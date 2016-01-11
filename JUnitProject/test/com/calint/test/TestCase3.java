package com.calint.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calint.test.Card;
import com.calint.test.Person;
import com.calint.test.Wallet;

public class TestCase3 {

	@Test
	public void test() {
		System.out.println("---------------");
        System.out.println("Q3 : Answers ");
        System.out.println("---------------");
        
        Person p3 = new Person("Person 3");
        Person p4 = new Person("Person 4");
        
        Wallet w31 = new Wallet(31);
        Card c31 = new Card('M',100);
        Card c32 = new Card('V',100);
        Card c33 = new Card('M',100);
        Card c34 = new Card('V',100);
        w31.add_card(c31);
        w31.add_card(c32);
        w31.add_card(c33);
        w31.add_card(c34);
        
        Wallet w41 = new Wallet(41);
        Card c41 = new Card('M',100);
        Card c42 = new Card('V',100);
        w41.add_card(c41);
        w41.add_card(c42);
        
        p3.add_wallet(w31);
        p4.add_wallet(w41);
       
        System.out.println("Interest per wallet "+ w31.wallet_number()+" is " + w31.calculate_interest());
        assertEquals(30.0, w31.calculate_interest(),0.00);
        System.out.println("Interest per wallet "+ w41.wallet_number()+" is " + w41.calculate_interest());
        assertEquals(15.0, w41.calculate_interest(),0.00);
        System.out.println("Total simple interst " + p3.calculate_interest());
        assertEquals(30.0, p3.calculate_interest(),0.00);
        System.out.println("Total simple interst " + p4.calculate_interest());
        assertEquals(15.0, p4.calculate_interest(),0.00);
                       
	}

}
