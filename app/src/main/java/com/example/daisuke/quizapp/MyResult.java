package com.example.daisuke.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyResult extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_result);

		TextView resultText = findViewById(R.id.resultText);
		Intent intent = getIntent();
		resultText.setText(intent.getStringExtra(MyQuiz.EXTRA_MYSCORE));

	}

	public void goBack(View view){
		finish();
	}
}
