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
        if(A_win == 2){
            return "Thirty-Love";
        }
        if(A_win == 3){
            return "Forty-Love";
        }
        if(A_win == 4){
            return "Win for Player A";
        }

        if(B_win == 1){
            return "Love-Fifteen";
        }
        return "Love-All";
    }

}
