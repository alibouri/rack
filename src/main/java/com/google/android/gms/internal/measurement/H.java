package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public final class h implements o {
    public final Double X;

    public h(Double double0) {
        if(double0 == null) {
            this.X = NaN;
            return;
        }
        this.X = double0;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        return Double.isNaN(((double)this.X)) || ((double)this.X) == 0.0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof h ? this.X.equals(((h)object0).X) : false;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        return this.X;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        BigDecimal bigDecimal1;
        Double double0 = this.X;
        if(Double.isNaN(((double)double0))) {
            return "NaN";
        }
        if(Double.isInfinite(((double)double0))) {
            return ((double)double0) > 0.0 ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimal0 = BigDecimal.valueOf(((double)double0));
        if(bigDecimal0.signum() == 0) {
            bigDecimal1 = new BigDecimal(BigInteger.ZERO, 0);
        }
        else {
            bigDecimal1 = bigDecimal0.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal0.stripTrailingZeros();
        }
        DecimalFormat decimalFormat0 = new DecimalFormat("0E0");
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat0.setMinimumFractionDigits((bigDecimal1.scale() <= 0 ? bigDecimal1.scale() : bigDecimal1.precision()) - 1);
        String s = decimalFormat0.format(bigDecimal1);
        int v = s.indexOf("E");
        if(v > 0) {
            int v1 = Integer.parseInt(s.substring(v + 1));
            return (v1 >= 0 || v1 <= -7) && (v1 < 0 || v1 >= 21) ? s.replace("E-", "e-").replace("E", "e+") : bigDecimal1.toPlainString();
        }
        return s;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        return new h(this.X);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, R2.h h0, ArrayList arrayList0) {
        if(!"toString".equals(s)) {
            throw new IllegalArgumentException(this.i() + "." + s + " is not a function.");
        }
        return new q(this.i());
    }

    @Override
    public final String toString() {
        return this.i();
    }
}

