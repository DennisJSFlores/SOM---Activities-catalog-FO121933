package flores.js.dnns.somactivitiescatalogfo121933;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InstanceStateActivity extends AppCompatActivity implements View.OnClickListener{

    private int  scoreTeamA, scoreTeamB;
    private static final String TEAM_A_SCORE = "A";
    private static final String TEAM_B_SCORE = "B";
    private TextView tv_teamA , tv_teamB;
    private Button btn_teamA, btn_TeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_instance_state);

        if (savedInstanceState != null){
            scoreTeamA = savedInstanceState.getInt(TEAM_A_SCORE);
            scoreTeamB = savedInstanceState.getInt(TEAM_B_SCORE);
        }else{
            scoreTeamA = 0;
            scoreTeamB = 0;
        }

        tv_teamA = findViewById(R.id.tv_A);
        tv_teamB = findViewById(R.id.tv_B);
        btn_teamA = findViewById(R.id.btn_A);
        btn_TeamB = findViewById(R.id.btn_B);

        tv_teamA.setText(String.valueOf(scoreTeamA));
        tv_teamB.setText(String.valueOf(scoreTeamB));

        btn_teamA.setOnClickListener(this);
        btn_TeamB.setOnClickListener(this);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(TEAM_A_SCORE, scoreTeamA);
        outState.putInt(TEAM_B_SCORE, scoreTeamB);
        super.onSaveInstanceState(outState);
    }

    public void scoreA (int i){
        scoreTeamA = scoreTeamA + 1;
    }

    public void scoreB (int i){
        scoreTeamB = scoreTeamB + 1;
    }


    @Override
    public void onClick(View v) {
        if (v == btn_teamA) {
            scoreA(scoreTeamA);
            tv_teamA.setText(String.valueOf(scoreTeamA));
        }

        if(v == btn_TeamB){
            scoreB(scoreTeamB);
            tv_teamB.setText(String.valueOf(scoreTeamB));
        }

    }
}
