class Book{
    private String name; 
    private String writer;  
    private String press; 
    private String date; 
    private int page;
    
    public Book(){
        System.out.println("You created a new book");
    }

    public void setbook(String name, String writer, String press, String date, int page){
        this.name = name;
        this.writer = writer;
        this.press = press;
        this.date = date;
        this.page = page;
    }

    public void showinfo(){
        System.out.println("Book name : " + name);
        System.out.println("Writer : " + writer);
        System.out.println("press : " + press);
        System.out.println("date : " + date);
        System.out.println("page : " + page);
    }

}