package com.chap9;

public class Teacher {

    //step-1:Instane variable declare
    int id;
    String name;
    String educationqualification;
    //step-2:

    //step-3: create setters method
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationqualification(String educationqualification) {
        this.educationqualification = educationqualification;
    }

    //step-4
    public static void main(String[] args) {
        //step-5: create object using default constructor
        Teacher teacherOfHistory = new Teacher();
        //step-6: set value within object teacher
        teacherOfHistory.setId(1000);
        teacherOfHistory.setName("Mr.Jogru babu");
        teacherOfHistory.setEducationqualification("BBA");
        System.out.println(teacherOfHistory);
        //System.out.println(teacherOfHistory.getId());
       // System.out.println(teacherOfHistory.getName());
       // System.out.println(teacherOfHistory.getEducationqualification());

    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", educationqualification=" + educationqualification + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationqualification() {
        return educationqualification;
    }

}
