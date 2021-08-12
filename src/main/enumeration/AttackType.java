package main.enumeration;

import main.model.Attack;
import main.model.FireBallAttack;
import main.model.SwordAttack;

public enum AttackType {
    SWORD_ATTACK,
    FIRE_BALL_ATTACK;

    public static Attack getAttack(AttackType attackType) {
        return switch (attackType) {
            case SWORD_ATTACK -> new SwordAttack();
            case FIRE_BALL_ATTACK -> new FireBallAttack();
        };
    }
}
