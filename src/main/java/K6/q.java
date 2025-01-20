package K6;

import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import o.l;
import o.o0;

public final class q extends l {
    public final o0 f0;
    public final AccessibilityManager g0;
    public final Rect h0;

    public q(Context context0, AttributeSet attributeSet0) {
        super(a.a(context0, attributeSet0, 0x7F040042, 0), attributeSet0, 0);  // attr:autoCompleteTextViewStyle
        this.h0 = new Rect();
        Context context1 = this.getContext();
        TypedArray typedArray0 = B6.l.f(context1, attributeSet0, p6.a.n, 0x7F040042, 0x7F13028B, new int[0]);  // attr:autoCompleteTextViewStyle
        if(typedArray0.hasValue(0) && typedArray0.getInt(0, 0) == 0) {
            this.setKeyListener(null);
        }
        this.g0 = (AccessibilityManager)context1.getSystemService("accessibility");
        o0 o00 = new o0(context1, null, 0x7F04028E);  // attr:listPopupWindowStyle
        this.f0 = o00;
        o00.v0 = true;
        o00.w0.setFocusable(true);
        o00.m0 = this;
        o00.w0.setInputMethodMode(2);
        o00.q(this.getAdapter());
        o00.n0 = new p(0, this);
        typedArray0.recycle();
    }

    public static void a(q q0, Object object0) {
        q0.setText(q0.convertSelectionToString(object0), false);
    }

    public final TextInputLayout b() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    @Override  // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.b();
        return textInputLayout0 == null || !textInputLayout0.D0 ? super.getHint() : textInputLayout0.getHint();
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.b();
        if(textInputLayout0 != null && textInputLayout0.D0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            this.setHint("");
        }
    }

    @Override  // android.widget.TextView
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(View.MeasureSpec.getMode(v) == 0x80000000) {
            int v2 = this.getMeasuredWidth();
            ListAdapter listAdapter0 = this.getAdapter();
            TextInputLayout textInputLayout0 = this.b();
            int v3 = 0;
            if(listAdapter0 != null && textInputLayout0 != null) {
                int v4 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
                int v5 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
                o0 o00 = this.f0;
                int v6 = o00.w0.isShowing() ? o00.Z.getSelectedItemPosition() : -1;
                int v7 = Math.min(listAdapter0.getCount(), Math.max(0, v6) + 15);
                int v8 = Math.max(0, v7 - 15);
                View view0 = null;
                int v9 = 0;
                while(v8 < v7) {
                    int v10 = listAdapter0.getItemViewType(v8);
                    if(v10 != v3) {
                        view0 = null;
                        v3 = v10;
                    }
                    view0 = listAdapter0.getView(v8, view0, textInputLayout0);
                    if(view0.getLayoutParams() == null) {
                        view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view0.measure(v4, v5);
                    v9 = Math.max(v9, view0.getMeasuredWidth());
                    ++v8;
                }
                Drawable drawable0 = o00.w0.getBackground();
                if(drawable0 != null) {
                    drawable0.getPadding(this.h0);
                    v9 += this.h0.left + this.h0.right;
                }
                v3 = textInputLayout0.getEndIconView().getMeasuredWidth() + v9;
            }
            int v11 = this.getMeasuredHeight();
            this.setMeasuredDimension(Math.min(Math.max(v2, v3), View.MeasureSpec.getSize(v)), v11);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setAdapter(ListAdapter listAdapter0) {
        super.setAdapter(listAdapter0);
        ListAdapter listAdapter1 = this.getAdapter();
        this.f0.q(listAdapter1);
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if(this.g0 != null && this.g0.isTouchExplorationEnabled()) {
            this.f0.a();
            return;
        }
        super.showDropDown();
    }
}

