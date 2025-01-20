package com.sendwave.backend.fragment;

import Nb.j;
import a9.E;
import a9.F;
import a9.G;
import a9.H;
import com.apollographql.apollo.api.Fragment.Data;

public final class AppActionFragment implements Data {
    public final String a;
    public final H b;
    public final F c;
    public final G d;
    public final E e;

    public AppActionFragment(String s, H h0, F f0, G g0, E e0) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = h0;
        this.c = f0;
        this.d = g0;
        this.e = e0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AppActionFragment)) {
            return false;
        }
        if(!j.a(this.a, ((AppActionFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((AppActionFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((AppActionFragment)object0).c)) {
            return false;
        }
        return j.a(this.d, ((AppActionFragment)object0).d) ? j.a(this.e, ((AppActionFragment)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.a.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        E e0 = this.e;
        if(e0 != null) {
            v1 = e0.a.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "AppActionFragment(__typename=" + this.a + ", onShowDealAction=" + this.b + ", onMerchantPaymentAction=" + this.c + ", onP2PTransferAction=" + this.d + ", onLaunchUriAction=" + this.e + ")";
    }
}

