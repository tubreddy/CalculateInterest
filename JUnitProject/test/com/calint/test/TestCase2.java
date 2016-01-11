package com.calint.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calint.test.Card;
import com.calint.test.Person;
import com.calint.test.Wallet;

public class TestCase2 {

	@Test
	public void test() {
		Person p2 = new Person("Person 2");
        
        Wallet w21 = new Wallet(21);
        Card c21 = new Card('V',100);
        Card c23 = new Card('D',100);
        w21.add_card(c21);
        w21.add_card(c23);
        
        Wallet w22 = new Wallet(22);
        Card c22 = new Card('M',100);
        w22.add_card(c22);
        
        p2.add_wallet(w21);
        p2.add_wallet(w22);
        
        System.out.println("---------------");
        System.out.println("Q2 : Answers ");
        System.out.println("---------------");
        
        System.out.println("Interest per wallet "+ w21.wallet_number()+" is " + w21.calculate_interest());
        assertEquals(11.0, w21.calculate_interest(),0.00);
        System.out.println("Interest per wallet "+ w22.wallet_number()+" is " + w22.calculate_interest());
        assertEquals(5.0, w22.calculate_interest(),0.00);
        System.out.println("Total simple interst " + p2.calculate_interest());
        assertEquals(16.0, p2.calculate_interest(),0.00);
        
	}

}
