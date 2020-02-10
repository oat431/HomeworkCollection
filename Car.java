package app;
import java.util.Random;

public class Car {

    public Car(){
  
    }

        String[] Brand = {"Tui", "Tho", "Toey", "Jo", "Pree"};
        int[] minPrice = {3000000, 2000000, 1000000, 500000, 20000} ;
        int[] maxPrice = {5000000, 3000000, 3000000, 1000000, 100000}; 
        int[] RentCost = {50000, 10000, 2000, 8000, 20000}; 
        int[] minDown = {100000, 80000, 100000, 10000, 1000};
        int[] maxDown = {500000, 350000, 400000, 50000, 8000};

    public String[] setBrand(){
        Random index = new Random();
        String[] BrandList = new String[999];
        for(int i = 0; i < BrandList.length; i++){
            int x = index.nextInt(5) + 1;
            String y = "";
            switch (x){
                case 1:
                y = this.Brand[0];
                BrandList[i] = y;
                break;
                case 2:
                y = this.Brand[1];
                BrandList[i] = y;
                break;
                case 3:
                y = this.Brand[2];
                BrandList[i] = y;
                break;
                case 4:
                y = this.Brand[3];
                BrandList[i] = y;
                break;
                case 5:
                y = this.Brand[4];
                BrandList[i] = y;
                break;
            }
        }  
        return BrandList; 
    }

    public int[] setPrice(){
        Random index = new Random();
        Random randPrice = new Random();
        int[] PriceList = new int[999];
        for(int i = 0; i < PriceList.length; i++){
            int x = index.nextInt(5) + 1;
            int y = randPrice.nextInt(maxPrice[x]) + minPrice[x];
            switch (x){
                case 1:
                PriceList[i] = y;
                break;
                case 2:
                PriceList[i] = y;
                break;
                case 3:
                PriceList[i] = y;
                break;
                case 4:
                PriceList[i] = y;
                break;
                case 5:
                PriceList[i] = y;
                break;
            }
        }
        return PriceList;
    }

    public int[] setRent(){
        Random index = new Random();
        int[] RentList = new int[999];
        for(int i = 0; i < RentList.length; i++){
            int x = index.nextInt(5) + 1;
            int y = 0;
            switch (x){
                case 1:
                y = this.RentCost[0];
                RentList[i] = y;
                break;
                case 2:
                y = this.RentCost[1];
                RentList[i] = y;
                break;
                case 3:
                y = this.RentCost[2];
                RentList[i] = y;
                break;
                case 4:
                y = this.RentCost[3];
                RentList[i] = y;
                break;
                case 5:
                y = this.RentCost[4];
                RentList[i] = y;
                break;
            }
        }  
        return RentList; 
    }

    public int[] setDown(){
        Random index = new Random();
        Random randDown = new Random();
        int[] DownList = new int[999];
        for(int i = 0; i < DownList.length; i++){
            int x = index.nextInt(5) + 1;
            int y = randDown.nextInt(maxDown[x]) + minDown[x];
            switch (x){
                case 1:
                DownList[i] = y;
                break;
                case 2:
                DownList[i] = y;
                break;
                case 3:
                DownList[i] = y;
                break;
                case 4:
                DownList[i] = y;
                break;
                case 5:
                DownList[i] = y;
                break;
            }
        }
        return DownList;
    }
    
    public String[] CarInfo(){
        String[] CarForSale = new String[999];
        String[] dataBrand = new String[999];
        int[] dataPrice = new int[999];
        int[] dataRent = new int[999];
        int[] dataDown = new int[999];
        dataBrand = setBrand();
        dataPrice = setPrice();
        dataRent = setRent();
        dataDown = setDown();
        
        for(int i = 0; i < CarForSale.length; i++){
            CarForSale[i] = dataBrand[i] + " " + dataPrice[i] + " " + dataRent[i] + " " + dataDown[i];
        }
        return CarForSale;
    }

}
