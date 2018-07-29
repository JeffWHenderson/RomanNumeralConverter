import java.util.TreeMap;

public class RomanNumeralConverter {
    private final static TreeMap<Integer, String> numbersForRoman = new TreeMap<Integer, String>();

    static {
        numbersForRoman.put(1, "I");
        numbersForRoman.put(4, "IV");
        numbersForRoman.put(5, "V");
        numbersForRoman.put(9, "IX");
        numbersForRoman.put(10, "X");
    }

    public String toRoman(int arabic) {
        Integer closestRomanNumeral = numbersForRoman.floorKey(arabic);
        if(closestRomanNumeral == arabic)
            return numbersForRoman.get(arabic);
        else
            return numbersForRoman.get(closestRomanNumeral) + toRoman(arabic - closestRomanNumeral);
    }
}
