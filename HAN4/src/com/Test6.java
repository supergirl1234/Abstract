package com;

/**
 * Author:Fanleilei
 * Created:2019/2/14 0014
 */
public class Test6 {

    public static void main(String[] args) {
      /* MsnMessage msnMessage=new MsnMessage();
       IMessage iMessage=new MsnMessage();
       Platform platform=new MsnMessage();*/

    /*   Platform platform1= (Platform) iMessage;
        System.out.println(iMessage instanceof Platform);//true
        */

      /*  MsnMessage msnMessage=new MsnMessage();
        Platform platform=msnMessage;//ok,ok
        //Company company= (Company) platform;//Ok,eror CCE
*/
    }
}
interface Combination{

    void print();
    void supportPlatform();
}

interface IMessage{
    void print();

}
interface Platform{
    void supportPlatform();

}
class QQMessage implements Combination{


    @Override
    public void print() {
        System.out.println("这是QQMessage");
    }

    @Override
    public void supportPlatform() {
        System.out.println("QQ支持windows和Macos平台");
    }
}

class MsnMessage implements IMessage,Platform{


    @Override
    public void print() {
        System.out.println("这是MsnMessage");
    }

    @Override
    public void supportPlatform() {
        System.out.println("MSN支持windows");
    }
}

//抽象类
 abstract  class Company implements IMessage,Platform{

    public abstract void printCompany();
    public  void print(){
        System.out.println("这是Company实现的print方法");
    }
}