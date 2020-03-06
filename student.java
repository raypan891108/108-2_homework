class Student{
    private String name;
    private String id;
    private String department;
    private int grade;
    private String schoolname;
    
    public Student(){
        System.out.println("You create a new Student.");
    }

    public void setstudent(String name, String id, String department, int grade, String schoolname){
        this.name = name;
        this.id = id;
        this.department = department;
        this.grade = grade;
        this.schoolname = schoolname;
    }

    public void showinfo(){
        System.out.println("name : " + name);
        System.out.println("id : " + id);
        System.out.println("department : " + department);
        System.out.println("grade : " + grade);
        System.out.println("school name : " + schoolname);
    }

}