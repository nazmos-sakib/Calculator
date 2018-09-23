package sakib.calculator.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StandardCalculator extends AppCompatActivity {

    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    public Button buttonDiv;
    public Button buttonMul;
    public Button buttonAdd;
    public Button buttonSub;

    public Button buttonClear;
    public Button buttonEqual;

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_calculator);


        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonSub = findViewById(R.id.buttonSub);

        buttonClear = findViewById(R.id.buttonClear);
        buttonEqual = findViewById(R.id.buttonEqual);

        textView = findViewById(R.id.textView3);

        textView.setText("0");

        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });


    }

    public String equation = "";
    public String operator;

    public void getButtonClickId(View  v)
    {
        //textView.setText("Button A");
        switch (v.getId())
        {
            case R.id.button0:
                //textView.setText("0");
                equation = equation + "0";
                textView.setText(equation);
                break;
            case R.id.button1:
                //textView.setText("1");
                equation = equation + "1";
                textView.setText(equation);
                break;
            case R.id.button2:
                //textView.setText("2");
                equation = equation + "2";
                textView.setText(equation);
                break;
            case R.id.button3:
                //textView.setText("3");
                equation = equation + "3";
                textView.setText(equation);
                break;
            case R.id.button4:
                //textView.setText("4");
                equation = equation + "4";
                textView.setText(equation);
                break;
            case R.id.button5:
                //textView.setText("5");
                equation = equation + "5";
                textView.setText(equation);
                break;
            case R.id.button6:
                //textView.setText("6");
                equation = equation + "6";
                textView.setText(equation);
                break;
            case R.id.button7:
                //textView.setText("7");
                equation = equation + "7";
                textView.setText(equation);
                break;
            case R.id.button8:
                //textView.setText("8");
                equation = equation + "8";
                textView.setText(equation);
                break;
            case R.id.button9:
                //textView.setText("9");
                equation = equation + "9";
                textView.setText(equation);
                break;
            case R.id.buttonAdd:
                //textView.setText("+");
                equation = equation + "+";
                textView.setText(equation);
                break;
            case R.id.buttonSub:
                //textView.setText("-");
                equation = equation + "-";
                textView.setText(equation);
                break;
            case R.id.buttonMul:
                //textView.setText("*");
                equation = equation + "*";
                textView.setText(equation);
                break;
            case R.id.buttonDiv:
                //textView.setText("/");
                equation = equation + "/";
                textView.setText(equation);
                break;
            case R.id.buttonClear:
                //textView.setText("C");
                equation = "";
                textView.setText(equation);
                break;
            case R.id.buttonEqual:
                //textView.setText("=");
                //equation = equation + "0";
                textView.setText(equation);
                break;
            default:
                textView.setText("default");
                break;
        }

    }
}
