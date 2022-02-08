package com.mjd.vacrservices.Main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.mjd.vacrservices.R;

public class SliderAdopter extends PagerAdapter {
    private final Context mContext;
    private final int[] sliderimgs = new int[]{R.drawable.popup1, R.drawable.popup2, R.drawable.popup3};

    public SliderAdopter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return sliderimgs.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(sliderimgs[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
