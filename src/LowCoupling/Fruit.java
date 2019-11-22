package LowCoupling;

    public class Fruit {
        private String name;
        private String color;

        public Fruit(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String toString(){
            return name+ " with color "+ color;
        }
    }

