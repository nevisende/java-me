public class AdvancedCalculator {
    static Console console = new Console();
    static void plus() {
        int counter = console.askAndGetIntValue("Kaç adet sayı gireceksiniz :");
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            number = console.askAndGetIntValue(i + ". sayı :");
            result += number;
        }

        console.printlnXisY("Sonuç: ", String.valueOf(result));
    }

    static void minus() {
        int counter = console.askAndGetIntValue("Kaç adet sayı gireceksiniz :");
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            number = console.askAndGetIntValue(i + ". sayı :");
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        console.printlnXisY("Sonuç: ", String.valueOf(result));
    }

    static void times() {
        int counter = console.askAndGetIntValue("Kaç adet sayı gireceksiniz :");
        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            number = console.askAndGetIntValue(i + ". sayı :");
            result *= number;
        }

        console.printlnXisY("Sonuç: ", String.valueOf(result));
    }

    static void divided() {
        int counter = console.askAndGetIntValue("Kaç adet sayı gireceksiniz :");
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            number = console.askAndGetDoubleValue(i + ". sayı :");
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        console.printlnXisY("Sonuç: ", String.valueOf(result));
    }

    static void power() {
        int base = console.askAndGetIntValue("Taban değeri giriniz :");
        int exponent = console.askAndGetIntValue("Üs değeri giriniz :");
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        console.printlnXisY("Sonuç: ", String.valueOf(result));
    }

    static void factorial() {
        int n = console.askAndGetIntValue("Sayı giriniz :");
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        console.printlnXisY("Sonuç: ", String.valueOf(result));
    }

    static void mod(){
        int x = console.askAndGetIntValue("Modu alınacak sayıyı girin: ");
        int y = console.askAndGetIntValue("Modu giriniz: ");

        console.printlnXisY("Sonuç: ", String.valueOf(x%y));
    }

    static void rectangleDimensions(){
        int x = console.askAndGetIntValue("Kısa kenarı giriniz: ");
        int y = console.askAndGetIntValue("Uzun kenarı giriniz: ");

        console.printlnXisY("Çevresi: ", String.valueOf((x+y)*2));
        console.printlnXisY("Alanı: ", String.valueOf(x * y));
    }
}
