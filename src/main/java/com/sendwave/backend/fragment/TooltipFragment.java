package com.sendwave.backend.fragment;

import A3.e;
import M.J;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.TooltipTarget;

public final class TooltipFragment implements Data {
    public final String a;
    public final TooltipTarget b;
    public final String c;
    public final String d;
    public final int e;

    public TooltipFragment(String s, TooltipTarget tooltipTarget0, String s1, String s2, int v) {
        j.f(tooltipTarget0, "target");
        super();
        this.a = s;
        this.b = tooltipTarget0;
        this.c = s1;
        this.d = s2;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TooltipFragment)) {
            return false;
        }
        if(!j.a(this.a, ((TooltipFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((TooltipFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((TooltipFragment)object0).c)) {
            return false;
        }
        return j.a(this.d, ((TooltipFragment)object0).d) ? this.e == ((TooltipFragment)object0).e : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c);
        return this.d == null ? v * 0x1F + this.e : (v + this.d.hashCode()) * 0x1F + this.e;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TooltipFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", target=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", text=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", backgroundColor=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", showCount=");
        return J.f(stringBuilder0, this.e, ")");
    }
}

