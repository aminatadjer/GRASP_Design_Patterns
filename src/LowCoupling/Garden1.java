package LowCoupling;
// in Garden 1 there is a high coupling situation (Garden1 is highly coupled to Apple1 and Pomegranate1
// With any change, we will be obliged to change so much code
//Suppose that we want to add a new class which a new fruit , Orange for example,

public class Garden1 {
    private Apple1 apple;
    private Pomegranate1 pomegranate;
    // we will be obliged to add an Orange Attribute (private Orange orange;)

    public Garden1(Apple1 apple, Pomegranate1 pomegranate) {
        this.apple = apple;
        this.pomegranate = pomegranate;
        // changing code here (adding initializing of orange)
    }
    public void displayFruits(){
        System.out.println(apple);
        System.out.println(pomegranate);
        // changing code here to display orange
    }
    public static void main(String[] args){
        String color1="red";
        String color2="green";
        Pomegranate1 pomegranate=new Pomegranate1(color1);
        Apple1 apple=new Apple1(color2);
        Garden1 garden= new Garden1(apple,pomegranate);
        garden.displayFruits();
    }
}
