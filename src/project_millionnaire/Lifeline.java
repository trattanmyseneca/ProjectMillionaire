/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_millionnaire;

import java.util.Scanner;

/**
 *
 * @author mhdah
 */
public abstract class Lifeline {

    private boolean isTaken;

    public Lifeline(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public boolean isIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
    
    public void lifelineuse(){
        Scanner read = new Scanner(System.in);
        System.out.println("1.Fifty - Fifty");
        System.out.println("2.Phone a friend");
        System.out.println("3.Ask the audience");
        int input = read.nextInt();
    }
    
    public abstract boolean Lifelineprocess();
    
}
