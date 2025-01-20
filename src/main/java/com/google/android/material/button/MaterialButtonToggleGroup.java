package com.google.android.material.button;

import B6.l;
import G0.x;
import H6.i;
import J1.N;
import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.timepicker.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import v6.b;
import v6.c;

public class MaterialButtonToggleGroup extends LinearLayout {
    public final ArrayList b0;
    public final b c0;
    public final com.google.android.material.button.b d0;
    public final LinkedHashSet e0;
    public final x f0;
    public Integer[] g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public static final int l0;

    public MaterialButtonToggleGroup(Context context0, AttributeSet attributeSet0) {
        super(a.a(context0, attributeSet0, 0x7F0402B7, 0x7F13030B), attributeSet0, 0x7F0402B7);  // attr:materialButtonToggleGroupStyle
        this.b0 = new ArrayList();
        this.c0 = new b(this);
        this.d0 = new com.google.android.material.button.b(this);
        this.e0 = new LinkedHashSet();
        this.f0 = new x(3, this);
        this.h0 = false;
        TypedArray typedArray0 = l.f(this.getContext(), attributeSet0, p6.a.p, 0x7F0402B7, 0x7F13030B, new int[0]);  // attr:materialButtonToggleGroupStyle
        this.setSingleSelection(typedArray0.getBoolean(2, false));
        this.k0 = typedArray0.getResourceId(0, -1);
        this.j0 = typedArray0.getBoolean(1, false);
        this.setChildrenDrawingOrderEnabled(true);
        typedArray0.recycle();
        this.setImportantForAccessibility(1);
    }

    public final void a() {
        int v = this.getFirstVisibleChildIndex();
        if(v == -1) {
            return;
        }
        for(int v1 = v + 1; v1 < this.getChildCount(); ++v1) {
            MaterialButton materialButton0 = (MaterialButton)this.getChildAt(v1);
            int v2 = Math.min(materialButton0.getStrokeWidth(), ((MaterialButton)this.getChildAt(v1 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = materialButton0.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams)viewGroup$LayoutParams0) : new LinearLayout.LayoutParams(viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height);
            if(this.getOrientation() == 0) {
                linearLayout$LayoutParams0.setMarginEnd(0);
                linearLayout$LayoutParams0.setMarginStart(-v2);
                linearLayout$LayoutParams0.topMargin = 0;
            }
            else {
                linearLayout$LayoutParams0.bottomMargin = 0;
                linearLayout$LayoutParams0.topMargin = -v2;
                linearLayout$LayoutParams0.setMarginStart(0);
            }
            materialButton0.setLayoutParams(linearLayout$LayoutParams0);
        }
        if(this.getChildCount() != 0 && v != -1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)((MaterialButton)this.getChildAt(v)).getLayoutParams();
            if(this.getOrientation() == 1) {
                linearLayout$LayoutParams1.topMargin = 0;
                linearLayout$LayoutParams1.bottomMargin = 0;
                return;
            }
            linearLayout$LayoutParams1.setMarginEnd(0);
            linearLayout$LayoutParams1.setMarginStart(0);
            linearLayout$LayoutParams1.leftMargin = 0;
            linearLayout$LayoutParams1.rightMargin = 0;
        }
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!(view0 instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
        this.setGeneratedIdIfNeeded(((MaterialButton)view0));
        this.setupButtonChild(((MaterialButton)view0));
        if(((MaterialButton)view0).o0) {
            this.d(((MaterialButton)view0).getId(), true);
            this.setCheckedId(((MaterialButton)view0).getId());
        }
        ShapeAppearanceModel shapeAppearanceModel0 = ((MaterialButton)view0).getShapeAppearanceModel();
        c c0 = new c(shapeAppearanceModel0.e, shapeAppearanceModel0.h, shapeAppearanceModel0.f, shapeAppearanceModel0.g);
        this.b0.add(c0);
        N.k(((MaterialButton)view0), new B6.a(4, this));
    }

    public final void b(int v, boolean z) {
        for(Object object0: this.e0) {
            ((h)object0).a();
        }
    }

    public final boolean c(int v) {
        return this.getChildAt(v).getVisibility() != 8;
    }

    public final boolean d(int v, boolean z) {
        List list0 = this.getCheckedButtonIds();
        if(this.j0 && list0.isEmpty()) {
            View view0 = this.findViewById(v);
            if(view0 instanceof MaterialButton) {
                this.h0 = true;
                ((MaterialButton)view0).setChecked(true);
                this.h0 = false;
            }
            this.k0 = v;
            return false;
        }
        if(z && this.i0) {
            list0.remove(Integer.valueOf(v));
            for(Object object0: list0) {
                int v1 = (int)(((Integer)object0));
                View view1 = this.findViewById(v1);
                if(view1 instanceof MaterialButton) {
                    this.h0 = true;
                    ((MaterialButton)view1).setChecked(false);
                    this.h0 = false;
                }
                this.b(v1, false);
            }
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    public final void dispatchDraw(Canvas canvas0) {
        TreeMap treeMap0 = new TreeMap(this.f0);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            treeMap0.put(((MaterialButton)this.getChildAt(v1)), v1);
        }
        this.g0 = (Integer[])treeMap0.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas0);
    }

    public final void e() {
        c c1;
        int v = this.getChildCount();
        int v1 = this.getFirstVisibleChildIndex();
        int v2 = this.getLastVisibleChildIndex();
        for(int v3 = 0; v3 < v; ++v3) {
            MaterialButton materialButton0 = (MaterialButton)this.getChildAt(v3);
            if(materialButton0.getVisibility() != 8) {
                i i0 = materialButton0.getShapeAppearanceModel().e();
                c c0 = (c)this.b0.get(v3);
                if(v1 != v2) {
                    boolean z = this.getOrientation() == 0;
                    H6.a a0 = c.e;
                    if(v3 == v1) {
                        if(z) {
                            c1 = this.getLayoutDirection() == 1 ? new c(a0, a0, c0.b, c0.c) : new c(c0.a, c0.d, a0, a0);
                        }
                        else {
                            c1 = new c(c0.a, a0, c0.b, a0);
                        }
                        c0 = c1;
                    }
                    else if(v3 == v2) {
                        if(!z) {
                            c1 = new c(a0, c0.d, a0, c0.c);
                        }
                        else if(this.getLayoutDirection() == 1) {
                            c1 = new c(c0.a, c0.d, a0, a0);
                        }
                        else {
                            c1 = new c(a0, a0, c0.b, c0.c);
                        }
                        c0 = c1;
                    }
                    else {
                        c0 = null;
                    }
                }
                if(c0 == null) {
                    i0.e = new H6.a(0.0f);
                    i0.f = new H6.a(0.0f);
                    i0.g = new H6.a(0.0f);
                    i0.h = new H6.a(0.0f);
                }
                else {
                    i0.e = c0.a;
                    i0.h = c0.d;
                    i0.f = c0.b;
                    i0.g = c0.c;
                }
                materialButton0.setShapeAppearanceModel(i0.a());
            }
        }
    }

    @Override  // android.widget.LinearLayout
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    // Deobfuscation rating: LOW(20)
    public int getCheckedButtonId() {
        return this.i0 ? this.k0 : -1;
    }

    public List getCheckedButtonIds() {
        List list0 = new ArrayList();
        for(int v = 0; v < this.getChildCount(); ++v) {
            MaterialButton materialButton0 = (MaterialButton)this.getChildAt(v);
            if(materialButton0.o0) {
                ((ArrayList)list0).add(materialButton0.getId());
            }
        }
        return list0;
    }

    @Override  // android.view.ViewGroup
    public final int getChildDrawingOrder(int v, int v1) {
        Integer[] arr_integer = this.g0;
        if(arr_integer != null && v1 < arr_integer.length) {
            return (int)arr_integer[v1];
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn\'t updated");
        return v1;
    }

    private int getFirstVisibleChildIndex() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.c(v1)) {
                return v1;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for(int v = this.getChildCount() - 1; v >= 0; --v) {
            if(this.c(v)) {
                return v;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof MaterialButton && this.c(v)) {
                ++v1;
            }
        }
        return v1;
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int v = this.k0;
        if(v != -1) {
            MaterialButton materialButton0 = (MaterialButton)this.findViewById(v);
            if(materialButton0 != null) {
                materialButton0.setChecked(true);
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setCollectionInfo(((AccessibilityNodeInfo.CollectionInfo)I5.h.r(1, this.getVisibleButtonCount(), (this.i0 ? 1 : 2)).Y));
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        this.e();
        this.a();
        super.onMeasure(v, v1);
    }

    @Override  // android.view.ViewGroup
    public final void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        if(view0 instanceof MaterialButton) {
            ((MaterialButton)view0).f0.remove(this.c0);
            ((MaterialButton)view0).setOnPressedChangeListenerInternal(null);
        }
        int v = this.indexOfChild(view0);
        if(v >= 0) {
            this.b0.remove(v);
        }
        this.e();
        this.a();
    }

    private void setCheckedId(int v) {
        this.k0 = v;
        this.b(v, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton0) {
        if(materialButton0.getId() == -1) {
            materialButton0.setId(View.generateViewId());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.j0 = z;
    }

    public void setSingleSelection(int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        if(this.i0 != z) {
            this.i0 = z;
            this.h0 = true;
            for(int v = 0; v < this.getChildCount(); ++v) {
                MaterialButton materialButton0 = (MaterialButton)this.getChildAt(v);
                materialButton0.setChecked(false);
                this.b(materialButton0.getId(), false);
            }
            this.h0 = false;
            this.setCheckedId(-1);
        }
    }

    private void setupButtonChild(MaterialButton materialButton0) {
        materialButton0.setMaxLines(1);
        materialButton0.setEllipsize(TextUtils.TruncateAt.END);
        materialButton0.setCheckable(true);
        materialButton0.f0.add(this.c0);
        materialButton0.setOnPressedChangeListenerInternal(this.d0);
        materialButton0.setShouldDrawSurfaceColorStroke(true);
    }
}

