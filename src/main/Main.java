package main;

import main.enumeration.AttackType;
import main.model.Attack;

public class Main {

    public static void main(String[] args) {
        Attack attack = AttackType.getAttack(AttackType.SWORD_ATTACK);
        attack.dealDamage();
    }
}
