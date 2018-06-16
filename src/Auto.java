public class Auto {
    private int id;
    private String marka;
    private int pojemnosc;
    private int moc;
    private String kolor;

    public Auto(int id, String marka, int pojemnosc, int moc, String kolor) {
        this.id = id;
        this.marka = marka;
        this.pojemnosc = pojemnosc;
        this.moc = moc;
        this.kolor = kolor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", pojemnosc=" + pojemnosc +
                ", moc=" + moc +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
