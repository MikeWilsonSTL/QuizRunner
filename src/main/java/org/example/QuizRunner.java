package org.example;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        String promptOne = "What is the lowest string on a guitar called?";
        String promptTwo = "What is a guitar's standard tuning?";
        String promptThree = "Select any and all answers that are appropriate. \n " +
                "Which of the following are guitar accessories? \n" +
                "Enter 'X' to finish submitting answers";
        String promptFour = "True or False: Tuning isn't as important as playing what you feel.";
        String promptFive = "True or False: A bass guitar and regular guitar share the same tuning system.";

        ArrayList<String> choicesOne = new ArrayList<>();
        ArrayList<String> choicesTwo = new ArrayList<>();
        ArrayList<String> choicesThree = new ArrayList<>();
        ArrayList<String> choicesFour = new ArrayList<>();
        ArrayList<String> choicesFive = new ArrayList<>();

        choicesOne.add("D");
        choicesOne.add("G");
        choicesOne.add("E");
        choicesOne.add("X");
        choicesOne.add("B");

        choicesTwo.add("CGCGCC");
        choicesTwo.add("DADGAD");
        choicesTwo.add("QWERTY");
        choicesTwo.add("90210");
        choicesTwo.add("EADGBe");

        choicesThree.add("Capo");
        choicesThree.add("String Winder");
        choicesThree.add("Windshield Wiper");
        choicesThree.add("Literally the intangible concept of infinity");
        choicesThree.add("Guitar Pick");

        choicesFour.add("True");
        choicesFour.add("False");

        choicesFive.add("True");
        choicesFive.add("False");

        ArrayList<Integer> answersOne = new ArrayList<>();
        ArrayList<Integer> answersTwo = new ArrayList<>();
        ArrayList<Integer> answersThree = new ArrayList<>();
        ArrayList<Integer> answersFour = new ArrayList<>();
        ArrayList<Integer> answersFive = new ArrayList<>();

        answersOne.add(2);
        answersTwo.add(4);
        answersThree.add(0);
        answersThree.add(1);
        answersThree.add(4);
        answersFour.add(1);
        answersFive.add(0);

        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(promptOne, choicesOne, answersOne);
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(promptTwo, choicesTwo, answersTwo);
        CheckboxQuestion question3 = new CheckboxQuestion(promptThree, choicesThree, answersThree);
        TrueFalseQuestion question4 = new TrueFalseQuestion(promptFour, choicesFour, answersFour);
        TrueFalseQuestion question5 = new TrueFalseQuestion(promptFive, choicesFive, answersFive);

        ArrayList<Question> quizQuestions = new ArrayList<>();
        quizQuestions.add(question1);
        quizQuestions.add(question2);
        quizQuestions.add(question3);
        quizQuestions.add(question4);
        quizQuestions.add(question5);

        Quiz guitarQuiz = new Quiz(quizQuestions);

        guitarQuiz.runQuiz();
    }
}