public class Rectangle {
    private double initX;
    private double initY;
    private double w;
    private double h;
    
    public Rectangle(double x,double y){
        this.initX = x;
        this.initY = y;
        this.w = 1;
        this.h = 1;
    }
    
    public Rectangle(double x,double y,double w,double h){
        this.initX = x;
        this.initY = y;
        this.w = w;
        this.h = h;
    }
 
    /**
       b +----------------+ c
         |                |
         |                |
       a +----------------+ d
        this is the rectangle that I design 
     */
    public void cornerOfRectangle(){
        double ax = this.initX;
        double ay = this.initY;

        double bx = this.initX;
        double by = this.initY + this.h;

        double cx = this.initX + this.w;
        double cy = this.initY + this.h;

        double dx = this.initX + this.w;
        double dy = this.initY;

        System.out.println("We have \"a\",\"b\",\"c\",\"d\" as the name of each coordinate in this Rectangle");
        System.out.println("a : ("+ax + "," + ay +")");  
        System.out.println("b : ("+bx + "," + by +")");  
        System.out.println("c : ("+cx + "," + cy +")");  
        System.out.println("d : ("+dx + "," + dy +")");  
    }
    
    public void areaOftheRectangle(){
        System.out.println("and area of this rectangle is " + this.w * this.h);
    }
}
