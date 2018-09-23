package sakib.calculator.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PercentCalculation extends AppCompatActivity
{

    Button buttonNext;
    Button buttonPrevious;
    Button buttonResult;
    EditText editTextPercent;
    EditText editTextNumber;
    TextView textViewShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_calculation);

        buttonNext = findViewById(R.id.nextPage);
        buttonPrevious = findViewById(R.id.previousPage);
        buttonResult = findViewById(R.id.calculateResult);
        editTextNumber = findViewById(R.id.number);
        editTextPercent = findViewById(R.id.percent);
        textViewShowResult =findViewById(R.id.textViewResult);


        buttonPrevious.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LoadMainActivity();
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CalculateResult();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LoadStandardCalculator();
            }
        });
    }

    public  void LoadMainActivity()
    {
        Intent intent;	//Intent is used to move to othrer layout
        intent = new Intent(PercentCalculation.this,MainActivity.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }

    public  void LoadStandardCalculator()
    {
        Intent intent;	//Intent is used to move to othrer layout
        intent = new Intent(PercentCalculation.this,StandardCalculator.class);

        //intent.putExtra("Phone",phn); //passing some value to other layout

        startActivity(intent);
    }

    public  void CalculateResult()
    {
        float percent =
                Float.parseFloat
                        (editTextPercent.getText().toString());
        float number =
                Float.parseFloat
                        (editTextNumber.getText().toString());

        textViewShowResult.setText(Float.toString(number*percent/100));
    }
}
