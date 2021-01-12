package com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ocama
 */
public class DAOcgpalogic {
    //total_cgpa.setText("" + cgpa);
                //System.out.println(cgpa + " is cgpa of semester " + semester);
                
                //semester++;
                //lbl_semester.setText("" + semester);
   public float calCgpa(int semester, float gpa, float answer){
        

    try{
        float calgpa = answer;

        if(calgpa==0){
            float sem = gpa;
            return calgpa = (calgpa + sem) / 1;
        }
        else{
            float sem = gpa;
            return calgpa = (calgpa + sem) / 2;
        }
    }
    catch(Exception ex){
    System.out.print(ex);
    }
       
       return (float) 0;
   }
    
}
