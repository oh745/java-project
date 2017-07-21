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

        String scoreA = "";
        String scoreB = "";

        if(A_win == 0 && B_win == 0){
            return "Love-All";
        }

        if(A_win == 1 && B_win == 1){
            return "Fifteen-All";
        }
        else if(A_win == 2 && B_win == 2){
            return "Thirty-All";
        }
        else if(A_win == 3 && B_win == 3){
            return "Deuce";
        }
        else if(A_win == 4 && B_win == 4){
            return "Deuce";
        }

    

        if(A_win >= 4 && A_win>B_win && A_win-B_win > 1){
            return "Win for Player A";
        }
        else if(A_win >= 4 && A_win>B_win && A_win-B_win == 1){
            return "Advantage Player A";
        }
        if(B_win >= 4 && B_win>A_win && B_win-A_win > 1){
            return "Win for Player B";
        }
        else if(B_win >= 4 && B_win>A_win && B_win-A_win ==1){
            return "Advantage Player B";
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
