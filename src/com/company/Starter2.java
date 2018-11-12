package com.company;


public class Starter2 {
    private int attack;
    private int def;
    private String name;

    public Starter2(int attack, int def, String name) {
        this.attack = attack;
        this.def = def;
        this.name = name;
    }

    public Starter2(int attack, int def) {
        this.attack = attack;
        this.def = def;
        this.name = "Ork";
    }

    public int getAttack() {
        return attack;

    }

    public int getDef() {
        return def;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDef(int def) {
        this.def = def;
    }
}