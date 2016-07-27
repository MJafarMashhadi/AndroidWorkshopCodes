package ir.sharif.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GetName extends AppCompatActivity {

    Button clickMe;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_name);

        clickMe = (Button) findViewById(R.id.btnClickMe);
        name = (EditText) findViewById(R.id.etName);

        clickMe.setOnClickListener(clickMeClicked);
    }

    View.OnClickListener clickMeClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String enteredName;
            enteredName = name.getText().toString();
//            clickIndicator.setText("Salam " + enteredName + "!");
            Intent i = new Intent(GetName.this, ShowName.class);
            i.putExtra(ShowName.EXTRA_NAME, enteredName);
            startActivity(i);
        }
    };

}
