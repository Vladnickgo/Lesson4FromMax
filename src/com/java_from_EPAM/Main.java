package com.java_from_EPAM;

public class Main {

    public static void main(String[] args) {
        Student[] studentsArray = new Student[10];
        studentsArray[0] = new Student(1, "Иванов", "Иван", "Иванович", 2010, "Сумы", "0991234567", "мехмат", 1, "123");
        studentsArray[1] = new Student(2, "Петров", "Иван", "Иванович", 2009, "Сумы", "0991234567", "физмат", 1, "123");
        studentsArray[2] = new Student(3, "Сидоров", "Иван", "Иванович", 2008, "Сумы", "0991234567", "мехмат", 2, "223");
        studentsArray[3] = new Student(4, "Иваненко", "Иван", "Иванович", 2007, "Сумы", "0991234567", "физмат", 2, "223");
        studentsArray[4] = new Student(5, "Петренко", "Иван", "Иванович", 2006, "Сумы", "0991234567", "мехмат", 3, "323");
        studentsArray[5] = new Student(6, "Сидоренко", "Иван", "Иванович", 2005, "Сумы", "0991234567", "физмат", 3, "323");
        studentsArray[6] = new Student(7, "Ивановский", "Иван", "Иванович", 2004, "Сумы", "0991234567", "мехмат", 4, "423");
        studentsArray[7] = new Student(8, "Петровский", "Иван", "Иванович", 2003, "Сумы", "0991234567", "физмат", 4, "423");
        studentsArray[8] = new Student(9, "Сидоровский", "Иван", "Иванович", 2002, "Сумы", "0991234567", "физмат", 5, "523");
        studentsArray[9] = new Student(10, "Иваненко", "Иван", "Иванович", 2001, "Сумы", "0991234567", "мехмат", 5, "523");
        listOfFaculty("физмат",studentsArray);
        listFacultyAndCourses(studentsArray);
    }

    public static void listOfFaculty(String faculty,Student[] studentsArray) {
        System.out.println("Задание А");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].faculty == faculty) System.out.println(studentsArray[i].toString());
        }
    }
    public static void listFacultyAndCourses(Student[] studentsArray) {
        System.out.println("");
        System.out.println("Задание Б");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].faculty == "физмат"){
                System.out.println(studentsArray[i].toStringShort());
            }
        }
        System.out.println("");
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i].faculty == "мехмат"){
                System.out.println(studentsArray[i].toStringShort());
            }
        }

    }




    }


