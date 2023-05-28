public class Pojazd {
    String nazwa;
    int rokProdukcji;

    public Pojazd(String nazwa, int rokProdukcji) {
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
}
