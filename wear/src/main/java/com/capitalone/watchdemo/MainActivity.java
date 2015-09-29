package com.capitalone.watchdemo;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.DotsPageIndicator;
import android.support.wearable.view.GridViewPager;

/**
 * Main activity that uses a grid view pager to show
 */
public class MainActivity extends WearableActivity {
	private GridViewPager gridViewPager;
	private GridPagerAdapter gridPagerAdapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.gridview_pager);
		gridViewPager = (GridViewPager) findViewById(R.id.pager);
		gridPagerAdapter = new GridPagerAdapter(this, getFragmentManager());
		gridViewPager.setAdapter(gridPagerAdapter);
		// Page Indicator
		DotsPageIndicator dotsPageIndicator = (DotsPageIndicator) findViewById(R.id.page_indicator);
		dotsPageIndicator.setPager(gridViewPager);
	}

}
