package com.example.flutte.UI.StateHolder.Holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.flutte.R;

public class ViewHolder extends RecyclerView.ViewHolder{

    private TextView titleTextView;
    private ImageView iconImageView;
    public ViewHolder(View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.music_title_text);
        iconImageView = itemView.findViewById(R.id.icon_view);
    }

    public TextView getTitleTextView() {
        return titleTextView;
    }

    public ImageView getIconImageView() {
        return iconImageView;
    }

    public void setTitleTextView(TextView titleTextView) {
        this.titleTextView = titleTextView;
    }

    public void setIconImageView(ImageView iconImageView) {
        this.iconImageView = iconImageView;
    }
}