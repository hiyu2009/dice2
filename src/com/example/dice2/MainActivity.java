package com.example.dice2;

//import com.example.dice.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
Button btn1;
TextView text1;
ImageView img1,img2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        text1 = (TextView)findViewById(R.id.textView4);
        img1 = (ImageView)findViewById(R.id.imageView2);
        img2 = (ImageView)findViewById(R.id.imageView3);
        btn1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int random = (int)Math.round(Math.random()*5);
		img1.setImageResource(R.drawable.dice21 + random);
		int random2 = (int)Math.round(Math.random()*5);
		img2.setImageResource(R.drawable.dice21 + random2);
		if(random>random2){
			text1.setText("ÄÉ¶±ÀÇ ´«¸ÊÀÇ ½Â¸®");
		}
		else if(random<random2){
			text1.setText("³ÊÀÇ ½Â¸®");
		}
		else{
			text1.setText("ºñ±è");
		}
	}
}
