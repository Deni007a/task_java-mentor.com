import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Enum is responsible for matching numbers in different alphabets
 */
public enum RomanNumeral {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100);

    private int value;

    RomanNumeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumeral> getReverseSortedValues() {
        List<RomanNumeral>  arr = Arrays.asList(RomanNumeral.values());
        Collections.reverse(arr);
        return arr;
    }
    // [C, XC, L, XL, X, IX, V, IV, I]
}
