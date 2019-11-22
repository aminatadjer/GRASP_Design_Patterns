package LowCoupling;
// Now we can add additional classes(ex: Orange) without changing anything
import java.util.ArrayList;

public class Garden2 {
    private ArrayList<Fruit> fruits=new ArrayList<Fruit>();
    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
    public void displayFruits(){
     for (Fruit fruit:fruits){
         System.out.println(fruit);
     }
    }
    public static void main(String[] args){
        String color1="red";
        String color2="green";
        Fruit pomegranate=new Pomegranate2(color1);
        Fruit apple=new Apple2(color2);
        Fruit apple1=new Apple2(color1);
        Garden2 garden= new Garden2();
        garden.addFruit(pomegranate);
        garden.addFruit(apple);
        garden.addFruit(apple1);
        garden.displayFruits();
    }
}
