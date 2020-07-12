package СalculatorTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTask {
    public static void main(String[] args) throws Exception { // новое
        try {
            System.out.println("Введите выражение");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine(); //чтение строки

            if (DataProcess.operatorInd(text)) { //проверка наличия +,-,*,/
                if (DataProcess.isArabic(text)) { // если присутствуют арабские цифры
                    Calculator.calculator(DataProcess.number1, DataProcess.number2, DataProcess.operator); // передаем числа и оператор
                    System.out.println(Calculator.result);
                } else {
                    if (DataProcess.isRoman(text)) { // если присутствуют римские цифры
                        Calculator.calculator(DataProcess.number1, DataProcess.number2, DataProcess.operator); // передаем числа и оператор
                        System.out.println(RomanNumerals.arabRims(Calculator.result));
                    } else {
                        throw new Exception("Введите либо две римские, либо две арабские цифры в диапазоне от 1 до 10");
                    }
                }
            } else {
                throw new Exception("Используйте один из операторов: +, -, *, /");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
