package o;

import M1.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class f0 extends ListView {
    public final Rect b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public c0 h0;
    public boolean i0;
    public final boolean j0;
    public boolean k0;
    public d l0;
    public e0 m0;

    public f0(Context context0, boolean z) {
        super(context0, null, 0x7F040169);  // attr:dropDownListViewStyle
        this.b0 = new Rect();
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.j0 = z;
        this.setCacheColorHint(0);
    }

    public final int a(int v, int v1) {
        int v2 = this.getListPaddingTop();
        int v3 = this.getListPaddingBottom();
        int v4 = this.getDividerHeight();
        Drawable drawable0 = this.getDivider();
        ListAdapter listAdapter0 = this.getAdapter();
        if(listAdapter0 == null) {
            return v2 + v3;
        }
        int v5 = v2 + v3;
        if(v4 <= 0 || drawable0 == null) {
            v4 = 0;
        }
        int v6 = listAdapter0.getCount();
        int v8 = 0;
        View view0 = null;
        for(int v7 = 0; v7 < v6; ++v7) {
            int v9 = listAdapter0.getItemViewType(v7);
            if(v9 != v8) {
                view0 = null;
                v8 = v9;
            }
            view0 = listAdapter0.getView(v7, view0, this);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
                view0.setLayoutParams(viewGroup$LayoutParams0);
            }
            view0.measure(v, (viewGroup$LayoutParams0.height <= 0 ? 0 : View.MeasureSpec.makeMeasureSpec(viewGroup$LayoutParams0.height, 0x40000000)));
            view0.forceLayout();
            if(v7 > 0) {
                v5 += v4;
            }
            v5 += view0.getMeasuredHeight();
            if(v5 >= v1) {
                return v1;
            }
        }
        return v5;
    }

    public final boolean b(MotionEvent motionEvent0, int v) {
        boolean z1;
        boolean z3;
        int v1 = motionEvent0.getActionMasked();
        boolean z = false;
        switch(v1) {
            case 1: {
                z1 = false;
                goto label_8;
            }
            case 2: {
                z1 = true;
            label_8:
                int v2 = motionEvent0.findPointerIndex(v);
                if(v2 >= 0) {
                    int v3 = (int)motionEvent0.getX(v2);
                    int v4 = (int)motionEvent0.getY(v2);
                    int v5 = this.pointToPosition(v3, v4);
                    if(v5 == -1) {
                        z = true;
                    }
                    else {
                        View view0 = this.getChildAt(v5 - this.getFirstVisiblePosition());
                        this.k0 = true;
                        int v6 = Build.VERSION.SDK_INT;
                        Z.a(this, ((float)v3), ((float)v4));
                        if(!this.isPressed()) {
                            this.setPressed(true);
                        }
                        this.layoutChildren();
                        int v7 = this.g0;
                        if(v7 != -1) {
                            View view1 = this.getChildAt(v7 - this.getFirstVisiblePosition());
                            if(view1 != null && view1 != view0 && view1.isPressed()) {
                                view1.setPressed(false);
                            }
                        }
                        this.g0 = v5;
                        Z.a(view0, ((float)v3) - ((float)view0.getLeft()), ((float)v4) - ((float)view0.getTop()));
                        if(!view0.isPressed()) {
                            view0.setPressed(true);
                        }
                        Drawable drawable0 = this.getSelector();
                        boolean z2 = drawable0 != null && v5 != -1;
                        if(z2) {
                            drawable0.setVisible(false, false);
                        }
                        int v8 = view0.getLeft();
                        int v9 = view0.getTop();
                        int v10 = view0.getRight();
                        int v11 = view0.getBottom();
                        Rect rect0 = this.b0;
                        rect0.set(v8, v9, v10, v11);
                        rect0.left -= this.c0;
                        rect0.top -= this.d0;
                        rect0.right += this.e0;
                        rect0.bottom += this.f0;
                        if(v6 >= 33) {
                            z3 = b0.a(this);
                        }
                        else {
                            Field field0 = d0.a;
                            if(field0 == null) {
                                z3 = false;
                            }
                            else {
                                try {
                                    z3 = field0.getBoolean(this);
                                }
                                catch(IllegalAccessException illegalAccessException0) {
                                    illegalAccessException0.printStackTrace();
                                    z3 = false;
                                }
                            }
                        }
                        if(view0.isEnabled() != z3) {
                            if(Build.VERSION.SDK_INT >= 33) {
                                b0.b(this, !z3);
                            }
                            else {
                                Field field1 = d0.a;
                                if(field1 != null) {
                                    try {
                                        field1.set(this, Boolean.valueOf(!z3));
                                    }
                                    catch(IllegalAccessException illegalAccessException1) {
                                        illegalAccessException1.printStackTrace();
                                    }
                                }
                            }
                            this.refreshDrawableState();
                        }
                        if(z2) {
                            float f = rect0.exactCenterX();
                            float f1 = rect0.exactCenterY();
                            drawable0.setVisible(this.getVisibility() == 0, false);
                            drawable0.setHotspot(f, f1);
                        }
                        Drawable drawable1 = this.getSelector();
                        if(drawable1 != null && v5 != -1) {
                            drawable1.setHotspot(((float)v3), ((float)v4));
                        }
                        c0 c00 = this.h0;
                        if(c00 != null) {
                            c00.Y = false;
                        }
                        this.refreshDrawableState();
                        if(v1 == 1) {
                            this.performItemClick(view0, v5, this.getItemIdAtPosition(v5));
                        }
                        z1 = true;
                    }
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                z1 = true;
            }
        }
        if(!z1 || z) {
            this.k0 = false;
            this.setPressed(false);
            this.drawableStateChanged();
            View view2 = this.getChildAt(this.g0 - this.getFirstVisiblePosition());
            if(view2 != null) {
                view2.setPressed(false);
            }
        }
        if(z1) {
            if(this.l0 == null) {
                this.l0 = new d(this);
            }
            this.l0.n0 = true;
            this.l0.onTouch(this, motionEvent0);
            return z1;
        }
        d d0 = this.l0;
        if(d0 != null) {
            if(d0.n0) {
                d0.d();
            }
            d0.n0 = false;
        }
        return z1;
    }

    @Override  // android.widget.ListView
    public final void dispatchDraw(Canvas canvas0) {
        Rect rect0 = this.b0;
        if(!rect0.isEmpty()) {
            Drawable drawable0 = this.getSelector();
            if(drawable0 != null) {
                drawable0.setBounds(rect0);
                drawable0.draw(canvas0);
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // android.widget.AbsListView
    public final void drawableStateChanged() {
        if(this.m0 != null) {
            return;
        }
        super.drawableStateChanged();
        c0 c00 = this.h0;
        if(c00 != null) {
            c00.Y = true;
        }
        Drawable drawable0 = this.getSelector();
        if(drawable0 != null && this.k0 && this.isPressed()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.ViewGroup
    public final boolean hasFocus() {
        return this.j0 || super.hasFocus();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.View
    public final boolean hasWindowFocus() {
        return this.j0 || super.hasWindowFocus();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.View
    public final boolean isFocused() {
        return this.j0 || super.isFocused();
    }

    // Deobfuscation rating: LOW(30)
    @Override  // android.view.View
    public final boolean isInTouchMode() {
        return this.j0 && this.i0 || super.isInTouchMode();
    }

    @Override  // android.widget.ListView
    public final void onDetachedFromWindow() {
        this.m0 = null;
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = Build.VERSION.SDK_INT;
        if(v < 26) {
            return super.onHoverEvent(motionEvent0);
        }
        int v1 = motionEvent0.getActionMasked();
        if(v1 == 10 && this.m0 == null) {
            e0 e00 = new e0(0, this);
            this.m0 = e00;
            this.post(e00);
        }
        boolean z = super.onHoverEvent(motionEvent0);
        if(v1 != 7 && v1 != 9) {
            this.setSelection(-1);
            return z;
        }
        int v2 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        if(v2 != -1 && v2 != this.getSelectedItemPosition()) {
            View view0 = this.getChildAt(v2 - this.getFirstVisiblePosition());
            if(view0.isEnabled()) {
                this.requestFocus();
                if(v < 30 || !a0.d) {
                    this.setSelectionFromTop(v2, view0.getTop() - this.getTop());
                }
                else {
                    try {
                        a0.a.invoke(this, v2, view0, Boolean.FALSE, -1, -1);
                        a0.b.invoke(this, v2);
                        a0.c.invoke(this, v2);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        illegalAccessException0.printStackTrace();
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        invocationTargetException0.printStackTrace();
                    }
                }
            }
            Drawable drawable0 = this.getSelector();
            if(drawable0 != null && this.k0 && this.isPressed()) {
                drawable0.setState(this.getDrawableState());
            }
        }
        return z;
    }

    @Override  // android.widget.AbsListView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.g0 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        }
        e0 e00 = this.m0;
        if(e00 != null) {
            ((f0)e00.Y).m0 = null;
            ((f0)e00.Y).removeCallbacks(e00);
        }
        return super.onTouchEvent(motionEvent0);
    }

    public void setListSelectionHidden(boolean z) {
        this.i0 = z;
    }

    @Override  // android.widget.AbsListView
    public void setSelector(Drawable drawable0) {
        c0 c00 = null;
        if(drawable0 != null) {
            c0 c01 = new c0();  // initializer: Landroid/graphics/drawable/Drawable;-><init>()V
            Drawable drawable1 = c01.X;
            if(drawable1 != null) {
                drawable1.setCallback(null);
            }
            c01.X = drawable0;
            drawable0.setCallback(c01);
            c01.Y = true;
            c00 = c01;
        }
        this.h0 = c00;
        super.setSelector(c00);
        Rect rect0 = new Rect();
        if(drawable0 != null) {
            drawable0.getPadding(rect0);
        }
        this.c0 = rect0.left;
        this.d0 = rect0.top;
        this.e0 = rect0.right;
        this.f0 = rect0.bottom;
    }
}

