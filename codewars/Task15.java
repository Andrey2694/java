package codewars;

//https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java
public class Task15 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        double firstFighter = Math.ceil((double) fighter2.health / fighter1.damagePerAttack);
        double secondFighter = Math.ceil((double) fighter1.health / fighter2.damagePerAttack);
        if (firstFighter < secondFighter) {
            return fighter1.name;
        } else if (firstFighter > secondFighter) {
            return fighter2.name;
        } else return firstAttacker;

    }
}

class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}