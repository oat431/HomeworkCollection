public class Queue {
    private Student[] stu;
    private int front;
    private int rear;
    private int size;

    public Queue(){
        this.stu = new Student[45];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean enQueue(Student s){
        if(this.isFull()){
            return false;
        }
        stu[rear] = s;
        rear++;
        size++;
        return true;
    }

    public Student deQueue(){
        if(isEmpty()){
            return null;
        }
        Student temp = stu[front];
        stu[front] = null;
        for(int i=0;i<size-1;i++){
            Student t = stu[i+1];
            stu[i+1] = stu[i];
            stu[i] = t;
        }
        size--;
        rear--;
        return temp;
    }

    public void deQueueAll(){
        int n = this.size();
        for(int i=0;i<n;i++){
            System.out.println(this.deQueue());
        }
    }

    public Student front(){
        return stu[front];
    }

    public Student rear(){
        return stu[rear-1];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= 45;
    }
}
