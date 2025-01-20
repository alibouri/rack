package B6;

import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;

public abstract class d extends ViewGroup {
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;

    public int getItemSpacing() {
        return this.c0;
    }

    public int getLineSpacing() {
        return this.b0;
    }

    public int getRowCount() {
        return this.e0;
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v12;
        int v11;
        if(this.getChildCount() == 0) {
            this.e0 = 0;
            return;
        }
        this.e0 = 1;
        boolean z1 = this.getLayoutDirection() == 1;
        int v4 = z1 ? this.getPaddingRight() : this.getPaddingLeft();
        int v5 = z1 ? this.getPaddingLeft() : this.getPaddingRight();
        int v6 = this.getPaddingTop();
        int v7 = v2 - v - v5;
        int v9 = v4;
        int v10 = v6;
        for(int v8 = 0; v8 < this.getChildCount(); ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() == 8) {
                view0.setTag(0x7F0A0278, -1);  // id:row_index_key
            }
            else {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                    v11 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginStart();
                    v12 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginEnd();
                }
                else {
                    v12 = 0;
                    v11 = 0;
                }
                int v13 = view0.getMeasuredWidth() + (v9 + v11);
                if(!this.d0 && v13 > v7) {
                    v10 = this.b0 + v6;
                    ++this.e0;
                    v9 = v4;
                }
                view0.setTag(0x7F0A0278, ((int)(this.e0 - 1)));  // id:row_index_key
                int v14 = v9 + v11;
                int v15 = view0.getMeasuredWidth() + v14;
                int v16 = view0.getMeasuredHeight() + v10;
                if(z1) {
                    view0.layout(v7 - v15, v10, v7 - v9 - v11, v16);
                }
                else {
                    view0.layout(v14, v10, v15, v16);
                }
                v9 += view0.getMeasuredWidth() + (v11 + v12) + this.c0;
                v6 = v16;
            }
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v14;
        int v13;
        int v12;
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = View.MeasureSpec.getMode(v1);
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingTop();
        int v8 = this.getPaddingRight();
        int v9 = v7;
        int v11 = 0;
        for(int v10 = 0; v10 < this.getChildCount(); ++v10) {
            View view0 = this.getChildAt(v10);
            if(view0.getVisibility() != 8) {
                this.measureChild(view0, v, v1);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                    v12 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
                    v13 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
                }
                else {
                    v13 = 0;
                    v12 = 0;
                }
                if(view0.getMeasuredWidth() + (v6 + v12) <= (v3 == 0x80000000 || v3 == 0x40000000 ? v2 : 0x7FFFFFFF) - v8 || ((ChipGroup)this).d0) {
                    v14 = v6;
                }
                else {
                    v14 = this.getPaddingLeft();
                    v9 = this.b0 + v7;
                }
                int v15 = view0.getMeasuredWidth() + (v14 + v12);
                int v16 = view0.getMeasuredHeight();
                if(v15 > v11) {
                    v11 = v15;
                }
                int v17 = view0.getMeasuredWidth() + (v12 + v13) + this.c0 + v14;
                if(v10 == this.getChildCount() - 1) {
                    v11 += v13;
                }
                v6 = v17;
                v7 = v16 + v9;
            }
        }
        int v18 = this.getPaddingRight() + v11;
        int v19 = this.getPaddingBottom() + v7;
        if(v3 == 0x80000000) {
            v2 = Math.min(v18, v2);
        }
        else if(v3 != 0x40000000) {
            v2 = v18;
        }
        if(v5 == 0x80000000) {
            v4 = Math.min(v19, v4);
        }
        else if(v5 != 0x40000000) {
            v4 = v19;
        }
        this.setMeasuredDimension(v2, v4);
    }

    public void setItemSpacing(int v) {
        this.c0 = v;
    }

    public void setLineSpacing(int v) {
        this.b0 = v;
    }

    public void setSingleLine(boolean z) {
        this.d0 = z;
    }
}

