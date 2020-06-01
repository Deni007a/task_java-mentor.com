import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArabicToRomanTest {
    String[] arr_output= {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI", "XXV","",""};
    Integer[] arr_input= {1,2,3,4,5,6,7,8,9,10,11,25,0,-5};
    List<String> result = new ArrayList<>();
    @Test
    void arabicToRoman() {
        for (Integer integer : arr_input) {
            result.add(ArabicToRoman.arabicToRoman(integer));
        }
        assertArrayEquals(arr_output,result.toArray());

    }
}