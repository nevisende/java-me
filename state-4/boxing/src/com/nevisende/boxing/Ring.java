package com.nevisende.boxing;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Ring {
    Fighter firstFighter;
    Fighter secondFighter;
    int minWeight;
    int maxWeight;
    String winner = null;
    Random random = new Random();


    public Ring(Fighter firstFighter, Fighter secondFighter, int minWeight, int maxWeight) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            match();
            announceWinner();
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public void match(){
        Fighter[] fighters = { firstFighter, secondFighter};
        System.out.println("======== Maç Başlıyor ===========");

        roundLabel: for (short round = 0; round < 3 ; round++){
            // Kazananı bulana kadar fazla beklememek için 3 rand da 10 ar atak olmasını tasarladım
            for(short attack = 0; attack < 10; attack++){
                System.out.println("======== " + round + ". Round ===========");
                int randomIndex = random.nextInt(2);
                int anotherIndex = randomIndex == 1 ? 0 : 1;
                Fighter randomSelectedFighter = fighters[randomIndex];
                Fighter anotherFighter = fighters[anotherIndex];

                int damageFromRandomSelectedFighter = randomSelectedFighter.hit();
                anotherFighter.decreaseHealth(damageFromRandomSelectedFighter);
                System.out.println(randomSelectedFighter.name + "ten " +
                        anotherFighter.name + "'e " +
                        randomSelectedFighter.hit() + " hasarında bir yumruk atıldı.");

                if(random.nextInt(100) > 60) {
                    anotherFighter.dodge(damageFromRandomSelectedFighter);
                    System.out.println("Ama " + anotherFighter.name + " o yumruğu savurdu.");
                }
                if (firstFighter.health == 0) {
                    winner = secondFighter.name;
                    break roundLabel;
                } else if (secondFighter.health == 0){
                    winner = firstFighter.name;
                    break roundLabel;
                }
            }
        }
    }

    public void announceWinner() {
        if (winner != null) {
            System.out.println("Maçı Kazanan : " + winner);
        } else{
            System.out.println("Maç berabere bitti.");
        }
    }
    public boolean checkWeight() {
        return (firstFighter.weight >= minWeight && firstFighter.weight <= maxWeight) && (secondFighter.weight >= minWeight && secondFighter.weight <= maxWeight);
    }
}

