package GeneriksOppgaver;

public class MobelImpl extends Mobel{
    public MobelImpl(String navn, String Type, int Vekt, int nummer) {
        super(navn, Type, Vekt, nummer);
    }
    public String toString(){
        return getNummer()+" "+getNavn();
    }
    public int compareTo(Mobel m) {
        return this.getNummer() - m.getNummer();
    }

}
