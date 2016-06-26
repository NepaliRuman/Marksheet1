/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksheet1.Marksheet;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarkSheet marks = new MarkSheet();
        Scanner input = new Scanner(System.in);
        
        //importing subjects form marksheet and taking user input///
        
        System.out.println("Enter The Marks In Computer: ");
        marks.setComputer(input.nextInt());
        
        System.out.println("Enter The Marks in English: ");
        marks.setEnglish(input.nextInt());
        
        System.out.println("Enter The Marks in Nepali: ");
        marks.setNepali(input.nextInt());
        
        System.out.println("Enter The Marks In Science: ");
        marks.setSciencce(input.nextInt());
        
        System.out.println("Enter The Marks In Social: ");
        marks.setSocial(input.nextInt());
        
        System.out.println("Enter The Marks In Math: ");
        marks.setMath(input.nextInt());
        
        //importing total and percentage//
        
        marks.total();
        marks.percentage(); 
    }
}

    
