package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import o.N;

public final class VerticalTextView extends N {
    public VerticalTextView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
    }

    @Override  // android.widget.TextView
    public final void onDraw(Canvas canvas0) {
        j.f(canvas0, "canvas");
        this.getPaint().setColor(this.getCurrentTextColor());
        TextPaint textPaint0 = this.getPaint();
        textPaint0.drawableState = this.getDrawableState();
        canvas0.save();
        canvas0.translate(((float)this.getWidth()), 0.0f);
        canvas0.rotate(90.0f);
        this.getLayout().draw(canvas0);
        canvas0.restore();
    }

    @Override  // o.N
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v1, v);
        this.setMeasuredDimension(this.getMeasuredHeight(), this.getMeasuredWidth());
    }
}

