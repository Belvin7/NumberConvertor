/*

Kontext ist die globale Umstände (circumstances , conditions, instances) eines Programmes
z.B : globale Variablen , Dateien ..

Seiteneffekt ist der Einfluss des Programmes auf den Kontext
z.B : Veränderung globaler Variablen , Speicherung von Dateien usw.

Q ) Das funktionale Paradigma kennzeichnet sich dadurch, dass es keinen Kontext und keine Seiteneffekte gibt.

ANS)
Die Ausgabe einer Funktion wird nur durch ihre Eingabe bestimmt. Bei gleicher Eingabe wird sie immer die
gleiche Ausgabe erzeugen. Das liegt daran, dass Funktionen in der funktionalen Programmierung keinen „Kontext“
oder „Zustand“ haben, den sie ändern können.

Sie verändern keine Variablen oder Daten außerhalb ihrer selbst. Daher haben Funktionen keine Seiteneffekte.

 */



/*
public class NonFunctional {
    public static final int BIN = 0;
    public static final int OCT = 1;
    public static final int DEC = 2;
    public static final int HEX = 3;

    private static int codec = DEC;
    private static int number = 0;

    public static void setNumber(int newNumber){
        number = newNumber;
    }

    public static void printNumber(){
        printNumber(number);
    }

    private static void printNumber(int printNumber){
        switch(codec){
            case BIN:
                System.out.format("0b%s\n", Integer.toBinaryString(printNumber));
                return;
            case OCT:
                System.out.format("0o%s\n",Integer.toOctalString(printNumber));
                return;
            case DEC:
                System.out.format("%d\n",printNumber);
                return;
            case HEX:
                System.out.format("0x%s\n",Integer.toHexString(printNumber));
                return;
            default:
                System.err.format("unknown codec '%d'\n",codec);
        }
    }

    public static void setCodec(int newCodec){
        codec = newCodec;
    }

    public static void main(String[] args){
        printNumber();
        setNumber(1337);
        setCodec(BIN);
        printNumber();
        setCodec(OCT);
        printNumber();
        setCodec(DEC);
        printNumber();
        setCodec(HEX);
        printNumber();
    }
}
*/


public class Functional {

    public static final int BIN = 0;
    public static final int OCT = 1;
    public static final int DEC = 2;
    public static final int HEX = 3;

    private static String printNumber(int printNumber, int codec){
        switch(codec){
            case BIN:
                return "0b:" + Integer.toBinaryString(printNumber);

            case OCT:
                return "0o:"+ Integer.toOctalString(printNumber);
            case DEC:
                return "  :"+ Integer.toString(printNumber);
            case HEX:
                return "0x:"+ Integer.toHexString(printNumber);
            default:
                return "unknown codec '" + codec + "'";
        }
    }

    public static void main(String[] args){
        System.out.println(printNumber(10,0));
        System.out.println(printNumber(10,1));
        System.out.println(printNumber(10,2));
        System.out.println(printNumber(10,3));

    }
}