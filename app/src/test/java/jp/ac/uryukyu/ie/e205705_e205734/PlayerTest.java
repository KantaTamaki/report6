package jp.ac.uryukyu.ie.e205705_e205734;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void attackTest(){
        Player hero = new Player("Hero", 10,100);
        Enemy enemy = new Enemy("魔王",10,100,10);

        hero.attack(hero, enemy, 3);

        assertEquals(90,enemy.gethp());

    }
}
