package sakib.calculator.com.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonA;
    Button buttonB;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        textView = findViewById(R.id.textView2);
        buttonA = findViewById(R.id.button);
        buttonB = findViewById(R.id.button2);
        buttonNext = findViewById(R.id.nextPage);

        buttonA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                increaseScore(v);
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                increaseScore(v);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LoadPercentCalculationActivity();
            }
        });

    }

    public void increaseScore(View  v)
    {
        //textView.setText("Button A");
        switch (v.getId())
        {
            case R.id.button:
                textView.setText("Button A");
                break;
            case R.id.button2:
                textView.setText("Button B");
                break;
            default:
                textView.setText("Text");
                break;
        }

    }

    public void LoadPercentCalculationActivity()
    {
        Intent intent;	//Intent is used to move to othrer layout
        intent = new Intent(MainActivity.this,PercentCalculation.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }

}
