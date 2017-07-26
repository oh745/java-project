package exam1;

public class Exam01 {

    String firstPerson;
    String secondPerson;
    int A_win ;
    int B_win ;

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

    public String getScore() {

        String scoreA = "";
        String scoreB = "";

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

        switch (A_win){
            case 0: scoreA = "Love"; break;
            case 1:scoreA = "Fifteen"; break;
            case 2:scoreA = "Thirty"; break;
            case 3:scoreA = "Forty"; break;

        }
        switch (B_win){
            case 0: scoreB = "Love"; break;
            case 1:scoreB = "Fifteen"; break;
            case 2:scoreB = "Thirty"; break;
            case 3:scoreB = "Forty"; break;
        }
        return scoreA + "-" + scoreB;

    }

}
