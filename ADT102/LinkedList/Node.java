public class Node{
    public Node next;
    public Student data;

    public Node(Student data){
        this.data = data;   
        next=null;
    }
    
    @override
    public String toString(){
        return data.toString();
    }

}
