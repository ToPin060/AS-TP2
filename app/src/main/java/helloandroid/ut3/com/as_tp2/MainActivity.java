package helloandroid.ut3.com.as_tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load toto layout
        setContentView(R.layout.toto);

        // Get the TextView1
        tv = (TextView) findViewById(R.id.textView1);
        tv.setText("Bienvenue chez vous");

        // Button personalization (JAVA way)
        /*
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(monEcouteur);
        */
    }

    // Button callback (JAVA way)
    /*
    private View.OnClickListener monEcouteur = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("button1", "pressed!");
        }
    };
    */

    public void mehtodeBouton(View view) {
        counter++;
        tv.setText("" + counter);
    }
}