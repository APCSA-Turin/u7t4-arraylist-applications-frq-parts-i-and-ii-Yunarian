package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        // sorts alphabetically by last name
        for (int i = 0; i < list.size() - 1; i++) {
            String currentStudentLastName = list.get(i).getLastName();

            for (int j = list.size() - 1; j >= i; j--) {
                String comparedLastName = list.get(j).getLastName();

                // if the current student's last name comes first alpahabetically
                if (currentStudentLastName.compareTo(comparedLastName) < 0) {
                    list.add(i, list.remove(j));
                }
            }   
        }



        for (int i = 0; i < list.size(); i++) {
            String currentStudentFirstName = list.get(i).getFirstName();
            String currentStudentLastName = list.get(i).getLastName();

            for (int j = list.size() - 1; j >= i; j--) {
                String comparedFirstName = list.get(j).getFirstName();
                String comparedLastName = list.get(j).getLastName();

                if (currentStudentLastName.equals(comparedLastName) && currentStudentFirstName.compareTo(comparedFirstName) < 0) {
                    list.add(i, list.remove(j));
                }
            }
        }      

        for (int i = 0; i < list.size(); i++) {
            String currentStudentFirstName = list.get(i).getFirstName();
            String currentStudentLastName = list.get(i).getLastName();
            double currentStudentGPA = list.get(i).getGpa();

            for (int j = list.size() - 1; j >= 0; j--) {
                String comparedFirstName = list.get(j).getFirstName();
                String comparedLastName = list.get(j).getLastName();
                double comparedStudentGPA = list.get(i).getGpa();

                if (currentStudentLastName.equals(comparedLastName) && 
                currentStudentFirstName.compareTo(comparedFirstName) < 0 &&
                currentStudentGPA > comparedStudentGPA) {
                    list.add(i, list.remove(j));
                }
            }
        }

        // reverses the array
        for (int i = 0; i < list.size(); i++) {
            list.add(0, list.remove(i));
        }
        
        return list;
        
    }

}
