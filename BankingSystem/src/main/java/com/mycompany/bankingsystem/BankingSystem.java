/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingsystem;

import java.util.*;

/**
 *
 * @author vygir
 */
public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do{
            System.out.print("1. Create TPBank Account \n"
                    + "2. Create VietcomBank Account \n");
            i = sc.nextByte();
            switch(i){
                case 1:
                    TPBank account = new TPBank();
                    System.out.println(account.getBankName());
                    break;
                case 2:
                    VietcomBank acc = new VietcomBank();
                    System.out.println(acc.getBankName());
                    break;
            }
        }while(i!=0);
    }
}
