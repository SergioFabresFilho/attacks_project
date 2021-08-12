package main.model;

public abstract class Attack {

    private Integer damage;

    protected Attack(Integer damage) {
        this.damage = damage;
    }

    public void dealDamage() {
        System.out.println(damage + " damage dealt!");
    }
}
