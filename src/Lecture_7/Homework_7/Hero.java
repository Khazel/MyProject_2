package Lecture_7.Homework_7;

import java.util.Random;

public class Hero {
    String name;
    int health;
    int strength;
    int experience;
    int level;

    Hero(String name, int health, int strength, int experience, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.experience = experience;
        this.level = level;
    }

    Hero() {
        this.name = "Default Hero";
        this.health = 100;
        this.strength = 7;
        this.experience = 0;
        this.level = 1;
    }

    public void attack(Enemy enemy) {
        Random rn = new Random();

        int criticalChance = rn.nextInt(1, 101);

        boolean isCriticalHit = (criticalChance <= 30) ? true : false;

        if (isCriticalHit) {
            int damage = strength + 3;
            enemy.health -= damage;
            System.out.println("It is a critical hit! Hero attacks and deals " + damage + " damage. Enemy health is now " + enemy.health);
            System.out.println();
        } else {
            enemy.health -= strength;
            System.out.println("Hero attacks and deals " + strength + " damage. Enemy health is now " + enemy.health);
            System.out.println();
        }
    }

    public void avoid(Hero hero) {
        hero.experience -= 10;
        if (hero.health <= 49) {
            hero.health += 50;
        } else {
            hero.health = 100;
        }
    }

    public void levelUp(Hero hero) {
        Random rn = new Random();

        hero.health = (hero.health + 50) * hero.level;
        hero.strength = (hero.strength + (rn.nextInt(3, 7))) * hero.level;
        hero.level += 1;
        hero.experience = 0;

        System.out.println(hero.name + " receives enough experience to level up! " + hero.name + " level is now " + hero.level + ". " +
                hero.name + " health is increased and now is " + hero.health + ". " +
                hero.name + " strength is increased and now is " + hero.strength);
    }
}
