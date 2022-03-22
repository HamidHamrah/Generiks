package GeneriksOppgaver;

abstract class Mobel implements  Comparable<Mobel> {
    private String navn;
    private String Type;
    private int Vekt;
    private int nummer;

    public Mobel(String navn, String Type, int Vekt, int nummer){
        this.navn=navn;
        this.Type=Type;
        this.Vekt=Vekt;
        this.nummer=nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getVekt() {
        return Vekt;
    }

    public void setVekt(int vekt) {
        Vekt = vekt;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    public abstract String toString();
}
