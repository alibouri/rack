package com.sendwave.backend.fragment;

import A3.e;
import M.J;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;
import m5.b;

public final class DealDetailFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;

    public DealDetailFragment(String s, String s1, String s2, String s3, List list0, List list1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = list0;
        this.f = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DealDetailFragment)) {
            return false;
        }
        if(!j.a(this.a, ((DealDetailFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((DealDetailFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((DealDetailFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((DealDetailFragment)object0).d)) {
            return false;
        }
        return j.a(this.e, ((DealDetailFragment)object0).e) ? j.a(this.f, ((DealDetailFragment)object0).f) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = e.s((this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F, this.b);
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return this.f.hashCode() + b.q(this.e, e.s((v1 + v) * 0x1F, 0x1F, this.d), 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DealDetailFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", description=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", animationUrl=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", imageUrl=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", terms=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", actions=");
        return J.h(stringBuilder0, this.f, ")");
    }
}

