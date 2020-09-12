package app;

public class Stack {

    private int top;
    private Student[] students;

    //int[] ar = new int[10];

    public Stack(int st){
        this.students = new Student[st];
        this.top = 0;
    }
    public void push(Student recieve){
        students[top++] = recieve;
        top++;
    }
    public Student pop(){
        Student tmp = this.students[top];
        this.students[top] = null;
        top--;
        return tmp;
    }
    public Student peek(){
        Student tmp = null;
        for(int i = students.length-1 ; i>=0; i--){
            if (students[i] != null){  
                tmp = students[i];          
                break;
            }
        }
        return tmp;
    }

    public boolean isEmpty(){
        if(top==-1)
        return true;
        return false;
    }

    public boolean isFull(){
        if(top==9)
        return true;
        return false;
        
    }
}

/*
Stack st = new Stack(10);
        
        st.push(6);
        st.push(2);
        st.push(2);
        st.push(1);
        st.push(1);
        st.push(5);
        st.push(0);
        st.push(2);
        st.push(0);
        
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        for(int i = 0; i<6; i++){
            System.out.println(st.pop());
        }
*/