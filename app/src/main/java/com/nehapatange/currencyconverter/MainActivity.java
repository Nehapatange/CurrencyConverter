package com.nehapatange.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText numberField =  (EditText) findViewById(R.id.numberField);

        Double numberFieldDouble = Double.parseDouble(numberField.getText().toString());
        Double rupeeAmount =numberFieldDouble * 75.62;

        Log.i("amount",numberField.getText().toString());



        Toast.makeText(MainActivity.this,String.format("%.2f",rupeeAmount) + "rupees" , Toast.LENGTH_LONG).show();

        ImageView Image = (ImageView) findViewById(R.id.dollar);
        Image.setImageResource(R.drawable.rupee);






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
