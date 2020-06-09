package com.example.caemsquiz;

import java.io.OptionalDataException;

public class AllQuestions {

//mettre un recupjson
    public static String[] mQuestions = new String [] {
            "Quelle est la capitale du Japon ?",
            "Quelles sont les dates de la premier guerre mondiale ?",
            "De quelle couleur est le cheval blanc de napoléon ?",
            "Comment s'appelle le petit du chat ?",
        "es ce que java est langage comiplier ?"

};

    private String mChoices [][] = {
            {"Paris", "Berlin", "Kyoto","Tokyo"},
            {"20-25", "69-75", "14-18","13-16"},
            {"Noir", "Jaune", "Blanc","Rouge"},
            {"Chiot", "Chaton", "Poussin","Tigre"},
            {"okay", "fauxn", "Peut etre","onee"}
    };


    private String mCorrectAnswers[] = {"Tokyo", "14-18", "Blanc", "Chaton","okay"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}