package СalculatorTask;

public class Calculator {
    public static double result;

    public static void calculator(int number1, int number2, char operator) throws Exception { // производит арифметические выражения согласно оператору
        if ((number1 < 1) || (number1 > 10) || (number2 < 1) || (number2 > 10)) {
            throw new Exception("Число не входит в диапазон");
        } else {
            switch (operator) {
                case '+' : result = number1 + number2;
                break;
                case '-' : result = number1 - number2;
                break;
                case '*' : result = number1 * number2;
                break;
                case '/' : result = (double) number1 / number2;
                break;
            }
        }
    }
}


