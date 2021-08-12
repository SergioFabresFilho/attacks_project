package main.model;

public abstract class Attack {

    private Integer damage;

    protected Attack(Integer damage) {
        this.damage = damage;
    }

    public void dealDamage(int times) {
        System.out.println((damage * times) + " damage dealt!");
    }
}
