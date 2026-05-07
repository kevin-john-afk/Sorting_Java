package cCCase;

import java.util.*;

public class Sentence {

    public static void main(String[] args) {
        
        
        String article [] = {"the", "a", "one", "some", "any"};
        String noun [] = {"boy", "girl", "town", "car"};
        String verb [] = {"drove", "jumped", "ran", "walked", "skipped"};
        String preposition [] = {"to", "from", "over", "under", "on"};
        
        Random random = new Random();
        
        
        for (int i = 0; i <= 20; i++) {
            
            String sentence = article[random.nextInt(article.length)] + " " +
                              noun[random.nextInt(noun.length)] + " " + 
                              verb[random.nextInt(verb.length)] + " " +
                              preposition[random.nextInt(preposition.length)] + " " +
                              article[random.nextInt(article.length)] + " " + 
                              noun[random.nextInt(noun.length)];
            
            char firstChar [] = sentence.toCharArray();
            firstChar[0] = Character.toUpperCase(firstChar[0]);
            sentence = new String(firstChar)+ ".";
            System.out.println(sentence);
        }
        
        
    }

}