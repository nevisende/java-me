import java.util.Scanner;

public class InteractToUser {
    static Console console = new Console();

    InteractToUser(){
        String welcome = "<  Welcome to my Advanced Calculator program  >";
        console.printHyphen(welcome.length());
        console.println(welcome);
        console.printHyphen(welcome.length());
        console.breakLine();
    }

    public int runMainFunc(){
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";


        System.out.println(menu);
        System.out.print("Lütfen bir işlem seçiniz : ");
        select = scan.nextInt();
        console.breakLine();
        switch (select) {
            case 1:
                AdvancedCalculator.plus();
                break;
            case 2:
                AdvancedCalculator.minus();
                break;
            case 3:
                AdvancedCalculator.times();
                break;
            case 4:
                AdvancedCalculator.divided();
                break;
            case 5:
                AdvancedCalculator.power();
                break;
            case 6:
                AdvancedCalculator.factorial();
                break;
            case 7:
                AdvancedCalculator.mod();
                break;
            case 8:
                AdvancedCalculator.rectangleDimensions();
            case 0:
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
        }

        console.breakLine(2);
        return select;

    }

    public void mainFuncLoop(){
        int terminalStationCode = runMainFunc();
        while (terminalStationCode != 0) {
            terminalStationCode = runMainFunc();

            if(terminalStationCode == 0) console.println("Programımı kullandığınız için teşekkürler.");

            console.breakLine();
        }
    }


}
