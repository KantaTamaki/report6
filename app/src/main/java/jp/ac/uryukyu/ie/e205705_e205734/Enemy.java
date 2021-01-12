package jp.ac.uryukyu.ie.e205705_e205734;

public class Enemy extends Character{

    int giveExp;

    public Enemy(String name,int attack,int hp,int giveExp){
        super(name, attack, hp);
        this.giveExp = giveExp;
    }


}
