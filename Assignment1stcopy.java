import java.util.*;
import java.io.*;

public class Assignment1stcopy {

public static void main(String[] args) throws IOException {
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input your document: ");
    String output = BR.readLine();
    output=output.toLowerCase();

    int length = output.length();
    char character;
    int totalCount = 0;
    Map<Character, Integer> map = new HashMap<Character,Integer>();
    for (int i = 0; i < length; i++)
    {
        character = output.charAt(i);
        totalCount++; 

        Integer countForCharacter = 0;
        if (map.containsKey(character)) {
            countForCharacter = map.get(character);
            countForCharacter++;
        } else {
            countForCharacter = 1;
        }
        map.put(character, countForCharacter);
    }

    Character[] charactersFound = map.keySet().toArray(new Character[0]);

    System.out.println("Letters\tFrequency\tCount");
    for(int k = 0; k < charactersFound.length; k++)
    {
        character = charactersFound[k];
        System.out.println(character+
                "\t" +
                (map.get(character)/((float)totalCount)) +
                "\t"+
                map.get(character));
    }
}
}