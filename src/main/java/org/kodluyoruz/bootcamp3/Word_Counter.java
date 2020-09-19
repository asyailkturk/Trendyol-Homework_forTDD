package org.kodluyoruz.bootcamp3;


import java.util.Arrays;
import java.util.HashSet;

public class Word_Counter {
    public int getOutput(String sentence) {
        if ("".equals(sentence))
            throw new IllegalArgumentException("It can not be null.");
        String trimmedSentence = sentence.trim().toLowerCase().replaceAll("[;,?.@!_|&%]" ,"");
        String[] seperatedWords = trimmedSentence.split("\\s+");;
        HashSet<String> uniqueWordsHashSet = new HashSet<>(Arrays.asList(seperatedWords));
        return uniqueWordsHashSet.size();
    }
}
