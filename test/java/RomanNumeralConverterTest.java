import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralConverterTest {
    @Test
    public void pass() {
        assertTrue(true);
    }

    @Test
    public void shouldReturnLetterIWhenGivenNumber1(){
        //Given
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        //When
        String actual = romanNumeralConverter.toRoman(1);
        //Then
        assertEquals("I", actual);
    }

    @Test
    public void shouldReturnLettersIIwhenGivenNumber2() {
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

        String actual = romanNumeralConverter.toRoman(2);

        assertEquals("II", actual);
    }

    @Test
    public void shouldReturnLettersIVwhenGivenNumber4() {
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

        String actual = romanNumeralConverter.toRoman(4);

        assertEquals("IV", actual);
    }

    @Test
    public void shouldReturnLettersXwhenGivenNumber10() {
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

        String actual = romanNumeralConverter.toRoman(10);

        assertEquals("X", actual);
    }
}
