package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by chris on 30-Nov-17.
 */

public class NumbersClickListener implements View.OnClickListener{

	@Override
	public void onClick(View view){
		Toast.makeText(view.getContext(), "Open the List of Numbers", Toast.LENGTH_SHORT).show();
	}
}
