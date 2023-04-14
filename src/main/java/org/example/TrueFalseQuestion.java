package org.example;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
    ArrayList<Integer> userAnswers = new ArrayList<>();
    public TrueFalseQuestion(String prompt, ArrayList<String> questions, ArrayList<Integer> correctAnswerIndexes) {
        super(prompt, questions, correctAnswerIndexes);
    }

//    public void askQuestion(){
//        System.out.println(prompt);
//        for (String choice : choices) {
//            System.out.println(choice + ": " + choices);
//        }
//        userAnswers.add(validateAnswer(input.nextInt()));
//    }
//
//    public int validateAnswer(int answer){
//        while(answer != 0 && answer != 1){
//            System.out.println("Invalid input!");
//            System.out.println("Please either '0' for True or '1' for False");
//            answer = input.nextInt();
//        }
//        return answer;
//    }
}
