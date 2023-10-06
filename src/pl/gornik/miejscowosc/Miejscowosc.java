package pl.gornik.miejscowosc;

public class Miejscowosc {
    String nazwa;
    String gmina;
    int liczbaLudnosci;
    double powierzchnia;
    double nieuzytki;

    public Miejscowosc(String nazwa, String gmina, int liczbaLudnosci, double powierzchnia, double nieuzytki) {
        this.nazwa = nazwa;
        this.gmina = gmina;
        this.liczbaLudnosci = liczbaLudnosci;
        this.powierzchnia = powierzchnia;
        this.nieuzytki = nieuzytki;
    }

    public double srednieZaludnienie(){
        return this.liczbaLudnosci/this.powierzchnia;
    }

    public double powierzchniaUzytkowa(){
        return (this.powierzchnia - this.nieuzytki);
    }

    @Override
    public String toString() {
        return "Miejscowosc{" +
                "nazwa='" + nazwa + '\'' +
                ", gmina='" + gmina + '\'' +
                ", liczbaLudnosci=" + liczbaLudnosci +
                ", powierzchnia=" + powierzchnia +
                ", nieuzytki=" + nieuzytki +
                '}';
    }
}
