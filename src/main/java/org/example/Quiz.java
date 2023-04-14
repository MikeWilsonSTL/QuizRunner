package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> userAnswers = new ArrayList<>();

    public Quiz(ArrayList<Question> questions){
        this.questions = questions;
    }

    public void runQuiz(){
        int userAnswer;
        for(int x = 0; x < questions.size(); x++){
            System.out.println(questions.get(0).prompt);
            for(int y = 0; y < questions.get(x).choices.size(); x++){
                System.out.println(x + ": " + questions.get(x).choices.get(x));
            }
            userAnswer = validateAnswer(input.nextInt(), x);
            userAnswers.add(userAnswer);
        }
    }

    public int validateAnswer(int answer, int currentIndex){
        while(answer < 0 || answer > questions.get(currentIndex).choices.size()){
            System.out.println("Invalid input!");
            System.out.println("Please choose a number from 0 to " + questions.get(currentIndex).choices.size() + ".");
            answer = input.nextInt();
        }
        return answer;
    }
}
