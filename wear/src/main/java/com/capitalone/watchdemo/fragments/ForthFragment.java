package com.capitalone.watchdemo.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.capitalone.watchdemo.R;
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
		listView.setAdapter(new Adapter(getActivity()));
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

	/**
	 * Adapter for list
	 */
	private static final class Adapter extends WearableListView.Adapter {
		private final Context mContext;
		private final LayoutInflater mInflater;
		private final String[] strings;

		private Adapter(Context context) {
			mContext = context;
			mInflater = LayoutInflater.from(context);
			strings = mContext.getResources().getStringArray(R.array.wear_list);
		}

		/**
		 * Create the view holder with the inflated view
		 * @param parent
		 * @param viewType
		 * @return
		 */
		@Override
		public WearableListView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			return new WearableListView.ViewHolder(
				mInflater.inflate(R.layout.wear_item, null));
		}

		/**
		 * Bind the view items. Note: You will probably want to create a custom view holder
		 * @param holder
		 * @param position
		 */
		@Override
		public void onBindViewHolder(WearableListView.ViewHolder holder, int position) {
			TextView view = (TextView) holder.itemView.findViewById(R.id.text);
			view.setText(strings[position]);
			holder.itemView.setTag(position);
		}

		@Override
		public int getItemCount() {
			return strings.length;
		}
	}
}
