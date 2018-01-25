package www.ntej.com.gmcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView1)
    TextView textView;

    float valueOne, valueTwo;
    boolean bAddition, bSubtract, bMultiplication, bDivision;

    private void setUpFullScreenMode() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        // remove the following flag for version < API 19
                        | View.SYSTEM_UI_FLAG_IMMERSIVE
        );

        getSupportActionBar().hide();
    }

    @OnClick(R.id.buttonClearText)
    public void onClearClick() {
        textView.setText(null);
    }

    @OnClick(R.id.buttonDivide)
    public void onDivideClick() {
        valueOne = Float.parseFloat(textView.getText() + "");
        bDivision = true;
        textView.setText(null);
    }

    @OnClick(R.id.buttonAdd)
    public void onAddClick() {
        if (textView == null) {
            textView.setText("");
        } else {
            valueOne = Float.parseFloat(textView.getText() + "");
            bAddition = true;
            textView.setText(null);
        }
    }

    @OnClick(R.id.buttonSubtraction)
    public void onSubstractClick() {

        valueOne = Float.parseFloat(textView.getText() + "");
        bSubtract = true;
        textView.setText(null);
    }

    @OnClick(R.id.buttonMultiply)
    public void onMultiplyClick() {
        valueOne = Float.parseFloat(textView.getText() + "");
        bMultiplication = true;
        textView.setText(null);
    }

    @OnClick(R.id.button1)
    public void onOneClick() {

        textView.setText(textView.getText() + "1");

    }

    @OnClick(R.id.button2)
    public void onTwoClick() {

        textView.setText(textView.getText() + "2");

    }

    @OnClick(R.id.button3)
    public void onThreeClick() {

        textView.setText(textView.getText() + "3");

    }

    @OnClick(R.id.button4)
    public void onFourClick() {

        textView.setText(textView.getText() + "4");

    }

    @OnClick(R.id.button5)
    public void onFiveClick() {

        textView.setText(textView.getText() + "5");

    }

    @OnClick(R.id.button6)
    public void onSixClick() {

        textView.setText(textView.getText() + "6");

    }

    @OnClick(R.id.button7)
    public void onSevenClick() {

        textView.setText(textView.getText() + "7");

    }

    @OnClick(R.id.button8)
    public void onEightClick() {

        textView.setText(textView.getText() + "8");

    }

    @OnClick(R.id.button9)
    public void onNineClick() {

        textView.setText(textView.getText() + "9");

    }

    @OnClick(R.id.buttonPoint)
    public void onPointClick() {
        String tempString = textView.getText().toString();

        if (tempString.isEmpty()) {
            textView.setText("0");
            tempString = textView.getText().toString();
            if (!tempString.substring(tempString.length() - 1).contains(".") & !tempString.contains(".")) {
                textView.setText(textView.getText() + ".");
            }
        }else{
            tempString = textView.getText().toString();
            if (!tempString.substring(tempString.length() - 1).contains(".") & !tempString.contains(".")) {
                textView.setText(textView.getText() + ".");
            }
        }
    }

    @OnClick(R.id.buttonZero)
    public void onZeroClick() {

        textView.setText(textView.getText() + "0");

    }

    @OnClick(R.id.buttonEqual)
    public void onEqualClick(View view) {
        valueTwo = Float.parseFloat(textView.getText() + "");

        if (bAddition == true) {
            textView.setText(valueOne + valueTwo + "");
            bAddition = false;
        }

        if (bSubtract == true) {
            textView.setText(valueOne - valueTwo + "");
            bSubtract = false;
        }

        if (bMultiplication == true) {
            textView.setText(valueOne * valueTwo + "");
            bMultiplication = false;
        }

        if (bDivision == true) {
            textView.setText(valueOne / valueTwo + "");
            bDivision = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code for hide title bar.
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setUpFullScreenMode();
        ButterKnife.bind(this);
    }

}