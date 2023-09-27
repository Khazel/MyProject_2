package Lecture_7.Homework_7;

import java.util.Random;

public class Enemy {
    int health;
    int strength;
    int level;

    Enemy(int health, int strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    Enemy() {
        this.health = 150;
        this.strength = 4;
        this.level = 1;
    }

    public void attack(Hero hero) {
        Random rn = new Random();

        int criticalChance = rn.nextInt(1, 101);

        boolean isCriticalHit = (criticalChance <= 10) ? true : false;

        if (isCriticalHit) {
            int damage = strength + 3;
            hero.health -= damage;
            System.out.println("It is a critical hit! Enemy attacks and deals " + damage + " damage. Hero health is now " + hero.health);
            System.out.println();
        } else {
            hero.health -= strength;
            System.out.println("Enemy attacks and deals " + strength + " damage. Hero health is now " + hero.health);
            System.out.println();
        }
    }
}
