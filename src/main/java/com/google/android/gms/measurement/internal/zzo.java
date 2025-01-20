package com.google.android.gms.measurement.internal;

import N5.r;
import R2.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j6.c;
import java.util.ArrayList;
import java.util.List;

public final class zzo extends AbstractSafeParcelable {
    public final int A0;
    public final long B0;
    public final String C0;
    public static final Parcelable.Creator CREATOR;
    public final String D0;
    public final String X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final long c0;
    public final long d0;
    public final String e0;
    public final boolean f0;
    public final boolean g0;
    public final long h0;
    public final String i0;
    public final long j0;
    public final long k0;
    public final int l0;
    public final boolean m0;
    public final boolean n0;
    public final String o0;
    public final Boolean p0;
    public final long q0;
    public final List r0;
    public final String s0;
    public final String t0;
    public final String u0;
    public final String v0;
    public final boolean w0;
    public final long x0;
    public final int y0;
    public final String z0;

    static {
        zzo.CREATOR = new c(6);
    }

    public zzo(String s, String s1, String s2, long v, String s3, long v1, long v2, String s4, boolean z, boolean z1, String s5, long v3, int v4, boolean z2, boolean z3, String s6, Boolean boolean0, long v5, List list0, String s7, String s8, String s9, boolean z4, long v6, int v7, String s10, int v8, long v9, String s11, String s12) {
        r.f(s);
        this.X = s;
        this.Y = TextUtils.isEmpty(s1) ? null : s1;
        this.Z = s2;
        this.h0 = v;
        this.b0 = s3;
        this.c0 = v1;
        this.d0 = v2;
        this.e0 = s4;
        this.f0 = z;
        this.g0 = z1;
        this.i0 = s5;
        this.j0 = 0L;
        this.k0 = v3;
        this.l0 = v4;
        this.m0 = z2;
        this.n0 = z3;
        this.o0 = s6;
        this.p0 = boolean0;
        this.q0 = v5;
        this.r0 = list0;
        this.s0 = null;
        this.t0 = s7;
        this.u0 = s8;
        this.v0 = s9;
        this.w0 = z4;
        this.x0 = v6;
        this.y0 = v7;
        this.z0 = s10;
        this.A0 = v8;
        this.B0 = v9;
        this.C0 = s11;
        this.D0 = s12;
    }

    public zzo(String s, String s1, String s2, String s3, long v, long v1, String s4, boolean z, boolean z1, long v2, String s5, long v3, long v4, int v5, boolean z2, boolean z3, String s6, Boolean boolean0, long v6, ArrayList arrayList0, String s7, String s8, String s9, String s10, boolean z4, long v7, int v8, String s11, int v9, long v10, String s12, String s13) {
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.h0 = v2;
        this.b0 = s3;
        this.c0 = v;
        this.d0 = v1;
        this.e0 = s4;
        this.f0 = z;
        this.g0 = z1;
        this.i0 = s5;
        this.j0 = v3;
        this.k0 = v4;
        this.l0 = v5;
        this.m0 = z2;
        this.n0 = z3;
        this.o0 = s6;
        this.p0 = boolean0;
        this.q0 = v6;
        this.r0 = arrayList0;
        this.s0 = s7;
        this.t0 = s8;
        this.u0 = s9;
        this.v0 = s10;
        this.w0 = z4;
        this.x0 = v7;
        this.y0 = v8;
        this.z0 = s11;
        this.A0 = v9;
        this.B0 = v10;
        this.C0 = s12;
        this.D0 = s13;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = f.I(0x4F45, parcel0);
        f.F(parcel0, 2, this.X);
        f.F(parcel0, 3, this.Y);
        f.F(parcel0, 4, this.Z);
        f.F(parcel0, 5, this.b0);
        f.K(parcel0, 6, 8);
        parcel0.writeLong(this.c0);
        f.K(parcel0, 7, 8);
        parcel0.writeLong(this.d0);
        f.F(parcel0, 8, this.e0);
        f.K(parcel0, 9, 4);
        parcel0.writeInt(((int)this.f0));
        f.K(parcel0, 10, 4);
        parcel0.writeInt(((int)this.g0));
        f.K(parcel0, 11, 8);
        parcel0.writeLong(this.h0);
        f.F(parcel0, 12, this.i0);
        f.K(parcel0, 13, 8);
        parcel0.writeLong(this.j0);
        f.K(parcel0, 14, 8);
        parcel0.writeLong(this.k0);
        f.K(parcel0, 15, 4);
        parcel0.writeInt(this.l0);
        f.K(parcel0, 16, 4);
        parcel0.writeInt(((int)this.m0));
        f.K(parcel0, 18, 4);
        parcel0.writeInt(((int)this.n0));
        f.F(parcel0, 19, this.o0);
        Boolean boolean0 = this.p0;
        if(boolean0 != null) {
            f.K(parcel0, 21, 4);
            parcel0.writeInt(((int)boolean0.booleanValue()));
        }
        f.K(parcel0, 22, 8);
        parcel0.writeLong(this.q0);
        List list0 = this.r0;
        if(list0 != null) {
            int v2 = f.I(23, parcel0);
            parcel0.writeStringList(list0);
            f.J(v2, parcel0);
        }
        f.F(parcel0, 24, this.s0);
        f.F(parcel0, 25, this.t0);
        f.F(parcel0, 26, this.u0);
        f.F(parcel0, 27, this.v0);
        f.K(parcel0, 28, 4);
        parcel0.writeInt(((int)this.w0));
        f.K(parcel0, 29, 8);
        parcel0.writeLong(this.x0);
        f.K(parcel0, 30, 4);
        parcel0.writeInt(this.y0);
        f.F(parcel0, 0x1F, this.z0);
        f.K(parcel0, 0x20, 4);
        parcel0.writeInt(this.A0);
        f.K(parcel0, 34, 8);
        parcel0.writeLong(this.B0);
        f.F(parcel0, 35, this.C0);
        f.F(parcel0, 36, this.D0);
        f.J(v1, parcel0);
    }
}

