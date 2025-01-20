package com.google.android.material.textfield;

import B6.l;
import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Locale;

public class TextInputEditText extends AppCompatEditText {
    public final Rect h0;
    public boolean i0;

    public TextInputEditText(Context context0, AttributeSet attributeSet0) {
        super(a.a(context0, attributeSet0, 0x7F040170, 0), attributeSet0, 0);  // attr:editTextStyle
        this.h0 = new Rect();
        l.a(context0, attributeSet0, 0x7F040170, 0x7F1302D5);  // attr:editTextStyle
        l.b(context0, attributeSet0, p6.a.E, 0x7F040170, 0x7F1302D5, new int[0]);  // attr:editTextStyle
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, p6.a.E, 0x7F040170, 0x7F1302D5);  // attr:editTextStyle
        this.setTextInputLayoutFocusedRectEnabled(typedArray0.getBoolean(0, false));
        typedArray0.recycle();
    }

    @Override  // android.widget.TextView
    public final void getFocusedRect(Rect rect0) {
        super.getFocusedRect(rect0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && this.i0 && rect0 != null) {
            textInputLayout0.getFocusedRect(this.h0);
            rect0.bottom = this.h0.bottom;
        }
    }

    @Override  // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect0, Point point0) {
        boolean z = super.getGlobalVisibleRect(rect0, point0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && this.i0 && rect0 != null) {
            textInputLayout0.getGlobalVisibleRect(this.h0, point0);
            rect0.bottom = this.h0.bottom;
        }
        return z;
    }

    @Override  // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null || !textInputLayout0.D0 ? super.getHint() : textInputLayout0.getHint();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null ? null : textInputLayout0.getHint();
    }

    private TextInputLayout getTextInputLayout() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    @Override  // android.widget.TextView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && textInputLayout0.D0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            this.setHint("");
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatEditText
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            editorInfo0.hintText = this.getHintFromLayout();
        }
        return inputConnection0;
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        this.getTextInputLayout();
    }

    @Override  // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect0) {
        boolean z = super.requestRectangleOnScreen(rect0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && this.i0) {
            int v = textInputLayout0.getHeight();
            int v1 = this.getResources().getDimensionPixelOffset(0x7F070164);  // dimen:mtrl_edittext_rectangle_top_offset
            int v2 = textInputLayout0.getWidth();
            int v3 = textInputLayout0.getHeight();
            this.h0.set(0, v - v1, v2, v3);
            textInputLayout0.requestRectangleOnScreen(this.h0, true);
        }
        return z;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.i0 = z;
    }
}

