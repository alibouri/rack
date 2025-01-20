package K6;

import Bb.F;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import o.N;
import q6.a;

public final class o {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public AnimatorSet f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public N l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public N r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public o(TextInputLayout textInputLayout0) {
        Context context0 = textInputLayout0.getContext();
        this.a = context0;
        this.b = textInputLayout0;
        this.g = (float)context0.getResources().getDimensionPixelSize(0x7F0700A5);  // dimen:design_textinput_caption_translate_y
    }

    public final void a(N n0, int v) {
        if(this.c == null && this.e == null) {
            LinearLayout linearLayout0 = new LinearLayout(this.a);
            this.c = linearLayout0;
            linearLayout0.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.c.addView(this.e, linearLayout$LayoutParams0);
            if(this.b.getEditText() != null) {
                this.b();
            }
        }
        if(v == 0 || v == 1) {
            this.e.setVisibility(0);
            this.e.addView(n0);
        }
        else {
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
            this.c.addView(n0, linearLayout$LayoutParams1);
        }
        this.c.setVisibility(0);
        ++this.d;
    }

    public final void b() {
        if(this.c != null) {
            TextInputLayout textInputLayout0 = this.b;
            if(textInputLayout0.getEditText() != null) {
                EditText editText0 = textInputLayout0.getEditText();
                Context context0 = this.a;
                boolean z = F.E(context0);
                LinearLayout linearLayout0 = this.c;
                int v = editText0.getPaddingStart();
                if(z) {
                    v = context0.getResources().getDimensionPixelSize(0x7F0700FA);  // dimen:material_helper_text_font_1_3_padding_horizontal
                }
                int v1 = context0.getResources().getDimensionPixelSize(0x7F0700F9);  // dimen:material_helper_text_default_padding_top
                if(z) {
                    v1 = context0.getResources().getDimensionPixelSize(0x7F0700FB);  // dimen:material_helper_text_font_1_3_padding_top
                }
                int v2 = editText0.getPaddingEnd();
                if(z) {
                    v2 = context0.getResources().getDimensionPixelSize(0x7F0700FA);  // dimen:material_helper_text_font_1_3_padding_horizontal
                }
                linearLayout0.setPaddingRelative(v, v1, v2, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet0 = this.f;
        if(animatorSet0 != null) {
            animatorSet0.cancel();
        }
    }

    public final void d(ArrayList arrayList0, boolean z, N n0, int v, int v1, int v2) {
        if(n0 != null && z && (v == v2 || v == v1)) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(n0, View.ALPHA, new float[]{(v2 == v ? 1.0f : 0.0f)});
            objectAnimator0.setDuration(0xA7L);
            objectAnimator0.setInterpolator(a.a);
            arrayList0.add(objectAnimator0);
            if(v2 == v) {
                ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(n0, View.TRANSLATION_Y, new float[]{-this.g, 0.0f});
                objectAnimator1.setDuration(0xD9L);
                objectAnimator1.setInterpolator(a.d);
                arrayList0.add(objectAnimator1);
            }
        }
    }

    // Deobfuscation rating: LOW(20)
    public final boolean e() {
        return this.i == 1 && this.l != null && !TextUtils.isEmpty(this.j);
    }

    public final TextView f(int v) {
        switch(v) {
            case 1: {
                return this.l;
            }
            case 2: {
                return this.r;
            }
            default: {
                return null;
            }
        }
    }

    public final void g() {
        this.j = null;
        this.c();
        if(this.h == 1) {
            this.i = !this.q || TextUtils.isEmpty(this.p) ? 0 : 2;
        }
        this.j(this.h, this.i, this.i(this.l, null));
    }

    public final void h(N n0, int v) {
        LinearLayout linearLayout0 = this.c;
        if(linearLayout0 == null) {
            return;
        }
        if(v != 0 && v != 1) {
            linearLayout0.removeView(n0);
        }
        else {
            FrameLayout frameLayout0 = this.e;
            if(frameLayout0 == null) {
                linearLayout0.removeView(n0);
            }
            else {
                frameLayout0.removeView(n0);
            }
        }
        int v1 = this.d - 1;
        this.d = v1;
        LinearLayout linearLayout1 = this.c;
        if(v1 == 0) {
            linearLayout1.setVisibility(8);
        }
    }

    // Deobfuscation rating: LOW(40)
    public final boolean i(N n0, CharSequence charSequence0) {
        return this.b.isLaidOut() && this.b.isEnabled() && (this.i != this.h || n0 == null || !TextUtils.equals(n0.getText(), charSequence0));
    }

    public final void j(int v, int v1, boolean z) {
        if(v == v1) {
            return;
        }
        if(z) {
            AnimatorSet animatorSet0 = new AnimatorSet();
            this.f = animatorSet0;
            ArrayList arrayList0 = new ArrayList();
            this.d(arrayList0, this.q, this.r, 2, v, v1);
            this.d(arrayList0, this.k, this.l, 1, v, v1);
            int v2 = arrayList0.size();
            long v3 = 0L;
            for(int v4 = 0; v4 < v2; ++v4) {
                Animator animator0 = (Animator)arrayList0.get(v4);
                long v5 = animator0.getStartDelay();
                v3 = Math.max(v3, animator0.getDuration() + v5);
            }
            ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, 0});
            valueAnimator0.setDuration(v3);
            arrayList0.add(0, valueAnimator0);
            animatorSet0.playTogether(arrayList0);
            animatorSet0.addListener(new n(this, v1, this.f(v), v, this.f(v1)));
            animatorSet0.start();
        }
        else if(v != v1) {
            if(v1 != 0) {
                TextView textView0 = this.f(v1);
                if(textView0 != null) {
                    textView0.setVisibility(0);
                    textView0.setAlpha(1.0f);
                }
            }
            if(v != 0) {
                TextView textView1 = this.f(v);
                if(textView1 != null) {
                    textView1.setVisibility(4);
                    if(v == 1) {
                        textView1.setText(null);
                    }
                }
            }
            this.h = v1;
        }
        this.b.q();
        this.b.s(z, false);
        this.b.z();
    }
}

