package com.wnswdwy.test01;

/**
 * @author yycstart
 * @create 2020-08-02 16:27
 */
public class ManKind {
    int sex ;
    int salary;
    //根据sex的显示输出对应的语句
    public void manOrderWoman(){
        if(sex == 1){
            System.out.println("man");
        }
        if(sex == 0){
            System.out.println("woman");
        }
    }
    //根据salary的值显示对应的值
    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }

}
