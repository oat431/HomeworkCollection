public class statistic{
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        double[] dnum = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0}; 
        
        System.out.println(deviation(num));

        System.out.println(deviation(dnum));
    }

    public static double deviation(double[] x){
        double avg = mean(x);
        double dev = 0;
        for(double i : x){
            dev += Math.pow(i - avg,2);
        }
        return Math.sqrt(dev/x.length-1);
    }

    public static double deviation(int[] x){
        double avg = mean(x);
        int dev = 0;
        for(int i : x){
            dev += (i - avg) * (i - avg);
        }
        return Math.floor(Math.sqrt(dev/x.length-1)) ;
    }

    public static double mean(double[] x){
        double avg = 0;
        for(double i : x){avg += i;}
        return avg/x.length;
    }

    public static double mean(int[] x){
        int avg = 0;
        for(int i : x){avg += i;}
        return avg/x.length;
    }
}