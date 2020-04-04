class ADTassign{
    static class sub1{
        static void method1(int a,int b){
            System.out.println("First number is " + a + " Second number is " + b);
        }

        static int method2(int x,int y){
            return x*y;
        }
        // I create the method sumToEven and it require two int and it return int
        static int sumToEven(int a, int b){
            if((a+b)%2==0){
                return a+b;
            }
            return a+b+1;
        }
    }
    // I create this class for part 2 
    static class sub2 {
        //this is the method that part 2 want  
        static int minimumValue(int[] arr){
            int min = arr[0];
            for(int i : arr){
                if(min > i){
                    min = i;
                }
            }
            return min;
        }
    }
    // I create this class for part 3
    static class sub3 {
        // I create this method for find sum
        static int[] sumOfTwo(int[][] arr){
            int[] ans = new int[2];
            for(int i=0 ; i<2 ; i++){
                for(int j=0 ; j<3 ; j++){
                    ans[i] += arr[i][j];
                }
            }
            return ans;
        }
    }
    public static void main(String[] args){
        System.out.println();
        /* ===========Part 1============  */
        System.out.println("===========Part 1============");
        int ans = 0;
        sub1.method1(1, 2);

        ans = sub1.method2(5, 5);
        System.out.println("multiplication results = " + ans);

        int ans2 = sub1.sumToEven(8, 9); // I put 8 and 9 for this method 
        System.out.println("This is sumToEven testcase1 " + ans2);
        
        int ans3 = sub1.sumToEven(9, 9); // I put 9 and 9 for this method
        System.out.println("This is sumToEven testcase1 " + ans3);
        System.out.println("===========End Part 1=========");
        /* ===========End Part 1=========  */
        System.out.println();
        /* ===========Part 2============  */
        System.out.println("===========Part 2=========");
        int[] arr = {343,474,755,366}; // I create array
        int min = sub2.minimumValue(arr); // find the min value via minimumValue method
        System.out.println(min); // show the minimumVaue
        System.out.println("===========End Part 2=========");
        /* ===========End Part 2========  */
        System.out.println();
        /* ===========Part 3============  */
        System.out.println("===========Part 3=========");
        int[][] arrs = {{1,3,4},{3,4,5}};  // I create 2D-array like the problem say
        int[] myAnswer = new int[2]; // I create  myAnswer to store the sum of the array
        myAnswer = sub3.sumOfTwo(arrs); // I call the method and it return sum of each array
        System.out.println("This is the sum of the first row " + myAnswer[0]); // show the answer in the first row
        System.out.println("This is the sum of the first row " + myAnswer[1]); // show the answer in the second row
        System.out.println("This is the sum of two array " + myAnswer[0] + myAnswer[1]);//show the sum of two array
        System.out.println("===========End Part 3=========");
        /* ===========End Part 3========  */


    }
}
