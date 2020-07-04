package com.hpcovid19project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hpcovid19project.Models.ContainmentZone;
import com.hpcovid19project.R;

import java.util.List;

public class ContainmentZoneAdapter extends RecyclerView.Adapter<ContainmentZoneAdapter.ImageViewHolder> {

    private Context mContext;
    private List<ContainmentZone> mContainmentZone;

    public ContainmentZoneAdapter(Context context, List<ContainmentZone> list) {
        mContext = context;
        mContainmentZone = list;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.single_containment_zone, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {

        final ContainmentZone containmentZone = mContainmentZone.get(position);

        holder.District.setText(containmentZone.getDistrict());
        holder.Hotspot.setText(containmentZone.getHotspot());
    }

    @Override
    public int getItemCount() {
        return mContainmentZone.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView District, Hotspot;
        public ImageViewHolder(View itemView) {
            super(itemView);

            District = itemView.findViewById(R.id.district);
            Hotspot = itemView.findViewById(R.id.hotspot);
        }
    }

}