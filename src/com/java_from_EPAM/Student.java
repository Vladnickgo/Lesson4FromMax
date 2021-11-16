package com.java_from_EPAM;

public class Student {
    int id;
    String lastName;
    String name;
    String patronymic;
    int yearOfBirth;
    String address;
    String phone;
    String faculty;
    int course;
    String group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(int id, String lastName, String name, String patronymic, int yearOfBirth, String address, String phone, String faculty, int course, String group) {

        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + "\t" +
                ", name='" + name + "\t" +
                ", patronymic='" + patronymic + "\t" +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + "\t" +
                ", phone='" + phone + "\t" +
                ", faculty='" + faculty + "\t" +
                ", course=" + course +
                ", group='" + group + "\t" +
                '}';
    }
    public String toStringShort() {
        return "Student{" +
                ", lastName='" + lastName + "\t" +
                ", name='" + name + "\t" +
                ", patronymic='" + patronymic + "\t" +
                ", faculty='" + faculty + "\t" +
                ", course=" + course +
                ", group='" + group + "\t" +
                '}';
    }

}
