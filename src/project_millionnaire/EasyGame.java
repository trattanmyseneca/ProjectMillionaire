/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_millionnaire;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mhdah
 */
public class EasyGame extends Games {

    public EasyGame(ArrayList<Question> al) {
        super(al);
    }

    @Override
    public boolean Round1() {
        Random random = new Random();
        System.out.println("Welcome to Round 1\n\n");

        System.out.println("First Question is for $100");
        do {
            randomIndex = random.nextInt(sizeOfQuestionsList());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);

        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        Scanner read = new Scanner(System.in);
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("\n\n Congratulations for the correct answer");
        System.out.println("\n Lets move to the next question");

        System.out.println("\nSecond Question is for $500\n");
        do {
            randomIndex = random.nextInt(questions.size());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);

        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("Congratulations for the correct answer");
        System.out.println("Lets move to the next question");
        System.out.println("Third Question is for $1000");
        do {
            randomIndex = random.nextInt(questions.size());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);
        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        
        System.out.println("You have successfully completed the round 1");

        return true;
    }

    @Override
    public boolean Round2() {
        Random random = new Random();
        System.out.println("Welcome to Round 2");

        System.out.println("Fourth Question is for $8,000");
        do {
            randomIndex = random.nextInt(sizeOfQuestionsList());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);

        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        Scanner read = new Scanner(System.in);
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("Congratulations for the correct answer");
        System.out.println("Lets move to the next question");

        System.out.println("Fifth Question is for $16,000");
        do {
            randomIndex = random.nextInt(questions.size());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);

        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("Congratulations for the correct answer");
        System.out.println("Lets move to the next question");
        System.out.println("Sixth Question is for $32,000");
        do {
            randomIndex = random.nextInt(questions.size());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);
        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        
        System.out.println("You have successfully completed the round 2");

        return true;
    }

    @Override
    public boolean Round3() {
        Random random = new Random();
        System.out.println("Welcome to Round 3");

        System.out.println("Seventh Question is for $125,000");
        do {
            randomIndex = random.nextInt(sizeOfQuestionsList());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);

        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        Scanner read = new Scanner(System.in);
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("Congratulations for the correct answer");
        System.out.println("Lets move to the next question");

        System.out.println("Eighth Question is for $500,000");
        do {
            randomIndex = random.nextInt(questions.size());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);

        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("Congratulations for the correct answer");
        System.out.println("Lets move to the next question");
        System.out.println("Ninth Question is for $1,000,000");
        do {
            randomIndex = random.nextInt(questions.size());
        } while (QuestionAnswered(randomIndex));
        AddQuestionsAnswered(randomIndex);
        System.out.println(questions.get(randomIndex).getTitle());
        System.out.println("Options are as below");
        System.out.println(questions.get(randomIndex).getOptionA());
        System.out.println(questions.get(randomIndex).getOptionB());
        System.out.println(questions.get(randomIndex).getOptionC());
        System.out.println(questions.get(randomIndex).getOptionD());
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        System.out.println("Congratulations for the correct answer");
        
        
        System.out.println("You have successfully completed the round 3");

        return true;
    }

}
