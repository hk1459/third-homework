package com.example.kimja.third_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TabHost tabHost;
    Button b1;
    EditText editText1,editText2;
    TextView resultBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("각종 계산기");

        init();
    }
    void  init(){
        b1 = (Button)findViewById(R.id.b1);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        resultBMI = (TextView)findViewById(R.id.resultBMI);
        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("BMI 계산기");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("면적 계산기");
        tabHost.addTab(spec);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputcm = editText1.getText().toString();
                String inputkg = editText2.getText().toString();
                double BMIresult;
                BMIresult = (Double.parseDouble(inputkg)/(Double.parseDouble(inputcm)*Double.parseDouble(inputcm)*0.0001));
                if(0 <=BMIresult && BMIresult < 18.5){
                    resultBMI.setText("체중 부족입니다.");
                } else if(18.5 <= BMIresult && BMIresult < 23 ){
                    resultBMI.setText("정상체중입니다.");
                } else if(23 <=BMIresult && BMIresult<25){
                    resultBMI.setText("과체중입니다.");
                } else if(25<= BMIresult){
                    resultBMI.setText("비만입니다.");
                } else {
                    resultBMI.setText("값을 잘못 입력하셨습니다.");
                }


            }
        });
    }
}
