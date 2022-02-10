/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_millionnaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mhdah
 */
public class HardGame extends Games {

    public HardGame(ArrayList<Question> questions) {
        super(questions);
    }
    @Override
    public boolean Round1() {
        Random random = new Random();
        System.out.println("Welcome to Round 1");

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
        if (!CorrectAnswer(randomIndex)) {
            return false;
        }
        Scanner read = new Scanner(System.in);
        
        System.out.println("Congratulations for the correct answer");
        System.out.println("Lets move to the next question");

        System.out.println("Second Question is for $200");
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
        System.out.println("Third Question is for $300");
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
        System.out.println("Fourth Question is for $500");
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
        System.out.println("Fifth Question is for $1000");
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

        System.out.println("You have successfully completed the round 1");

        return true;
    }

    @Override
    public boolean Round2() {
        Random random = new Random();
        System.out.println("Welcome to Round 2");

        System.out.println("Sixth Question is for $2,000");
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

        System.out.println("Seventh Question is for $4,000");
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
        System.out.println("Eighth Question is for $8,000");
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
        System.out.println("Ninth Question is for $16,000");
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
        System.out.println("Tenth Question is for $32,000");
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

        System.out.println("You have successfully completed the round 2");

        return true;
    }

    @Override
    public boolean Round3() {
        Random random = new Random();
        System.out.println("Welcome to Round 3");

        System.out.println("Eleventh Question is for $64,000");
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

        System.out.println("Twelth Question is for $125,000");
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
        System.out.println("Thirteenth Question is for $250,000");
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
        System.out.println("Fourteenth Question is for $500,000");
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
        System.out.println("Fifteenth Question is for $1,000,000");
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
