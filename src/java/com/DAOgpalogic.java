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
public class DAOgpalogic {
     
     public float checkByMarks(float marks){
        if(marks >= 89.5){
            return 4;
        }
        else if(marks >= 79.5){
            return 4;
        }
        else if(marks >= 76.5){
            return 4;
        }
        else if(marks >= 73.5){
            return (float) 3.33;
        }
        else if(marks >= 69.5){
            return 3;
        }
        else if(marks >= 66.5){
            return (float) 2.66;
        }
        else if(marks >= 63.5){
            return (float) 2.33;
        }
        else if(marks >= 59.5){
            return (float) 2;
        }
        else if(marks >= 49.5){
            return (float) 1.5;
        }
        else if(marks < 49.5){
            return 0;
        }        
        
        return 0;
    }
     
      public float checkByGrades(String grades){
        if("A1".equals(grades)){
            return (float) 4;
        }
        else if("A2".equals(grades)){
            return (float) 4;
        }
        else if("A3".equals(grades)){
            return (float) 3.66;
        }
        else if("B1".equals(grades)){
            return (float) 3.33;
        }
        else if("B2".equals(grades)){
            return (float) 3;
        }
        else if("B3".equals(grades)){
            return (float) 2.66;
        }
        else if("C1".equals(grades)){
           return (float) 2.33;
        }
        else if("C2".equals(grades)){
           return (float) 2;
        }
        else if("D1".equals(grades)){
            return (float) 1.5;
        }
        else if("F".equals(grades)){
            return (float) 0;
        }        
        
        return 0;
    }
      
    public float checkGpaByPercentage(String grades){
        if("A1".equals(grades)){
            return (float) 89.5;
        }
        else if("A2".equals(grades)){
            return (float) 79.5;
        }
        else if("A3".equals(grades)){
            return (float) 76.5;
        }
        else if("B1".equals(grades)){
            return (float) 73.5;
        }
        else if("B2".equals(grades)){
            return (float) 69.5;
        }
        else if("B3".equals(grades)){
            return (float) 66.5;
        }
        else if("C1".equals(grades)){
           return (float) 63.5;
        }
        else if("C2".equals(grades)){
           return (float) 59.5;
        }
        else if("D1".equals(grades)){
            return (float) 49.5;
        }
        else if("F".equals(grades)){
            return (float) 49.5;
        }        
        
        return 0;
    }
}
