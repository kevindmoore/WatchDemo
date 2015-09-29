package com.capitalone.watchdemo;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Adapter for Wearable List
 */
public class WearableAdapter extends WearableListView.Adapter {
	private final Context mContext;
	private final LayoutInflater mInflater;
	private final String[] strings;

	public WearableAdapter(Context context) {
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
