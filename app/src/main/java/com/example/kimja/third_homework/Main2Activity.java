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
    Button b1 ,b2 ,b3;
    EditText editText1,editText2, inputAREA;
    TextView resultBMI ,resultAREA ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("각종 계산기");

        init();
    }
    void  init(){
        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        b1 = (Button)findViewById(R.id.b1);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        resultBMI = (TextView)findViewById(R.id.resultBMI);

        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        inputAREA = (EditText)findViewById(R.id.inputAREA);
        resultAREA = (TextView)findViewById(R.id.resultAREA);


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

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String area = inputAREA.getText().toString();
                double AREAresult;
                AREAresult = (Double.parseDouble(area)*3.305785);
                double result = Math.round(AREAresult*1000d) / 1000d;
                resultAREA.setText(" "+result + " 제곱미터");

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String area = inputAREA.getText().toString();
                double AREAresult;
                AREAresult = (Double.parseDouble(area)*0.3025);
                double result = Math.round(AREAresult*100d) / 100d;
                resultAREA.setText(" "+ result + " 평");
            }
        });
    }
}
