package jp.ac.uryukyu.ie.e205705_e205734;

public class Player extends Character {
    private int level;
    private int exp;

    public Player(String name, int attack,int hp){
        super(name, attack, hp);
        this.level = 1;
        this.exp = 0;
    }

    public void levelup(){
        this.level += 1;
        super.heal(getmaxHp()-gethp());
    }

    

}
