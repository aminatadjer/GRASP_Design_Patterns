package Creator;

import java.util.Scanner;

// you can order a juice by specifying the fruit and the juice complemnt to add ( example: Pomegranate juice with sugar)
public class Juice {
    private Fruit fruit;
    private JuiceComplement complement;

    Juice(Fruit fruit, JuiceComplement juiceComplement) {
        this.fruit=fruit;
        this.complement=juiceComplement;
    }
    Juice(String fruitName,TypeOfComplements typeOfComplement){
        this.fruit=new Fruit(fruitName);
        this.complement=new JuiceComplement(typeOfComplement);
    }
    public static void main(String []args){
        String fruitName="Pomegranate";
        //Without creator

        Fruit fruit = new Fruit(fruitName);
        JuiceComplement complement=new JuiceComplement(TypeOfComplements.SUGAR);
        Juice juice=new Juice(fruit,complement); // uses the first constructor of Juice
        //with creator
        Juice juice1=new Juice(fruitName,TypeOfComplements.SUGAR);//uses the second constructor of Juice
        System.out.println("Your "+juice1.fruit.getName()+" Juice with "+juice1.complement.getName().toString()+" is ready!");

    }

}
