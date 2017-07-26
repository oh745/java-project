package exam1;

public class Exam01 {

    private String firstPerson;
    private String secondPerson;
    private int A_win ;
    private int B_win ;

    public Exam01(String firstPerson, String secondPerson) {
        A_win = 0;
        B_win = 0;
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
    }


    public void playerAWin() {
        A_win++;
    }

    public void playerBWin() {
        B_win++;
    }

    public boolean isDeuce(int score_playerA, int score_playerB){

        if(score_playerA == score_playerB){
            return true;
        }
        return false;
    }

    public String getNormalScore(int score){
        switch (score){
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "";
        }
    }
    public String getScore() {


        if(isDeuce(A_win,B_win)){
            switch (A_win){
                case 0:return "Love-All";
                case 1:return "Fifteen-All";
                case 2:return "Thirty-All";
                case 3:
                case 4:return "Deuce";
            }
        }

        if(A_win >= 4 && A_win>B_win && A_win-B_win > 1){
            return "Win for " + firstPerson;
        }
        else if(A_win >= 4 && A_win>B_win && A_win-B_win == 1){
            return "Advantage " + firstPerson;
        }
        if(B_win >= 4 && B_win>A_win && B_win-A_win > 1){
            return "Win for " + secondPerson;
        }
        else if(B_win >= 4 && B_win>A_win && B_win-A_win ==1){
            return "Advantage " + secondPerson;
        }


        return getNormalScore(A_win) + "-" + getNormalScore(B_win);

    }

}
