package com.nevisende.boxing;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Мuhammad Ali" , 10 , 100, 90, 50);
        Fighter alex = new Fighter("Sonny Liston" , 10 , 100, 100, 50);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
