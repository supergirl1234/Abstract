package com;

/**
 * Author:Fanleilei
 * Created:2019/2/14 0014
 */
public class Test4 {

    public static void main(String[] args) {
        new B2(30).print();//结果为:0  30  30
    }
}
abstract class A2{

    public A2() {//3.调用父类构造
        this.print(); //4.调用被子类覆写的方法
    }
    public abstract void print();
}

class B2 extends A2{

    private  int num=100;

    public B2(int num) {//2.调用子类实例化对象
        super();//3.隐含一行语句，实际要先调用父类构造

        this.num = num;//7.为类中属性初始化

        this.print();
    }

    @Override
    public void print() { //5.此时子类对象的属性还没有被初始化
        System.out.println(this.num);//6.对应其数据类型的默认值

    }
}