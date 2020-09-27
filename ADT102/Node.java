import java.util.Scanner;
 
class Node{
    public Node right;
    public Node left;
    private int data;
    public Node(int data){
        this.data = data;
        right = left = null;
    }
 
    public int getData(){
        return data;
    }
}
 
class BinarySearchTree{
    private Node root;
    public BinarySearchTree(){
        root = null;
    }
 
    public void addChild(int data){
        root = insert(root,data);
    }
 
    public Node insert(Node cur,int data){
        if(cur == null){
            cur = new Node(data);
            return cur;
        }
        if(data > cur.getData()){
            cur.right = insert(cur.right,data);
        }else{
            cur.left = insert(cur.left,data);
        }
        return cur;
    }
    public int height(Node root) {
        if (root == null) {
            return 0;
        }
 
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    public Node getRoot() {
        return root;
    }
}
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BinarySearchTree oat = new BinarySearchTree();
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            oat.addChild(in.nextInt());
        }
        System.out.println(oat.height(oat.getRoot()));
    }
}