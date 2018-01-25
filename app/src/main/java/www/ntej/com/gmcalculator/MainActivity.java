package www.ntej.com.gmcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    private float result = 0.0f;

    float tempResult =0.0f;

    private boolean isSymbolClicked;

    @BindView(R.id.resultTextView)
    TextView screen;

    @BindView(R.id.buttonZero)
    Button zeroButton;
    @BindView(R.id.buttonOne)
    Button oneButton;
    @BindView(R.id.buttonTwo)
    Button twoButton;
    @BindView(R.id.buttonThree)
    Button threeButton;
    @BindView(R.id.buttonFour)
    Button fourButton;
    @BindView(R.id.buttonFive)
    Button fiveButton;
    @BindView(R.id.buttonSix)
    Button sixButton;
    @BindView(R.id.buttonSeven)
    Button sevenButton;
    @BindView(R.id.buttonEight)
    Button eightButton;
    @BindView(R.id.buttonNine)
    Button nineButton;
    @BindView(R.id.buttonDot)
    Button dotButton;

    @BindView(R.id.buttonDivide)
    Button divideButton;
    @BindView(R.id.buttonMultiply)
    Button multiplyButton;
    @BindView(R.id.buttonSubtract)
    Button substractButton;
    @BindView(R.id.buttonAdd)
    Button addButton;

    @BindView(R.id.buttonEqual)
    Button equalButton;

    @BindView(R.id.buttonClear)
    Button clearButton;

    @OnClick(R.id.buttonZero)
    public void zeroButtonClicked(View view) {

        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "0");
        } else {
            screen.setText("0");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonOne)
    public void oneButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "1");
        } else {
            screen.setText("1");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonTwo)
    public void twoButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "2");
        } else {
            screen.setText("2");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonThree)
    public void threeButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "3");
        } else {
            screen.setText("3");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonFour)
    public void fourButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "4");
        } else {
            screen.setText("4");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonFive)
    public void fiveButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "5");
        } else {
            screen.setText("5");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonSix)
    public void sixButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "6");
        } else {
            screen.setText("6");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonSeven)
    public void sevenButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "7");
        } else {
            screen.setText("7");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonEight)
    public void eightButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "8");
        } else {
            screen.setText("8");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonNine)
    public void nineButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + "9");
        } else {
            screen.setText("9");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonDot)
    public void dotButtonClicked(View view) {
        if (!isSymbolClicked) {
            screen.setText(screen.getText() + ".");
        } else {
            screen.setText(".");
            isSymbolClicked = false;
        }
    }

    @OnClick(R.id.buttonDivide)
    public void divideButtonClicked(View view) {
    }

    @OnClick(R.id.buttonMultiply)
    public void multiplyButtonClicked(View view) {
    }

    @OnClick(R.id.buttonSubtract)
    public void substractButtonClicked(View view) {
    }

    @OnClick(R.id.buttonAdd)
    public void addButtonClicked(View view) {
        tempResult = Float.parseFloat(screen.getText().toString());
        Log.d(TAG, "tempResult "+tempResult);
         result = result + tempResult;
        Log.d(TAG, "result "+result);
        isSymbolClicked = true;
    }

    @OnClick(R.id.buttonEqual)
    public void equalButtonClicked(View view) {
        if(!isSymbolClicked) {
            tempResult = Float.parseFloat(screen.getText().toString());
            result = result + tempResult;
        }
        screen.setText("" + result);
        result = 0f;
        tempResult = 0f;

//        isSymbolClicked = false;
    }

    @OnClick(R.id.buttonClear)
    public void setClearButton(View view) {
        screen.setText("");
        result = 0.0f;
        tempResult = 0.0f;
    }


    private void performCalculation() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setFullScreenMode();
    }

    private void setFullScreenMode() {

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        // remove the following flag for version < API 19
                        | View.SYSTEM_UI_FLAG_IMMERSIVE
        );

        getSupportActionBar().hide();

    }


}
