package com.capitalone.watchdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.wearable.view.FragmentGridPagerAdapter;
/**
 * GridPager Adapter for Main activity
 */
public class GridPagerAdapter extends FragmentGridPagerAdapter {
	private final Context mContext;

	public GridPagerAdapter(Context mContext, FragmentManager fm) {
		super(fm);
		this.mContext = mContext;
	}

	/**
	 * Return a fragment for each row & column requested.
	 * NOTE: Returning null seems to crash the app
	 * @param row
	 * @param column
	 * @return Fragment
	 */
	@Override
	public Fragment getFragment(int row, int column) {
		return null;
	}

	/*
		switch (row) {
			case 0:
			switch (column) {
				case 0:
					return FirstFragment.newInstance(mContext.getResources().getColor(android.R.color.darker_gray));
				case 1:
					return SecondFragment.newInstance(mContext.getResources().getColor(android.R.color.holo_blue_bright));
				case 2:
					return new ThirdFragment();
			}
			break;
			case 1:
			switch (column) {
				case 0:
					return new ForthFragment();
				case 1:
					return new FifthFragment();
			}
			break;
		}

	 */
	/**
	 * This is the number of rows in the grid
	 * @return
	 */
	@Override
	public int getRowCount() {
		return 1;
	}

	/**
	 * This is the number of columns for each row
	 * @param row
	 * @return
	 */
	@Override
	public int getColumnCount(int row) {
		return 1;
	}
	/*
			switch (row) {
			case 0:
				return 3;
			case 1:
				return 2;
		}
		return 3;

	 */
}
