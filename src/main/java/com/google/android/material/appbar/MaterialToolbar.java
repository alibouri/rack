package com.google.android.material.appbar;

import B6.l;
import J1.E;
import L6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.shape.MaterialShapeDrawable;
import hb.h;

public class MaterialToolbar extends Toolbar {
    public Integer V0;
    public boolean W0;
    public boolean X0;

    public MaterialToolbar(Context context0, AttributeSet attributeSet0) {
        int v = 0;
        super(a.a(context0, attributeSet0, 0x7F04044C, 0x7F130349), attributeSet0, 0);  // attr:toolbarStyle
        Context context1 = this.getContext();
        TypedArray typedArray0 = l.f(context1, attributeSet0, p6.a.x, 0x7F04044C, 0x7F130349, new int[0]);  // attr:toolbarStyle
        if(typedArray0.hasValue(0)) {
            this.setNavigationIconTint(typedArray0.getColor(0, -1));
        }
        this.W0 = typedArray0.getBoolean(2, false);
        this.X0 = typedArray0.getBoolean(1, false);
        typedArray0.recycle();
        Drawable drawable0 = this.getBackground();
        if(drawable0 == null || drawable0 instanceof ColorDrawable) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
            if(drawable0 != null) {
                v = ((ColorDrawable)drawable0).getColor();
            }
            materialShapeDrawable0.j(ColorStateList.valueOf(v));
            materialShapeDrawable0.h(context1);
            materialShapeDrawable0.i(E.e(this));
            this.setBackground(materialShapeDrawable0);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable0 = this.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            h.i0(this, ((MaterialShapeDrawable)drawable0));
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.W0 || this.X0) {
            TextView textView0 = l.e(this, this.getTitle());
            TextView textView1 = l.e(this, this.getSubtitle());
            if(textView0 != null || textView1 != null) {
                int v4 = this.getMeasuredWidth();
                int v5 = this.getPaddingLeft();
                int v6 = v4 - this.getPaddingRight();
                for(int v7 = 0; v7 < this.getChildCount(); ++v7) {
                    View view0 = this.getChildAt(v7);
                    if(view0.getVisibility() != 8 && view0 != textView0 && view0 != textView1) {
                        if(view0.getRight() < v4 / 2 && view0.getRight() > v5) {
                            v5 = view0.getRight();
                        }
                        if(view0.getLeft() > v4 / 2 && view0.getLeft() < v6) {
                            v6 = view0.getLeft();
                        }
                    }
                }
                Pair pair0 = new Pair(v5, v6);
                if(this.W0 && textView0 != null) {
                    this.x(textView0, pair0);
                }
                if(this.X0 && textView1 != null) {
                    this.x(textView1, pair0);
                }
            }
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable drawable0 = this.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable)drawable0).i(f);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable0) {
        if(drawable0 != null) {
            Integer integer0 = this.V0;
            if(integer0 != null) {
                drawable0.setTint(((int)integer0));
            }
        }
        super.setNavigationIcon(drawable0);
    }

    public void setNavigationIconTint(int v) {
        this.V0 = v;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if(this.X0 != z) {
            this.X0 = z;
            this.requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if(this.W0 != z) {
            this.W0 = z;
            this.requestLayout();
        }
    }

    public final void x(TextView textView0, Pair pair0) {
        int v = this.getMeasuredWidth();
        int v1 = textView0.getMeasuredWidth();
        int v2 = v / 2 - v1 / 2;
        int v3 = v1 + v2;
        int v4 = Math.max(Math.max(((int)(((Integer)pair0.first))) - v2, 0), Math.max(v3 - ((int)(((Integer)pair0.second))), 0));
        if(v4 > 0) {
            v2 += v4;
            v3 -= v4;
            textView0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v2, 0x40000000), textView0.getMeasuredHeightAndState());
        }
        textView0.layout(v2, textView0.getTop(), v3, textView0.getBottom());
    }
}

