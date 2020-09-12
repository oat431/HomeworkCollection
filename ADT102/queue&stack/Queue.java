package app;

public class Queue {

    private int Front;
    private int Rear;
    private int Size;
    private Student[] students = new Student[45];

    public Queue() {
        this.Front = 0;
        this.Rear = 0;
        this.Size = 0;
    }

    public void enqueue(Student a){
        students[this.Rear] = a;
        this.Rear++;
        this.Size++;
    }

    public Student dequeue(){
        Student temp = students[this.Front];
        students[this.Front] = null;
        for(int i = 0; i < this.Size-1 ; i++){
            Student t = students[this.Front];
            students[this.Front] = students[this.Front+1];
            students[this.Front+1] = t;
        }
        return temp;        
    }

    public boolean isFull(){
        return this.Size >= 45; 
    }

    public boolean isEmpty(){
        return this.Size == 0;     
    }

    public Student front(){
        return this.students[this.Front];

    }

    public Student rear(){
        return this.students[this.Rear-1];

    }
 
    public int getSize(){
        return this.Size;

    }

}

/*
Queue q1 = new Queue();

        q1.enqueue(2);
        q1.enqueue(4);
        q1.enqueue(-1);
        q1.enqueue(3);
        q1.enqueue(5);
        q1.enqueue(9);

        q1.Show();
        q1.dequeue();
        q1.Show();
        q1.dequeue();
        q1.Show();
        System.out.println("Font");
        System.out.println(q1.front());
        System.out.println("Rear");
        System.out.println(q1.rear());
    
*/