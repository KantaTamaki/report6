package jp.ac.uryukyu.ie.e205705_e205734;

/**
 * Dogameクラス。
 * プレイヤー、敵キャラの実装を行い、ゲーム全体の流れを組む。
 */
public class Dogame {
    /**
     * プレイヤー、敵キャラの実装を行い、ゲーム全体を実行するメソッド
     */
    public void playgame(){
        var hero = new Player("勇者", 10, 150);
        var enemy = new Enemy("ゴブリン", 0, 100,15);
        var enemy2 = new Enemy("ボスゴブリン", 50, 150,30);
        var enemy3 = new Enemy("魔王",100,1000,1000);
        var master = new Turn();

        master.playbattle(hero, enemy);
        if(judgePlay(hero)){
            nextbattle();
            master.playbattle(hero, enemy2);
            if(judgePlay(hero)){
                nextbattle();
                master.lastbattle(hero, enemy3);
                if(judgePlay(hero)){
                    System.out.println("                                  ");
                    System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   ");
                    System.out.println("    『おめでとう！ゲームクリアだ！!』    ");
                    System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  ");
                    System.out.println("                                  ");
                    hero.shstatus(hero);
                }else{
                    System.out.println("ゲームを終了します。");
                }
            }else{
                System.out.println("ゲームを終了します。");
            }
        }else{
            System.out.println("ゲームを終了します。");
        }
        
    }
    /**
     * プレイヤーの生死を確認し、ゲーム続行を判定するメソッド
     * @param e　判定したいプレイヤー
     * @return　ゲーム続行判定結果
     */
    public boolean judgePlay(Player e){
        if(e.getdead()){
            System.out.println(e.getname()+"は戦闘不能だ！");
            System.out.println("ゲームオーバー！");
            return false;
        }else{
            return true;
        }
    }

    /**
     * 次のバトルへ行く際の確認メソッド
     */
    public void nextbattle(){
        System.out.println("次のバトルへ進みます");
        new Scansystem().input_y();
    }
}

