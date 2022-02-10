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
public class Project_Millionnaire {

    /**
     * @param args the command line arguments
     */
    ArrayList<Question> questions = new ArrayList();
    int questionsAnswered[] = new int[15];
    int randomIndex = -1;
    String answer = "";

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Project_Millionnaire pm = new Project_Millionnaire();
            String name = "";
            int input = 0;
            do {
                input = pm.launchscreen();
                switch (input) {
                    case 1:
                        System.out.println("game started");
                        break;
                    case 2:
                        System.out.println("rules");                    
                        return;
                    case 3:
                        System.out.println("exit");
                        return;
                    default:
                        System.out.println("You have entered the wrong input");
                        break;
                }
            } while (input < 1 || input > 3);
            int difficultyOption = 0;

            Scanner read = new Scanner(System.in);
            if (input == 1) {
                System.out.println("Please enter your name");
                name = read.nextLine();
                do {
                    difficultyOption = pm.DifficultyOptionSelector();
                    switch (difficultyOption) {
                        case 1:
                            System.out.println("Easy optio selected");
                            break;
                        case 2:
                            System.out.println("Hard game selected");
                            break;
                        default:
                            System.out.println("You have enetered the wrong input");
                            break;
                    }
                } while (difficultyOption < 1 || difficultyOption > 2);

            }
            Games games;
            if (difficultyOption == 2) {
                games = new HardGame(pm.CreateQuestions());
            } else if (difficultyOption == 1) {
                games = new EasyGame(pm.CreateQuestions());
            } else {
                games = null;
            }
            if (games.Round1()) {
                do {
                    System.out.println("1-Walk out from the game with money");
                    System.out.println("2-Countinue for second round");
                    input = read.nextInt();
                    if (input == 1) {
                        System.out.println("You have won $1,000.00. Thank you and have a nice day");
                    } else if (input == 2) {
                        System.out.println("You are entering round 2");
                        if (games.Round2()) {
                            do {
                                System.out.println("1-Walk out from the game with money");
                                System.out.println("2-Countinue for third round");
                                input = read.nextInt();
                                if (input == 1) {
                                    System.out.println("You have won $32,000. Thank you and have a nice day");
                                } else if (input == 2) {
                                    System.out.println("You are entering round 2");
                                    if (games.Round3()) {
                                        System.out.println("You have won $1,000,000. Thank you and have a nice day");
                                    }
                                }
                            } while (input < 1 || input > 2);
                        }
                    }
                } while (input < 1 || input > 2);
            } else {
                System.out.println("Sorry you have lost the game");
            }
        }
        catch(Exception ex){
                System.out.println(ex);
        }
    }

    public int launchscreen() {
        Scanner read = new Scanner(System.in);
        System.out.println("1.Start the game");
        System.out.println("2.View the Rules of the game");
        System.out.println("3.Exit the game");
        int input = read.nextInt();
        return input;
    }

    public int DifficultyOptionSelector() {
        Scanner read = new Scanner(System.in);
        System.out.println("1.Easy Option");
        System.out.println("2.Hard Option");
        int input = read.nextInt();
        return input;
    }

    public ArrayList<Question> CreateQuestions() {
        ArrayList<Question> questions = new ArrayList();
        questions.add(new Question("What does CPU stand for?", "A-Central Process Unit", "B-Computer Personal Unit", "C-Central Processing Unit", "D-Central Processor Unit", "C"));
        questions.add(new Question("What does the &quot;MP&quot; stand for in MP3?", "A-Moving Picture", "B-Music Player", "C-Multi Pass", "D-Micro Point", "A"));
        questions.add(new Question("Which company was established on April 1st, 1976 by Steve Jobs, Steve Wozniak and Ronald Wayne?", "A-Apple", "B-Microsoft", "C-Atari", "D-Commodore", "A"));
        questions.add(new Question("In any programming language, what is the most common way to iterate through an array?", "A-For loops", "B-If Statements", "C-Do-while loops", "D-While loops", "A"));
        questions.add(new Question("According to the International System of Units, how many bytes are in a kilobyte of RAM?", "A-1000", "B-512", "C-1024", "D-500", "A"));
        questions.add(new Question("What does GHz stand for?", "A-Gigahertz", "B-Gigahotz", "C-Gigahetz", "D-Gigahatz", "A"));
        questions.add(new Question("HTML is what type of language?", "A-Markup Language", "B-Macro Language", "C-Programming Language", "D-Scripting Language", "A"));
        questions.add(new Question("What amount of bits commonly equals one byte?", "A-8", "B-1", "C-2", "D-64", "A"));
        questions.add(new Question("In the programming language Java, which of these keywords would you put on a variable to make sure it doesn&#039;t get modified?", "A-Final", "B-Static", "C-Private", "D-Public", "A"));
        questions.add(new Question("If you were to code software in this language you&#039;d only be able to type 0&#039;s and 1&#039;s.", "A-Binary", "B-JavaScript", "C-C++", "D-Python", "A"));
        questions.add(new Question("What is the code name for the mobile operating system Android 7.0?", "A-Nougat", "B-Ice Cream Sandwich", "C-Jelly Bean", "D-Marshmallow", "A"));
        questions.add(new Question("On Twitter, what was the original character limit for a Tweet?", "A-140", "B-120", "C-160", "D-100", "A"));
        questions.add(new Question("Which computer language would you associate Django framework with?", "A-Python", "B-C#", "C-C++", "D-Java", "A"));
        questions.add(new Question("The numbering system with a radix of 16 is more commonly referred to as ", "A-Hexidecimal", "B-Binary", "C-Duodecimal", "D-Octal", "A"));
        questions.add(new Question("The C programming language was created by this American computer scientist.", "A-Dennis Ritchie", "B-Tim Berners Lee", "C-al-Khwārizmī", "D-Willis Ware", "A"));

        //Random random = new Random();
        //int randomIndex = random.nextInt(questions.size());
        //questions.get(randomIndex).getTitle();
        return questions;
    }

    public void ChooseLifeline() {

    }

}
