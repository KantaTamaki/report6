package jp.ac.uryukyu.ie.e205705_e205734;

public class Player extends Character {
    private int level;
    private int exp;
    private int maxExp;

    public Player(String name, int attack,int hp){
        super(name, attack, hp);
        this.level = 1;
        this.exp = 0;
        this.maxExp = 10;
    }

    public void chLevelUp(int exp){
        System.out.println(super.getname()+"は"+exp+"経験値もらった！");
        this.exp += exp;
        if(this.exp>=this.maxExp){
            statusup();
            this.maxExp += 10;
            this.exp = 0;
            int healvalue = getmaxHp()-gethp();
            super.heal(healvalue);
            System.out.println(super.getname()+"はレベルアップによりHPが全回復した！");
        }else{
            int lackExp = this.maxExp-this.exp;
            System.out.println(super.getname()+"は現在Lv."+this.level+":"+this.exp+"経験値溜まっている！"+"あと"+lackExp+"経験値でレベルアップ！");
        }
        
    }

    public void statusup(){
        this.level += 1;
        super.setattack(super.getattack()+20);
        super.setmaxHp(super.getmaxHp()+20);
        System.out.println(super.getname()+"はLv."+this.level+"に上がった！");
        System.out.println(super.getname()+"はレベルアップにより最大HP+20,攻撃力+20ステータスUPした！");
    }

}
