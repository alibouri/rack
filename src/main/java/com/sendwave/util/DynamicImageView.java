package com.sendwave.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.appcompat.widget.AppCompatImageView;

public class DynamicImageView extends AppCompatImageView {
    public DynamicImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // android.widget.ImageView
    public final void onMeasure(int v, int v1) {
        Drawable drawable0 = this.getDrawable();
        if(drawable0 != null) {
            int v2 = View.MeasureSpec.getSize(v);
            this.setMeasuredDimension(v2, ((int)Math.ceil(((float)v2) * ((float)drawable0.getIntrinsicHeight()) / ((float)drawable0.getIntrinsicWidth()))));
            return;
        }
        super.onMeasure(v, v1);
    }
}

