package tw.edu.ntut.csie.app01_105590002;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtxt_grade ;
    private Button btn_ok;
    private TextView txt_grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt_grade = (EditText) findViewById(R.id.edit_grade);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        txt_grade = (TextView) findViewById(R.id.txt_grade);

        btn_ok.setOnClickListener(btnOkOnClick);
    }

    private View.OnClickListener btnOkOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int intGrade = Integer.parseInt(edtxt_grade.getText().toString());
            Grade grade = new Grade();
            String res = "等第: ";
            switch (grade.letterGrade(intGrade)){
                case "A":
                    res += "A";
                    break;
                case "B":
                    res += "B";
                    break;
                case "C":
                    res += "C";
                    break;
                case "D":
                    res += "D";
                    break;
                case "F":
                    res += "F";
                    break;
                case "X":
                    res += "輸入分數應介於0~100";
                    break;
            }
            txt_grade.setText(res);
        }
    };
}


