package sakib.calculator.com.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonPercentCal;
    Button buttonCalculator;
    Button buttonWebView;
    Button buttonMusicPlayer;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        textView = findViewById(R.id.textView2);
        buttonPercentCal = findViewById(R.id.parcentCal);
        buttonCalculator = findViewById(R.id.calculator);
        buttonWebView = findViewById(R.id.webView);
        buttonMusicPlayer = findViewById(R.id.musicPlayer);
        buttonNext = findViewById(R.id.nextPage);

        buttonPercentCal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LoadPercentCalculationActivity();
            }
        });
        buttonCalculator.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LoadStanderCalculationActivity();
            }
        });

        buttonWebView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LoadWebViewActivity();
            }
        });

        buttonMusicPlayer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LoadMusicPlayerActivity();
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
            case R.id.parcentCal:
                textView.setText("Button A");
                break;
            case R.id.calculator:
                textView.setText("Button B");
                break;
            default:
                textView.setText("Text");
                break;
        }

    }




    public void LoadPercentCalculationActivity()
    {
        Intent intent;	//Intent is used to move to other layout
        intent = new Intent(MainActivity.this,PercentCalculation.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }



    public void LoadStanderCalculationActivity()
    {
        Intent intent;	//Intent is used to move to other layout
        intent = new Intent(MainActivity.this,StandardCalculator.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }


    public void LoadWebViewActivity()
    {
        Intent intent = new Intent(MainActivity.this,WebViewActivity.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }

    public void LoadMusicPlayerActivity()
    {
        Intent intent;	//Intent is used to move to other layout
        intent = new Intent(MainActivity.this,MusicPlayer.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }

}
