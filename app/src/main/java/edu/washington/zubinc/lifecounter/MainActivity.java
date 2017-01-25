package edu.washington.zubinc.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText player1;
    public EditText player2;
    public EditText player3;
    public EditText player4;
    public Button plus1;
    public Button minus1;
    public Button plus5;
    public Button minus5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
