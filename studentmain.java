public class studentmain{
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setstudent("ray","108021003","csie",1,"asia");
        student1.showinfo();

        Student student2 = new Student();
        student2.setstudent("allen","108021162","csie",1,"asia");
        student2.showinfo();
    
        Student student3 = new Student();
        student3.setstudent("lisa","108021613","csie",1,"asia");
        student3.showinfo();
    }
}