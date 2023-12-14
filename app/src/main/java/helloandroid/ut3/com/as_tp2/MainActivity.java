package helloandroid.ut3.com.as_tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load toto layout
        setContentView(R.layout.toto);

        // Get the TextView1
        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setText("Bienvenue chez vous");
    }
}