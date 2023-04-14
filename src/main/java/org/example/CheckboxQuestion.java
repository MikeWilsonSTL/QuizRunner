package org.example;

import java.util.ArrayList;

public class CheckboxQuestion extends Question{
    ArrayList<Integer> userAnswers = new ArrayList<>();
    public CheckboxQuestion(String prompt, ArrayList<String> questions, ArrayList<Integer> correctAnswerIndexes) {
        super(prompt, questions, correctAnswerIndexes);
    }

//    public void askQuestion(){
//        int response;
//        System.out.println(prompt);
//        for (String choice : choices) {
//            System.out.println(choice + ": " + choices);
//        }
//        do{
//            response = validateAnswer(input.nextInt());
//            userAnswers.add(response);
//        }while(response != 'X');
//    }
//
//    public int validateAnswer(int answer){
//        if(answer == 'X' || answer == 'x'){
//            return -1;
//        }
//        while(answer < choices.size() || answer > choices.size()){
//            System.out.println("Invalid input!");
//            System.out.println("Please choose a number from 0 to " + choices.size() + ".");
//            answer = input.nextInt();
//        }
//        return answer;
//    }
}
