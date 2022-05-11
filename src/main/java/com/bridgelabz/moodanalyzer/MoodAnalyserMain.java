package com.bridgelabz.moodanalyzer;
/*
 * @author : Ashwini
 * Given “I am in Sad Mood” message Should Return SAD
 */

public class MoodAnalyserMain {
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}