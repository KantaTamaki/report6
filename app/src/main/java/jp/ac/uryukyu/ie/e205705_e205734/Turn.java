package jp.ac.uryukyu.ie.e205705_e205734;

public class Turn {
    private int turn;

    public Turn(){
        this.turn = 1;
    }
    
    public void playgame(Character player1, Character player2){
        while(true){
            System.out.println(this.turn+"ターン目戦闘開始！");
            Character.attack(player1,player2);
            Character.attack(player2,player1);
            Character.chdead(player1);
            Character.chdead(player2);
            if (player1.getdead()==true){
                System.out.println(player2.getname()+"の勝利！");
                break;
            }else if(player2.getdead()==true){
                System.out.println(player1.getname()+"の勝利！");
                break;
            }else{
                this.turn += 1;
            }
        }
    }
}
