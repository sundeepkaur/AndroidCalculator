package com.example.mycalc;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class CustomizedLinearLayout extends LinearLayout {
    public CustomizedLinearLayout(Context context) {
        super(context);
    }

    public CustomizedLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomizedLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomizedLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        double aspectR = 4.25/5;
        int w = MeasureSpec.getSize(widthMeasureSpec);
        int h = MeasureSpec.getSize(heightMeasureSpec);

        int newHeight = (int) (w*1.0    /aspectR);
        Log.d("aaq", "onMeasure: "+w+","+h+","+newHeight);
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(newHeight, MeasureSpec.EXACTLY));
    }
}
