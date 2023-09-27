package Lecture_7.Homework_7;

import java.util.Random;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Please enter your hero name");
        String heroName = sn.nextLine();

        int heroStrength = rn.nextInt(5, 11);

        System.out.println();

        Hero hero = new Hero(heroName, 100, heroStrength, 0, 1);
        System.out.println(hero.name + " health is " + hero.health + " and " + hero.name + " strength is " + hero.strength);

        System.out.println();

        for (int i = 0; i <= 9; i++) {

            System.out.println("Please type 'Fight' if you want to fight next enemy, or 'Avoid' if you want to skip this fight");

            String userInput = sn.nextLine();

            if (userInput.equalsIgnoreCase("Fight")) {
                int enemyHealth = rn.nextInt(100, 201) * hero.level;
                int enemyStrength = (int) Math.round(rn.nextInt(3, 9) + (hero.strength * 0.10));
                int enemyLevel = rn.nextInt(1, hero.level + 1);

                Enemy enemy = new Enemy(enemyHealth, enemyStrength, enemyLevel);
                System.out.println("Enemy health is " + enemyHealth + " and enemy strength is " + enemyStrength);
                System.out.println();

                int coinToss = rn.nextInt(1, 101);

                if (coinToss <= 50) {
                    System.out.println("Coin toss is heads. Hero attacks first.");
                    System.out.println();

                    while ((hero.health > 0) & (enemy.health > 0)) {
                        hero.attack(enemy);
                        enemy.attack(hero);
                    }

                    if ((hero.health > 0) && (enemy.health) <= 0) {
                        System.out.println(hero.name + " health is " + hero.health + ", enemy health is " + enemy.health + ". " + hero.name + " wins.");

                        System.out.println();

                        int gainedExperience = 50 * enemy.level;
                        hero.experience += gainedExperience;
                        System.out.println(hero.name + " gains " + gainedExperience + " points of experience.");

                        int healthBurstChance = rn.nextInt(1, 101);

                        if (healthBurstChance <= 30) {
                            hero.health = 120;
                            System.out.println(hero.name + " feels the burst of energy! " + hero.name + " health is now " + hero.health);
                            System.out.println();
                        } else {
                            hero.health = 100;
                            System.out.println(hero.name + " relaxes after fight and restores health to " + hero.health);
                            System.out.println();
                        }

                        if (hero.experience >= 100) {
                            hero.levelUp(hero);
                        }

                    } else if ((hero.health <= 0) && (enemy.health) > 0) {
                        System.out.println(hero.name + " health is " + hero.health + ", enemy health is " + enemy.health + ". Enemy wins.");
                        break;

                    } else if ((hero.health <= 0) && (enemy.health) <= 0) {
                        System.out.println(hero.name + " health is " + hero.health + ", enemy health is " + enemy.health + ". It is a draw.");
                        break;
                    }
                } else {
                    System.out.println("Coin toss is tails. Enemy attacks first.");
                    System.out.println();

                    while ((hero.health > 0) & (enemy.health > 0)) {
                        enemy.attack(hero);
                        hero.attack(enemy);
                    }

                    if ((hero.health > 0) && (enemy.health) <= 0) {
                        System.out.println(hero.name + " health is " + hero.health + ", enemy health is " + enemy.health + ". " + hero.name + " wins.");

                        System.out.println();

                        int gainedExperience = 50 * enemy.level;
                        hero.experience += gainedExperience;
                        System.out.println(hero.name + " gains " + gainedExperience + " points of experience.");

                        int healthBurstChance = rn.nextInt(1, 101);

                        if (healthBurstChance <= 30) {
                            hero.health = 120;
                            System.out.println(hero.name + " feels the burst of energy! " + hero.name + " health is now " + hero.health);
                            System.out.println();
                        } else {
                            hero.health = 100;
                            System.out.println(hero.name + " relaxes after fight and restores health to " + hero.health);
                            System.out.println();
                        }

                        if (hero.experience >= 100) {
                            hero.levelUp(hero);
                        }

                    } else if ((hero.health <= 0) && (enemy.health) > 0) {
                        System.out.println(hero.name + " health is " + hero.health + ", enemy health is " + enemy.health + ". Enemy wins.");
                        break;

                    } else if ((hero.health <= 0) && (enemy.health) <= 0) {
                        System.out.println(hero.name + " health is " + hero.health + ", enemy health is " + enemy.health + ". It is a draw.");
                        break;
                    }
                }
            } else if (userInput.equalsIgnoreCase("Avoid")) {
                hero.avoid(hero);

            } else {
                System.out.println("I did not understand you. Skipping this round.");
            }
        }
    }
}
