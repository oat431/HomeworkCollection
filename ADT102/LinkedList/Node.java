public class Node{
    public Node next;
    private Node prev;
    public Student data;

    public Node(Student data){
        this.data = data;   
        next=prev=null;
    }

}
