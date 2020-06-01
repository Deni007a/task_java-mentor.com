import java.util.List;

/**
 * arab to roman converter
 */

public class ArabicToRoman {
    /**
     * Conversion Arabic To Roman
     *
     * @param number input numeral
     * @return string Conversion result
     */
    public static String arabicToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        if ((number <= 0) || (number > 100)) {
            sb.append("  в рисмой нумерации нету 0 и отрицательных цифр");
            return sb.toString();
            //throw new IllegalArgumentException(number + " в рисмой нумерации нету 0 и отрицательных цифр");
        } else {
            List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

            int i = 0;

            while ((number > 0) && (i < romanNumerals.size())) {
                RomanNumeral currentSymbol = romanNumerals.get(i);
                if (currentSymbol.getValue() <= number) {
                    sb.append(currentSymbol.name());
                    number -= currentSymbol.getValue();
                } else {
                    i++;
                }
            }
            return sb.toString();
        }
    }
}
