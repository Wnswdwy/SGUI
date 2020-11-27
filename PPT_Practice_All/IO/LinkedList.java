public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

    private static class Node<E> { // 节点.
        E item; // 数据域
        Node<E> next; // 下一个指针
        Node<E> prev; // 上一个指针

        // 上一个指针, 数据值, 下一下指针
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    // 计数器
    transient int size = 0;
    // 头结点的引用
    transient Node<E> first;
    // 尾结点的引用
    transient Node<E> last;
    // 用于控制迭代器同步的修改次数
    protected transient int modCount = 0;

    public LinkedList() {
    }

    public boolean add(E e) { // 添加
        linkLast(e); // 链到尾部
        return true;
    }

    void linkLast(E e) { // "cc"
        final Node<E> l = last; // l是尾引用, 老尾
        final Node<E> newNode = new Node<>(l, e, null); // 新结点的上一个指针 指向老尾, 第二个参数是数据
        last = newNode; // 刷新尾, 让尾指向新结点.
        if (l == null) // 判断老尾是否为空, 说明链表为空
            first = newNode; // 头引用无条件指向第一个结点.
        else // 链表非空的.
            l.next = newNode; // 老尾的next指针  指向 新结点
        size++; // 调整计数器
        modCount++; // 修改次数++
    }

    // 821 => 829 => 830 => 831 => 832 => 833 => 834
    //                              |
    public boolean remove(Object o) { // "aa"
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            // x : 821, X!=null
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) { // 进行搜索, 定位要删除的目标对象.
                    unlink(x); // x就是目标结点
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(Node<E> x) { // x就是target // 832
        // assert x != null;
        final E element = x.item; // 取老值
        final Node<E> next = x.next; // 下一个结点 // 833
        final Node<E> prev = x.prev; // 上一个结点 // 831

        if (prev == null) { // 如果要删除的是头结点
            first = next; // 更新头, 让头指向下一个.
        } else {
            prev.next = next; // 831.next = 833
            x.prev = null; // 832.prev = null. 要删除的结点中的指针消除.
        }

        if (next == null) { // 如果要删除的结点是尾结点
            last = prev; // 刷新尾, 让它指向上一个
        } else {
            next.prev = prev; // 833.prev = 831
            x.next = null; // 消除目标结点中的指针
        }

        x.item = null; // 目标结点的数据域也清除.
        size--; // 调整计数器
        modCount++; // 修改次数++
        return element; // 返回老值.
    }

}