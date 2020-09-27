public abstract class Person {

    protected String name;
    
    public String getName() {
    
    return name;
    
    }
    
    public abstract void buyThings(float price);
    
    public abstract void sellThings(float price);
    
    public abstract void showInformation();
    
    }