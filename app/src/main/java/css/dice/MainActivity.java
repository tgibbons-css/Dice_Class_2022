package css.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // declare variables
    Button btnRoll;
    TextView tvDieValue;
    Dice myDie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRoll = findViewById(R.id.buttonRollDie);
        tvDieValue = findViewById(R.id.textViewDieValue);
        myDie = new Dice();

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Only change this code here
                tvDieValue.setText(myDie.roll(6).toString());
            }
        });
    }
}