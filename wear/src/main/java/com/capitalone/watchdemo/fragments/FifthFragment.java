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
 * Fragment used to chose a CircleImageView
 */
public class FifthFragment extends Fragment {

	private TextView mTextView;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.circle, container, false);
		return layout;

	}
}
