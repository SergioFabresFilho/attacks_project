package main;

import main.enumeration.AttackType;
import main.model.Attack;

public class Main {

    public static void main(String[] args) {
        Attack swordAttack = AttackType.getAttack(AttackType.SWORD_ATTACK);
        swordAttack.dealDamage(2);

        Attack fireBallAttack = AttackType.getAttack(AttackType.FIRE_BALL_ATTACK);
        fireBallAttack.dealDamage(3);
    }
}
