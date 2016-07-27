package ir.sharif.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowName extends AppCompatActivity {

    static final String EXTRA_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name);

        String userName = getIntent().getStringExtra(EXTRA_NAME);

        TextView name = (TextView) findViewById(R.id.tvName);
        name.setText(userName);
    }
}
