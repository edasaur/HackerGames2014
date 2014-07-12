package com.cardsui.example;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import com.fima.cardsui.objects.CardStack;
import com.fima.cardsui.views.CardUI;

public class MainActivity extends Activity {

	private CardUI mCardView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// init CardView
		mCardView = (CardUI) findViewById(R.id.cardsview);
		mCardView.setSwipeable(true);

		// add AndroidViews Cards
	
		// add one card, and then add another one to the last stack.
		

		// add one card
		mCardView.addCard(new MyCard("Nuts"));

		// create a stack
		CardStack stack = new CardStack();
		

		// add stack to cardView
		mCardView.addStack(stack);

		// draw cards
		mCardView.refresh();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
