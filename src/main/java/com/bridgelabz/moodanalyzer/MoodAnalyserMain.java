package com.bridgelabz.moodanalyzer;
/*
 * @author : Ashwini
 * I am in Any Mood ,message Should Return HAPPY
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