package org.launchcode.java.quiztime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question {

    private String questionText;
    private ArrayList<Answer> answerList = new ArrayList<>();

    public Question(String someText) {
        this.questionText = someText;
    }

    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String aText) {
        questionText = aText;
    }

    public void addAnswer(Answer anAnswer) {
        answerList.add(anAnswer);
    }
    public void removeAnswer(Answer anAnswer) {
        answerList.remove(anAnswer);
    }

    public void printQuestion() {
        System.out.println(this.getQuestionText());
        for (Answer answer : answerList) {
            System.out.println(answerList.indexOf(answer) + ":  " + answer.getAnswerText());
        }
    }

    public boolean gradeQuestion() {

        boolean result = false;
        Scanner in = new Scanner(System.in);
        String textInput = in.next();
        char[] digits = textInput.toCharArray();
        Arrays.sort(digits);

        String answerInput = "";
        for (Answer answer : answerList) {
            if (answer.checkIsCorrect()) {
                answerInput += answerList.indexOf(answer);
            }
        }
        char[] answers = answerInput.toCharArray();
        Arrays.sort(answers);

        if (Arrays.equals(answers, digits)) {
            result = true;
        }
        return result;
    }


}
