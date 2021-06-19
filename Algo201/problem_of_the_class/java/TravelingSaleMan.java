public class TravelingSaleMan {
    /**
     *  below method is a TSP problem that correct for polynomial time (O(n^2))
     *  I use optimal substructure to solve the TSP by use the latest path of sale man the calculate next path 
     *  and finally get the minimum path of the sale man that travel all over the map 
     *  */ 
    private static int travelingSaleMan(int[][] map,boolean[] passAble,int currentPath,int path,int count,int cost,int minimumPath){
        // break path set sale man back to own path 
        if(count == path && map[currentPath][0] > 0){
            minimumPath = Math.min(minimumPath,cost + map[currentPath][0]);
            return minimumPath;
        } 

        // find the best way
        for(int i=0;i<path;i++){
            if(!passAble[i] && map[currentPath][i] > 0){
                passAble[i] = true;
                minimumPath = travelingSaleMan(map, passAble, i, path, count + 1, cost + map[currentPath][i], minimumPath);
                passAble[i] = false;
            }
        }
        return minimumPath;
    }
    // result for O(n^2)

    public static void main(String[] args) {
        int path = 4;
        int[][] map = {{0,10,15,20},{10,0,35,25},{15,35,0,30},{20,25,30,0}};
        boolean[] passAble = new boolean[path];

        passAble[0] = true;

        int minimumPath = Integer.MAX_VALUE;

        minimumPath = travelingSaleMan(map, passAble, 0, path, 1, 0, minimumPath);

        System.out.println(minimumPath);
        System.exit(0);
    }
}