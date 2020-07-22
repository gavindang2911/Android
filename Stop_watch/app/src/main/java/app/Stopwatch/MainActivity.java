package app.Stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleWelcomeText = findViewById(R.id.tvSplash);
        TextView bodyWelcomeText = findViewById(R.id.tvSplash);
        Button btnStart = findViewById(R.id.btn_get_started);

        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.tff");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.tff");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.tff");

        titleWelcomeText.setTypeface(MRegular);
        bodyWelcomeText.setTypeface(MLight);
        btnStart.setTypeface(MMedium);

    }
}