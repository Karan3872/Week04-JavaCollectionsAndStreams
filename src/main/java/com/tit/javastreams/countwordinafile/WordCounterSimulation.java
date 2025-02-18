package com.tit.javastreams.countwordinafile;

// Creating a class WordCounterSimulation to demonstrate word counting operations
public class WordCounterSimulation {
    public static void main(String[] args) {
        // Creating an object of WordCounter
        WordCounter wordCounter = new WordCounter();

        // File path to read
        String filePath = "src/main/resources/Large_Text_File.txt";

        // Counting words and displaying the top 5 most frequent words
        wordCounter.countWordsAndDisplayTop5(filePath);
    }
}
