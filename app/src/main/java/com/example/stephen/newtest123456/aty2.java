package com.example.stephen.newtest123456;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class aty2 extends AppCompatActivity {
    Button sent_btn;
    String sugar = "無糖";
    EditText set_drink;
    String ice_opt = "微冰";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty2);
        RadioGroup rgl =(RadioGroup) findViewById(R.id.radioGroup1);
        rgl.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkdld){
                switch (checkdld){
                    case R.id.radio0:
                        sugar = "無糖";
                        break;
                    case R.id.radio1:
                        sugar = "少糖";
                        break;
                    case R.id.radio2:
                        sugar = "半糖";
                        break;
                    case R.id.radio3:
                        sugar = "黃金比例";
                        break;
                }

            }
        });

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkdld){
                switch (checkdld) {
                    case R.id.radioButton1:
                        sugar = "微冰";
                        break;
                    case R.id.radioButton2:
                        sugar = "少冰";
                        break;
                    case R.id.radioButton3:
                        sugar = "正常冰";
                        break;


                }

            }


        });
        sent_btn = (Button) findViewById(R.id.sent);
        sent_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                set_drink = (EditText) findViewById(R.id.editText1);
                String temp = set_drink.getText().toString();
                Intent i = new Intent();
                Bundle b = new Bundle();
                b.putString("sugar_level", sugar);
                b.putString("drink_level", temp);
                b.putString("ice_level", ice_opt);
                i.putExtras(b);
                setResult(101,i);
                finish();
            }
        });
    }
}
