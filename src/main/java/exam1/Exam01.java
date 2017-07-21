package exam1;

public class Exam01 {

    boolean A_win ;
    boolean B_win ;

    public Exam01(String firstPerson, String secondPerson) {
        A_win = false;
        B_win = false;
    }


    public void playerAWin() {
        A_win = true;
    }

    public void playerBWin() {
        B_win = true;
    }

    public String getScore() {

        if(A_win){
            return "Fifteen-Love";
        }
        return "Love-All";
    }

}
