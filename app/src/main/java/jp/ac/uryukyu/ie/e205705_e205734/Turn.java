package jp.ac.uryukyu.ie.e205705_e205734;

public class Turn {
    private int turn;

    public Turn(){
        this.turn = 1;
    }
    
    public void playgame(Player player1, Enemy player2){
        Character.status(player1,player2);
        while(true){
            System.out.println(this.turn+"ターン目戦闘開始！");
            Character.attack(player1,player2);
            Character.attack(player2,player1);
            Character.chdead(player1);
            Character.chdead(player2);
            System.out.println(player1.getname()+"のHP："+player1.gethp());
            System.out.println(player2.getname()+"のHP："+player2.gethp());
            if(player1.getdead()==true && player2.getdead()==true){
                System.out.println("引き分け！");
                break;
            }else if(player1.getdead()==true){
                System.out.println(player2.getname()+"の勝利！");
                this.turn =1;
                break;
            }else if(player2.getdead()==true){
                System.out.println(player1.getname()+"の勝利！");
                player1.chLevelUp(player2.giveExp);
                this.turn =1;
                break;
            }else{
                this.turn += 1;
            }
        }
    }
}
