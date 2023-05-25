public class Drucker {
    // private variable
    private static Drucker instance;

    //private constructor
    private Drucker(){}

    //public get instance
    //one instance per thread/process
    public static Drucker getDrucker(){
        if(instance == null){
            instance = new Drucker();
        }
        return instance;
    }

    public static String drucken(){
        String s ="Ich drucke und bin die Instanz vom coolen Drucker!";
        return s;
    }

    public static int Rechnen(int wert1,int wert2){
        int ergebnis = wert1 + wert2;
        return ergebnis;
    }
}