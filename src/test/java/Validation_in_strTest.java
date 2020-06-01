import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class Validation_in_strTest {
    String[] input_str_rome_true = {"I +II", "III -IV", "V * VI", "VII/VIII", "IX*X"};
    String[] input_str_rome_folse = {"I ++ II", "II -IIV", "V * VIIII", "IIV/IIX", "IIIX*X"};
    String[] input_str_arab_true = {"1 + 2", "2 -3", "10* 10", "9/8", "5/10"};
    String[] input_str_arab_folse = {"1 ++ 2", "2 3", "101 + 10", " /8", "5/*10"};

    @org.junit.jupiter.api.Test
    void validation() {
        for (String str : input_str_arab_true) {
            assertEquals(Validation_in_str.validation(str), true);
        }
        for (String str : input_str_arab_folse) {
            assertEquals(Validation_in_str.validation(str), false);
        }

        for (String str : input_str_rome_true) {
            assertEquals(Validation_in_str.validation(str), true);
        }
        for (String str : input_str_rome_folse) {
            assertEquals(Validation_in_str.validation(str), false);
        }
    }

    @org.junit.jupiter.api.Test
    void isResultRome() {
        for (String str : input_str_rome_true) {
            assertEquals(Validation_in_str.isResultRome(str), true);
        }
        for (String str : input_str_rome_folse) {
            assertEquals(Validation_in_str.isResultRome(str), false);
        }
    }
}