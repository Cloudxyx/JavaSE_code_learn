package java_base;

public class Teacher {
    public void getScore(int score) throws ScoreException {
        if (score<0||score>100){
            throw new ScoreException("error score");
        }else{
            System.out.println("zhengchang");
        }
    }
}
