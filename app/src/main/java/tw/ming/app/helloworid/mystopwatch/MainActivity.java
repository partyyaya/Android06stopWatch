package tw.ming.app.helloworid.mystopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean isRunning;
    private Button left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left = (Button) findViewById(R.id.left);
        rightt = (Button) findViewById(R.id.right);
    }

    //reset/stop
    public void doLeft(View view){

    }

    //start/lap
    public void doRight(View view){
        isRunning = !isRunning;
        if(isRunning){
            right.setText("Stop");
            left.setText("Lap");
        }else{
            right.setText("Start");
            left.setText("reset");
        }
    }
}
