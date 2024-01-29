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
        System.out.println("Enter the word: ");
        String a = sc.next();
        if (CheckExist(dictionary, a)) {
            String meaning = FindMeaning(dictionary, a);
            System.out.print(meaning);
        } else {
            System.out.print(a + " does not exist in the dictionary");
        }

    }

    public static void Input(HashMap<String, String> dictionary) {
        dictionary.put("key", "chia khoa");
        dictionary.put("book", "sach");
        dictionary.put("school", "truong hoc");
        dictionary.put("computer", "may tinh");
        dictionary.put("class", "lop");
        dictionary.put("keyboard", "ban phim");
        dictionary.put("study", "hoc");
        dictionary.put("graduate", "tot nghiep");
        dictionary.put("action", "hanh dong");
        dictionary.put("uniform", "đong phuc");

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
