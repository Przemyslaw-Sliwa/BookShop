public class TestBookShop {
    public static void main(String[] args){
        Autor autor=new Autor("jan","kowal");
        Wydawnictwo wydawnictwo= new Wydawnictwo("Trwam","Idziemy");
        ISBN isbn=new ISBN(1,2,3,10,5);
        Book book=new Book();
        Book book1=new Book("Pan Tadeusz",autor,wydawnictwo,2015,isbn,500,43.23,"link");

        System.out.println(book.toString());
        System.out.println(book1.toString());
    }
}
