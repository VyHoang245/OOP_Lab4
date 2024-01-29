/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.university;

import java.util.*;

/**
 *
 * @author vygir
 */
public class University {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Vector<Student> student = new Vector<>();
        CollegeStudent a = new CollegeStudent(5, "1", "Vy", 120, 7);
        student.add(a);
        UniversityStudent b = new UniversityStudent("A", 8, "3", "zyzy", 150, 9);
        student.add(b);
        CollegeStudent c = new CollegeStudent(3.0, "4", "le", 130, 3.2);
        student.add(c);
        
        int menu;
        do {
            System.out.print("1. Add a new college student.\n"
                    + "2. Add a new university student.\n"
                    + "3. Remove a student from the list with the student code entered from the keyboard.\n"
                    + "4. Print student list.\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible\n"
                    + "students.\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code\n"
                    + "7. Find student list by student's full name (Contains).\n"
                    + "8. Exit");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    AddCollege(student);
                    break;
                case 2:
                    AddUniversity(student);
                    break;
                case 3:
                    RemoveByStudentCode(student);
                    break;
                case 4:
                    Print(student);
                    break;
                case 5:
                    ElegibleGraduation(student);
                    break;
                case 6:
                    SortAscendingByTypeAndCode(student);
                    break;
                case 7:
                    FindByName(student);
                    break;

            }
        } while (menu != 8);
    }

    public static void AddCollege(Vector<Student> student) {
        CollegeStudent a = new CollegeStudent();
        a.Input();
        student.add(a);
    }

    public static void AddUniversity(Vector<Student> student) {
        UniversityStudent a = new UniversityStudent();
        a.Input();
        student.add(a);
    }

    public static void Print(Vector<Student> student) {
        for (int i = 0; i < student.size(); i++) {
            student.get(i).getInfo();
        }
    }

    public static void RemoveByStudentCode(Vector<Student> student) {
        System.out.print("Enter student code: ");
        String code = sc.next();
        boolean flag = false;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentNumber().equals(code)) {
                student.remove(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("There is no student who has code " + code);
        }
    }

    public static void ElegibleGraduation(Vector<Student> student) {
        int count = 0;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).Graduation()) {
                student.get(i).getInfo();
                count++;
            }
        }
        System.out.println("The number of students eligible for graduation is: " + count);
    }

    public static void SortAscendingByTypeAndCode(Vector<Student> student) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if(s1.StudentType()<s2.StudentType()){
                    return -1;
                }
                else{
                    if(s1.StudentType()==s2.StudentType()){
                        return s1.getStudentNumber().compareTo(s2.getStudentNumber());
                    }
                    else{
                        return 1;
                    }
                }
                

            }
        };
        student.sort(com);
    }
    public static void FindByName(Vector<Student> student){
        System.out.print("Enter name: ");
        String name = sc.next();
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).getName().toUpperCase().contains(name.toUpperCase())){
                student.get(i).getInfo();
            }
        }
    }
}
