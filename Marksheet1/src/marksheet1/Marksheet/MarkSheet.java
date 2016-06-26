/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksheet1.Marksheet;

/**
 *
 * @author dell
 */
public class MarkSheet {

    private double math, science, socail, english, computer, nepali;
    private double total = 0, percentage;

    public void setMath(double math) {
        this.math = math;
    }

    public void setSciencce(double science) {
        this.science = science;

    }

    public void setSocial(double socail) {
        this.socail = socail;

    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public void setComputer(double computer) {
        this.computer = computer;

    }

    public void setNepali(double neplai) {
        this.nepali = nepali;
    }

    public void total() {
        total = math + science + socail + english + computer + nepali;
        System.out.println("The Total Marks You Have Secured: " + total);
    }

    public void percentage() {
        percentage = total / 5;
        System.out.println("The Percentage You Have Secured: " + percentage + "%");

        if (percentage < 100 || percentage > 80)
        {
            System.out.println("Distinction");
        }
        else if (percentage < 80 || percentage >=60) {
            System.out.println("First Division");
        } else if (percentage > 60 || percentage >= 50) {
            System.out.println("Second Division");
        } else if (percentage > 50 || percentage >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println(" You Are Fail ");
        }
    }
}
