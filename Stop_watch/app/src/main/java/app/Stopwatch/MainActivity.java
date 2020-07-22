package app.Stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleWelcomeText = findViewById(R.id.tvSplash);
        TextView bodyWelcomeText = findViewById(R.id.tvSplash);
        Button btnGetStarted = findViewById(R.id.btn_get_started);
        ImageView imageWelcome = findViewById(R.id.imageWelcome);
        // Load animation
        Animation atg = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Animation atg2 = AnimationUtils.loadAnimation(this, R.anim.alpha2);
        Animation atg3 = AnimationUtils.loadAnimation(this, R.anim.alpha3);

        imageWelcome.startAnimation(atg);
        titleWelcomeText.startAnimation(atg2);
        bodyWelcomeText.startAnimation(atg2);
        btnGetStarted.startAnimation(atg3);
        
        
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StopWatchActivity.class);
                startActivity(intent);
            }
        });

        // Import fonts
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        titleWelcomeText.setTypeface(MRegular);
        bodyWelcomeText.setTypeface(MLight);
        btnGetStarted.setTypeface(MMedium);

    }
}