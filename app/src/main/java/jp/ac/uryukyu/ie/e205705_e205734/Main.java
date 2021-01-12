package jp.ac.uryukyu.ie.e205705_e205734;

public class Main {
    public static void main(String[] args){
        var hero = new Player("悟空", 30, 100);
        var enemy = new Enemy("魔王", 15, 100,10);
        var enemy2 = new Enemy("ゴブリン", 0, 100,15);
        var master = new Turn();
        master.playgame(hero, enemy);
        master.playgame(hero, enemy2);
        
    }
}
