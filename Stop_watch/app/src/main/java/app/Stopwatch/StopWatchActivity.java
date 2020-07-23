package app.Stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchActivity extends AppCompatActivity {

    Button btnStart;
    Button btnStop;
    ImageView imgAnchor;
    Animation rotate;
    Chronometer time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnStart = findViewById(R.id.btn_start);
        btnStop = findViewById(R.id.btn_finish);
        imgAnchor = findViewById(R.id.imageAnchor);
        time = findViewById(R.id.timerHere);

        btnStop.setAlpha(0);

        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");

        btnStart.setTypeface(MMedium);
        btnStop.setTypeface(MMedium);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAnchor.startAnimation(rotate);
                btnStop.animate().alpha(1).translationY(-80).setDuration(300).start();
                btnStart.animate().alpha(0).setDuration(300).start();
                // Start time
                time.setBase(SystemClock.elapsedRealtime());
                time.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAnchor.clearAnimation();
                btnStart.animate().alpha(1).translationY(-80).setDuration(300).start();
                btnStop.animate().alpha(0).setDuration(300).start();
                time.setBase(SystemClock.elapsedRealtime());
                time.stop();
            }
        });

    }
}