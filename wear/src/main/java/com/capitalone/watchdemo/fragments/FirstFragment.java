package com.capitalone.watchdemo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.view.WatchViewStub;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.capitalone.watchdemo.R;
/**
 * Simple Fragment showing a watch view stub
 */
public class FirstFragment extends Fragment {

	private TextView mTextView;
	private int color;

	// Pass in a color to use the fragment in other areas
	public static FirstFragment newInstance(int color) {
		FirstFragment fragment = new FirstFragment();
		fragment.color = color;
		return fragment;
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.first_layout, container, false);
		if (color != 0) {
			layout.setBackgroundColor(color);
		} else {
			layout.setBackgroundColor(getActivity().getResources().getColor(android.R.color.darker_gray));
		}
		final WatchViewStub stub = (WatchViewStub) layout.findViewById(R.id.watch_view_stub);
		stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
			@Override
			public void onLayoutInflated(WatchViewStub stub) {
				mTextView = (TextView) stub.findViewById(R.id.text);
				mTextView.setText(R.string.hello_watchviewstub);
			}
		});
		return layout;
	}
}
