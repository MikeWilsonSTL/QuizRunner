package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class MultipleChoiceQuestion extends Question {
    ArrayList<Integer> userAnswers = new ArrayList<>();
    public MultipleChoiceQuestion(String prompt, ArrayList<String> questions, ArrayList<Integer> correctAnswerIndexes) {
        super(prompt, questions, correctAnswerIndexes);
    }

//    public void askQuestion(){
//        int userAnswer;
//        System.out.println(prompt);
//        for(int x = 0; x < choices.size(); x++){
//            System.out.println(x + ": " + choices.get(x));
//        }
//        userAnswer = validateAnswer(input.nextInt());
//        userAnswers.add(userAnswer);
//    }

//    public int validateAnswer(int answer){
//        while(answer < 0 || answer > choices.size()){
//            System.out.println("Invalid input!");
//            System.out.println("Please choose a number from 0 to " + choices.size() + ".");
//            answer = input.nextInt();
//        }
//        return answer;
//    }

}
