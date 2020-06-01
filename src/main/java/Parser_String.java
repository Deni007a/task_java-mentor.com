/**
 * break the string into 3 substrings
 * (2 digits and mat sign) and return an array
 */

public class Parser_String {

    public static String[] Parser_String(String input_string) {

        input_string = input_string.trim();
        int math_start_position = 0;

        for (int i = 0; i < input_string.length(); i++) {
            if ((input_string.charAt(i) == '-') ||
                    (input_string.charAt(i) == '+') ||
                    (input_string.charAt(i) == '*') ||
                    (input_string.charAt(i) == '/')
            ) math_start_position = i;
        }
        // 1 цифра
        String str1 = input_string.substring(0, math_start_position).trim();
        //2  цифра
        String str2 = input_string.substring(math_start_position + 1).trim();
        // математический знак (+,-,*,/)
        String mathematical_operation = String.valueOf(input_string.charAt(math_start_position)).trim();

        return new String[]{str1, mathematical_operation, str2};
    }
}
