public class Main{
    public static void main(String[] args){
        Student s1 = new Student("1","Sahahchan","Tippimwong");
        Student s2 = new Student("2","Prin","SomeLastName");
        Student s3 = new Student("3","Pronmongkong","AnotherLastName");
        Student s4 = new Student("4","Jin","Michael");
        Student s5 = new Student("5","Titisan","JaiLouml");
        LinkedList li = new LinkedList();

        li.insert(s1);
        li.insert(s2);
        li.insert(s3);
        li.insert(s4);
        li.insert(s5);

        li.traversal();

        System.out.println();
        li.deleteAt(0);
        li.deleteAt(1);

        li.traversal();

        li.deleteAll();
        System.out.println();

        li.traversal();
    }
}