package com.mulcam.swimswim.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);   //findViewById는 View 타입으로 반환하므로 형변환이 필요함
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.tv);
                if(tv.getText().equals("너고소"))
                    tv.setText("맞고소");
                else if(tv.getText().equals("맞고소"))
                tv.setText("너고소");
            }
        });
    }
}
