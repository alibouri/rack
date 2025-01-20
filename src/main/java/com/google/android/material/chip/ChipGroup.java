package com.google.android.material.chip;

import B6.d;
import B6.l;
import I5.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import m2.a;
import x6.e;

public class ChipGroup extends d {
    public interface OnCheckedChangeListener {
        void a();
    }

    public int f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public OnCheckedChangeListener j0;
    public final a k0;
    public final e l0;
    public int m0;
    public boolean n0;

    public ChipGroup(Context context0, AttributeSet attributeSet0) {
        Context context1 = L6.a.a(context0, attributeSet0, 0x7F0400BA, 0x7F1302FD);  // attr:chipGroupStyle
        super(context1, attributeSet0, 0x7F0400BA);  // attr:chipGroupStyle
        this.d0 = false;
        TypedArray typedArray0 = context1.getTheme().obtainStyledAttributes(attributeSet0, p6.a.k, 0, 0);
        this.b0 = typedArray0.getDimensionPixelSize(1, 0);
        this.c0 = typedArray0.getDimensionPixelSize(0, 0);
        typedArray0.recycle();
        this.k0 = new a(3, this);
        e e0 = new e(this);
        this.l0 = e0;
        this.m0 = -1;
        this.n0 = false;
        TypedArray typedArray1 = l.f(this.getContext(), attributeSet0, p6.a.f, 0x7F0400BA, 0x7F1302FD, new int[0]);  // attr:chipGroupStyle
        int v = typedArray1.getDimensionPixelOffset(1, 0);
        this.setChipSpacingHorizontal(typedArray1.getDimensionPixelOffset(2, v));
        this.setChipSpacingVertical(typedArray1.getDimensionPixelOffset(3, v));
        this.setSingleLine(typedArray1.getBoolean(5, false));
        this.setSingleSelection(typedArray1.getBoolean(6, false));
        this.setSelectionRequired(typedArray1.getBoolean(4, false));
        int v1 = typedArray1.getResourceId(0, -1);
        if(v1 != -1) {
            this.m0 = v1;
        }
        typedArray1.recycle();
        super.setOnHierarchyChangeListener(e0);
        this.setImportantForAccessibility(1);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 instanceof Chip && ((Chip)view0).isChecked()) {
            int v1 = this.m0;
            if(v1 != -1 && this.h0) {
                this.c(v1, false);
            }
            this.setCheckedId(((Chip)view0).getId());
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public final void b(int v) {
        int v1 = this.m0;
        if(v == v1) {
            return;
        }
        if(v1 != -1 && this.h0) {
            this.c(v1, false);
        }
        if(v != -1) {
            this.c(v, true);
        }
        this.setCheckedId(v);
    }

    public final void c(int v, boolean z) {
        View view0 = this.findViewById(v);
        if(view0 instanceof Chip) {
            this.n0 = true;
            ((Chip)view0).setChecked(z);
            this.n0 = false;
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof x6.d;
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new x6.d(-2, -2);  // initializer: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new x6.d(this.getContext(), attributeSet0);  // initializer: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new x6.d(viewGroup$LayoutParams0);  // initializer: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
    }

    // Deobfuscation rating: LOW(20)
    public int getCheckedChipId() {
        return this.h0 ? this.m0 : -1;
    }

    public List getCheckedChipIds() {
        List list0 = new ArrayList();
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0 instanceof Chip && ((Chip)view0).isChecked()) {
                ((ArrayList)list0).add(view0.getId());
                if(this.h0) {
                    return list0;
                }
            }
        }
        return list0;
    }

    private int getChipCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof Chip) {
                ++v1;
            }
        }
        return v1;
    }

    public int getChipSpacingHorizontal() {
        return this.f0;
    }

    public int getChipSpacingVertical() {
        return this.g0;
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int v = this.m0;
        if(v != -1) {
            this.c(v, true);
            this.setCheckedId(this.m0);
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setCollectionInfo(((AccessibilityNodeInfo.CollectionInfo)h.r(this.getRowCount(), (this.d0 ? this.getChipCount() : -1), (this.h0 ? 1 : 2)).Y));
    }

    private void setCheckedId(int v) {
        this.m0 = v;
        OnCheckedChangeListener chipGroup$OnCheckedChangeListener0 = this.j0;
        if(chipGroup$OnCheckedChangeListener0 != null && this.h0) {
            chipGroup$OnCheckedChangeListener0.a();
        }
    }

    public void setChipSpacing(int v) {
        this.setChipSpacingHorizontal(v);
        this.setChipSpacingVertical(v);
    }

    public void setChipSpacingHorizontal(int v) {
        if(this.f0 != v) {
            this.f0 = v;
            this.setItemSpacing(v);
            this.requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int v) {
        this.setChipSpacingHorizontal(this.getResources().getDimensionPixelOffset(v));
    }

    public void setChipSpacingResource(int v) {
        this.setChipSpacing(this.getResources().getDimensionPixelOffset(v));
    }

    public void setChipSpacingVertical(int v) {
        if(this.g0 != v) {
            this.g0 = v;
            this.setLineSpacing(v);
            this.requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int v) {
        this.setChipSpacingVertical(this.getResources().getDimensionPixelOffset(v));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable0) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable0) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int v) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener chipGroup$OnCheckedChangeListener0) {
        this.j0 = chipGroup$OnCheckedChangeListener0;
    }

    @Override  // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0) {
        this.l0.a = viewGroup$OnHierarchyChangeListener0;
    }

    public void setSelectionRequired(boolean z) {
        this.i0 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int v) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int v) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int v) {
        this.setSingleLine(this.getResources().getBoolean(v));
    }

    @Override  // B6.d
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        if(this.h0 != z) {
            this.h0 = z;
            this.n0 = true;
            for(int v = 0; v < this.getChildCount(); ++v) {
                View view0 = this.getChildAt(v);
                if(view0 instanceof Chip) {
                    ((Chip)view0).setChecked(false);
                }
            }
            this.n0 = false;
            this.setCheckedId(-1);
        }
    }
}

