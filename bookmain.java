public class bookmain{
    public static void main(String[] args){
        Book book1 = new Book();
        book1.setbook("dog","ray","asia","20200310",100);
        book1.showinfo();

        Book book2 = new Book();
        book2.setbook("cat","ray","asia","20200310",1300);
        book2.showinfo();

        Book book3 = new Book();
        book3.setbook("horse","ray","asia","20200310",300);
        book3.showinfo();
    }
}