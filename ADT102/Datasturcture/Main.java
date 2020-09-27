public class Main{
	public static void main(String[] args){
		Queue q1 = new Queue();

		q1.Enqueue("2");
		q1.Enqueue("4");
		q1.Enqueue("-1");
		q1.Enqueue("3");
		q1.Enqueue("5");
		q1.Enqueue("9");

		q1.dequeue();
		q1.dequeue();
		q1.front();
		q1.rear();
		q1.getSize();


	}
}
