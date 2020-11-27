public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

    private static class Node<E> { // �ڵ�.
        E item; // ������
        Node<E> next; // ��һ��ָ��
        Node<E> prev; // ��һ��ָ��

        // ��һ��ָ��, ����ֵ, ��һ��ָ��
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    // ������
    transient int size = 0;
    // ͷ��������
    transient Node<E> first;
    // β��������
    transient Node<E> last;
    // ���ڿ��Ƶ�����ͬ�����޸Ĵ���
    protected transient int modCount = 0;

    public LinkedList() {
    }

    public boolean add(E e) { // ���
        linkLast(e); // ����β��
        return true;
    }

    void linkLast(E e) { // "cc"
        final Node<E> l = last; // l��β����, ��β
        final Node<E> newNode = new Node<>(l, e, null); // �½�����һ��ָ�� ָ����β, �ڶ�������������
        last = newNode; // ˢ��β, ��βָ���½��.
        if (l == null) // �ж���β�Ƿ�Ϊ��, ˵������Ϊ��
            first = newNode; // ͷ����������ָ���һ�����.
        else // ����ǿյ�.
            l.next = newNode; // ��β��nextָ��  ָ�� �½��
        size++; // ����������
        modCount++; // �޸Ĵ���++
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
                if (o.equals(x.item)) { // ��������, ��λҪɾ����Ŀ�����.
                    unlink(x); // x����Ŀ����
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(Node<E> x) { // x����target // 832
        // assert x != null;
        final E element = x.item; // ȡ��ֵ
        final Node<E> next = x.next; // ��һ����� // 833
        final Node<E> prev = x.prev; // ��һ����� // 831

        if (prev == null) { // ���Ҫɾ������ͷ���
            first = next; // ����ͷ, ��ͷָ����һ��.
        } else {
            prev.next = next; // 831.next = 833
            x.prev = null; // 832.prev = null. Ҫɾ���Ľ���е�ָ������.
        }

        if (next == null) { // ���Ҫɾ���Ľ����β���
            last = prev; // ˢ��β, ����ָ����һ��
        } else {
            next.prev = prev; // 833.prev = 831
            x.next = null; // ����Ŀ�����е�ָ��
        }

        x.item = null; // Ŀ�����������Ҳ���.
        size--; // ����������
        modCount++; // �޸Ĵ���++
        return element; // ������ֵ.
    }

}