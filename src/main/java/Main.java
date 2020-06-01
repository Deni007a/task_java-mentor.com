import java.util.Scanner;

/**
 * поскольку в задании не указаны некоторые моменты то взял из вашего же задания на JS
 * https://jm-program.github.io/frontend-calculator
 * 1)  округляю целые числа в нижнюю сторону
 * 2) поскольку в римских цифрах нет отрицательных значений и нуля выдаю ""
 * 3) выводим результат в одном типе String
 *
 * @author Iesypko Denys
 * версиня на JS https://github.com/Deni007a/calculat
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            while (true) {
                String string_result = null;
                int result = 0;
                System.out.print(":> ");

                String string_input = in.nextLine();

                //  поверяем на валидность строки если не валдно закрываем программу
                if (!Validation_in_str.validation(string_input)) {
                    throw new Validation_Error();
                }
                //  римские цифры или нет
                boolean is_rome = Validation_in_str.isResultRome(string_input);
                // разбиваем три подстроки
                String[] arr_sring = Parser_String.Parser_String(string_input);
                // если римские цифры
                if (is_rome) {
                    // прееобразуем  в нормальные цифры
                    String first_digit = String.valueOf(RomanToArabic.romanToArabic(arr_sring[0]));
                    String mathematical_operation = arr_sring[1];
                    String second_digit = String.valueOf(RomanToArabic.romanToArabic(arr_sring[2]));
                    // вычисляем
                    result = Calculator.calculation(first_digit, mathematical_operation, second_digit);
                    // преобразуем резкльтат в римские цифры
                    string_result = ArabicToRoman.arabicToRoman(result);
                    //System.out.println(result);
                } else {
                    String first_digit = (arr_sring[0]);
                    String mathematical_operation = arr_sring[1];
                    String second_digit = (arr_sring[2]);
                    // вычисляем
                    result = Calculator.calculation(first_digit, mathematical_operation, second_digit);
                    string_result = String.valueOf(result);
                }
                //System.out.println(string_input + " = " + string_result);
                System.out.println(string_result);
            }
        } catch (Validation_Error validation_error) {
            validation_error.printStackTrace();
        } finally {
            in.close();
        }
    }
}
