/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.engvietdictionary;

import java.util.*;

/**
 *
 * @author vygir
 */
public class EngVietDictionary {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        Input(dictionary);
        int menu = 1;
        while (menu != 0) {
            System.out.println("Enter the word: ");
            String a = sc.next();
            if (CheckExist(dictionary, a)) {
                String meaning = FindMeaning(dictionary, a);
                System.out.print(meaning);
            } else {
                System.out.print(a + " does not exist in the dictionary");
            }
            System.out.println("Do you want to search words?");
            menu = sc.nextInt();
        }

    }

    public static void Input(HashMap<String, String> dictionary) {
        dictionary.put("key", "từ khóa");
        dictionary.put("book", "sách");
        dictionary.put("school", "trường học");
        dictionary.put("computer", "máy tính");
        dictionary.put("class", "lớp");
        dictionary.put("keyboard", "bàn phím");
        dictionary.put("study", "học");
        dictionary.put("graduate", "tốt nghiệp");
        dictionary.put("action", "hành động");
        dictionary.put("uniform", "đồng phục");

    }

    public static boolean CheckExist(HashMap<String, String> dictionary, String a) {
        for (String e : dictionary.keySet()) {
            if (e.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static String FindMeaning(HashMap<String, String> dictionary, String a) {
        String meaning = "";
        for (String e : dictionary.keySet()) {
            if (e.equals(a)) {
                meaning = dictionary.get(e);
            }
        }
        return meaning;
    }
}
