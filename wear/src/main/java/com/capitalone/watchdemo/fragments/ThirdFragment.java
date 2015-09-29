package com.capitalone.watchdemo.fragments;

import android.os.Bundle;
import android.support.wearable.view.CardFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.capitalone.watchdemo.R;
/**
 * Fragment used to show a Card Fragment.
 */
public class ThirdFragment extends CardFragment {

	private TextView mTextView;

	/**
	 * A CardFragment contains a Title: R.id.title, TextView: R.id.text, and icon (tied to title)
	 * @param inflater
	 * @param container
	 * @param savedInstanceState
	 * @return ViewGroup
	 */
	@Override
	public View onCreateContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup layout = (ViewGroup) super.onCreateContentView(inflater, container, savedInstanceState);
		layout.setBackgroundColor(getActivity().getResources().getColor(android.R.color.holo_red_dark));
		((TextView)layout.findViewById(R.id.title)).setText(R.string.hello_card);
		return layout;
	}

}
