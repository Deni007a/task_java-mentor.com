/**
 *  This class validates the input string using regular expressions
 */
public class Validation_in_str {
    /** Arab numeric expression check pattern */
    final private static String resultArab = "^([1-9]|10)([\\s]?)*[-+*/]([\\s]?)*([1-9]|10)$";
    /** Rome numeric expression check pattern */
    final private static String resultRome = "^(I|II|III|IV|V|VI|VII|VIII|IX|X)([\\s]?)*[-+*/]([\\s]?)*(I|II|III|IV|V|VI|VII|VIII|IX|X)$";

    public static boolean validation(String in_string) {
        in_string = in_string.trim();
        return (in_string.matches(resultArab)) || in_string.matches(resultRome);
    }
    public static boolean isResultRome(String input) {
        input = input.trim();
        return input.matches(resultRome);
    }
}
