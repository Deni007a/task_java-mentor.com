/**
 * in this methods we do calculations
 */
public class Calculator {
    /**
     * the method is calculated based on 3 transmitted String
     *
     * @param str1                   input string  1 numeral
     * @param mathematical_operation input string
     * @param str2                   input string 2 numeral
     * @return int the result of calculation
     */
    public static int calculation(String str1, String mathematical_operation, String str2) {

        double result = 0.0;
        switch (mathematical_operation) {
            case "*":
                result = (Integer.parseInt(str1) * Integer.parseInt(str2));
                break;
            case "/":
                result = (Double.parseDouble(str1) / Double.parseDouble(str2));
                break;
            case "+":
                result = (Integer.parseInt(str1) + Integer.parseInt(str2));
                break;
            case "-":
                result = (Integer.parseInt(str1) - Integer.parseInt(str2));
                break;
        }
        return (int) Math.floor(result);
    }
}