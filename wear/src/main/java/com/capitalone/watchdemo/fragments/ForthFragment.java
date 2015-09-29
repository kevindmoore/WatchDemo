package com.capitalone.watchdemo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.capitalone.watchdemo.R;
import com.capitalone.watchdemo.WearableAdapter;
/**
 * Fragment used to show a WearableListView
 */
public class ForthFragment extends Fragment implements WearableListView.ClickListener {

	private TextView mTextView;


	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.wearablelist, container, false);
		WearableListView listView = (WearableListView) layout.findViewById(R.id.wearableList);
		// Set up the adapter
		listView.setAdapter(new WearableAdapter(getActivity()));
		// If we need to do something when clicking on an item
		listView.setClickListener(this);
		return layout;
	}

	/**
	 * Handle click on list element
	 * @param v
	 */
	@Override
	public void onClick(WearableListView.ViewHolder v) {
	}

	@Override
	public void onTopEmptyRegionClick() {

	}

}
