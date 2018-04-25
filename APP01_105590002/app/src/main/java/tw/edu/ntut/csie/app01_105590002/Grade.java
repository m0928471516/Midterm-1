package tw.edu.ntut.csie.app01_105590002;

**
        * Created by NTUTCSIE on 2018/4/25.
        */

public class Grade {
    int grade;
    Grade(){
        grade = 0;
    }

    public String letterGrade(int score){
        grade = score;
        if(grade >= 90 && grade <= 100)
            return "A";
        else if(grade >= 80 && grade <= 89)
            return "B";
        else if(grade >= 70 && grade <= 79)
            return "C";
        else if(grade >= 60 && grade <= 69)
            return "D";
        else if(grade >= 0 && grade <= 59)
            return "F";
        return "X";
    }
}