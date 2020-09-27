package com.company;
import java.util.ArrayList;
import java.util.Random;
public class Forest {

    private ArrayList<Tree> tree = new ArrayList<>();
    private int area;
    private Tree[][] fields;
    private int plant;
    private int unplant;
    public Forest(){}

    public Forest(int n,int area){
        this.fields = new Tree[area][area];
        this.area = area;
        Random random = new Random();
        for(int i = 0; i<n; i++){
            int height = random.nextInt(20)+1;
            Tree tree = new Tree(height + Math.random());
            this.tree.add(tree);
        }

        for(int i=0;i<n;i++){
            int x = random.nextInt(area);
            int y = random.nextInt(area);

            if(fields[x][y] == null){
                fields[x][y] = this.tree.get(i);
            }else if(fields[x][y] != null){
                outer:for(int j=0 ; j<this.area ; j++){
                    for(int k=0; k<this.area ; k++){
                        if(fields[j][k] == null){
                            fields[j][k] = this.tree.get(i);
                            break outer;
                        }
                    }
                }
            }

        }

    }

    public void showTreeInTheForest(){
        for(int i=0 ; i<this.area ; i++){
            for(int j=0 ; j<this.area ; j++){
                if(fields[i][j] != null) {
                    plant++;
                    System.out.print("T  ");
                }else{
                    unplant++;
                    System.out.print("_  ");
                }
            }
            System.out.println();
        }
    }

    public void ForestInformation(){
        System.out.println("There are " + this.plant + " trees in this forest");
        System.out.println("And there are " + this.unplant + " remained area in the forest");
        System.out.println("Expect to have " + this.tree.size() + " trees in the forest");
    }

}
