package com.calint.test;

import java.util.*;
public class Wallet{
    List<Card > cards_list = new ArrayList<Card>();
    int num = 0;
    public Wallet(int number){
        num = number;
    }
    
    public void add_card(Card iCard){
        cards_list.add(iCard);
    }
    
    public List<Card> get_cards(){
        return cards_list;
    }
    
    public int wallet_number(){
        return num;
    }
    
    public double calculate_interest(){
        double sum = 0;
        for (Card card: cards_list)
        {
          sum +=  card.getInterestAmount();  
        }
        
        return sum;
        
    }
       
}
