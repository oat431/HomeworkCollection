import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static  List<Integer> mins = new ArrayList<Integer>();
    public static ArrayList<String> index = new ArrayList<String>();
    public static void main(String[] args) throws Exception, ArrayIndexOutOfBoundsException {
        int cost[][] = { { 9, 2, 7, 8 }, { 6, 4, 3, 7 }, { 5, 8, 1, 8 }, { 7, 6, 9, 4 } };
        int selectIndex[] = {0, 1, 2, 3};
        int oldSelectIndex[] = new int [selectIndex.length];
        int N = cost.length;
        for(int arr = 0; arr < selectIndex.length; arr++){
             oldSelectIndex[arr] = selectIndex[arr]; 
        }
        for(int i = 0; i < N;i++){
            for(int j = 0; j < 6; j++){
                
                if(j == 0){
                    int total = cost[0][selectIndex[0]] + cost[1][selectIndex[1]] + cost[2][selectIndex[2]] + cost[3][selectIndex[3]]; 
                    System.out.println();
                                
                }  
                if(j == 1){
                    int oldValue = selectIndex[2];
                    selectIndex[2] = selectIndex[3];
                    selectIndex[3] = oldValue;
                }  
                if(j == 2){
                    int oldValue = selectIndex[1];
                    selectIndex[1] = selectIndex[2];
                    selectIndex[2] = oldValue;
                }  
                if(j == 3){
                    int oldValue = selectIndex[2];
                    selectIndex[2] = selectIndex[3];
                    selectIndex[3] = oldValue;
                }  
                if(j == 4){
                    int oldValue = selectIndex[1];
                    selectIndex[1] = selectIndex[2];
                    selectIndex[2] = oldValue;
                }  
                if(j == 5){
                    int oldValue = selectIndex[2];
                    selectIndex[2] = selectIndex[3];
                    selectIndex[3] = oldValue;
                }  
                if(j == 6){
                    int oldValue = selectIndex[1];
                    selectIndex[1] = selectIndex[2];
                    selectIndex[2] = oldValue;
                }  
                int total = cost[0][selectIndex[0]] + cost[1][selectIndex[1]] + cost[2][selectIndex[2]] + cost[3][selectIndex[3]];
                mins.add(total);
                System.out.println (i+": "+total);
             
            }
                 
            
            if(i == 3){
                break;
            }  
            
            s(selectIndex, oldSelectIndex,i);
        
          
        }
        System.out.println("Current minimum :"+Collections.min(mins));
    }

    public static void s(int[] selectIndex, int[] oldSelectIndex, int i) {
            for(int arr = 0; arr < selectIndex.length; arr++){
                selectIndex[arr] = oldSelectIndex[arr];
            }
            int temp = selectIndex[0];
            selectIndex[0] = selectIndex[i+1];
            selectIndex[i+1] = temp;
            
        }
    }

 