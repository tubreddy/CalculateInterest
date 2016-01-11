package com.calint.test;

import java.util.*;
public class Person{
    List<Wallet > wallet_list = new ArrayList<Wallet>();
    String name;
    public Person(String iName){
        name = iName;
        
    }
    public void add_wallet(Wallet wallet){
        wallet_list.add(wallet);
    }
    public List<Wallet> get_wallets(){
        return wallet_list;
    }
    
    public double calculate_interest(){
        double sum = 0;
        for (Wallet wallet: wallet_list)
        {
          sum +=  wallet.calculate_interest();  
        }
        
        return sum;
        
    }
}