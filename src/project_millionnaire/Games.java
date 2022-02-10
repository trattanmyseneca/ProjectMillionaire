/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_millionnaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mhdah
 */
public abstract class Games {

    private List<Integer> questionsAnswered = new ArrayList<Integer>();
    int randomIndex = -1;
    String answer = "";
    ArrayList<Question> questions;

    private boolean fifty_fifty_lifeine;
    private boolean phoneafriend_lifeine;
    private boolean askAudience_lifeine;

    public Games(ArrayList<Question> questions) {
        this.questions = questions;
        this.fifty_fifty_lifeine = true;
        this.phoneafriend_lifeine = true;
        this.askAudience_lifeine = true;
    }

    public int sizeOfQuestionsList() {
        return questions.size();
    }

    public boolean isFifty_fifty_lifeine() {
        return fifty_fifty_lifeine;
    }

    public void setFifty_fifty_lifeine(boolean fifty_fifty_lifeine) {
        this.fifty_fifty_lifeine = fifty_fifty_lifeine;
    }

    public boolean isPhoneafriend_lifeine() {
        return phoneafriend_lifeine;
    }

    public void setPhoneafriend_lifeine(boolean phoneafriend_lifeine) {
        this.phoneafriend_lifeine = phoneafriend_lifeine;
    }

    public boolean isAskAudience_lifeine() {
        return askAudience_lifeine;
    }

    public void setAskAudience_lifeine(boolean askAudience_lifeine) {
        this.askAudience_lifeine = askAudience_lifeine;
    }

    public void AddQuestionsAnswered(int questionsAnsweredd) {
        this.questionsAnswered.add(questionsAnsweredd);
    }

    public boolean QuestionAnswered(int index) {
        if (this.questionsAnswered != null) {
            return this.questionsAnswered.contains(index);
        } else {
            return false;
        }
    }

    public abstract boolean Round1();

    public abstract boolean Round2();

    public abstract boolean Round3();

    public boolean CorrectAnswer(int questionIndex) {
        UseLifeLine(questionIndex);
        String confirm = "";
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Please Enter Appropriate Alpabet");
            answer = read.nextLine();

            System.out.println("Are you sure this is the final answer (y/n)");
            confirm = read.nextLine();
        } while (!confirm.toUpperCase().equals("Y"));

        if (!answer.toUpperCase().equals(questions.get(randomIndex).getCorrectAnswer())) {
            System.out.println("You lost the game");
            return false;
        } else {
            return true;
        }
    }

    public boolean UseLifeLine(int questionIndex) {

        if(!isFifty_fifty_lifeine()&&!isPhoneafriend_lifeine()&&!isAskAudience_lifeine())
            return false;
        
        Scanner read = new Scanner(System.in);
        System.out.println("If you want to use lifeline press 1");
        if (read.nextInt() != 1) {
            return false;
        }
        System.out.println("Below are the lifelines");
        if (isFifty_fifty_lifeine()) {
            System.out.println("1-Fifty - Fifty");
        }
        if (isPhoneafriend_lifeine()) {
            System.out.println("2-Phone a Friend");
        }
        if (isAskAudience_lifeine()) {
            System.out.println("3-Ask a Audience");
        }
        System.out.println("4-If dont want to use lifeline");
        int lifeline = read.nextInt();
        if (lifeline == 4) {
            return false;
        } else if (lifeline == 1) {
            return fifty_fifty_lifeline(questionIndex);
        }
        else if (lifeline == 2) {
            return phoneafriend_lifeline(questionIndex);
        }
        else if (lifeline == 3) {
            return audience_lifeline(questionIndex);
        }
        return false;
    }

    public boolean fifty_fifty_lifeline(int questionIndex) {
        List<String> ans = new ArrayList<String>();
        ans.add("A");
        ans.add("B");
        ans.add("C");
        ans.add("D");
        String correctanswer = questions.get(questionIndex).getCorrectAnswer();
        Random random = new Random();
        int randomIndex = -1;
        do {
            randomIndex = random.nextInt(ans.size());
            if (randomIndex != ans.indexOf(correctanswer)) {
                ans.remove(randomIndex);
            }
        } while (ans.size() > 2);
        setFifty_fifty_lifeine(false);
        System.out.println("New options are as below");
        for (int i = 0; i < 2; i++) {

            if (ans.get(i) == "A") {
                System.out.println(questions.get(questionIndex).getOptionA());
            }
            if (ans.get(i) == "B") {
                System.out.println(questions.get(questionIndex).getOptionB());
            }
            if (ans.get(i) == "C") {
                System.out.println(questions.get(questionIndex).getOptionC());
            }
            if (ans.get(i) == "D") {
                System.out.println(questions.get(questionIndex).getOptionD());
            }
        }
        return true;
    }

    public boolean phoneafriend_lifeline(int questionIndex) {
        System.out.println("Calling a friend and asking for answer");
        List<String> ans = new ArrayList<String>();
        ans.add("A");
        ans.add("B");
        ans.add("C");
        ans.add("D");
        Random random = new Random();
        int randomIndex = random.nextInt(ans.size());
        setPhoneafriend_lifeine(false);
        System.out.println("Your friend is suggesting Option " + ans.get(randomIndex));

        return true;
    }
    
    public boolean audience_lifeline(int questionIndex) {
        System.out.println("Audience Poll");
        List<String> ans = new ArrayList<String>();
        ans.add("A");
        ans.add("B");
        ans.add("C");
        ans.add("D");
        Random random = new Random();
        int randomIndex = random.nextInt(ans.size());
        setAskAudience_lifeine(false);
        System.out.println("According to audience poll option " + ans.get(randomIndex)+" has the greatest vote");

        return true;
    }

}
