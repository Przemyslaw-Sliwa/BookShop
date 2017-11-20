public class ISBN {

    int cyfra1;
    int cyfra2;
    int cyfra3;
    int cyfra4;
    int cyfra5;

    public ISBN(){
        cyfra1=1;
        cyfra2=2;
        cyfra3=3;
        cyfra4=4;
        cyfra5=5;
    }
    public ISBN(int cyfra1,int cyfra2,int cyfra3,int cyfra4,int cyfra5){
        this.cyfra1=cyfra1;
        this.cyfra2=cyfra2;
        this.cyfra3=cyfra3;
        this.cyfra4=cyfra4;
        this.cyfra5=cyfra5;
    }

    @Override
    public String toString() {
        return cyfra1+"-"+cyfra2+"-"+cyfra3+"-"+cyfra4+"-"+cyfra5;
    }
}
