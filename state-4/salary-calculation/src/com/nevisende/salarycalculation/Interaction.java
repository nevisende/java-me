package com.nevisende.salarycalculation;

import java.util.Scanner;

public class Interaction {
    Interaction() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ad ve Soyad yazınız: ");
        String name = input.nextLine();

        System.out.print("Maaşı yazınız : ");
        double salary = input.nextDouble();

        System.out.print("Haftalık çalışma saatini yazınız : ");
        short workHours = input.nextShort();

        System.out.print("İşe başlangıç yılını yazınız : ");
        int hireYear = input.nextInt();

        Employee firstPerson = new Employee(name, salary,hireYear, workHours);
        longHyphens();
        System.out.print("Çalışanın verileri kaydedildi, bilgilerini görmek için : 1\nYeni bir çalışan girdisi oluşturmak için : 2\n"
                +"Çıkış yapmak için : 0 \n'a basınız : ");

        byte optionNumber = input.nextByte();

        if(optionNumber == 2) {
            new Interaction();
        } else if(optionNumber == 1) {
            longHyphens();
            firstPerson.toString();
            longHyphens();
            System.out.println("Çıkış yapmak ister misiniz? (y / n) : ");

            boolean isNo = input.hasNext("n");
            if(isNo) {
                new Interaction();
            }
        }
    }

    public void longHyphens(){
        System.out.println("----------------------------------------------------------------------------------------");

    }
}
