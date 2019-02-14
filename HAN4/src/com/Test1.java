package com;

/**
 * Author:Fanleilei
 * Created:2019/2/14 0013
 */
public class Test1 {

    public static void main(String[] args) {
        //抽象类的实例化对象可以通过其子类实例化（多态）
        Person person = new Student("张三");
        System.out.println(person.getPersonInfo());
        System.out.println(person.getName());

        Person person1=new teacher("李四");
        System.out.println(person1.getPersonInfo());


        Person person2=Person.getPersonObject();
        System.out.println(person2.getPersonInfo());


        String info=new Person("王五"){

            @Override
            String getPersonInfo() {
                return "医生姓名："+this.getName();
            }
        }.getPersonInfo();
        System.out.println(info);
    }
}

//抽象类是无法实例化对象（即便类中没有抽象方法）
//抽象方法不能使用private修饰
abstract class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
     //抽象方法
    abstract String getPersonInfo();

    public static Person getPersonObject(){
         //1.方法内部类（局部内部类）
        //2.匿名内部类

      /*  class Worker extends Person{


            public Worker(String name) {
            super(name); //调用父类的构造方法
            }

            @Override
            String getPersonInfo() {
                return "我的名字为："+this.getName();
            }
        }*/

        //匿名内部类 --> 必须继承一个父类或者实现一个接口
        return new Person("Tom"){
            @Override
            String getPersonInfo(){

                return "我的名字为："+this.getName();
            }
        };
    }

}


//子类继承抽象类，必须实现父类的抽象方法（所有）
//子类继承抽象类，如果没有覆写父类的抽象方法，则必须使用abstract修饰子类（抽象类）
//如果抽象类没有无参构造方法，那么子类必须通过super明确指定父类的构造方法

class Student extends Person{
    public Student(String name) {
        super(name);
    }
        @Override
    public String getPersonInfo() {
            return "学生的名字为："+this.getName();
    }
}

class teacher extends Person{
    public teacher(String name) {
        super(name);
    }

    @Override
    String getPersonInfo() {
        return "老师姓名："+this.getName();
    }
}

