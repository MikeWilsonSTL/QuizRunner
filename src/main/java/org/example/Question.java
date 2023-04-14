package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    Scanner input = new Scanner(System.in);
    String prompt;
    ArrayList<String> choices;
    ArrayList<Integer> correctAnswerIndexes;

    public Question(String prompt, ArrayList<String> choices, ArrayList<Integer> correctAnswerIndexes){
        this.prompt = prompt;
        this.choices = choices;
        this.correctAnswerIndexes = correctAnswerIndexes;
    }
}
