package com.example.py_dev.caclulatethis;

import org.mariuszgromada.math.mxparser.*;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


//    public Array<String>();

    public ArrayList<String> storeArray = new ArrayList<>();
    public String[] expHolder;
    public String[] numHolder;
    public String[] evalHolder;
    public boolean calculate = false;
    public int result = 0;


    @Bind(R.id.button_0)
    Button button0;
    @Bind(R.id.button_1)
    Button button1;
    @Bind(R.id.button_2)
    Button button2;
    @Bind(R.id.button_3)
    Button button3;
    @Bind(R.id.button_4)
    Button button4;
    @Bind(R.id.button_5)
    Button button5;
    @Bind(R.id.button_6)
    Button button6;
    @Bind(R.id.button_7)
    Button button7;
    @Bind(R.id.button_8)
    Button button8;
    @Bind(R.id.button_9)
    Button button9;
    @Bind(R.id.button_minus)
    ImageButton buttonMinus;
    @Bind(R.id.button_plus)
    ImageButton buttonPlus;
    @Bind(R.id.button_equals)
    ImageButton buttonEquals;
    @Bind(R.id.button_divide)
    ImageButton buttonDivides;
    @Bind(R.id.button_multi)
    ImageButton buttonMultiply;
    @Bind(R.id.button_clear_entry)
    Button buttonClearEntry;
    @Bind(R.id.button_clear)
    Button buttonClear;

    @Bind(R.id.readout)
    TextView readout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        SpannableString ss = new SpannableString("abc");
//        Drawable d = getResources().getDrawable(R.drawable.icondivide);
//        d.setBounds(0,0, d.getIntrinsicWidth(),d.getIntrinsicHeight());
//        ImageSpan span = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
//        ss.setSpan(span, 0, 3, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
//        readout.setText(ss);

        readout.setText("");
        readout.addTextChangedListener(textWatcher);

    }

    @OnClick(R.id.button_0)
    public void button0 (Button button){
        readout.append("0");

    }

    @OnClick(R.id.button_1)
    public void button1 (Button button){
        readout.append("1");
    }

    @OnClick(R.id.button_2)
    public void button2 (Button button){
        readout.append("2");
    }

    @OnClick(R.id.button_3)
    public void button3 (Button button){
        readout.append("3");
    }

    @OnClick(R.id.button_4)
    public void button4 (Button button){
        readout.append("4");
    }

    @OnClick(R.id.button_5)
    public void button5 (Button button){
        readout.append("5");
    }

    @OnClick(R.id.button_6)
    public void button6 (Button button){
        readout.append("6");
    }

    @OnClick(R.id.button_7)
    public void button7 (Button button){
        readout.append("7");
    }

    @OnClick(R.id.button_8)
    public void button8 (Button button){
        readout.append("8");
    }

    @OnClick(R.id.button_9)
    public void button9 (Button button){
        readout.append("9");
    }

    @OnClick(R.id.button_minus)
    public void buttonMinus (ImageButton button){
        String checkText = readout.getText().toString();
        if(!checkText.endsWith("-"))
        readout.append(" -");
    }

    @OnClick(R.id.button_plus)
    public void buttonPlus (ImageButton button){
        String checkText = readout.getText().toString();
        if(!checkText.endsWith("+"))
        readout.append(" +");
    }

    @OnClick(R.id.button_equals)
    public void buttonEquals (ImageButton button){
        String cText = readout.getText().toString();
        String newText = cText.replaceAll("x","*");
        readout.append("");

        Expression result = new Expression(newText);
        readout.setText(""+result.calculate());


    }

    @OnClick(R.id.button_clear_entry)
    public void ButtonClearEntry (Button button){
        readout.setText("");
    }

    @OnClick(R.id.button_clear)
    public void buttonClear (Button button){
        readout.setText("");
    }

    @OnClick(R.id.button_multi)
    public void buttonMulti (ImageButton button){
        String checkText = readout.getText().toString();
        if(!checkText.endsWith("x"))
        readout.append(" x");
    }

    @OnClick(R.id.button_divide)
    public void buttonDivide (ImageButton button){
        String checkText = readout.getText().toString();
        if(!checkText.endsWith("/"))
        readout.append(" /");
    }


    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

//            System.out.println("TEXT >> "+s);
//            EditText readout;
              readout = (EditText) findViewById(R.id.readout);



//
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}

