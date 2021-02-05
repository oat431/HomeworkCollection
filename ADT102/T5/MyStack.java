public class MyStack {
    private int size;
    private Student top;
    private Student[] s;

    public MyStack(int size) {
        s = new Student[size];
        this.size = 0;
        this.top = null;
    }

    public void push(Student s) {
        if (this.size < this.s.length) {
            this.s[size] = s;
            this.size++;
            this.top = this.s[this.size - 1];
        }else{
            System.out.println("cannot push more..");
        }
    }

    public Student pop() {
        if(this.size > 0){
            Student temp = this.s[size - 1];
            this.s[size - 1] = null;
            size--;
            this.top = size != 0 ? this.s[size - 1] : null;
            return temp;
        }else{
            System.out.println("cannot pop more..");
        }
        return null;
    }

    public Student peek() {
        return this.top;
    }

    public boolean isEmpty() {
        int cnt = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.s[i] == null) {
                cnt++;
            }
        }
        return cnt == size;
    }

    public boolean isFull() {
        if(this.size == 0){
            return false;
        }
        int cnt = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.s[i] != null) {
                cnt++;
            }
        }
        return cnt == size;
    }

    public boolean search(String fname) {
        for (int i = 0; i < this.size; i++) {
            if (this.s[i].getName().equals(fname)) {
                return true;
            }
        }
        return false;
    }

    public void printStack() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.s[i].toString());
        }
    }

    public static void main(String args[]) {
        System.out.println("Test: instance Stack"); 
        MyStack st = new MyStack(10);
        System.out.println();
        System.out.println("Test: check whter stack is full or not");
        System.out.println(st.isFull());
        st.push(new Student("Sa", "Hs", "12345"));
        st.push(new Student("gh", "DD", "12335"));
        st.push(new Student("aa", "CC", "12343"));
        st.push(new Student("bb", "EE", "32345"));
        st.push(new Student("Sa", "Hs", "12345"));
        st.push(new Student("gg", "GG", "12335"));
        st.push(new Student("cc", "CC", "52343"));
        st.push(new Student("ee", "EE", "82335"));
        st.push(new Student("ww", "WW", "32345"));
        st.push(new Student("pp", "PP", "12395"));
        st.printStack();
        System.out.println(st.isFull());
        
        System.out.println("Test: if push another value on full stack");
        st.push(new Student("soemthing", "something", "123345"));

        System.out.println();
        
        System.out.println("Test: Pop method on stack");
        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println();

        System.out.println("Test: Peek method on stack");
        System.out.println(st.peek());
        System.out.println(st.pop());

        System.out.println();

        System.out.println("Test: search method on stack");
        System.out.println(st.search("Sa"));
        System.out.println(st.search("SS"));

        System.out.println();

        System.out.println("Test: whether stack is empty or not");
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());

        st.printStack();

        System.out.println("Program terminate propery");
    }

}
