package tach_bien;

public class TachBien {
    public static final int CONST1 = 2;
    public static final int CONST2 = 3;
    public static final String PHEP_CONG = "+";
    public static final String PHEP_TRU = "-";
    public static final String PHEP_NHAN = "*";
    public static final String PHEP_CHIA = "/";

    /*
        ...
     */
    public int sum(int number1, int number2){
        final int i = number1 + number2;
        int a = 0,b = 0;

        int c = a + b;
        int d = c+a;
        return i;
    }

    public int subtract(int number1, int number2){
        int n = 100;
        return (number1+ CONST1)-(number2+ CONST2);
    }

    public void testSwitchCase(String k, int a, int b){
        switch (k){
            case PHEP_CONG:
                //final int i = a + b;
                System.out.println("Tong 2 so: "+ (a+b));
                break;
            case PHEP_TRU:
                final int i = a - b;
                System.out.println("Hieu 2 so: "+ i);
                break;
            case PHEP_NHAN:
                final int mutiple = a*b;
                System.out.println("Tich 2 so: "+mutiple);
                break;
            case PHEP_CHIA:
                System.out.println("Thuong 2 so: "+(float)a/b);
                break;
        }
    }

}
