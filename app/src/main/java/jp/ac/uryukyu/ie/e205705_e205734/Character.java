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

    public int getattack(){return this.attack;}

    public void setattack(int value){this.attack = value;}

    public void setmaxHp(int value){this.maxHp = value;}

    public void heal(int value){
        this.hp += value;
    }

    public static void status(Character player1,Character player2){
        System.out.println(player1.name+" VS "+player2.name);
        System.out.println(player1.name+"のHP:"+player1.hp+"　攻撃力:"+player1.attack);
        System.out.println(player2.name+"のHP:"+player2.hp+"　攻撃力:"+player2.attack);
    }

    
    
}
