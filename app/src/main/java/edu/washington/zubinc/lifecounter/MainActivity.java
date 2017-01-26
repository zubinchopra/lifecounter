package edu.washington.zubinc.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;
    public TextView p1;
    public TextView p2;
    public TextView p3;
    public TextView p4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        p1 = (TextView)findViewById(R.id.p1);
        p2 = (TextView)findViewById(R.id.p2);
        p3 = (TextView)findViewById(R.id.p3);
        p4 = (TextView)findViewById(R.id.p4);

        button1.setOnClickListener(new MyListener(-1, p1));
        button2.setOnClickListener(new MyListener(1, p1));
        button3.setOnClickListener(new MyListener(-5, p1));
        button4.setOnClickListener(new MyListener(5, p1));
        button5.setOnClickListener(new MyListener(-1, p2));
        button6.setOnClickListener(new MyListener(1, p2));
        button7.setOnClickListener(new MyListener(-5, p2));
        button8.setOnClickListener(new MyListener(5, p2));
        button9.setOnClickListener(new MyListener(-1, p3));
        button10.setOnClickListener(new MyListener(1, p3));
        button11.setOnClickListener(new MyListener(-5, p3));
        button12.setOnClickListener(new MyListener(5, p3));
        button13.setOnClickListener(new MyListener(-1, p4));
        button14.setOnClickListener(new MyListener(1, p4));
        button15.setOnClickListener(new MyListener(-5, p4));
        button16.setOnClickListener(new MyListener(5, p4));
    }

    public class MyListener implements View.OnClickListener{

        public int amount;
        public TextView player;

        public MyListener(int amount, TextView player){
            this.amount = amount;
            this.player = player;
        }

        @Override
        public void onClick(View v) {
            int healthLeft = Integer.parseInt(this.player.getText().toString()) + this.amount;
            if(healthLeft > 0)
                this.player.setText("" + healthLeft);
            else
                this.player.setText("LOSES!");
        }
    }
}
