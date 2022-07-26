package ex3;

import java.util.HashSet;
import java.util.Set;

public class ChatApplicationArrayVersion {
    String[] wordsNotAllowed = new String[] {"Idiot", "Stupid"};

    public String getReplacer(int numberOfReplacers) {
        StringBuilder replacer = new StringBuilder();
        for (int i = 0; i < numberOfReplacers; i++) {
            replacer.append("#");
        }
        return replacer.toString();
    }

    public String removeBadWordsFromSentence(String sentence) {
        StringBuilder finalSentence = new StringBuilder();
        String[] allWords = sentence.split(" ");
        for (String word : allWords) {
            if (checkIfBadWord(word)) {
                finalSentence.append(getReplacer(word.length()));
            } else {
                finalSentence.append(word).append(" ");
            }
        }
        return finalSentence.toString();
    }

    public boolean checkIfBadWord(String word){
        for (String badWord: wordsNotAllowed) {
            if(badWord.equals(word)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String sentence = "Bad word: Idiot";
        ChatApplicationArrayVersion chatApplication = new ChatApplicationArrayVersion();

        System.out.println(chatApplication.removeBadWordsFromSentence(sentence));
    }
}
