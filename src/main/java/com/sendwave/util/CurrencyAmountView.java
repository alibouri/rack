package com.sendwave.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import com.sendwave.models.CurrencyAmount;
import h9.b;
import java.text.DecimalFormat;
import o.N;
import q9.M0;

public class CurrencyAmountView extends N {
    public CurrencyAmount i0;
    public final float j0;
    public Boolean k0;
    public final Boolean l0;

    public CurrencyAmountView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i0 = null;
        this.j0 = 0.5f;
        this.k0 = Boolean.FALSE;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, b.c, 0, 0);
        try {
            this.j0 = typedArray0.getFloat(0, 0.5f);
            this.l0 = Boolean.valueOf(typedArray0.getBoolean(1, false));
        }
        finally {
            typedArray0.recycle();
        }
    }

    public CurrencyAmount getCurrencyAmount() {
        return this.i0;
    }

    public Boolean getIsObfuscated() {
        return this.k0;
    }

    @Override  // android.widget.TextView
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            this.i0 = (CurrencyAmount)((Bundle)parcelable0).getParcelable("currencyAmount");
            this.k0 = Boolean.valueOf(((Bundle)parcelable0).getBoolean("isObfuscated"));
            parcelable0 = ((Bundle)parcelable0).getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.widget.TextView
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("superState", super.onSaveInstanceState());
        ((Bundle)parcelable0).putParcelable("currencyAmount", this.i0);
        ((BaseBundle)parcelable0).putBoolean("isObfuscated", this.k0.booleanValue());
        return parcelable0;
    }

    public void setCurrencyAmount(CurrencyAmount currencyAmount0) {
        this.i0 = currencyAmount0;
        if(!this.isInEditMode()) {
            if(currencyAmount0 == null) {
                this.setText("");
            }
            else {
                Boolean boolean0 = this.k0;
                DecimalFormat decimalFormat0 = M0.d(currencyAmount0.X);
                DecimalFormat decimalFormat1 = M0.g(currencyAmount0.X);
                String s = decimalFormat0.getPositivePrefix();
                String s1 = decimalFormat0.getPositiveSuffix();
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
                RelativeSizeSpan relativeSizeSpan0 = new RelativeSizeSpan(this.j0);
                int v = spannableStringBuilder0.length();
                spannableStringBuilder0.append(s);
                spannableStringBuilder0.setSpan(relativeSizeSpan0, v, spannableStringBuilder0.length(), 33);
                spannableStringBuilder0.append((boolean0.booleanValue() ? "******" : decimalFormat1.format(currencyAmount0.Y)));
                RelativeSizeSpan relativeSizeSpan1 = new RelativeSizeSpan(this.j0);
                int v1 = spannableStringBuilder0.length();
                spannableStringBuilder0.append(s1);
                spannableStringBuilder0.setSpan(relativeSizeSpan1, v1, spannableStringBuilder0.length(), 33);
                this.setText(spannableStringBuilder0);
                if(this.l0.booleanValue() && currencyAmount0.f()) {
                    this.setText(TextUtils.concat(new CharSequence[]{"+", spannableStringBuilder0}));
                }
            }
        }
    }

    public void setIsObfuscated(Boolean boolean0) {
        this.k0 = boolean0;
    }
}

