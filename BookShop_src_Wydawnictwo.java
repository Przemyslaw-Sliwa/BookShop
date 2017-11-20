public class Wydawnictwo {
    String nazwa;
    String miejscowosc;

    public Wydawnictwo(){
        nazwa="Nazwa";
        miejscowosc="Miejscowosc";

    }
    public Wydawnictwo(String nazwa,String miejscowosc){
        this.nazwa=nazwa;
        this.miejscowosc=miejscowosc;
    }

    @Override
    public String toString() {
        return nazwa+" "+miejscowosc;
    }
}
