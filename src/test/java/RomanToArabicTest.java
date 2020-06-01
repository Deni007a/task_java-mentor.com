import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RomanToArabicTest {
String[] arr_input= {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI", "XXV"};
Integer[] arr_output= {1,2,3,4,5,6,7,8,9,10,11,25};
List<Integer> result = new ArrayList<>();

    @Test
    void romanToArabic() {

        for (String str : arr_input) {
           result.add(RomanToArabic.romanToArabic(str));
        }
       assertArrayEquals(arr_output,result.toArray());
    }
}