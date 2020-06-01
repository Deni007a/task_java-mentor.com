import java.util.List;

/**
 *  roman  to arab converter
 */
public class RomanToArabic {

    public static int romanToArabic(String input) {

        int result = 0;
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        // [C, XC, L, XL, X, IX, V, IV, I]
        int i = 0;

        while ((input.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (input.startsWith(symbol.name())) {
                result += symbol.getValue();
                input = input.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        if (input.length() > 0 ) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }
        return result;
    }
}
