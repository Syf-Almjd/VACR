package com.mjd.vacrservices.Main;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mjd.vacrservices.R;

public class MainServices extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;
    private final String[] rate;
    private final String[] status;


    public MainServices(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid, String[] rate, String[] status) {
        super(context, R.layout.main_services, maintitle);

        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imgid = imgid;
        this.rate = rate;
        this.status = status;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.main_services, null, true);

        TextView titleText = rowView.findViewById(R.id.title);
        ImageView imageView = rowView.findViewById(R.id.icon);
        TextView subtitleText = rowView.findViewById(R.id.subtitle);
        TextView rateText = rowView.findViewById(R.id.rating);
        TextView statusText = rowView.findViewById(R.id.status);
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        rateText.setText(rate[position]);
        statusText.setText(status[position]);
        return rowView;
    }

}