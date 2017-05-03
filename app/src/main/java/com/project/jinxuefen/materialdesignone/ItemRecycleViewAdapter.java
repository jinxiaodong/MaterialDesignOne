package com.project.jinxuefen.materialdesignone;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.jinxuefen.materialdesignone.view.BaseRecyclerAdapter;
import com.project.jinxuefen.materialdesignone.view.BaseViewHold;

import java.util.List;

/**
 * Created by xiaodong.jin on 2017/5/3.
 */
public class ItemRecycleViewAdapter extends BaseRecyclerAdapter<String> {

    public ItemRecycleViewAdapter(Context context, List<String> list) {
        super(context, list);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public BaseViewHold onCreateViewHolder(ViewGroup parent, int viewType) {

        BaseViewHold holder = new ItemViewHolder(mContext, inflate(R.layout.item_viewholder, parent));
        return holder;
    }

    private class ItemViewHolder extends BaseViewHold<String> {


        TextView textView;

        public ItemViewHolder(Context mContext, View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }

        @Override
        public void onBindViewHolder(int position, List<String> mData) {
            textView.setText(mData.get(position));
        }
    }
}
