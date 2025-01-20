package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;

public final class SmsTokenFragment implements Data {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final Boolean g;

    public SmsTokenFragment(String s, String s1, int v, boolean z, int v1, boolean z1, Boolean boolean0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = z;
        this.e = v1;
        this.f = z1;
        this.g = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SmsTokenFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SmsTokenFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SmsTokenFragment)object0).b)) {
            return false;
        }
        if(this.c != ((SmsTokenFragment)object0).c) {
            return false;
        }
        if(this.d != ((SmsTokenFragment)object0).d) {
            return false;
        }
        if(this.e != ((SmsTokenFragment)object0).e) {
            return false;
        }
        return this.f == ((SmsTokenFragment)object0).f ? j.a(this.g, ((SmsTokenFragment)object0).g) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((e.s(this.a.hashCode() * 0x1F, 0x1F, this.b) + this.c) * 0x1F + (this.d ? 0x4CF : 0x4D5)) * 0x1F + this.e) * 0x1F;
        if(this.f) {
            v = 0x4CF;
        }
        return this.g == null ? (v1 + v) * 0x1F : (v1 + v) * 0x1F + this.g.hashCode();
    }

    @Override
    public final String toString() {
        return "SmsTokenFragment(id=" + this.a + ", mobile=" + this.b + ", length=" + this.c + ", robocallsEnabled=" + this.d + ", resendSmsDelaySeconds=" + this.e + ", shouldUseOldSmsUserConsentAutofill=" + this.f + ", attachLogs=" + this.g + ")";
    }
}

