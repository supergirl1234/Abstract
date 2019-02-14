package com;

/**
 * Author:Fanleilei
 * Created:2019/2/14 0014
 */
public class Test5 {

    public static void main(String[] args) {

        Coffee coffee=new Coffee();
        coffee.makeDrink();

        System.out.println("--------------");

        Tea tea=new Tea();
        tea.makeDrink();

        System.out.println("----------------");

        Tea tea2=new Tea(false);
        tea2.makeDrink();

        System.out.println("-------------");

        Juice juice=new Juice();
        juice.makeDrink();

        System.out.println("------------------");
    }
}
abstract class Drink{

    //饮品的制作流程
    //模板设计模式 makeDrink摸板的流程
    //流程发生改变，只需要在父类的模板方法中修改
    public final void makeDrink(){

        this.boilWater();
        this.waterInputCup();
        this.addMajorIngredient();
        if(this.isAddMinorIngredient()) {
            this.addMinorIngredient();
        }
        this.clear();
    }

    public final void boilWater(){

        System.out.println("1.烧水");
    }

    public final void waterInputCup(){

        System.out.println("2.将水倒入杯中");
    }
    public abstract void addMajorIngredient();
    public abstract void addMinorIngredient();

    public void clear(){

    }

    public boolean isAddMinorIngredient(){
        return true;
    }
}

class Coffee extends Drink{


    @Override
    public void addMajorIngredient() {
        System.out.println("3.将咖啡倒入水中");
    }

    @Override
    public void addMinorIngredient() {
        System.out.println("4.添加糖或牛奶");
    }

    public void clear(){

        System.out.println("5.清理餐具");
    }
}

class Tea extends Drink{

    private boolean minorIngredient=true;

    public Tea() {
    }

    public Tea(boolean minorIngredient) {
        this.minorIngredient = minorIngredient;
    }

    @Override
    public void addMajorIngredient() {
        System.out.println("3.将茶叶倒入水中");
    }

    @Override
    public void addMinorIngredient() {
        System.out.println("4.添加柠檬");
    }
    //覆写父类的方法
    public boolean isAddMinorIngredient(){
        return this.minorIngredient;

    }
}

class Juice extends Drink{


    @Override
    public void addMajorIngredient() {
        System.out.println("3.将浓缩芒果汁倒入水中");
    }

    @Override
    public void addMinorIngredient() {

    }
}