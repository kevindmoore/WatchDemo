package com.capitalone.watchdemo;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Main activity that uses a grid view pager to show
 */
public class MainActivity extends WearableActivity {
	private static final SimpleDateFormat AMBIENT_DATE_FORMAT = new SimpleDateFormat("HH:mm", Locale.US);

	private BoxInsetLayout mContainerView;
	private TextView mTextView;
	private TextView mClockView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setAmbientEnabled();

		mContainerView = (BoxInsetLayout) findViewById(R.id.container);
		mTextView = (TextView) findViewById(R.id.text);
		mClockView = (TextView) findViewById(R.id.clock);
	}

	@Override
	public void onEnterAmbient(Bundle ambientDetails) {
		super.onEnterAmbient(ambientDetails);
		updateDisplay();
	}

	@Override
	public void onUpdateAmbient() {
		super.onUpdateAmbient();
		updateDisplay();
	}

	@Override
	public void onExitAmbient() {
		updateDisplay();
		super.onExitAmbient();
	}

	private void updateDisplay() {
		if (isAmbient()) {
			mContainerView.setBackgroundColor(getResources().getColor(android.R.color.black));
			mTextView.setTextColor(getResources().getColor(android.R.color.white));
			mClockView.setVisibility(View.VISIBLE);

			mClockView.setText(AMBIENT_DATE_FORMAT.format(new Date()));
		} else {
			mContainerView.setBackground(null);
			mTextView.setTextColor(getResources().getColor(android.R.color.black));
			mClockView.setVisibility(View.GONE);
		}
	}
}

/*
	private GridViewPager gridViewPager;
	private GridPagerAdapter gridPagerAdapter;

		setContentView(R.layout.gridview_pager);
		gridViewPager = (GridViewPager) findViewById(R.id.pager);
		gridPagerAdapter = new GridPagerAdapter(this, getFragmentManager());
		gridViewPager.setAdapter(gridPagerAdapter);
		// Page Indicator
		DotsPageIndicator dotsPageIndicator = (DotsPageIndicator) findViewById(R.id.page_indicator);
		dotsPageIndicator.setPager(gridViewPager);

 */