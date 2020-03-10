public class LinkedList{
    private Node head;
    private int size;

    //constructor
    public LinkedList(){}
    public LinkedList(Student s){
        head = new Node(s);
        this.size++;
    }

    //Insert
    public void insert(Student s){
        if(head == null){
            head = new Node(s);
            size++;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(s);
        size++;
    }

    //deleteFirst
    public void deleteFirst(){
        head = head.next;
        size--;
        return ;        
    }

    //deleteLast
    public void deleteLast(){
        Node temp = head;
        int s = this.size-1;
        while(s-- > 0){
            temp = temp.next;
        }
        this.size--;
        temp.next = null;
    }

    //deletePosition
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        Node cur = head;
        cur = cur.next;
        while(index-- > 0){
            temp = temp.next;
            cur = cur.next;
        }
        temp.next = cur.next;
        size--;

    }
    

    //deleteAll
    public void deleteAll(){
        head.next = null;
        this.size = 0;
    }

    //traversal
    public void traversal(){
        if(this.size == 0){
            System.out.println("There no anything in this LinkedList");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
        System.out.println(temp.data.toString());
    }

    //getSize
    public int getSize(){
        return this.size;
    }


}