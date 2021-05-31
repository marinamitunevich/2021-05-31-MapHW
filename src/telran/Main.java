package telran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("marina","water","news","computer","book","news",
                "water", "november","marina","money","november","number", "apple", "apple","book");
        TreeMap<Character, Set<String>> map = new TreeMap<>();
        Set<String> set = new HashSet<>();

        int i = 0;
        for (String word :words) {
            Character e = word.charAt(i);
            map.put(e,setOfWords(words,e));
        }
        //To print our Map
        for ( Map.Entry<Character,Set<String>> e: map.entrySet()) {
            System.out.println(e.getKey()+ " : "+ e.getValue());
        }


    }
    public static Set<String>  setOfWords (List<String> list, Character letter){
        Set<String> set = new TreeSet<>();
        int i = 0;

        for (String word : list) {
            if(word.charAt(i) == letter){
                set.add(word);
            }
        }
        return set;
    }
}
