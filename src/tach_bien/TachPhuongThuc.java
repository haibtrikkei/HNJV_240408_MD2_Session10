package tach_bien;

public class TachPhuongThuc {
    public int tong(int number1, int number2){
        final int total1 = getC(number1);
        final int total2 = getD(number2);
        return extracted(total1, total2);
    }

    private static int extracted(int c, int d) {
        return c + d;
    }

    private static int getD(int b) {
        int d = b +10;
        return d;
    }

    private static int getC(int a) {
        int c = a +5;
        return c;
    }
}
