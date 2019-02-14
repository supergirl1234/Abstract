package com;

/**
 * Author:Fanleilei
 * Created:2019/2/14 0014
 */
public class Test2 {

    public static void main(String[] args) {
        //抽象内部类 内部类
        C c=new C();

        C.D d1=new C().new D();
        A.B d2=c.new D();

        F f=new F();
        A.E f1=new F();

    }
}


abstract class A{

    abstract class B{


    }

    //静态抽象内部类
    static abstract class E{


    }
}
class C extends A{

    class D extends B{

    }
}

//静态抽象内部类子类
class F extends A.E{


}