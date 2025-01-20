package com.sendwave.util;

import A3.e;
import Ab.o;
import Ea.e0;
import Nb.j;
import W4.f;
import a9.g3;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import java.util.List;
import java.util.Map;
import m5.b;

public final class Country implements Parcelable {
    public final Object A0;
    public final CurrencyAmount B0;
    public final String C0;
    public static final Parcelable.Creator CREATOR;
    public final String D0;
    public final String E0;
    public final String F0;
    public final String G0;
    public final boolean H0;
    public final String I0;
    public final String J0;
    public final boolean K0;
    public final int L0;
    public final Boolean M0;
    public final Boolean N0;
    public final g3 O0;
    public static final o P0;
    public static final o Q0;
    public final String X;
    public final String Y;
    public final String Z;
    public final int b0;
    public final String c0;
    public final String d0;
    public final String e0;
    public final int f0;
    public final Map g0;
    public final String h0;
    public final Currency i0;
    public final String j0;
    public final boolean k0;
    public final String l0;
    public final List m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final Map s0;
    public final String t0;
    public final String u0;
    public final String v0;
    public final String w0;
    public final int x0;
    public final boolean y0;
    public final Object z0;

    static {
        Country.P0 = f.A(new e0(19));
        Country.Q0 = f.A(new e0(20));
        Country.CREATOR = new q9.o(3);
    }

    public Country(String s, String s1, String s2, int v, String s3, String s4, String s5, int v1, Map map0, String s6, Currency currency0, String s7, boolean z, String s8, List list0, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, Map map1, String s9, String s10, String s11, String s12, int v2, boolean z6, Map map2, Map map3, CurrencyAmount currencyAmount0, String s13, String s14, String s15, String s16, String s17, boolean z7, String s18, String s19, boolean z8, int v3, Boolean boolean0, Boolean boolean1, g3 g30) {
        j.f(currency0, "currency");
        super();
        this.X = s;
        this.Y = s1;
        this.Z = s2;
        this.b0 = v;
        this.c0 = s3;
        this.d0 = s4;
        this.e0 = s5;
        this.f0 = v1;
        this.g0 = map0;
        this.h0 = s6;
        this.i0 = currency0;
        this.j0 = s7;
        this.k0 = z;
        this.l0 = s8;
        this.m0 = list0;
        this.n0 = z1;
        this.o0 = z2;
        this.p0 = z3;
        this.q0 = z4;
        this.r0 = z5;
        this.s0 = map1;
        this.t0 = s9;
        this.u0 = s10;
        this.v0 = s11;
        this.w0 = s12;
        this.x0 = v2;
        this.y0 = z6;
        this.z0 = map2;
        this.A0 = map3;
        this.B0 = currencyAmount0;
        this.C0 = s13;
        this.D0 = s14;
        this.E0 = s15;
        this.F0 = s16;
        this.G0 = s17;
        this.H0 = z7;
        this.I0 = s18;
        this.J0 = s19;
        this.K0 = z8;
        this.L0 = v3;
        this.M0 = boolean0;
        this.N0 = boolean1;
        this.O0 = g30;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Country)) {
            return false;
        }
        if(!this.X.equals(((Country)object0).X)) {
            return false;
        }
        if(!this.Y.equals(((Country)object0).Y)) {
            return false;
        }
        if(!this.Z.equals(((Country)object0).Z)) {
            return false;
        }
        if(this.b0 != ((Country)object0).b0) {
            return false;
        }
        if(!this.c0.equals(((Country)object0).c0)) {
            return false;
        }
        if(!this.d0.equals(((Country)object0).d0)) {
            return false;
        }
        if(!this.e0.equals(((Country)object0).e0)) {
            return false;
        }
        if(this.f0 != ((Country)object0).f0) {
            return false;
        }
        if(!this.g0.equals(((Country)object0).g0)) {
            return false;
        }
        if(!this.h0.equals(((Country)object0).h0)) {
            return false;
        }
        if(!j.a(this.i0, ((Country)object0).i0)) {
            return false;
        }
        if(!this.j0.equals(((Country)object0).j0)) {
            return false;
        }
        if(this.k0 != ((Country)object0).k0) {
            return false;
        }
        if(!this.l0.equals(((Country)object0).l0)) {
            return false;
        }
        if(!this.m0.equals(((Country)object0).m0)) {
            return false;
        }
        if(this.n0 != ((Country)object0).n0) {
            return false;
        }
        if(this.o0 != ((Country)object0).o0) {
            return false;
        }
        if(this.p0 != ((Country)object0).p0) {
            return false;
        }
        if(this.q0 != ((Country)object0).q0) {
            return false;
        }
        if(this.r0 != ((Country)object0).r0) {
            return false;
        }
        if(!this.s0.equals(((Country)object0).s0)) {
            return false;
        }
        if(!this.t0.equals(((Country)object0).t0)) {
            return false;
        }
        if(!this.u0.equals(((Country)object0).u0)) {
            return false;
        }
        if(!this.v0.equals(((Country)object0).v0)) {
            return false;
        }
        if(!this.w0.equals(((Country)object0).w0)) {
            return false;
        }
        if(this.x0 != ((Country)object0).x0) {
            return false;
        }
        if(this.y0 != ((Country)object0).y0) {
            return false;
        }
        if(!j.a(this.z0, ((Country)object0).z0)) {
            return false;
        }
        if(!this.A0.equals(((Country)object0).A0)) {
            return false;
        }
        if(!j.a(this.B0, ((Country)object0).B0)) {
            return false;
        }
        if(!this.C0.equals(((Country)object0).C0)) {
            return false;
        }
        if(!this.D0.equals(((Country)object0).D0)) {
            return false;
        }
        if(!this.E0.equals(((Country)object0).E0)) {
            return false;
        }
        if(!this.F0.equals(((Country)object0).F0)) {
            return false;
        }
        if(!this.G0.equals(((Country)object0).G0)) {
            return false;
        }
        if(this.H0 != ((Country)object0).H0) {
            return false;
        }
        if(!j.a(this.I0, ((Country)object0).I0)) {
            return false;
        }
        if(!j.a(this.J0, ((Country)object0).J0)) {
            return false;
        }
        if(this.K0 != ((Country)object0).K0) {
            return false;
        }
        if(this.L0 != ((Country)object0).L0) {
            return false;
        }
        if(!j.a(this.M0, ((Country)object0).M0)) {
            return false;
        }
        return j.a(this.N0, ((Country)object0).N0) ? j.a(this.O0, ((Country)object0).O0) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4CF;
        int v1 = 0;
        int v2 = e.s(e.s(e.s(e.s(e.s(((this.A0.hashCode() + (((e.s(e.s(e.s((((this.t0.hashCode() + (this.s0.hashCode() + (((((b.q(this.m0, e.s((e.s((this.i0.hashCode() + e.s((this.g0.hashCode() + (e.s(e.s(e.s((e.s(e.s(this.X.hashCode() * 0x1F, 0x1F, this.Y), 0x1F, this.Z) + this.b0) * 0x1F, 0x1F, this.c0), 0x1F, this.d0), 0x1F, this.e0) + this.f0) * 0x1F) * 0x1F, 0x1F, this.h0)) * 0x1F, 0x1F, this.j0) + (this.k0 ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.l0), 0x1F) + (this.n0 ? 0x4CF : 0x4D5)) * 0x1F + (this.o0 ? 0x4CF : 0x4D5)) * 0x1F + (this.p0 ? 0x4CF : 0x4D5)) * 0x1F + (this.q0 ? 0x4CF : 0x4D5)) * 0x1F + (this.r0 ? 0x4CF : 0x4D5)) * 0x1F) * 0x1F) * 0x1F - 0x15F1D5) * 0x1F + 0x4CF) * 0x1F, 0x1F, this.u0), 0x1F, this.v0), 961, this.w0) + this.x0) * 0x1F + (this.y0 ? 0x4CF : 0x4D5)) * 0x1F + (this.z0 == null ? 0 : this.z0.hashCode())) * 0x1F) * 0x1F + (this.B0 == null ? 0 : this.B0.hashCode())) * 0x1F, 0x1F, this.C0), 0x1F, this.D0), 0x1F, this.E0), 0x1F, this.F0), 0x1F, this.G0);
        int v3 = this.H0 ? 0x4CF : 0x4D5;
        int v4 = this.I0 == null ? 0 : this.I0.hashCode();
        int v5 = this.J0 == null ? 0 : this.J0.hashCode();
        if(!this.K0) {
            v = 0x4D5;
        }
        int v6 = (((((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v) * 0x1F + this.L0) * 0x1F;
        int v7 = this.M0 == null ? 0 : this.M0.hashCode();
        int v8 = this.N0 == null ? 0 : this.N0.hashCode();
        g3 g30 = this.O0;
        if(g30 != null) {
            v1 = g30.hashCode();
        }
        return ((v6 + v7) * 0x1F + v8) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Country(name=" + this.X + ", iso2=" + this.Y + ", iso3=" + this.Z + ", tcLocationCode=" + this.b0 + ", localPrefix=" + this.c0 + ", sampleLocalTelnum=" + this.d0 + ", mobileNumberPlaceholder=" + this.e0 + ", mobileNumberMaxLength=" + this.f0 + ", mobilePhoneMockTemplate=" + this.g0 + ", okMobileRe=" + this.h0 + ", currency=" + this.i0 + ", supportNumber=" + this.j0 + ", supportNumberIsFree=" + this.k0 + ", shortcode=" + this.l0 + ", languages=" + this.m0 + ", atxExpires=" + this.n0 + ", signupName=" + this.o0 + ", linkAccount=" + this.p0 + ", hasAtxFee=" + this.q0 + ", isActive=" + this.r0 + ", supportTelnums=" + this.s0 + ", timezone=" + this.t0 + ", dateFormat=%d/%m/%Y, dateDayIsBeforeMonth=true, timeFormat=" + this.u0 + ", defaultCommissionStructureName=" + this.v0 + ", countrySpecificHostname=" + this.w0 + ", defaultMinBalStaffAgentScalar=0, atxCodeDuration=" + this.x0 + ", allowsUssdSignup=" + this.y0 + ", supportHours=" + this.z0 + ", riskOpsHours=" + this.A0 + ", qrCardTriggerVerificationThreshold=" + this.B0 + ", waveTestNumberPrefix=" + this.C0 + ", agentOpeningSlackChannel=" + this.D0 + ", agentManagementSlackChannel=" + this.E0 + ", agentTerminationSlackChannel=" + this.F0 + ", agentAdminSlackTeam=" + this.G0 + ", showBusinessSearch=" + this.H0 + ", distributionManagementSlackChannel=" + this.I0 + ", countrySpecificBusinessAppHostname=" + this.J0 + ", hasPerLegalEntityLimits=" + this.K0 + ", agentDefaultTerminationPeriod=" + this.L0 + ", isActiveInBouncer=" + this.M0 + ", isActiveInScheduledTasks=" + this.N0 + ", homescreenMenuConfig=" + this.O0 + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        j.f(parcel0, "dest");
        parcel0.writeString(this.Y);
    }
}

