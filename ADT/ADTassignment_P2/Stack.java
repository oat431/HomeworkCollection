
public class Stack {
    private Student[] stu;
    private int top;

    public Stack(){
        stu = new Student[45];
        top = 0;
    }

    public void push(Student s){
        if(this.isFull()){
            return;
        }
        stu[top] = s;
        top++;
    }

    public Student pop() {
        if(this.isEmpty()){
            System.out.println("nothing left on the stack");
            return null;
        }
        Student temp = stu[top-1];
        stu[top-1] = null;
        top--;
        return temp;
    }

    public void popAll(){
        int n = this.size();
        for(int i=0;i<n;i++){
            System.out.println(this.pop());
        }
    }

    public Student peek(){
        return stu[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top >= 45;
    }

    public int size(){
        return top;
    }
}
