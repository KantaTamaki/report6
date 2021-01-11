package jp.ac.uryukyu.ie.e205705_e205734;

public class Main {
    public static void main(String[] args){
        var hero = new Player("悟空", 10, 100);
        var enemy = new Enemy("魔王", 15, 100);
        var master = new Turn();
        master.playgame(hero, enemy);
    }
}
