package com.bridgelabz.moodanalyzer;
/*
 * @author : Ashwini
 * Given a Message, ability to analyse and respond Happy or Sad Mood
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

