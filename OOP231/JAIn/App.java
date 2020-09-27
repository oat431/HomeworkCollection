public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========================== Assign 1 ========================== ");
        
        Banana banana1 = new Banana(10);

        Bone bone1 = new Bone(false);

        Animal dog = new Dog();
        Animal monkey = new Monkey(banana1);

        dog.eat(banana1);
        dog.eat(banana1);
        dog.eat(bone1);
        dog.eat(bone1);

        monkey.eat(banana1);
        monkey.eat(banana1);
        monkey.eat(bone1);
        monkey.eat(bone1);
    
        monkey.roar();
        dog.bark();
        
        // System.out.println("========================== Assign 2 ========================== ");
        
        // Developer dev = new Developer("Jonh");
        // dev.displayGeneralInformation();
        // dev.displayJobDescription();
        // dev.code();
        // System.out.println("---------------------------------------------------------------");
        // Tester test = new Tester("Jane");
        // test.displayGeneralInformation();
        // test.displayJobDescription();
        // test.test();
        

    
    }
}