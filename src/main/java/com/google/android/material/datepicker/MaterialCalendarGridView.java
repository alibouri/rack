package com.google.android.material.datepicker;

import J1.N;
import M1.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;

final class MaterialCalendarGridView extends GridView {
    public final boolean b0;

    public MaterialCalendarGridView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        t.c(null);
        if(k.Y(this.getContext(), 0x101020D)) {
            this.setNextFocusLeftId(0x7F0A00B7);  // id:cancel_button
            this.setNextFocusRightId(0x7F0A00DE);  // id:confirm_button
        }
        this.b0 = k.Y(this.getContext(), 0x7F04030D);  // attr:nestedScrollable
        N.k(this, new e(2));
    }

    public final n a() {
        return (n)super.getAdapter();
    }

    @Override  // android.widget.GridView
    public final Adapter getAdapter() {
        return (n)super.getAdapter();
    }

    @Override  // android.widget.GridView
    public final ListAdapter getAdapter() {
        return (n)super.getAdapter();
    }

    @Override  // android.widget.AbsListView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n)super.getAdapter()).notifyDataSetChanged();
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        n n0 = (n)super.getAdapter();
        n0.getClass();
        n0.a(n0.X.g());
        n0.a(n0.b());
        throw null;
    }

    @Override  // android.widget.GridView
    public final void onFocusChanged(boolean z, int v, Rect rect0) {
        if(z) {
            switch(v) {
                case 33: {
                    this.setSelection(((n)super.getAdapter()).b());
                    return;
                }
                case 130: {
                    this.setSelection(((n)super.getAdapter()).X.g());
                    return;
                }
                default: {
                    super.onFocusChanged(true, v, rect0);
                    return;
                }
            }
        }
        super.onFocusChanged(false, v, rect0);
    }

    @Override  // android.widget.GridView
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(!super.onKeyDown(v, keyEvent0)) {
            return false;
        }
        if(this.getSelectedItemPosition() != -1 && this.getSelectedItemPosition() < ((n)super.getAdapter()).X.g()) {
            if(19 == v) {
                this.setSelection(((n)super.getAdapter()).X.g());
                return true;
            }
            return false;
        }
        return true;
    }

    @Override  // android.widget.GridView
    public final void onMeasure(int v, int v1) {
        if(this.b0) {
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(0xFFFFFF, 0x80000000));
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            viewGroup$LayoutParams0.height = this.getMeasuredHeight();
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.GridView
    public final void setAdapter(Adapter adapter0) {
        this.setAdapter(((ListAdapter)adapter0));
    }

    @Override  // android.widget.GridView
    public final void setAdapter(ListAdapter listAdapter0) {
        if(!(listAdapter0 instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter0);
    }

    @Override  // android.widget.GridView
    public final void setSelection(int v) {
        if(v < ((n)super.getAdapter()).X.g()) {
            super.setSelection(((n)super.getAdapter()).X.g());
            return;
        }
        super.setSelection(v);
    }
}

