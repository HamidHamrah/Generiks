package GeneriksOppgaver;

public class BordImpl extends Mobel{
    public BordImpl(String navn, String Type, int Vekt, int nummer, int antallbein) {
        super(navn, Type, Vekt, nummer);
    }
    public String toString(){
        return getNummer()+" "+getNavn();
    }

}
