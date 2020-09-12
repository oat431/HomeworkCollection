public class LinkedList{
	private Node head;
	public LinkedList(){
		this.head = null;
	}
	//I don't know what the problem here 
	public void append(int data){
		if(this.head == null){
			head = new Node(data);
			return ;
		}
		Node cur = head;
		while(cur != null){
			cur = cur.next;
		}
		cur.next = new Node(data);
	}
	
	public void travel(){
		Node cur = head;
		while(cur != null){
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}
}
