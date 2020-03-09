package com.example.loginapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.login_app.Main2Activity";
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            editText= (EditText) findViewById(R.id.editText);
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),""+ex,Toast.LENGTH_LONG).show();
        }
    }


    public void ss(View view) {
        try {


            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            String message = editText.getText().toString();
            i.putExtra("id", message);
            startActivity(i);
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),""+ex,Toast.LENGTH_LONG).show();
        }

    }
}