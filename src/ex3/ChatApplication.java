package ex3;

import java.util.*;

public class ChatApplication {
    Set<String> wordsNotAllowed = new HashSet<>();

    ChatApplication(){
        wordsNotAllowed.add("Idiot");
        wordsNotAllowed.add("Stupid");

    }
    public String getReplacer(int numberOfReplacers){
        String replacer = "";
        for(int i = 0 ; i < numberOfReplacers; i++){
            replacer += "#";
        }
        return replacer;
    }
    public String removeBadWordsFromSentence(String sentence){
        String finalSentence = "";
        String[] allWords = sentence.split(" ");
        for (String word: allWords) {
            if(wordsNotAllowed.contains(word)){
                finalSentence += getReplacer(word.length());
            }
            else{
                finalSentence += word + " ";
            }
        }
        return finalSentence;
    }

    public static void main(String[] args) {
        String sentence = "Bad word: Idiot";
        ChatApplication chatApplication = new ChatApplication();

        System.out.println(chatApplication.removeBadWordsFromSentence(sentence));
    }
}
