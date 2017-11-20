public class Autor {
    String imie;
    String nazwisko;


    public Autor(){
        imie="Imie";
        nazwisko="Nazwisko";
    }
    public Autor(String imie,String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    @Override
    public String toString() {
        return imie+" "+nazwisko;
    }
}
