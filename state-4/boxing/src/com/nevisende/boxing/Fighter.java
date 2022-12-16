package com.nevisende.boxing;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit() {
        return this.damage;
    }

    public void dodge(int opponentDamage) {
        if(this.health + opponentDamage > 100) {
            return;
        }
        this.health += opponentDamage;
    }

    public void decreaseHealth(int damage){
        if(this.health - damage < 0) {
            this.health = 0;
            return;
        }

        this.health -= damage;
    }
}
