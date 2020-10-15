public class metricSys {
    public static void main(String[] args){
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles\t");
        System.out.println("---------------------------------------------------------------");
        int temp = 20; 
        for(int i=1;i<=10;i++){
            double t = i;
            System.out.println(t+"\t"+kiloToMile(t)+"\t\t|\t" + temp + "\t\t" +String.format("%.2f",mileToKilometer(temp)));
            temp += 5;
        }
    }

    public static double mileToKilometer(double mile){
        return mile / 1.609;
    }
    public  static double kiloToMile(double kilometer){
        return kilometer * 1.609;
    }
}