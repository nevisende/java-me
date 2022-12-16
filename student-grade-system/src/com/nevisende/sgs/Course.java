package com.nevisende.sgs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int vivaGrade;
    int examGrade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.vivaGrade = 0;
        this.examGrade = 0;
    }

    public double getGrade(){
        return this.examGrade * 0.8 + this.vivaGrade * 0.2;
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
}