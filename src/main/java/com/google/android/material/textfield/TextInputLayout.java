package com.google.android.material.textfield;

import B6.l;
import Bb.F;
import Bb.q;
import H1.e;
import H6.f;
import H6.i;
import J1.H;
import J1.b;
import K1.d;
import K6.h;
import K6.j;
import K6.o;
import K6.r;
import K6.s;
import K6.t;
import L6.a;
import M.J;
import a8.Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import o.N;
import o.p;

public class TextInputLayout extends LinearLayout {
    public static class AccessibilityDelegate extends b {
        public final TextInputLayout d;

        public AccessibilityDelegate(TextInputLayout textInputLayout0) {
            this.d = textInputLayout0;
        }

        @Override  // J1.b
        public void d(View view0, d d0) {
            AccessibilityNodeInfo accessibilityNodeInfo0 = d0.a;
            this.a.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
            EditText editText0 = this.d.getEditText();
            Editable editable0 = editText0 == null ? null : editText0.getText();
            CharSequence charSequence0 = this.d.getHint();
            CharSequence charSequence1 = this.d.getError();
            CharSequence charSequence2 = this.d.getPlaceholderText();
            int v = this.d.getCounterMaxLength();
            CharSequence charSequence3 = this.d.getCounterOverflowDescription();
            boolean z = TextUtils.isEmpty(editable0);
            boolean z1 = TextUtils.isEmpty(charSequence0);
            boolean z2 = this.d.D1;
            boolean z3 = TextUtils.isEmpty(charSequence1);
            boolean z4 = !z3 || !TextUtils.isEmpty(charSequence3);
            String s = z1 ? "" : charSequence0.toString();
            if(!z) {
                d0.n(editable0);
            }
            else if(!TextUtils.isEmpty(s)) {
                d0.n(s);
                if(!z2 && charSequence2 != null) {
                    d0.n(s + ", " + charSequence2);
                }
            }
            else if(charSequence2 != null) {
                d0.n(charSequence2);
            }
            if(!TextUtils.isEmpty(s)) {
                int v1 = Build.VERSION.SDK_INT;
                if(v1 >= 26) {
                    d0.l(s);
                }
                else {
                    if(!z) {
                        s = editable0 + ", " + s;
                    }
                    d0.n(s);
                }
                if(v1 >= 26) {
                    accessibilityNodeInfo0.setShowingHintText(z);
                }
                else {
                    d0.h(4, z);
                }
            }
            if(editable0 == null || editable0.length() != v) {
                v = -1;
            }
            accessibilityNodeInfo0.setMaxTextLength(v);
            if(z4) {
                if(z3) {
                    charSequence1 = charSequence3;
                }
                accessibilityNodeInfo0.setError(charSequence1);
            }
            if(editText0 != null) {
                editText0.setLabelFor(0x7F0A02FD);  // id:textinput_helper_text
            }
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public CharSequence Z;
        public boolean b0;
        public CharSequence c0;
        public CharSequence d0;
        public CharSequence e0;

        static {
            SavedState.CREATOR = new com.google.android.material.textfield.d();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.Z = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
            this.b0 = parcel0.readInt() == 1;
            this.c0 = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
            this.d0 = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
            this.e0 = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        }

        @Override
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.Z + " hint=" + this.c0 + " helperText=" + this.d0 + " placeholderText=" + this.e0 + "}";
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            TextUtils.writeToParcel(this.Z, parcel0, v);
            parcel0.writeInt(((int)this.b0));
            TextUtils.writeToParcel(this.c0, parcel0, v);
            TextUtils.writeToParcel(this.d0, parcel0, v);
            TextUtils.writeToParcel(this.e0, parcel0, v);
        }
    }

    public final N A0;
    public int A1;
    public boolean B0;
    public int B1;
    public CharSequence C0;
    public int C1;
    public boolean D0;
    public boolean D1;
    public MaterialShapeDrawable E0;
    public final B6.b E1;
    public MaterialShapeDrawable F0;
    public boolean F1;
    public final ShapeAppearanceModel G0;
    public boolean G1;
    public final int H0;
    public ValueAnimator H1;
    public int I0;
    public boolean I1;
    public int J0;
    public boolean J1;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public final Rect Q0;
    public final Rect R0;
    public final RectF S0;
    public Typeface T0;
    public final CheckableImageButton U0;
    public ColorStateList V0;
    public boolean W0;
    public PorterDuff.Mode X0;
    public boolean Y0;
    public ColorDrawable Z0;
    public int a1;
    public final FrameLayout b0;
    public View.OnLongClickListener b1;
    public final LinearLayout c0;
    public final LinkedHashSet c1;
    public final LinearLayout d0;
    public int d1;
    public final FrameLayout e0;
    public final SparseArray e1;
    public EditText f0;
    public final CheckableImageButton f1;
    public CharSequence g0;
    public final LinkedHashSet g1;
    public int h0;
    public ColorStateList h1;
    public int i0;
    public boolean i1;
    public final o j0;
    public PorterDuff.Mode j1;
    public boolean k0;
    public boolean k1;
    public int l0;
    public ColorDrawable l1;
    public boolean m0;
    public int m1;
    public N n0;
    public Drawable n1;
    public int o0;
    public View.OnLongClickListener o1;
    public int p0;
    public View.OnLongClickListener p1;
    public CharSequence q0;
    public final CheckableImageButton q1;
    public boolean r0;
    public ColorStateList r1;
    public N s0;
    public ColorStateList s1;
    public ColorStateList t0;
    public ColorStateList t1;
    public int u0;
    public int u1;
    public ColorStateList v0;
    public int v1;
    public ColorStateList w0;
    public int w1;
    public CharSequence x0;
    public ColorStateList x1;
    public final N y0;
    public int y1;
    public CharSequence z0;
    public int z1;

    public TextInputLayout(Context context0, AttributeSet attributeSet0) {
        super(a.a(context0, attributeSet0, 0x7F04041E, 0x7F1302D6), attributeSet0, 0x7F04041E);  // attr:textInputStyle
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = new o(this);
        this.Q0 = new Rect();
        this.R0 = new Rect();
        this.S0 = new RectF();
        this.c1 = new LinkedHashSet();
        this.d1 = 0;
        SparseArray sparseArray0 = new SparseArray();
        this.e1 = sparseArray0;
        this.g1 = new LinkedHashSet();
        B6.b b0 = new B6.b(this);
        this.E1 = b0;
        Context context1 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        FrameLayout frameLayout0 = new FrameLayout(context1);
        this.b0 = frameLayout0;
        frameLayout0.setAddStatesFromChildren(true);
        this.addView(frameLayout0);
        LinearLayout linearLayout0 = new LinearLayout(context1);
        this.c0 = linearLayout0;
        linearLayout0.setOrientation(0);
        linearLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800003));
        frameLayout0.addView(linearLayout0);
        LinearLayout linearLayout1 = new LinearLayout(context1);
        this.d0 = linearLayout1;
        linearLayout1.setOrientation(0);
        linearLayout1.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800005));
        frameLayout0.addView(linearLayout1);
        FrameLayout frameLayout1 = new FrameLayout(context1);
        this.e0 = frameLayout1;
        frameLayout1.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        b0.H = q6.a.a;
        b0.g();
        b0.G = q6.a.a;
        b0.g();
        if(b0.h != 0x800033) {
            b0.h = 0x800033;
            b0.g();
        }
        l.a(context1, attributeSet0, 0x7F04041E, 0x7F1302D6);  // attr:textInputStyle
        l.b(context1, attributeSet0, p6.a.F, 0x7F04041E, 0x7F1302D6, new int[]{20, 18, 33, 38, 42});  // attr:textInputStyle
        TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, p6.a.F, 0x7F04041E, 0x7F1302D6);  // attr:textInputStyle
        Q q0 = new Q(context1, 18, typedArray0);
        this.B0 = typedArray0.getBoolean(41, true);
        this.setHint(typedArray0.getText(4));
        this.G1 = typedArray0.getBoolean(40, true);
        this.F1 = typedArray0.getBoolean(35, true);
        if(typedArray0.hasValue(3)) {
            this.setMinWidth(typedArray0.getDimensionPixelSize(3, -1));
        }
        if(typedArray0.hasValue(2)) {
            this.setMaxWidth(typedArray0.getDimensionPixelSize(2, -1));
        }
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.b(context1, attributeSet0, 0x7F04041E, 0x7F1302D6).a();  // attr:textInputStyle
        this.G0 = shapeAppearanceModel0;
        this.H0 = context1.getResources().getDimensionPixelOffset(0x7F0701BC);  // dimen:mtrl_textinput_box_label_cutout_padding
        this.K0 = typedArray0.getDimensionPixelOffset(7, 0);
        this.M0 = typedArray0.getDimensionPixelSize(14, context1.getResources().getDimensionPixelSize(0x7F0701BD));  // dimen:mtrl_textinput_box_stroke_width_default
        this.N0 = typedArray0.getDimensionPixelSize(15, context1.getResources().getDimensionPixelSize(0x7F0701BE));  // dimen:mtrl_textinput_box_stroke_width_focused
        this.L0 = this.M0;
        float f = typedArray0.getDimension(11, -1.0f);
        float f1 = typedArray0.getDimension(10, -1.0f);
        float f2 = typedArray0.getDimension(8, -1.0f);
        float f3 = typedArray0.getDimension(9, -1.0f);
        i i0 = shapeAppearanceModel0.e();
        if(f >= 0.0f) {
            i0.e = new H6.a(f);
        }
        if(f1 >= 0.0f) {
            i0.f = new H6.a(f1);
        }
        if(f2 >= 0.0f) {
            i0.g = new H6.a(f2);
        }
        if(f3 >= 0.0f) {
            i0.h = new H6.a(f3);
        }
        this.G0 = i0.a();
        ColorStateList colorStateList0 = F.v(context1, q0, 5);
        if(colorStateList0 == null) {
            this.P0 = 0;
            this.y1 = 0;
            this.z1 = 0;
            this.A1 = 0;
            this.B1 = 0;
        }
        else {
            int v = colorStateList0.getDefaultColor();
            this.y1 = v;
            this.P0 = v;
            if(colorStateList0.isStateful()) {
                this.z1 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.A1 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
                this.B1 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            }
            else {
                this.A1 = this.y1;
                ColorStateList colorStateList1 = q.t(context1, 0x7F060143);  // color:mtrl_filled_background_color
                this.z1 = colorStateList1.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.B1 = colorStateList1.getColorForState(new int[]{0x1010367}, -1);
            }
        }
        if(typedArray0.hasValue(1)) {
            ColorStateList colorStateList2 = q0.p(1);
            this.t1 = colorStateList2;
            this.s1 = colorStateList2;
        }
        ColorStateList colorStateList3 = F.v(context1, q0, 12);
        this.w1 = typedArray0.getColor(12, 0);
        this.u1 = context1.getColor(0x7F06015A);  // color:mtrl_textinput_default_box_stroke_color
        this.C1 = context1.getColor(0x7F06015B);  // color:mtrl_textinput_disabled_color
        this.v1 = context1.getColor(0x7F06015E);  // color:mtrl_textinput_hovered_box_stroke_color
        if(colorStateList3 != null) {
            this.setBoxStrokeColorStateList(colorStateList3);
        }
        if(typedArray0.hasValue(13)) {
            this.setBoxStrokeErrorColor(F.v(context1, q0, 13));
        }
        if(typedArray0.getResourceId(42, -1) != -1) {
            this.setHintTextAppearance(typedArray0.getResourceId(42, 0));
        }
        int v1 = typedArray0.getResourceId(33, 0);
        CharSequence charSequence0 = typedArray0.getText(28);
        boolean z = typedArray0.getBoolean(29, false);
        CheckableImageButton checkableImageButton0 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(0x7F0D004C, linearLayout1, false);  // layout:design_text_input_end_icon
        this.q1 = checkableImageButton0;
        checkableImageButton0.setId(0x7F0A02F9);  // id:text_input_error_icon
        checkableImageButton0.setVisibility(8);
        if(F.E(context1)) {
            ((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()).setMarginStart(0);
        }
        if(typedArray0.hasValue(30)) {
            this.setErrorIconDrawable(q0.t(30));
        }
        if(typedArray0.hasValue(0x1F)) {
            this.setErrorIconTintList(F.v(context1, q0, 0x1F));
        }
        if(typedArray0.hasValue(0x20)) {
            this.setErrorIconTintMode(l.g(typedArray0.getInt(0x20, -1), null));
        }
        checkableImageButton0.setContentDescription(this.getResources().getText(0x7F12016A));  // string:error_icon_content_description "Error"
        checkableImageButton0.setImportantForAccessibility(2);
        checkableImageButton0.setClickable(false);
        checkableImageButton0.setPressable(false);
        checkableImageButton0.setFocusable(false);
        int v2 = typedArray0.getResourceId(38, 0);
        boolean z1 = typedArray0.getBoolean(37, false);
        CharSequence charSequence1 = typedArray0.getText(36);
        int v3 = typedArray0.getResourceId(50, 0);
        CharSequence charSequence2 = typedArray0.getText(49);
        int v4 = typedArray0.getResourceId(53, 0);
        CharSequence charSequence3 = typedArray0.getText(52);
        int v5 = typedArray0.getResourceId(0x3F, 0);
        CharSequence charSequence4 = typedArray0.getText(62);
        boolean z2 = typedArray0.getBoolean(16, false);
        this.setCounterMaxLength(typedArray0.getInt(17, -1));
        this.p0 = typedArray0.getResourceId(20, 0);
        this.o0 = typedArray0.getResourceId(18, 0);
        CheckableImageButton checkableImageButton1 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(0x7F0D004D, linearLayout0, false);  // layout:design_text_input_start_icon
        this.U0 = checkableImageButton1;
        checkableImageButton1.setVisibility(8);
        if(F.E(context1)) {
            ((ViewGroup.MarginLayoutParams)checkableImageButton1.getLayoutParams()).setMarginEnd(0);
        }
        this.setStartIconOnClickListener(null);
        this.setStartIconOnLongClickListener(null);
        if(typedArray0.hasValue(59)) {
            this.setStartIconDrawable(q0.t(59));
            if(typedArray0.hasValue(58)) {
                this.setStartIconContentDescription(typedArray0.getText(58));
            }
            this.setStartIconCheckable(typedArray0.getBoolean(57, true));
        }
        if(typedArray0.hasValue(60)) {
            this.setStartIconTintList(F.v(context1, q0, 60));
        }
        if(typedArray0.hasValue(61)) {
            this.setStartIconTintMode(l.g(typedArray0.getInt(61, -1), null));
        }
        this.setBoxBackgroundMode(typedArray0.getInt(6, 0));
        CheckableImageButton checkableImageButton2 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(0x7F0D004C, frameLayout1, false);  // layout:design_text_input_end_icon
        this.f1 = checkableImageButton2;
        frameLayout1.addView(checkableImageButton2);
        checkableImageButton2.setVisibility(8);
        if(F.E(context1)) {
            ((ViewGroup.MarginLayoutParams)checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        sparseArray0.append(-1, new K6.i(this, 0));
        sparseArray0.append(0, new K6.i(this, 1));
        sparseArray0.append(1, new r(this));
        sparseArray0.append(2, new h(this));
        sparseArray0.append(3, new c(this));
        if(typedArray0.hasValue(25)) {
            this.setEndIconMode(typedArray0.getInt(25, 0));
            if(typedArray0.hasValue(24)) {
                this.setEndIconDrawable(q0.t(24));
            }
            if(typedArray0.hasValue(23)) {
                this.setEndIconContentDescription(typedArray0.getText(23));
            }
            this.setEndIconCheckable(typedArray0.getBoolean(22, true));
        }
        else if(typedArray0.hasValue(46)) {
            this.setEndIconMode(((int)typedArray0.getBoolean(46, false)));
            this.setEndIconDrawable(q0.t(45));
            this.setEndIconContentDescription(typedArray0.getText(44));
            if(typedArray0.hasValue(0x2F)) {
                this.setEndIconTintList(F.v(context1, q0, 0x2F));
            }
            if(typedArray0.hasValue(0x30)) {
                this.setEndIconTintMode(l.g(typedArray0.getInt(0x30, -1), null));
            }
        }
        if(!typedArray0.hasValue(46)) {
            if(typedArray0.hasValue(26)) {
                this.setEndIconTintList(F.v(context1, q0, 26));
            }
            if(typedArray0.hasValue(27)) {
                this.setEndIconTintMode(l.g(typedArray0.getInt(27, -1), null));
            }
        }
        N n0 = new N(context1, null);
        this.y0 = n0;
        n0.setId(0x7F0A02FF);  // id:textinput_prefix_text
        n0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        n0.setAccessibilityLiveRegion(1);
        linearLayout0.addView(checkableImageButton1);
        linearLayout0.addView(n0);
        N n1 = new N(context1, null);
        this.A0 = n1;
        n1.setId(0x7F0A0300);  // id:textinput_suffix_text
        n1.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        n1.setAccessibilityLiveRegion(1);
        linearLayout1.addView(n1);
        linearLayout1.addView(checkableImageButton0);
        linearLayout1.addView(frameLayout1);
        this.setHelperTextEnabled(z1);
        this.setHelperText(charSequence1);
        this.setHelperTextTextAppearance(v2);
        this.setErrorEnabled(z);
        this.setErrorTextAppearance(v1);
        this.setErrorContentDescription(charSequence0);
        this.setCounterTextAppearance(this.p0);
        this.setCounterOverflowTextAppearance(this.o0);
        this.setPlaceholderText(charSequence2);
        this.setPlaceholderTextAppearance(v3);
        this.setPrefixText(charSequence3);
        this.setPrefixTextAppearance(v4);
        this.setSuffixText(charSequence4);
        this.setSuffixTextAppearance(v5);
        if(typedArray0.hasValue(34)) {
            this.setErrorTextColor(q0.p(34));
        }
        if(typedArray0.hasValue(39)) {
            this.setHelperTextColor(q0.p(39));
        }
        if(typedArray0.hasValue(43)) {
            this.setHintTextColor(q0.p(43));
        }
        if(typedArray0.hasValue(21)) {
            this.setCounterTextColor(q0.p(21));
        }
        if(typedArray0.hasValue(19)) {
            this.setCounterOverflowTextColor(q0.p(19));
        }
        if(typedArray0.hasValue(51)) {
            this.setPlaceholderTextColor(q0.p(51));
        }
        if(typedArray0.hasValue(54)) {
            this.setPrefixTextColor(q0.p(54));
        }
        if(typedArray0.hasValue(0x40)) {
            this.setSuffixTextColor(q0.p(0x40));
        }
        this.setCounterEnabled(z2);
        this.setEnabled(typedArray0.getBoolean(0, true));
        q0.I();
        this.setImportantForAccessibility(2);
        if(Build.VERSION.SDK_INT >= 26) {
            H.b(this, 1);
        }
    }

    public final void a(float f) {
        B6.b b0 = this.E1;
        if(b0.c == f) {
            return;
        }
        if(this.H1 == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.H1 = valueAnimator0;
            valueAnimator0.setInterpolator(q6.a.b);
            this.H1.setDuration(0xA7L);
            this.H1.addUpdateListener(new J6.b(2, this));
        }
        this.H1.setFloatValues(new float[]{b0.c, f});
        this.H1.start();
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 instanceof EditText) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
            frameLayout$LayoutParams0.gravity = frameLayout$LayoutParams0.gravity & 0xFFFFFF8F | 16;
            this.b0.addView(view0, frameLayout$LayoutParams0);
            this.b0.setLayoutParams(viewGroup$LayoutParams0);
            this.r();
            this.setEditText(((EditText)view0));
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public final void b() {
        MaterialShapeDrawable materialShapeDrawable0 = this.E0;
        if(materialShapeDrawable0 == null) {
            return;
        }
        materialShapeDrawable0.setShapeAppearanceModel(this.G0);
        if(this.J0 == 2) {
            int v = this.L0;
            if(v > -1) {
                int v1 = this.O0;
                if(v1 != 0) {
                    MaterialShapeDrawable materialShapeDrawable1 = this.E0;
                    materialShapeDrawable1.X.j = (float)v;
                    materialShapeDrawable1.invalidateSelf();
                    ColorStateList colorStateList0 = ColorStateList.valueOf(v1);
                    f f0 = materialShapeDrawable1.X;
                    if(f0.d != colorStateList0) {
                        f0.d = colorStateList0;
                        materialShapeDrawable1.onStateChange(materialShapeDrawable1.getState());
                    }
                }
            }
        }
        int v2 = this.P0;
        if(this.J0 == 1) {
            TypedValue typedValue0 = q.W(this.getContext(), 0x7F040101);  // attr:colorSurface
            v2 = z1.a.c(this.P0, (typedValue0 == null ? 0 : typedValue0.data));
        }
        this.P0 = v2;
        this.E0.j(ColorStateList.valueOf(v2));
        if(this.d1 == 3) {
            this.f0.getBackground().invalidateSelf();
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.F0;
        if(materialShapeDrawable2 != null) {
            if(this.L0 > -1) {
                int v3 = this.O0;
                if(v3 != 0) {
                    materialShapeDrawable2.j(ColorStateList.valueOf(v3));
                }
            }
            this.invalidate();
        }
        this.invalidate();
    }

    public final void c() {
        TextInputLayout.d(this.f1, this.i1, this.h1, this.k1, this.j1);
    }

    public static void d(CheckableImageButton checkableImageButton0, boolean z, ColorStateList colorStateList0, boolean z1, PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(drawable0 != null && (z || z1)) {
            drawable0 = drawable0.mutate();
            if(z) {
                drawable0.setTintList(colorStateList0);
            }
            if(z1) {
                drawable0.setTintMode(porterDuff$Mode0);
            }
        }
        if(checkableImageButton0.getDrawable() != drawable0) {
            checkableImageButton0.setImageDrawable(drawable0);
        }
    }

    @Override  // android.view.ViewGroup
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure0, int v) {
        EditText editText0 = this.f0;
        if(editText0 == null) {
            super.dispatchProvideAutofillStructure(viewStructure0, v);
            return;
        }
        if(this.g0 != null) {
            boolean z = this.D0;
            this.D0 = false;
            CharSequence charSequence0 = editText0.getHint();
            this.f0.setHint(this.g0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure0, v);
            }
            finally {
                this.f0.setHint(charSequence0);
                this.D0 = z;
            }
            return;
        }
        viewStructure0.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure0, v);
        this.onProvideAutofillVirtualStructure(viewStructure0, v);
        FrameLayout frameLayout0 = this.b0;
        viewStructure0.setChildCount(frameLayout0.getChildCount());
        for(int v1 = 0; v1 < frameLayout0.getChildCount(); ++v1) {
            View view0 = frameLayout0.getChildAt(v1);
            ViewStructure viewStructure1 = viewStructure0.newChild(v1);
            view0.dispatchProvideAutofillStructure(viewStructure1, v);
            if(view0 == this.f0) {
                viewStructure1.setHint(this.getHint());
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.J1 = true;
        super.dispatchRestoreInstanceState(sparseArray0);
        this.J1 = false;
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        super.draw(canvas0);
        if(this.B0) {
            B6.b b0 = this.E1;
            b0.getClass();
            int v = canvas0.save();
            if(b0.x != null && b0.b) {
                b0.N.getLineLeft(0);
                b0.E.setTextSize(b0.B);
                float f = b0.q;
                float f1 = b0.r;
                float f2 = b0.A;
                if(f2 != 1.0f) {
                    canvas0.scale(f2, f2, f, f1);
                }
                canvas0.translate(f, f1);
                b0.N.draw(canvas0);
                canvas0.restoreToCount(v);
            }
        }
        MaterialShapeDrawable materialShapeDrawable0 = this.F0;
        if(materialShapeDrawable0 != null) {
            Rect rect0 = materialShapeDrawable0.getBounds();
            rect0.top = rect0.bottom - this.L0;
            this.F0.draw(canvas0);
        }
    }

    @Override  // android.view.ViewGroup
    public final void drawableStateChanged() {
        boolean z1;
        if(this.I1) {
            return;
        }
        boolean z = true;
        this.I1 = true;
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        B6.b b0 = this.E1;
        if(b0 == null) {
            z1 = false;
        }
        else {
            b0.C = arr_v;
            if((b0.l == null || !b0.l.isStateful()) && (b0.k == null || !b0.k.isStateful())) {
                z1 = false;
            }
            else {
                b0.g();
                z1 = true;
            }
        }
        if(this.f0 != null) {
            if(!this.isLaidOut() || !this.isEnabled()) {
                z = false;
            }
            this.s(z, false);
        }
        this.q();
        this.z();
        if(z1) {
            this.invalidate();
        }
        this.I1 = false;
    }

    public final int e() {
        if(!this.B0) {
            return 0;
        }
        B6.b b0 = this.E1;
        switch(this.J0) {
            case 0: 
            case 1: {
                b0.F.setTextSize(b0.j);
                b0.F.setTypeface(b0.s);
                b0.F.setLetterSpacing(b0.M);
                return (int)(-b0.F.ascent());
            }
            case 2: {
                b0.F.setTextSize(b0.j);
                b0.F.setTypeface(b0.s);
                b0.F.setLetterSpacing(b0.M);
                return (int)(-b0.F.ascent() / 2.0f);
            }
            default: {
                return 0;
            }
        }
    }

    // Deobfuscation rating: LOW(30)
    public final boolean f() {
        return this.B0 && !TextUtils.isEmpty(this.C0) && this.E0 instanceof j;
    }

    public final boolean g() {
        return this.e0.getVisibility() == 0 && this.f1.getVisibility() == 0;
    }

    @Override  // android.widget.LinearLayout
    public int getBaseline() {
        EditText editText0 = this.f0;
        if(editText0 != null) {
            int v = editText0.getBaseline();
            int v1 = this.getPaddingTop();
            return this.e() + (v1 + v);
        }
        return super.getBaseline();
    }

    public MaterialShapeDrawable getBoxBackground() {
        if(this.J0 != 1 && this.J0 != 2) {
            throw new IllegalStateException();
        }
        return this.E0;
    }

    public int getBoxBackgroundColor() {
        return this.P0;
    }

    public int getBoxBackgroundMode() {
        return this.J0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.E0.X.a.h.a(this.E0.f());
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.E0.X.a.g.a(this.E0.f());
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.E0.X.a.f.a(this.E0.f());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.E0.X.a.e.a(this.E0.f());
    }

    public int getBoxStrokeColor() {
        return this.w1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.x1;
    }

    public int getBoxStrokeWidth() {
        return this.M0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.N0;
    }

    public int getCounterMaxLength() {
        return this.l0;
    }

    public CharSequence getCounterOverflowDescription() {
        if(this.k0 && this.m0) {
            return this.n0 == null ? null : this.n0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.v0;
    }

    public ColorStateList getCounterTextColor() {
        return this.v0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.s1;
    }

    public EditText getEditText() {
        return this.f0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1.getContentDescription();
    }

    private EndIconDelegate getEndIconDelegate() {
        EndIconDelegate endIconDelegate0 = (EndIconDelegate)this.e1.get(this.d1);
        return endIconDelegate0 == null ? ((EndIconDelegate)this.e1.get(0)) : endIconDelegate0;
    }

    public Drawable getEndIconDrawable() {
        return this.f1.getDrawable();
    }

    public int getEndIconMode() {
        return this.d1;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton0 = this.q1;
        if(checkableImageButton0.getVisibility() == 0) {
            return checkableImageButton0;
        }
        return this.d1 == 0 || !this.g() ? null : this.f1;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1;
    }

    // Deobfuscation rating: LOW(20)
    public CharSequence getError() {
        return this.j0.k ? this.j0.j : null;
    }

    public CharSequence getErrorContentDescription() {
        return this.j0.m;
    }

    public int getErrorCurrentTextColors() {
        N n0 = this.j0.l;
        return n0 == null ? -1 : n0.getCurrentTextColor();
    }

    public Drawable getErrorIconDrawable() {
        return this.q1.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        N n0 = this.j0.l;
        return n0 == null ? -1 : n0.getCurrentTextColor();
    }

    // Deobfuscation rating: LOW(20)
    public CharSequence getHelperText() {
        return this.j0.q ? this.j0.p : null;
    }

    public int getHelperTextCurrentTextColor() {
        N n0 = this.j0.r;
        return n0 == null ? -1 : n0.getCurrentTextColor();
    }

    // Deobfuscation rating: LOW(20)
    public CharSequence getHint() {
        return this.B0 ? this.C0 : null;
    }

    public final float getHintCollapsedTextHeight() {
        this.E1.F.setTextSize(this.E1.j);
        this.E1.F.setTypeface(this.E1.s);
        this.E1.F.setLetterSpacing(this.E1.M);
        return -this.E1.F.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.E1.d(this.E1.l);
    }

    public ColorStateList getHintTextColor() {
        return this.t1;
    }

    public int getMaxWidth() {
        return this.i0;
    }

    public int getMinWidth() {
        return this.h0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1.getDrawable();
    }

    // Deobfuscation rating: LOW(20)
    public CharSequence getPlaceholderText() {
        return this.r0 ? this.q0 : null;
    }

    public int getPlaceholderTextAppearance() {
        return this.u0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.t0;
    }

    public CharSequence getPrefixText() {
        return this.x0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.y0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.y0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.U0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.U0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.z0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A0;
    }

    public Typeface getTypeface() {
        return this.T0;
    }

    public final void h() {
        int v = this.J0;
        if(v == 0) {
            this.E0 = null;
            this.F0 = null;
        }
        else {
            ShapeAppearanceModel shapeAppearanceModel0 = this.G0;
            switch(v) {
                case 1: {
                    this.E0 = new MaterialShapeDrawable(shapeAppearanceModel0);
                    this.F0 = new MaterialShapeDrawable();
                    break;
                }
                case 2: {
                    this.E0 = !this.B0 || this.E0 instanceof j ? new MaterialShapeDrawable(shapeAppearanceModel0) : new j(shapeAppearanceModel0);
                    this.F0 = null;
                    break;
                }
                default: {
                    throw new IllegalArgumentException(J.f(new StringBuilder(), this.J0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            }
        }
        if(this.f0 != null && this.E0 != null && this.f0.getBackground() == null && this.J0 != 0) {
            this.f0.setBackground(this.E0);
        }
        this.z();
        if(this.J0 == 1) {
            if(this.getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.K0 = this.getResources().getDimensionPixelSize(0x7F0700F8);  // dimen:material_font_2_0_box_collapsed_padding_top
            }
            else if(F.E(this.getContext())) {
                this.K0 = this.getResources().getDimensionPixelSize(0x7F0700F7);  // dimen:material_font_1_3_box_collapsed_padding_top
            }
        }
        if(this.f0 != null && this.J0 == 1) {
            if(this.getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f0.setPaddingRelative(this.f0.getPaddingStart(), this.getResources().getDimensionPixelSize(0x7F0700F6), this.f0.getPaddingEnd(), this.getResources().getDimensionPixelSize(0x7F0700F5));  // dimen:material_filled_edittext_font_2_0_padding_top
            }
            else if(F.E(this.getContext())) {
                this.f0.setPaddingRelative(this.f0.getPaddingStart(), this.getResources().getDimensionPixelSize(0x7F0700F4), this.f0.getPaddingEnd(), this.getResources().getDimensionPixelSize(0x7F0700F3));  // dimen:material_filled_edittext_font_1_3_padding_top
            }
        }
        if(this.J0 != 0) {
            this.r();
        }
    }

    public final void i() {
        float f1;
        float f;
        if(!this.f()) {
            return;
        }
        RectF rectF0 = this.S0;
        int v = this.f0.getWidth();
        int v1 = this.f0.getGravity();
        B6.b b0 = this.E1;
        CharSequence charSequence0 = b0.w;
        boolean z = (b0.a.getLayoutDirection() == 1 ? e.d : e.c).d(charSequence0.length(), charSequence0);
        b0.y = z;
        Rect rect0 = b0.e;
        if(v1 == 17 || (v1 & 7) == 1) {
            f = ((float)v) / 2.0f - b0.b() / 2.0f;
        }
        else if((v1 & 0x800005) == 0x800005 || (v1 & 5) == 5) {
            f = z ? ((float)rect0.left) : ((float)rect0.right) - b0.b();
        }
        else if(z) {
            f = ((float)rect0.right) - b0.b();
        }
        else {
            f = (float)rect0.left;
        }
        rectF0.left = f;
        rectF0.top = (float)rect0.top;
        if(v1 == 17 || (v1 & 7) == 1) {
            f1 = ((float)v) / 2.0f + b0.b() / 2.0f;
        }
        else if((v1 & 0x800005) == 0x800005 || (v1 & 5) == 5) {
            f1 = b0.y ? b0.b() + f : ((float)rect0.right);
        }
        else if(b0.y) {
            f1 = (float)rect0.right;
        }
        else {
            f1 = b0.b() + f;
        }
        rectF0.right = f1;
        b0.F.setTextSize(b0.j);
        b0.F.setTypeface(b0.s);
        b0.F.setLetterSpacing(b0.M);
        b0.F.ascent();
        rectF0.left -= (float)this.H0;
        rectF0.right += (float)this.H0;
        this.I0 = this.L0;
        rectF0.top = 0.0f;
        rectF0.bottom = (float)this.L0;
        rectF0.offset(((float)(-this.getPaddingLeft())), 0.0f);
        j j0 = (j)this.E0;
        j0.getClass();
        j0.n(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }

    public static void j(ViewGroup viewGroup0, boolean z) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            view0.setEnabled(z);
            if(view0 instanceof ViewGroup) {
                TextInputLayout.j(((ViewGroup)view0), z);
            }
        }
    }

    public final void k(CheckableImageButton checkableImageButton0, ColorStateList colorStateList0) {
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(checkableImageButton0.getDrawable() != null && colorStateList0 != null && colorStateList0.isStateful()) {
            int[] arr_v = this.getDrawableState();
            int[] arr_v1 = checkableImageButton0.getDrawableState();
            int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            int v = colorStateList0.getColorForState(arr_v2, colorStateList0.getDefaultColor());
            Drawable drawable1 = drawable0.mutate();
            drawable1.setTintList(ColorStateList.valueOf(v));
            checkableImageButton0.setImageDrawable(drawable1);
        }
    }

    public static void l(CheckableImageButton checkableImageButton0, View.OnLongClickListener view$OnLongClickListener0) {
        boolean z = checkableImageButton0.hasOnClickListeners();
        boolean z1 = false;
        int v = 1;
        if(z || view$OnLongClickListener0 != null) {
            z1 = true;
        }
        checkableImageButton0.setFocusable(z1);
        checkableImageButton0.setClickable(z);
        checkableImageButton0.setPressable(z);
        checkableImageButton0.setLongClickable(view$OnLongClickListener0 != null);
        if(!z1) {
            v = 2;
        }
        checkableImageButton0.setImportantForAccessibility(v);
    }

    public final void m(N n0, int v) {
        try {
            n0.setTextAppearance(v);
            if(n0.getTextColors().getDefaultColor() == 0xFFFF00FF) {
                goto label_2;
            }
            return;
        }
        catch(Exception unused_ex) {
        }
    label_2:
        n0.setTextAppearance(0x7F130195);  // style:TextAppearance.AppCompat.Caption
        n0.setTextColor(this.getContext().getColor(0x7F0600B9));  // color:design_error
    }

    public final void n(int v) {
        boolean z = this.m0;
        int v1 = this.l0;
        String s = null;
        if(v1 == -1) {
            this.n0.setText(String.valueOf(v));
            this.n0.setContentDescription(null);
            this.m0 = false;
        }
        else {
            this.m0 = v > v1;
            Context context0 = this.getContext();
            this.n0.setContentDescription(context0.getString((this.m0 ? 0x7F1200B0 : 0x7F1200AF), new Object[]{v, ((int)this.l0)}));  // string:character_counter_overflowed_content_description "Character limit exceeded 
                                                                                                                                      // %1$d of %2$d"
            if(z != this.m0) {
                this.o();
            }
            H1.b b0 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? H1.b.e : H1.b.d;
            N n0 = this.n0;
            String s1 = this.getContext().getString(0x7F1200B1, new Object[]{v, ((int)this.l0)});  // string:character_counter_pattern "%1$d/%2$d"
            if(s1 == null) {
                b0.getClass();
            }
            else {
                b0.getClass();
                s = b0.c(s1).toString();
            }
            n0.setText(s);
        }
        if(this.f0 != null && z != this.m0) {
            this.s(false, false);
            this.z();
            this.q();
        }
    }

    public final void o() {
        N n0 = this.n0;
        if(n0 != null) {
            this.m(n0, (this.m0 ? this.o0 : this.p0));
            if(!this.m0) {
                ColorStateList colorStateList0 = this.v0;
                if(colorStateList0 != null) {
                    this.n0.setTextColor(colorStateList0);
                }
            }
            if(this.m0) {
                ColorStateList colorStateList1 = this.w0;
                if(colorStateList1 != null) {
                    this.n0.setTextColor(colorStateList1);
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        EditText editText0 = this.f0;
        if(editText0 != null) {
            int v4 = editText0.getWidth();
            int v5 = editText0.getHeight();
            Rect rect0 = this.Q0;
            boolean z1 = false;
            rect0.set(0, 0, v4, v5);
            ThreadLocal threadLocal0 = B6.c.a;
            Matrix matrix0 = (Matrix)threadLocal0.get();
            if(matrix0 == null) {
                matrix0 = new Matrix();
                threadLocal0.set(matrix0);
            }
            else {
                matrix0.reset();
            }
            B6.c.a(this, editText0, matrix0);
            ThreadLocal threadLocal1 = B6.c.b;
            RectF rectF0 = (RectF)threadLocal1.get();
            if(rectF0 == null) {
                rectF0 = new RectF();
                threadLocal1.set(rectF0);
            }
            rectF0.set(rect0);
            matrix0.mapRect(rectF0);
            rect0.set(((int)(rectF0.left + 0.5f)), ((int)(rectF0.top + 0.5f)), ((int)(rectF0.right + 0.5f)), ((int)(rectF0.bottom + 0.5f)));
            MaterialShapeDrawable materialShapeDrawable0 = this.F0;
            if(materialShapeDrawable0 != null) {
                materialShapeDrawable0.setBounds(rect0.left, rect0.bottom - this.N0, rect0.right, rect0.bottom);
            }
            if(this.B0) {
                float f = this.f0.getTextSize();
                B6.b b0 = this.E1;
                if(b0.i != f) {
                    b0.i = f;
                    b0.g();
                }
                int v6 = this.f0.getGravity();
                int v7 = v6 & 0xFFFFFF8F | 0x30;
                if(b0.h != v7) {
                    b0.h = v7;
                    b0.g();
                }
                if(b0.g != v6) {
                    b0.g = v6;
                    b0.g();
                }
                if(this.f0 == null) {
                    throw new IllegalStateException();
                }
                if(this.getLayoutDirection() == 1) {
                    z1 = true;
                }
                Rect rect1 = this.R0;
                rect1.bottom = rect0.bottom;
                N n0 = this.y0;
                switch(this.J0) {
                    case 1: {
                        int v11 = rect0.left;
                        int v12 = this.f0.getCompoundPaddingLeft() + v11;
                        if(this.x0 != null && !z1) {
                            v12 = v12 - n0.getMeasuredWidth() + n0.getPaddingLeft();
                        }
                        rect1.left = v12;
                        rect1.top = rect0.top + this.K0;
                        int v13 = rect0.right - this.f0.getCompoundPaddingRight();
                        if(this.x0 != null && z1) {
                            v13 += n0.getMeasuredWidth() - n0.getPaddingRight();
                        }
                        rect1.right = v13;
                        break;
                    }
                    case 2: {
                        int v14 = rect0.left;
                        rect1.left = this.f0.getPaddingLeft() + v14;
                        rect1.top = rect0.top - this.e();
                        rect1.right = rect0.right - this.f0.getPaddingRight();
                        break;
                    }
                    default: {
                        int v8 = rect0.left;
                        int v9 = this.f0.getCompoundPaddingLeft() + v8;
                        if(this.x0 != null && !z1) {
                            v9 = v9 - n0.getMeasuredWidth() + n0.getPaddingLeft();
                        }
                        rect1.left = v9;
                        rect1.top = this.getPaddingTop();
                        int v10 = rect0.right - this.f0.getCompoundPaddingRight();
                        if(this.x0 != null && z1) {
                            v10 += n0.getMeasuredWidth() - n0.getPaddingRight();
                        }
                        rect1.right = v10;
                    }
                }
                int v15 = rect1.left;
                int v16 = rect1.top;
                int v17 = rect1.right;
                int v18 = rect1.bottom;
                Rect rect2 = b0.e;
                if(rect2.left != v15 || rect2.top != v16 || rect2.right != v17 || rect2.bottom != v18) {
                    rect2.set(v15, v16, v17, v18);
                    b0.D = true;
                    b0.f();
                }
                if(this.f0 == null) {
                    throw new IllegalStateException();
                }
                b0.F.setTextSize(b0.i);
                b0.F.setTypeface(b0.t);
                b0.F.setLetterSpacing(0.0f);
                float f1 = b0.F.ascent();
                int v19 = rect0.left;
                rect1.left = this.f0.getCompoundPaddingLeft() + v19;
                rect1.top = this.J0 != 1 || this.f0.getMinLines() > 1 ? rect0.top + this.f0.getCompoundPaddingTop() : ((int)(((float)rect0.centerY()) - -f1 / 2.0f));
                rect1.right = rect0.right - this.f0.getCompoundPaddingRight();
                int v20 = this.J0 != 1 || this.f0.getMinLines() > 1 ? rect0.bottom - this.f0.getCompoundPaddingBottom() : ((int)(((float)rect1.top) + -f1));
                rect1.bottom = v20;
                int v21 = rect1.left;
                int v22 = rect1.top;
                int v23 = rect1.right;
                Rect rect3 = b0.d;
                if(rect3.left != v21 || rect3.top != v22 || rect3.right != v23 || rect3.bottom != v20) {
                    rect3.set(v21, v22, v23, v20);
                    b0.D = true;
                    b0.f();
                }
                b0.g();
                if(this.f() && !this.D1) {
                    this.i();
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        boolean z = false;
        if(this.f0 != null) {
            int v2 = Math.max(this.d0.getMeasuredHeight(), this.c0.getMeasuredHeight());
            if(this.f0.getMeasuredHeight() < v2) {
                this.f0.setMinimumHeight(v2);
                z = true;
            }
        }
        if(z || this.p()) {
            this.f0.post(new s(this, 1));
        }
        if(this.s0 != null) {
            EditText editText0 = this.f0;
            if(editText0 != null) {
                int v3 = editText0.getGravity();
                this.s0.setGravity(v3);
                this.s0.setPadding(this.f0.getCompoundPaddingLeft(), this.f0.getCompoundPaddingTop(), this.f0.getCompoundPaddingRight(), this.f0.getCompoundPaddingBottom());
            }
        }
        this.u();
        this.x();
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).X);
        this.setError(((SavedState)parcelable0).Z);
        if(((SavedState)parcelable0).b0) {
            s s0 = new s(this, 0);
            this.f1.post(s0);
        }
        this.setHint(((SavedState)parcelable0).c0);
        this.setHelperText(((SavedState)parcelable0).d0);
        this.setPlaceholderText(((SavedState)parcelable0).e0);
        this.requestLayout();
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // initializer: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        if(this.j0.e()) {
            parcelable0.Z = this.getError();
        }
        parcelable0.b0 = this.d1 != 0 && this.f1.e0;
        parcelable0.c0 = this.getHint();
        parcelable0.d0 = this.getHelperText();
        parcelable0.e0 = this.getPlaceholderText();
        return parcelable0;
    }

    public final boolean p() {
        boolean z1;
        boolean z = true;
        if(this.f0 == null) {
            return false;
        }
        if(this.getStartIconDrawable() == null && this.x0 == null) {
        label_20:
            if(this.Z0 == null) {
                z1 = false;
            }
            else {
                Drawable[] arr_drawable1 = this.f0.getCompoundDrawablesRelative();
                this.f0.setCompoundDrawablesRelative(null, arr_drawable1[1], arr_drawable1[2], arr_drawable1[3]);
                this.Z0 = null;
                z1 = true;
            }
        }
        else {
            LinearLayout linearLayout0 = this.c0;
            if(linearLayout0.getMeasuredWidth() > 0) {
                int v = linearLayout0.getMeasuredWidth() - this.f0.getPaddingLeft();
                if(this.Z0 == null || this.a1 != v) {
                    ColorDrawable colorDrawable0 = new ColorDrawable();
                    this.Z0 = colorDrawable0;
                    this.a1 = v;
                    colorDrawable0.setBounds(0, 0, v, 1);
                }
                Drawable[] arr_drawable = this.f0.getCompoundDrawablesRelative();
                ColorDrawable colorDrawable1 = this.Z0;
                if(arr_drawable[0] == colorDrawable1) {
                    z1 = false;
                }
                else {
                    this.f0.setCompoundDrawablesRelative(colorDrawable1, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
                    z1 = true;
                }
            }
            else {
                goto label_20;
            }
        }
        if((this.q1.getVisibility() != 0 || this.d1 == 0 && this.g() || this.z0 != null) && this.d0.getMeasuredWidth() > 0) {
            int v1 = this.A0.getMeasuredWidth() - this.f0.getPaddingRight();
            CheckableImageButton checkableImageButton0 = this.getEndIconToUpdateDummyDrawable();
            if(checkableImageButton0 != null) {
                int v2 = checkableImageButton0.getMeasuredWidth();
                v1 = ((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()).getMarginStart() + (v2 + v1);
            }
            Drawable[] arr_drawable2 = this.f0.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable2 = this.l1;
            if(colorDrawable2 != null && this.m1 != v1) {
                this.m1 = v1;
                colorDrawable2.setBounds(0, 0, v1, 1);
                this.f0.setCompoundDrawablesRelative(arr_drawable2[0], arr_drawable2[1], this.l1, arr_drawable2[3]);
                return true;
            }
            if(colorDrawable2 == null) {
                ColorDrawable colorDrawable3 = new ColorDrawable();
                this.l1 = colorDrawable3;
                this.m1 = v1;
                colorDrawable3.setBounds(0, 0, v1, 1);
            }
            Drawable drawable0 = arr_drawable2[2];
            ColorDrawable colorDrawable4 = this.l1;
            if(drawable0 != colorDrawable4) {
                this.n1 = drawable0;
                this.f0.setCompoundDrawablesRelative(arr_drawable2[0], arr_drawable2[1], colorDrawable4, arr_drawable2[3]);
                return true;
            }
            return z1;
        }
        if(this.l1 != null) {
            Drawable[] arr_drawable3 = this.f0.getCompoundDrawablesRelative();
            if(arr_drawable3[2] == this.l1) {
                this.f0.setCompoundDrawablesRelative(arr_drawable3[0], arr_drawable3[1], this.n1, arr_drawable3[3]);
            }
            else {
                z = z1;
            }
            this.l1 = null;
            return z;
        }
        return z1;
    }

    public final void q() {
        EditText editText0 = this.f0;
        if(editText0 != null && this.J0 == 0) {
            Drawable drawable0 = editText0.getBackground();
            if(drawable0 == null) {
                return;
            }
            Drawable drawable1 = drawable0.mutate();
            o o0 = this.j0;
            if(o0.e()) {
                drawable1.setColorFilter(p.c((o0.l == null ? -1 : o0.l.getCurrentTextColor()), PorterDuff.Mode.SRC_IN));
                return;
            }
            if(this.m0) {
                N n0 = this.n0;
                if(n0 != null) {
                    drawable1.setColorFilter(p.c(n0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                    return;
                }
            }
            drawable1.clearColorFilter();
            this.f0.refreshDrawableState();
        }
    }

    public final void r() {
        if(this.J0 != 1) {
            FrameLayout frameLayout0 = this.b0;
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)frameLayout0.getLayoutParams();
            int v = this.e();
            if(v != linearLayout$LayoutParams0.topMargin) {
                linearLayout$LayoutParams0.topMargin = v;
                frameLayout0.requestLayout();
            }
        }
    }

    public final void s(boolean z, boolean z1) {
        boolean z2 = this.isEnabled();
        int v = 0;
        boolean z3 = this.f0 != null && !TextUtils.isEmpty(this.f0.getText());
        boolean z4 = this.f0 != null && this.f0.hasFocus();
        o o0 = this.j0;
        boolean z5 = o0.e();
        ColorStateList colorStateList0 = this.s1;
        B6.b b0 = this.E1;
        if(colorStateList0 != null) {
            b0.h(colorStateList0);
            ColorStateList colorStateList1 = this.s1;
            if(b0.k != colorStateList1) {
                b0.k = colorStateList1;
                b0.g();
            }
        }
        if(!z2) {
            int v1 = this.s1 == null ? this.C1 : this.s1.getColorForState(new int[]{0xFEFEFF62}, this.C1);
            b0.h(ColorStateList.valueOf(v1));
            ColorStateList colorStateList2 = ColorStateList.valueOf(v1);
            if(b0.k != colorStateList2) {
                b0.k = colorStateList2;
                b0.g();
            }
        }
        else if(z5) {
            b0.h((o0.l == null ? null : o0.l.getTextColors()));
        }
        else if(this.m0) {
            N n0 = this.n0;
            if(n0 != null) {
                b0.h(n0.getTextColors());
                goto label_34;
            }
            goto label_30;
        }
        else {
        label_30:
            if(z4) {
                ColorStateList colorStateList3 = this.t1;
                if(colorStateList3 != null) {
                    b0.h(colorStateList3);
                }
            }
        }
    label_34:
        if(!z3 && this.F1 && (!this.isEnabled() || !z4)) {
            if(z1 || !this.D1) {
                if(this.H1 != null && this.H1.isRunning()) {
                    this.H1.cancel();
                }
                if(!z || !this.G1) {
                    b0.i(0.0f);
                }
                else {
                    this.a(0.0f);
                }
                if(this.f() && !((j)this.E0).w0.isEmpty() && this.f()) {
                    ((j)this.E0).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.D1 = true;
                N n1 = this.s0;
                if(n1 != null && this.r0) {
                    n1.setText(null);
                    this.s0.setVisibility(4);
                }
                this.v();
                this.y();
            }
        }
        else if(z1 || this.D1) {
            if(this.H1 != null && this.H1.isRunning()) {
                this.H1.cancel();
            }
            if(!z || !this.G1) {
                b0.i(1.0f);
            }
            else {
                this.a(1.0f);
            }
            this.D1 = false;
            if(this.f()) {
                this.i();
            }
            EditText editText0 = this.f0;
            if(editText0 != null) {
                v = editText0.getText().length();
            }
            this.t(v);
            this.v();
            this.y();
        }
    }

    public void setBoxBackgroundColor(int v) {
        if(this.P0 != v) {
            this.P0 = v;
            this.y1 = v;
            this.A1 = v;
            this.B1 = v;
            this.b();
        }
    }

    public void setBoxBackgroundColorResource(int v) {
        this.setBoxBackgroundColor(this.getContext().getColor(v));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList0) {
        int v = colorStateList0.getDefaultColor();
        this.y1 = v;
        this.P0 = v;
        this.z1 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
        this.A1 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        this.B1 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
        this.b();
    }

    public void setBoxBackgroundMode(int v) {
        if(v == this.J0) {
            return;
        }
        this.J0 = v;
        if(this.f0 != null) {
            this.h();
        }
    }

    public void setBoxStrokeColor(int v) {
        if(this.w1 != v) {
            this.w1 = v;
            this.z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList0) {
        if(colorStateList0.isStateful()) {
            this.u1 = colorStateList0.getDefaultColor();
            this.C1 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
            this.v1 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            this.w1 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        }
        else if(this.w1 != colorStateList0.getDefaultColor()) {
            this.w1 = colorStateList0.getDefaultColor();
        }
        this.z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList0) {
        if(this.x1 != colorStateList0) {
            this.x1 = colorStateList0;
            this.z();
        }
    }

    public void setBoxStrokeWidth(int v) {
        this.M0 = v;
        this.z();
    }

    public void setBoxStrokeWidthFocused(int v) {
        this.N0 = v;
        this.z();
    }

    public void setBoxStrokeWidthFocusedResource(int v) {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(v));
    }

    public void setBoxStrokeWidthResource(int v) {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(v));
    }

    public void setCounterEnabled(boolean z) {
        if(this.k0 != z) {
            o o0 = this.j0;
            if(z) {
                N n0 = new N(this.getContext(), null);
                this.n0 = n0;
                n0.setId(0x7F0A02FB);  // id:textinput_counter
                Typeface typeface0 = this.T0;
                if(typeface0 != null) {
                    this.n0.setTypeface(typeface0);
                }
                this.n0.setMaxLines(1);
                o0.a(this.n0, 2);
                ((ViewGroup.MarginLayoutParams)this.n0.getLayoutParams()).setMarginStart(this.getResources().getDimensionPixelOffset(0x7F0701BF));  // dimen:mtrl_textinput_counter_margin_start
                this.o();
                if(this.n0 != null) {
                    this.n((this.f0 == null ? 0 : this.f0.getText().length()));
                }
            }
            else {
                o0.h(this.n0, 2);
                this.n0 = null;
            }
            this.k0 = z;
        }
    }

    public void setCounterMaxLength(int v) {
        if(this.l0 != v) {
            this.l0 = v > 0 ? v : -1;
            if(this.k0 && this.n0 != null) {
                this.n((this.f0 == null ? 0 : this.f0.getText().length()));
            }
        }
    }

    public void setCounterOverflowTextAppearance(int v) {
        if(this.o0 != v) {
            this.o0 = v;
            this.o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList0) {
        if(this.w0 != colorStateList0) {
            this.w0 = colorStateList0;
            this.o();
        }
    }

    public void setCounterTextAppearance(int v) {
        if(this.p0 != v) {
            this.p0 = v;
            this.o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList0) {
        if(this.v0 != colorStateList0) {
            this.v0 = colorStateList0;
            this.o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList0) {
        this.s1 = colorStateList0;
        this.t1 = colorStateList0;
        if(this.f0 != null) {
            this.s(false, false);
        }
    }

    private void setEditText(EditText editText0) {
        boolean z1;
        boolean z;
        if(this.f0 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if(this.d1 != 3 && !(editText0 instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f0 = editText0;
        this.setMinWidth(this.h0);
        this.setMaxWidth(this.i0);
        this.h();
        this.setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface0 = this.f0.getTypeface();
        B6.b b0 = this.E1;
        E6.a a0 = b0.v;
        if(a0 != null) {
            a0.c = true;
        }
        if(b0.s == typeface0) {
            z = false;
        }
        else {
            b0.s = typeface0;
            z = true;
        }
        if(b0.t == typeface0) {
            z1 = false;
        }
        else {
            b0.t = typeface0;
            z1 = true;
        }
        if(z || z1) {
            b0.g();
        }
        float f = this.f0.getTextSize();
        if(b0.i != f) {
            b0.i = f;
            b0.g();
        }
        int v = this.f0.getGravity();
        int v1 = v & 0xFFFFFF8F | 0x30;
        if(b0.h != v1) {
            b0.h = v1;
            b0.g();
        }
        if(b0.g != v) {
            b0.g = v;
            b0.g();
        }
        this.f0.addTextChangedListener(new K6.a(1, this));
        if(this.s1 == null) {
            this.s1 = this.f0.getHintTextColors();
        }
        if(this.B0) {
            if(TextUtils.isEmpty(this.C0)) {
                CharSequence charSequence0 = this.f0.getHint();
                this.g0 = charSequence0;
                this.setHint(charSequence0);
                this.f0.setHint(null);
            }
            this.D0 = true;
        }
        if(this.n0 != null) {
            this.n(this.f0.getText().length());
        }
        this.q();
        this.j0.b();
        this.c0.bringToFront();
        this.d0.bringToFront();
        this.e0.bringToFront();
        this.q1.bringToFront();
        for(Object object0: this.c1) {
            ((t)object0).a(this);
        }
        this.u();
        this.x();
        if(!this.isEnabled()) {
            editText0.setEnabled(false);
        }
        this.s(false, true);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        TextInputLayout.j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f1.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f1.setCheckable(z);
    }

    public void setEndIconContentDescription(int v) {
        this.setEndIconContentDescription((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setEndIconContentDescription(CharSequence charSequence0) {
        if(this.getEndIconContentDescription() != charSequence0) {
            this.f1.setContentDescription(charSequence0);
        }
    }

    public void setEndIconDrawable(int v) {
        this.setEndIconDrawable((v == 0 ? null : q.v(this.getContext(), v)));
    }

    public void setEndIconDrawable(Drawable drawable0) {
        this.f1.setImageDrawable(drawable0);
        this.k(this.f1, this.h1);
    }

    public void setEndIconMode(int v) {
        AutoCompleteTextView autoCompleteTextView0;
        int v1 = this.d1;
        this.d1 = v;
        for(Object object0: this.g1) {
            K6.d d0 = (K6.d)object0;
            switch(d0.a) {
                case 0: {
                    EditText editText1 = this.getEditText();
                    if(editText1 == null || v1 != 2) {
                        continue;
                    }
                    editText1.post(new Y6.b(7, d0, editText1, false));
                    if(editText1.getOnFocusChangeListener() != ((h)d0.b).e) {
                        continue;
                    }
                    editText1.setOnFocusChangeListener(null);
                    continue;
                }
                case 1: {
                    autoCompleteTextView0 = (AutoCompleteTextView)this.getEditText();
                    if(autoCompleteTextView0 == null || v1 != 3) {
                        continue;
                    }
                    autoCompleteTextView0.post(new Y6.b(9, d0, autoCompleteTextView0, false));
                    if(autoCompleteTextView0.getOnFocusChangeListener() == ((c)d0.b).e) {
                        autoCompleteTextView0.setOnFocusChangeListener(null);
                    }
                    break;
                }
                default: {
                    EditText editText0 = this.getEditText();
                    if(editText0 == null || v1 != 1) {
                        continue;
                    }
                    editText0.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    editText0.post(new Y6.b(10, d0, editText0, false));
                    continue;
                }
            }
            autoCompleteTextView0.setOnTouchListener(null);
            autoCompleteTextView0.setOnDismissListener(null);
        }
        this.setEndIconVisible(v != 0);
        if(!this.getEndIconDelegate().b(this.J0)) {
            throw new IllegalStateException("The current box background mode " + this.J0 + " is not supported by the end icon mode " + v);
        }
        this.getEndIconDelegate().a();
        this.c();
    }

    public void setEndIconOnClickListener(View.OnClickListener view$OnClickListener0) {
        View.OnLongClickListener view$OnLongClickListener0 = this.o1;
        this.f1.setOnClickListener(view$OnClickListener0);
        TextInputLayout.l(this.f1, view$OnLongClickListener0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.o1 = view$OnLongClickListener0;
        this.f1.setOnLongClickListener(view$OnLongClickListener0);
        TextInputLayout.l(this.f1, view$OnLongClickListener0);
    }

    public void setEndIconTintList(ColorStateList colorStateList0) {
        if(this.h1 != colorStateList0) {
            this.h1 = colorStateList0;
            this.i1 = true;
            this.c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.j1 != porterDuff$Mode0) {
            this.j1 = porterDuff$Mode0;
            this.k1 = true;
            this.c();
        }
    }

    public void setEndIconVisible(boolean z) {
        if(this.g() != z) {
            this.f1.setVisibility((z ? 0 : 8));
            this.x();
            this.p();
        }
    }

    public void setError(CharSequence charSequence0) {
        o o0 = this.j0;
        if(!o0.k) {
            if(TextUtils.isEmpty(charSequence0)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            o0.c();
            o0.j = charSequence0;
            o0.l.setText(charSequence0);
            int v = o0.h;
            if(v != 1) {
                o0.i = 1;
            }
            o0.j(v, o0.i, o0.i(o0.l, charSequence0));
            return;
        }
        o0.g();
    }

    public void setErrorContentDescription(CharSequence charSequence0) {
        this.j0.m = charSequence0;
        N n0 = this.j0.l;
        if(n0 != null) {
            n0.setContentDescription(charSequence0);
        }
    }

    public void setErrorEnabled(boolean z) {
        o o0 = this.j0;
        if(o0.k != z) {
            o0.c();
            TextInputLayout textInputLayout0 = o0.b;
            if(z) {
                N n0 = new N(o0.a, null);
                o0.l = n0;
                n0.setId(0x7F0A02FC);  // id:textinput_error
                o0.l.setTextAlignment(5);
                Typeface typeface0 = o0.u;
                if(typeface0 != null) {
                    o0.l.setTypeface(typeface0);
                }
                int v = o0.n;
                o0.n = v;
                N n1 = o0.l;
                if(n1 != null) {
                    textInputLayout0.m(n1, v);
                }
                ColorStateList colorStateList0 = o0.o;
                o0.o = colorStateList0;
                N n2 = o0.l;
                if(n2 != null && colorStateList0 != null) {
                    n2.setTextColor(colorStateList0);
                }
                CharSequence charSequence0 = o0.m;
                o0.m = charSequence0;
                N n3 = o0.l;
                if(n3 != null) {
                    n3.setContentDescription(charSequence0);
                }
                o0.l.setVisibility(4);
                o0.l.setAccessibilityLiveRegion(1);
                o0.a(o0.l, 0);
            }
            else {
                o0.g();
                o0.h(o0.l, 0);
                o0.l = null;
                textInputLayout0.q();
                textInputLayout0.z();
            }
            o0.k = z;
        }
    }

    public void setErrorIconDrawable(int v) {
        this.setErrorIconDrawable((v == 0 ? null : q.v(this.getContext(), v)));
        this.k(this.q1, this.r1);
    }

    public void setErrorIconDrawable(Drawable drawable0) {
        this.q1.setImageDrawable(drawable0);
        this.setErrorIconVisible(drawable0 != null && this.j0.k);
    }

    public void setErrorIconOnClickListener(View.OnClickListener view$OnClickListener0) {
        View.OnLongClickListener view$OnLongClickListener0 = this.p1;
        this.q1.setOnClickListener(view$OnClickListener0);
        TextInputLayout.l(this.q1, view$OnLongClickListener0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.p1 = view$OnLongClickListener0;
        this.q1.setOnLongClickListener(view$OnLongClickListener0);
        TextInputLayout.l(this.q1, view$OnLongClickListener0);
    }

    public void setErrorIconTintList(ColorStateList colorStateList0) {
        this.r1 = colorStateList0;
        CheckableImageButton checkableImageButton0 = this.q1;
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(drawable0 != null) {
            drawable0 = drawable0.mutate();
            drawable0.setTintList(colorStateList0);
        }
        if(checkableImageButton0.getDrawable() != drawable0) {
            checkableImageButton0.setImageDrawable(drawable0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        CheckableImageButton checkableImageButton0 = this.q1;
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(drawable0 != null) {
            drawable0 = drawable0.mutate();
            drawable0.setTintMode(porterDuff$Mode0);
        }
        if(checkableImageButton0.getDrawable() != drawable0) {
            checkableImageButton0.setImageDrawable(drawable0);
        }
    }

    private void setErrorIconVisible(boolean z) {
        int v = 8;
        this.q1.setVisibility((z ? 0 : 8));
        FrameLayout frameLayout0 = this.e0;
        if(!z) {
            v = 0;
        }
        frameLayout0.setVisibility(v);
        this.x();
        if(this.d1 == 0) {
            this.p();
        }
    }

    public void setErrorTextAppearance(int v) {
        o o0 = this.j0;
        o0.n = v;
        N n0 = o0.l;
        if(n0 != null) {
            o0.b.m(n0, v);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList0) {
        this.j0.o = colorStateList0;
        N n0 = this.j0.l;
        if(n0 != null && colorStateList0 != null) {
            n0.setTextColor(colorStateList0);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if(this.F1 != z) {
            this.F1 = z;
            this.s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence0) {
        boolean z = TextUtils.isEmpty(charSequence0);
        o o0 = this.j0;
        if(!z) {
            if(!o0.q) {
                this.setHelperTextEnabled(true);
            }
            o0.c();
            o0.p = charSequence0;
            o0.r.setText(charSequence0);
            int v = o0.h;
            if(v != 2) {
                o0.i = 2;
            }
            o0.j(v, o0.i, o0.i(o0.r, charSequence0));
        }
        else if(o0.q) {
            this.setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList0) {
        this.j0.t = colorStateList0;
        N n0 = this.j0.r;
        if(n0 != null && colorStateList0 != null) {
            n0.setTextColor(colorStateList0);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        o o0 = this.j0;
        if(o0.q != z) {
            o0.c();
            if(z) {
                N n0 = new N(o0.a, null);
                o0.r = n0;
                n0.setId(0x7F0A02FD);  // id:textinput_helper_text
                o0.r.setTextAlignment(5);
                Typeface typeface0 = o0.u;
                if(typeface0 != null) {
                    o0.r.setTypeface(typeface0);
                }
                o0.r.setVisibility(4);
                o0.r.setAccessibilityLiveRegion(1);
                int v = o0.s;
                o0.s = v;
                N n1 = o0.r;
                if(n1 != null) {
                    n1.setTextAppearance(v);
                }
                ColorStateList colorStateList0 = o0.t;
                o0.t = colorStateList0;
                N n2 = o0.r;
                if(n2 != null && colorStateList0 != null) {
                    n2.setTextColor(colorStateList0);
                }
                o0.a(o0.r, 1);
            }
            else {
                o0.c();
                int v1 = o0.h;
                if(v1 == 2) {
                    o0.i = 0;
                }
                o0.j(v1, o0.i, o0.i(o0.r, null));
                o0.h(o0.r, 1);
                o0.r = null;
                o0.b.q();
                o0.b.z();
            }
            o0.q = z;
        }
    }

    public void setHelperTextTextAppearance(int v) {
        this.j0.s = v;
        N n0 = this.j0.r;
        if(n0 != null) {
            n0.setTextAppearance(v);
        }
    }

    public void setHint(int v) {
        this.setHint((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setHint(CharSequence charSequence0) {
        if(this.B0) {
            this.setHintInternal(charSequence0);
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.G1 = z;
    }

    public void setHintEnabled(boolean z) {
        if(z != this.B0) {
            this.B0 = z;
            if(z) {
                CharSequence charSequence0 = this.f0.getHint();
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(TextUtils.isEmpty(this.C0)) {
                        this.setHint(charSequence0);
                    }
                    this.f0.setHint(null);
                }
                this.D0 = true;
            }
            else {
                this.D0 = false;
                if(!TextUtils.isEmpty(this.C0) && TextUtils.isEmpty(this.f0.getHint())) {
                    this.f0.setHint(this.C0);
                }
                this.setHintInternal(null);
            }
            if(this.f0 != null) {
                this.r();
            }
        }
    }

    private void setHintInternal(CharSequence charSequence0) {
        if(!TextUtils.equals(charSequence0, this.C0)) {
            this.C0 = charSequence0;
            B6.b b0 = this.E1;
            if(charSequence0 == null || !TextUtils.equals(b0.w, charSequence0)) {
                b0.w = charSequence0;
                b0.x = null;
                Bitmap bitmap0 = b0.z;
                if(bitmap0 != null) {
                    bitmap0.recycle();
                    b0.z = null;
                }
                b0.g();
            }
            if(!this.D1) {
                this.i();
            }
        }
    }

    public void setHintTextAppearance(int v) {
        B6.b b0 = this.E1;
        TextInputLayout textInputLayout0 = b0.a;
        TextAppearance textAppearance0 = new TextAppearance(textInputLayout0.getContext(), v);
        ColorStateList colorStateList0 = textAppearance0.a;
        if(colorStateList0 != null) {
            b0.l = colorStateList0;
        }
        float f = textAppearance0.k;
        if(f != 0.0f) {
            b0.j = f;
        }
        ColorStateList colorStateList1 = textAppearance0.b;
        if(colorStateList1 != null) {
            b0.L = colorStateList1;
        }
        b0.J = textAppearance0.f;
        b0.K = textAppearance0.g;
        b0.I = textAppearance0.h;
        b0.M = textAppearance0.j;
        E6.a a0 = b0.v;
        if(a0 != null) {
            a0.c = true;
        }
        I5.h h0 = new I5.h(1, b0);
        textAppearance0.a();
        b0.v = new E6.a(h0, textAppearance0.n);
        textAppearance0.c(textInputLayout0.getContext(), b0.v);
        b0.g();
        this.t1 = b0.l;
        if(this.f0 != null) {
            this.s(false, false);
            this.r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList0) {
        if(this.t1 != colorStateList0) {
            if(this.s1 == null) {
                this.E1.h(colorStateList0);
            }
            this.t1 = colorStateList0;
            if(this.f0 != null) {
                this.s(false, false);
            }
        }
    }

    public void setMaxWidth(int v) {
        this.i0 = v;
        EditText editText0 = this.f0;
        if(editText0 != null && v != -1) {
            editText0.setMaxWidth(v);
        }
    }

    public void setMaxWidthResource(int v) {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    public void setMinWidth(int v) {
        this.h0 = v;
        EditText editText0 = this.f0;
        if(editText0 != null && v != -1) {
            editText0.setMinWidth(v);
        }
    }

    public void setMinWidthResource(int v) {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int v) {
        this.setPasswordVisibilityToggleContentDescription((v == 0 ? null : this.getResources().getText(v)));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence0) {
        this.f1.setContentDescription(charSequence0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int v) {
        this.setPasswordVisibilityToggleDrawable((v == 0 ? null : q.v(this.getContext(), v)));
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable0) {
        this.f1.setImageDrawable(drawable0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if(z && this.d1 != 1) {
            this.setEndIconMode(1);
            return;
        }
        if(!z) {
            this.setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList0) {
        this.h1 = colorStateList0;
        this.i1 = true;
        this.c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.j1 = porterDuff$Mode0;
        this.k1 = true;
        this.c();
    }

    public void setPlaceholderText(CharSequence charSequence0) {
        int v = 0;
        if(!this.r0 || !TextUtils.isEmpty(charSequence0)) {
            if(!this.r0) {
                this.setPlaceholderTextEnabled(true);
            }
            this.q0 = charSequence0;
        }
        else {
            this.setPlaceholderTextEnabled(false);
        }
        EditText editText0 = this.f0;
        if(editText0 != null) {
            v = editText0.getText().length();
        }
        this.t(v);
    }

    public void setPlaceholderTextAppearance(int v) {
        this.u0 = v;
        N n0 = this.s0;
        if(n0 != null) {
            n0.setTextAppearance(v);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList0) {
        if(this.t0 != colorStateList0) {
            this.t0 = colorStateList0;
            N n0 = this.s0;
            if(n0 != null && colorStateList0 != null) {
                n0.setTextColor(colorStateList0);
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if(this.r0 == z) {
            return;
        }
        if(z) {
            N n0 = new N(this.getContext(), null);
            this.s0 = n0;
            n0.setId(0x7F0A02FE);  // id:textinput_placeholder
            this.s0.setAccessibilityLiveRegion(1);
            this.setPlaceholderTextAppearance(this.u0);
            this.setPlaceholderTextColor(this.t0);
            N n1 = this.s0;
            if(n1 != null) {
                this.b0.addView(n1);
                this.s0.setVisibility(0);
            }
        }
        else {
            N n2 = this.s0;
            if(n2 != null) {
                n2.setVisibility(8);
            }
            this.s0 = null;
        }
        this.r0 = z;
    }

    public void setPrefixText(CharSequence charSequence0) {
        this.x0 = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.y0.setText(charSequence0);
        this.v();
    }

    public void setPrefixTextAppearance(int v) {
        this.y0.setTextAppearance(v);
    }

    public void setPrefixTextColor(ColorStateList colorStateList0) {
        this.y0.setTextColor(colorStateList0);
    }

    public void setStartIconCheckable(boolean z) {
        this.U0.setCheckable(z);
    }

    public void setStartIconContentDescription(int v) {
        this.setStartIconContentDescription((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setStartIconContentDescription(CharSequence charSequence0) {
        if(this.getStartIconContentDescription() != charSequence0) {
            this.U0.setContentDescription(charSequence0);
        }
    }

    public void setStartIconDrawable(int v) {
        this.setStartIconDrawable((v == 0 ? null : q.v(this.getContext(), v)));
    }

    public void setStartIconDrawable(Drawable drawable0) {
        CheckableImageButton checkableImageButton0 = this.U0;
        checkableImageButton0.setImageDrawable(drawable0);
        if(drawable0 != null) {
            this.setStartIconVisible(true);
            this.k(checkableImageButton0, this.V0);
            return;
        }
        this.setStartIconVisible(false);
        this.setStartIconOnClickListener(null);
        this.setStartIconOnLongClickListener(null);
        this.setStartIconContentDescription(null);
    }

    public void setStartIconOnClickListener(View.OnClickListener view$OnClickListener0) {
        View.OnLongClickListener view$OnLongClickListener0 = this.b1;
        this.U0.setOnClickListener(view$OnClickListener0);
        TextInputLayout.l(this.U0, view$OnLongClickListener0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.b1 = view$OnLongClickListener0;
        this.U0.setOnLongClickListener(view$OnLongClickListener0);
        TextInputLayout.l(this.U0, view$OnLongClickListener0);
    }

    public void setStartIconTintList(ColorStateList colorStateList0) {
        if(this.V0 != colorStateList0) {
            this.V0 = colorStateList0;
            this.W0 = true;
            TextInputLayout.d(this.U0, true, colorStateList0, this.Y0, this.X0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.X0 != porterDuff$Mode0) {
            this.X0 = porterDuff$Mode0;
            this.Y0 = true;
            TextInputLayout.d(this.U0, this.W0, this.V0, true, porterDuff$Mode0);
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton0 = this.U0;
        int v = 0;
        if(checkableImageButton0.getVisibility() == 0 != z) {
            if(!z) {
                v = 8;
            }
            checkableImageButton0.setVisibility(v);
            this.u();
            this.p();
        }
    }

    public void setSuffixText(CharSequence charSequence0) {
        this.z0 = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.A0.setText(charSequence0);
        this.y();
    }

    public void setSuffixTextAppearance(int v) {
        this.A0.setTextAppearance(v);
    }

    public void setSuffixTextColor(ColorStateList colorStateList0) {
        this.A0.setTextColor(colorStateList0);
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate textInputLayout$AccessibilityDelegate0) {
        EditText editText0 = this.f0;
        if(editText0 != null) {
            J1.N.k(editText0, textInputLayout$AccessibilityDelegate0);
        }
    }

    public void setTypeface(Typeface typeface0) {
        boolean z1;
        if(typeface0 != this.T0) {
            this.T0 = typeface0;
            B6.b b0 = this.E1;
            E6.a a0 = b0.v;
            boolean z = true;
            if(a0 != null) {
                a0.c = true;
            }
            if(b0.s == typeface0) {
                z1 = false;
            }
            else {
                b0.s = typeface0;
                z1 = true;
            }
            if(b0.t == typeface0) {
                z = false;
            }
            else {
                b0.t = typeface0;
            }
            if(z1 || z) {
                b0.g();
            }
            o o0 = this.j0;
            if(typeface0 != o0.u) {
                o0.u = typeface0;
                N n0 = o0.l;
                if(n0 != null) {
                    n0.setTypeface(typeface0);
                }
                N n1 = o0.r;
                if(n1 != null) {
                    n1.setTypeface(typeface0);
                }
            }
            N n2 = this.n0;
            if(n2 != null) {
                n2.setTypeface(typeface0);
            }
        }
    }

    public final void t(int v) {
        if(v != 0 || this.D1) {
            N n1 = this.s0;
            if(n1 != null && this.r0) {
                n1.setText(null);
                this.s0.setVisibility(4);
            }
        }
        else {
            N n0 = this.s0;
            if(n0 != null && this.r0) {
                n0.setText(this.q0);
                this.s0.setVisibility(0);
                this.s0.bringToFront();
            }
        }
    }

    public final void u() {
        if(this.f0 == null) {
            return;
        }
        int v = this.U0.getVisibility() == 0 ? 0 : this.f0.getPaddingStart();
        int v1 = this.f0.getCompoundPaddingTop();
        int v2 = this.getContext().getResources().getDimensionPixelSize(0x7F0700FC);  // dimen:material_input_text_to_prefix_suffix_padding
        int v3 = this.f0.getCompoundPaddingBottom();
        this.y0.setPaddingRelative(v, v1, v2, v3);
    }

    public final void v() {
        this.y0.setVisibility((this.x0 == null || this.D1 ? 8 : 0));
        this.p();
    }

    public final void w(boolean z, boolean z1) {
        int v = this.x1.getDefaultColor();
        int v1 = this.x1.getColorForState(new int[]{0x1010367, 0x101009E}, v);
        int v2 = this.x1.getColorForState(new int[]{0x10102FE, 0x101009E}, v);
        if(z) {
            this.O0 = v2;
            return;
        }
        if(z1) {
            this.O0 = v1;
            return;
        }
        this.O0 = v;
    }

    public final void x() {
        if(this.f0 == null) {
            return;
        }
        int v = this.g() || this.q1.getVisibility() == 0 ? 0 : this.f0.getPaddingEnd();
        int v1 = this.getContext().getResources().getDimensionPixelSize(0x7F0700FC);  // dimen:material_input_text_to_prefix_suffix_padding
        int v2 = this.f0.getPaddingTop();
        int v3 = this.f0.getPaddingBottom();
        this.A0.setPaddingRelative(v1, v2, v, v3);
    }

    public final void y() {
        N n0 = this.A0;
        int v = n0.getVisibility();
        int v1 = 0;
        boolean z = this.z0 != null && !this.D1;
        if(!z) {
            v1 = 8;
        }
        n0.setVisibility(v1);
        if(v != n0.getVisibility()) {
            this.getEndIconDelegate().c(z);
        }
        this.p();
    }

    public final void z() {
        boolean z = false;
        if(this.E0 != null && this.J0 != 0) {
            boolean z1 = this.isFocused() || this.f0 != null && this.f0.hasFocus();
            boolean z2 = this.isHovered() || this.f0 != null && this.f0.isHovered();
            boolean z3 = this.isEnabled();
            int v = -1;
            o o0 = this.j0;
            if(!z3) {
                this.O0 = this.C1;
            }
            else if(!o0.e()) {
                if(this.m0) {
                    N n0 = this.n0;
                    if(n0 == null) {
                        goto label_24;
                    }
                    else if(this.x1 != null) {
                        this.w(z1, z2);
                    }
                    else {
                        this.O0 = n0.getCurrentTextColor();
                    }
                }
                else {
                label_24:
                    if(z1) {
                        this.O0 = this.w1;
                    }
                    else if(z2) {
                        this.O0 = this.v1;
                    }
                    else {
                        this.O0 = this.u1;
                    }
                }
            }
            else if(this.x1 != null) {
                this.w(z1, z2);
            }
            else {
                this.O0 = o0.l == null ? -1 : o0.l.getCurrentTextColor();
            }
            if(this.getErrorIconDrawable() != null && o0.k && o0.e()) {
                z = true;
            }
            this.setErrorIconVisible(z);
            this.k(this.q1, this.r1);
            this.k(this.U0, this.V0);
            CheckableImageButton checkableImageButton0 = this.f1;
            this.k(checkableImageButton0, this.h1);
            EndIconDelegate endIconDelegate0 = this.getEndIconDelegate();
            endIconDelegate0.getClass();
            if(endIconDelegate0 instanceof c) {
                if(!o0.e() || this.getEndIconDrawable() == null) {
                    this.c();
                }
                else {
                    Drawable drawable0 = this.getEndIconDrawable().mutate();
                    N n1 = o0.l;
                    if(n1 != null) {
                        v = n1.getCurrentTextColor();
                    }
                    drawable0.setTint(v);
                    checkableImageButton0.setImageDrawable(drawable0);
                }
            }
            this.L0 = !z1 || !this.isEnabled() ? this.M0 : this.N0;
            if(this.J0 == 2 && this.f() && !this.D1 && this.I0 != this.L0) {
                if(this.f()) {
                    ((j)this.E0).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.i();
            }
            if(this.J0 == 1) {
                if(!this.isEnabled()) {
                    this.P0 = this.z1;
                }
                else if(z2 && !z1) {
                    this.P0 = this.B1;
                }
                else if(z1) {
                    this.P0 = this.A1;
                }
                else {
                    this.P0 = this.y1;
                }
            }
            this.b();
        }
    }
}

