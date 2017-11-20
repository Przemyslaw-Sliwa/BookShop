public class Book {
    String tytul;
    String autor1;
    String wydawnictwo1;
    String pdf;
    String isbn1;
    int rok;
    int strony;
    double cena;
    Autor autor;
    Wydawnictwo wydawnictwo;
    ISBN isbn;


    public Book() {
        tytul = "Tytuł";
        autor=new Autor();
        wydawnictwo=new Wydawnictwo();
        rok = 2017;
        isbn=new ISBN();
        strony = 0;
        cena = 23.45;
        pdf = "link";


    }

    public Book(String tytul, Autor autor, Wydawnictwo wydawnictwo,
                int rok, ISBN isbn, int strony, double cena,
                String pdf) {
        this.tytul = tytul;
        this.autor1 =autor.toString();
        this.wydawnictwo1 =wydawnictwo.toString();
        this.rok = rok;
        this.isbn1 =isbn.toString();
        this.strony = strony;
        this.cena = cena;
        this.pdf = pdf;


    }

    @Override
    public String toString() {
        return autor1 + " | " + "\"" + tytul + "\"" + " | " + wydawnictwo1 + " " + rok + " | " + isbn1 + " | " + strony + " | " + cena + " zl | " + pdf + " | ";
    }
}
