package exam1;

public class Exam01 {

    int A_win ;
    int B_win ;

    public Exam01(String firstPerson, String secondPerson) {
        A_win = 0;
        B_win = 0;
    }


    public void playerAWin() {
        A_win++;
    }

    public void playerBWin() {
        B_win++;
    }

    public String getScore() {


        if(A_win == 1){
            return "Fifteen-Love";
        }
        else if(A_win == 2){
            return "Thirty-Love";
        }
        else if(A_win == 3){
            return "Forty-Love";
        }
        else if(A_win == 4){
            return "Win for Player A";
        }
        else if(B_win == 1){
            return "Love-Fifteen";
        }
        else if(B_win == 2){
            return "Love-Thirty";
        }
        else if(B_win == 3){
            return "Love-Forty";
        }
        else if(B_win == 4){
            return "Win for Player B";
        }


        return "Love-All";
    }

}
