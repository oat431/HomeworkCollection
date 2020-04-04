package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========================== Assign 1 ========================== ");
        
        Banana banana1 = new Banana(50);
        Banana banana2 = new Banana(35);

        Bone bone1 = new Bone(false);
        Bone bone2 = new Bone(true);


        Animal dog = new Dog();
        Animal monkey = new Monkey();


        dog.eat(banana1);
        dog.eat(banana2);
        dog.eat(bone1);
        dog.eat(bone2);

        monkey.eat(banana1);
        monkey.eat(banana2);
        monkey.eat(bone1);
        monkey.eat(bone2);
    
        System.out.println("Monkey:");
        monkey.roar();
        
        System.out.println("Dog:");
        dog.bark();
        
        System.out.println("========================== Assign 2 ========================== ");
        Developer dev = new Developer("Jonh");
        dev.displayGeneralInformation();
        dev.displayJobDescription();
        dev.code();
        System.out.println("---------------------------------------------------------------");
        Tester test = new Tester("Jane");
        test.displayGeneralInformation();
        test.displayJobDescription();
        test.test();
        

    
    }
}