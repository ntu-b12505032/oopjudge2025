import java.util.*;

public class SentenceProcessor {

    public String removeDuplicatedWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) return sentence;

        String[] words = sentence.trim().split("\\s+");
        Set<String> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!seen.contains(word)) {
                seen.add(word);
                if (result.length() > 0) result.append(" ");
                result.append(word);
            }
        }

        return result.toString();
    }

    public String replaceWord(String target, String replacement, String sentence) {
        if (sentence == null || sentence.isEmpty()) return sentence;

        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (result.length() > 0) result.append(" ");
            if (word.equals(target)) {
                result.append(replacement);
            } else {
                result.append(word);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SentenceProcessor sp = new SentenceProcessor();

        System.out.println(sp.removeDuplicatedWords("Hello Hello World I love love the World I lovelove the World"));
        System.out.println(sp.removeDuplicatedWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
        System.out.println(sp.removeDuplicatedWords("a a la a la carte A la La carte Carte A a la la"));
        System.out.println(sp.replaceWord("major", "minor", "The major problem is how to sing in A major"));
        System.out.println(sp.replaceWord("on", "off", "Turn on the television I want to keep the television on"));
        System.out.println(sp.replaceWord("love", "hate", "I love the World I lovelove the Love"));
    }
}

