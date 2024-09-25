package Strings;
import java.util.ArrayList;
import java.util.List;

public class StringFourth {
    public static void main(String[] args) {
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "esta";
        String str3 = "string";

        List<Integer> positionsStr2 = findAllOccurrences(str1, str2);
        List<Integer> positionsStr3 = findAllOccurrences(str1, str3);

        System.out.println("Posiciones de '" + str2 + "' en str1: " + positionsStr2);
        System.out.println("Posiciones de '" + str3 + "' en str1: " + positionsStr3);
    }

    private static List<Integer> findAllOccurrences(String str1, String subStr) {
        List<Integer> positions = new ArrayList<>();
        String lowerStr1 = str1.toLowerCase();
        String lowerSubStr = subStr.toLowerCase();

        int index = lowerStr1.indexOf(lowerSubStr);
        while (index >= 0) {
            positions.add(index);
            index = lowerStr1.indexOf(lowerSubStr, index + 1);
        }

        return positions;
    }
}