package СalculatorTask;

public class DataProcess {

    public static char operator;
    public static int number1;
    public static int number2;

    public static boolean operatorInd(String text) { // присутствует ли оператор; какой именно оператор;
        boolean ok = false;
        char[] op = {'+', '-', '*', '/'};
        for (int i = 0; i <= 3; i++) {
            if (text.indexOf(op[i]) > -1) {
                operator = op[i]; // оператор
                ok = true;
            }
        }
        return ok;
    }

    public static boolean isArabic(String text) throws NumberFormatException, Exception { // новое
        String[] subs = text.split("[+-/*]"); //разбиваем на подстроки
        try {
            number1 = Integer.parseInt(subs[0].trim());// переводим в число и удаляем начальные и конечные пробелы
            number2 = Integer.parseInt(subs[1].trim());
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isRoman(String text) throws NumberFormatException {
        boolean ok = true;
        String[] subs = text.split("[+-/*]"); //разбиваем на подстроки
        if (RomanNumerals.rimsArab(subs[0].trim())) {
            number1 = RomanNumerals.numeralArab;
        } else { ok = false;}
        if (RomanNumerals.rimsArab(subs[1].trim())) {
            number2 = RomanNumerals.numeralArab;
        } else { ok = false;}
        return ok;
    }
}
