package com.google.android.material.textfield;

import Bb.F;
import K6.l;
import K6.m;
import K6.t;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.shape.MaterialShapeDrawable;

public final class b implements t {
    public final c a;

    public b(c c0) {
        this.a = c0;
    }

    @Override  // K6.t
    public final void a(TextInputLayout textInputLayout0) {
        EditText editText0 = textInputLayout0.getEditText();
        if(!(editText0 instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        c c0 = this.a;
        int v = c0.a.getBoxBackgroundMode();
        if(v == 2) {
            ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(c0.m);
        }
        else if(v == 1) {
            ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(c0.l);
        }
        if(!c.f(((AutoCompleteTextView)editText0))) {
            TextInputLayout textInputLayout1 = c0.a;
            int v1 = textInputLayout1.getBoxBackgroundMode();
            MaterialShapeDrawable materialShapeDrawable0 = textInputLayout1.getBoxBackground();
            int v2 = F.u(((AutoCompleteTextView)editText0), 0x7F0400F1);  // attr:colorControlHighlight
            int[][] arr2_v = {new int[]{0x10100A7}, new int[0]};
            if(v1 == 2) {
                int v3 = F.u(((AutoCompleteTextView)editText0), 0x7F040101);  // attr:colorSurface
                MaterialShapeDrawable materialShapeDrawable1 = new MaterialShapeDrawable(materialShapeDrawable0.X.a);
                int v4 = F.F(v2, 0.1f, v3);
                materialShapeDrawable1.j(new ColorStateList(arr2_v, new int[]{v4, 0}));
                materialShapeDrawable1.setTint(v3);
                ColorStateList colorStateList0 = new ColorStateList(arr2_v, new int[]{v4, v3});
                MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable0.X.a);
                materialShapeDrawable2.setTint(-1);
                ((AutoCompleteTextView)editText0).setBackground(new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList0, materialShapeDrawable1, materialShapeDrawable2), materialShapeDrawable0}));
            }
            else if(v1 == 1) {
                int v5 = textInputLayout1.getBoxBackgroundColor();
                ((AutoCompleteTextView)editText0).setBackground(new RippleDrawable(new ColorStateList(arr2_v, new int[]{F.F(v2, 0.1f, v5), v5}), materialShapeDrawable0, materialShapeDrawable0));
            }
        }
        ((AutoCompleteTextView)editText0).setOnTouchListener(new l(c0, ((AutoCompleteTextView)editText0)));
        ((AutoCompleteTextView)editText0).setOnFocusChangeListener(c0.e);
        ((AutoCompleteTextView)editText0).setOnDismissListener(new m(c0));
        ((AutoCompleteTextView)editText0).setThreshold(0);
        ((AutoCompleteTextView)editText0).removeTextChangedListener(c0.d);
        ((AutoCompleteTextView)editText0).addTextChangedListener(c0.d);
        textInputLayout0.setEndIconCheckable(true);
        textInputLayout0.setErrorIconDrawable(null);
        if(((AutoCompleteTextView)editText0).getKeyListener() == null) {
            c0.c.setImportantForAccessibility(2);
        }
        textInputLayout0.setTextInputAccessibilityDelegate(c0.f);
        textInputLayout0.setEndIconVisible(true);
    }
}

