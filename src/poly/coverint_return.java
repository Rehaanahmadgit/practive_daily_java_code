package poly;


    class Animal {
        Animal getAnimal() {
            System.out.println("animal calss" );
            return this;
        }

        void display() {
            System.out.println("I am an animal");
        }
    }

    class Dog extends Animal {
        @Override
        Dog getAnimal() {
            System.out.println("dog class ");
            return this;
        }
//        Animal getAnimal(){
//            System.out.println("dog class ");
//            return this;
//        }

        void display() {
            System.out.println("I am a dog");
        }
    }

    public class coverint_return {
        public static void main(String[] args) {
            Animal a = new Animal();
            a.display();

            Dog d = new Dog();
            d.display();

            Animal ad = a.getAnimal();
            ad.display();
            Dog ad1=d.getAnimal();
            ad1.display();// This will call the display method in Dog class
        }

}
