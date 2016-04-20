package assign1.lomsadze.giorgi.flashlight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        LinearLayout layout = (LinearLayout) findViewById(R.id.mtavariLayaut);
        if (v.getId() == R.id.redBtn){
            layout.setBackgroundColor(Color.RED);
        }else if (v.getId() == R.id.blueBtn){
          layout.setBackgroundColor(Color.BLUE);
        }else if (v.getId() == R.id.greenBtn){
            layout.setBackgroundColor(Color.GREEN);
        }else if (v.getId() == R.id.witeBtn){
            layout.setBackgroundColor(Color.WHITE);
        }else if (v.getId()== R.id.yelloBtn){
            layout.setBackgroundColor(Color.YELLOW);
        }
    }
}
