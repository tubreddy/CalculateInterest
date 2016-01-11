package com.calint.test;

//import java.util.*;
public class Card{
    char type ;
    double amount = 0.0;
    double interest_amount = 0.0;
    
    public Card(){}
    public Card(char iType, double iAmount)
    {
        type =  iType;
        amount =  iAmount;
    }	
    
    //public void setType(char iType){ type = iType; }
    //public void setAmount(char iAmount){ amount = iAmount; }
    
    public char getType(){ return type;}
    public double getAmount(){ return amount;}
    public double getInterestAmount(){ return calculateInterest();}
    
    public double calculateInterest()
    {
        if (type == 'V'){
            return amount * 0.1;
        }
        else if (type == 'M'){
            return amount * 0.05;
        }
        else{
            return amount * 0.01;
        }
    }

}