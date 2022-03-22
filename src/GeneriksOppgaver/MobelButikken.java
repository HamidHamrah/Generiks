package GeneriksOppgaver;

public class MobelButikken {
    public static void main(String[] args) {
        MobelRegister<Mobel> sofar=new MobelRegister<>();
        sofar.addMobel(new MobelImpl("Hamid", "360", 120 ,8351));
        sofar.addMobel(new MobelImpl("JOhn", "332", 12, 7672));

        sofar.skrivutalle();
        sofar.sorter();
        sofar.skrivutalle();

    }
}
