package ir.sharif.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by mjafar on 7/27/16.
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Open main activity and close this one
                finish();

                Intent i = new Intent(SplashActivity.this, GetName.class);
                startActivity(i);
            }
        }, 2000);
    }
}
