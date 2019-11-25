package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSquare(){

            Double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot)){
                return true;
            }
            else {
                return false;
            }

        }

        public boolean triangularNumber() {

            int x = 1;
            int triangularNumber = 1;

            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber  + x;

            }
            if(triangularNumber==number){
                return true;
            }
            else {
                return false;
            }

        }

    }

    public void testNumber(View view){

        Log.i("info ", "Buton Pressed");

        Number myNumber = new Number();
        EditText editText = (EditText) findViewById(R.id.editText);
        myNumber.number = Integer.parseInt(editText.getText().toString());
        String message = editText.getText().toString();

        if (myNumber.isSquare() && myNumber.triangularNumber()){

            message += " is both square & Tringular.";
        } else if (myNumber.isSquare()){
            message += " is Square but not Triangular.";
        } else if (myNumber.triangularNumber()){

            message += " is Triangular but not Square.";
        } else {
            message += " Neither Square or Triangular.";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
