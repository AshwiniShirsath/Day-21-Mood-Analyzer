package com.bridgelabz.moodanalyzer;
/*
 * @author : Ashwini
 * Given “I am in Sad Mood” message Should Return SAD
 */

public class MoodAnalyserMain {
    private String message;

    /**
     * default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message=message;
    }
    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}