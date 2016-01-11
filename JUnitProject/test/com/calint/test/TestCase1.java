package com.calint.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.calint.test.Card;
import com.calint.test.Person;
import com.calint.test.Wallet;

public class TestCase1 {

	Person p1 = new Person("Person 1");
    Wallet w1 = new Wallet(1);
	
    @Before
	public void init()
	{
		Card c1 = new Card('V',100);
        Card c2 = new Card('M',100);
        Card c3 = new Card('D',100);
        
        w1.add_card(c1);
        w1.add_card(c2);
        w1.add_card(c3);
        
        p1.add_wallet(w1);
	}
	
	@Test
	public void test() {
		    
        System.out.println("---------------");
        System.out.println("Q1 : Answers ");
        System.out.println("---------------");
        
        for (Wallet wallet: p1.get_wallets()){
            for (Card card : wallet.get_cards()){
                 System.out.println("Interest per person/card " + card.getInterestAmount());
                 if (card.getType()=='V')
                 assertEquals(10.0, card.getInterestAmount(),0.00);
                 if (card.getType()=='M')
                     assertEquals(5.0, card.getInterestAmount(),0.00);
                 if (card.getType()=='D')
                     assertEquals(1.0, card.getInterestAmount(),0.00);
            }
        }
        
	}
	@After
	public void Display(){
		System.out.println("test is complete");
	}
}
