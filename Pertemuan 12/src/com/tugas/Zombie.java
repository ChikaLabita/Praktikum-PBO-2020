package com.tugas;

abstract class Zombie implements Destroyable {
    protected int health, level;

    abstract public void heal();

    abstract public void destroyed();

    public String getZombieInfo(){
        return "Health : " + this.health + "\n" + "Level : " + this.level + "\n";
    }
}
