package com.nevisende.sgs;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamGrade(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examGrade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examGrade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examGrade = kimya;
        }

    }
    public void addBulkVivaGrade(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.vivaGrade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.vivaGrade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.vivaGrade = kimya;
        }
    }

    public void isPass() {
        if (this.mat.getGrade() == 0 || this.fizik.getGrade() == 0 || this.kimya.getGrade() == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.getGrade() + this.kimya.getGrade() + this.mat.getGrade()) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.getGrade());
        System.out.println("Fizik Notu : " + this.fizik.getGrade());
        System.out.println("Kimya Notu : " + this.kimya.getGrade());
    }

}
