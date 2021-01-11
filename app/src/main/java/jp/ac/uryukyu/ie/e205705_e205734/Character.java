package jp.ac.uryukyu.ie.e205705_e205734;

public class Character {
    private String name;
    private  int attack;
    private int hp;
    private int maxHp;
    private boolean dead;

    public Character(String name, int attack, int hp){
        this.name = name;
        this.attack = attack;
        this.hp = hp;
        this.maxHp = hp;
        this.dead = false;
    }

    public static void attack(Character player, Character target){
        System.out.println(player.name+"の攻撃！");
        target.hp -= player.attack;
        System.out.println(target.name+"は"+player.attack+"ダメージ受けた！");
    }

    public static void chdead(Character e){
        if(e.hp<=0){
            e.dead = true;
        }
    }
    public String getname(){return this.name;}

    public int gethp(){return this.hp;}

    public int getmaxHp(){return this.maxHp;}

    public boolean getdead(){return this.dead;}

    public void heal(int value){
        this.hp += value;
    }
}
