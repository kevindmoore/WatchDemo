package com.capitalone.watchdemo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.capitalone.watchdemo.R;
/**
 * Fragment used to show BoxInsetLayout.
 */
public class SecondFragment extends Fragment {

	private TextView mTextView;

	private int color;

	/**
	 * Pass in color value (Note: This should be a color gotten from getResources().getColor()
	 * @param color
	 * @return SecondFragment
	 */
	public static SecondFragment newInstance( int color) {
		SecondFragment fragment = new SecondFragment();
		fragment.color = color;
		return fragment;
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.boxset, container, false);
		if (color != 0) {
			layout.setBackgroundColor(color);
		} else {
			layout.setBackgroundColor(getActivity().getResources().getColor(android.R.color.holo_blue_bright));
		}
		((TextView)layout.findViewById(R.id.text)).setText(R.string.hello_boxset);
		return layout;
	}
}
