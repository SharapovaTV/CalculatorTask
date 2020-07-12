package СalculatorTask;

public class RomanNumerals {
    public static int numeralArab;
    public static String numeralRim;
    public static Integer[] arabN = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    public static String[] rimN = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

    public static boolean rimsArab(String sub) { // римские цифры I - X
        boolean ok = false;
        for (int i = 0; i <= rimN.length - 1; i++){
            if(sub.equals(rimN[i])) {
                numeralArab = arabN[i];
                ok = true;
            }
        }
        return ok;
    }

    public static String arabRims(double result) {
        String n1 = "";
        String n2 = "";
        int resultInt = (int) Math.round(result);
        int units = resultInt % 10;
        int decades = resultInt - units;
        if (units == 0 || decades == 0){
            for (int i = 0; i <= arabN.length - 1; i++) {
                if (arabN[i].equals(resultInt)) {
                    numeralRim = rimN[i];
                }
            }
        } else {
            for (int i = 0; i <= arabN.length - 1; i++) {
                if (arabN[i].equals(units)) {
                    n2 = rimN[i];
                }
                if (arabN[i].equals(decades)) {
                    n1 = rimN[i];
                }
            }
            numeralRim = n1 + n2;
        }
        return numeralRim;
    }
}


