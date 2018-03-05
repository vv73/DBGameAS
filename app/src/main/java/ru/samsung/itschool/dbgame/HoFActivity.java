package ru.samsung.itschool.dbgame;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HoFActivity extends Activity {

	private DBManager dbManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ho_f);
		dbManager = DBManager.getInstance(this);
		
		TextView restv = (TextView)this.findViewById(R.id.results);
		ArrayList<Result> results = dbManager.getAllResults();
		String resStr = "";
		for (Result res : results)
		{
			resStr += res.name + ": " + res.score + "\n";
		}	
		restv.setText(resStr);
	}
}
