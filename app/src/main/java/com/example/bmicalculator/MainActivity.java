package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtheightft , edtweight , edtin;
        Button btncalculate;
        LinearLayout linearmain;
        TextView txtresult;

        edtweight = findViewById(R.id.edtweight);
        edtheightft=findViewById(R.id.edtheightft);
        edtin=findViewById(R.id.edtin);
        btncalculate=findViewById(R.id.btncalculate);
        txtresult=findViewById(R.id.textresult);
       linearmain=findViewById(R.id.linearmain);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int wt= Integer.parseInt(edtweight.getText().toString()) ;
                int ft= Integer.parseInt(edtheightft.getText().toString()) ;
                int in= Integer.parseInt(edtin.getText().toString()) ;

                int totalin = ft*12 + in;
                double totalcm= totalin*2.53;
                double totalm=totalcm/100;
                double bmi= wt/(totalm*totalm);
                if (bmi>25){
                    txtresult.setText("you're overweight!");
linearmain.setBackgroundColor(getResources().getColor(R.color.ow));
                } else if (bmi<18) {
                    txtresult.setText("you're underweight!");
                    linearmain.setBackgroundColor(getResources().getColor(R.color.uw));

                }else{
                    txtresult.setText("you're healthy");
                    linearmain.setBackgroundColor(getResources().getColor(R.color.healthy));
                }


            }
        });






    }
}