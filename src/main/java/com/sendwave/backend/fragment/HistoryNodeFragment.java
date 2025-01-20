package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import Y8.o;
import a9.R2;
import a9.S2;
import a9.T2;
import a9.U2;
import a9.V2;
import a9.W2;
import a9.X2;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class HistoryNodeFragment implements Data {
    public final String a;
    public final String b;
    public final Date c;
    public final CurrencyAmount d;
    public final CurrencyAmount e;
    public final CurrencyAmount f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final List m;
    public final R2 n;
    public final U2 o;
    public final W2 p;
    public final V2 q;
    public final X2 r;
    public final S2 s;
    public final T2 t;

    public HistoryNodeFragment(String s, String s1, Date date0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, CurrencyAmount currencyAmount2, String s2, boolean z, boolean z1, boolean z2, boolean z3, String s3, List list0, R2 r20, U2 u20, W2 w20, V2 v20, X2 x20, S2 s20, T2 t20) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = s1;
        this.c = date0;
        this.d = currencyAmount0;
        this.e = currencyAmount1;
        this.f = currencyAmount2;
        this.g = s2;
        this.h = z;
        this.i = z1;
        this.j = z2;
        this.k = z3;
        this.l = s3;
        this.m = list0;
        this.n = r20;
        this.o = u20;
        this.p = w20;
        this.q = v20;
        this.r = x20;
        this.s = s20;
        this.t = t20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HistoryNodeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((HistoryNodeFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((HistoryNodeFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((HistoryNodeFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((HistoryNodeFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((HistoryNodeFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((HistoryNodeFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((HistoryNodeFragment)object0).g)) {
            return false;
        }
        if(this.h != ((HistoryNodeFragment)object0).h) {
            return false;
        }
        if(this.i != ((HistoryNodeFragment)object0).i) {
            return false;
        }
        if(this.j != ((HistoryNodeFragment)object0).j) {
            return false;
        }
        if(this.k != ((HistoryNodeFragment)object0).k) {
            return false;
        }
        if(!j.a(this.l, ((HistoryNodeFragment)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((HistoryNodeFragment)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((HistoryNodeFragment)object0).n)) {
            return false;
        }
        if(!j.a(this.o, ((HistoryNodeFragment)object0).o)) {
            return false;
        }
        if(!j.a(this.p, ((HistoryNodeFragment)object0).p)) {
            return false;
        }
        if(!j.a(this.q, ((HistoryNodeFragment)object0).q)) {
            return false;
        }
        if(!j.a(this.r, ((HistoryNodeFragment)object0).r)) {
            return false;
        }
        return j.a(this.s, ((HistoryNodeFragment)object0).s) ? j.a(this.t, ((HistoryNodeFragment)object0).t) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.f, o.n(this.e, o.n(this.d, (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F, 0x1F), 0x1F), 0x1F);
        int v1 = 0;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        int v3 = 0x4D5;
        int v4 = this.h ? 0x4CF : 0x4D5;
        int v5 = this.i ? 0x4CF : 0x4D5;
        int v6 = this.j ? 0x4CF : 0x4D5;
        if(this.k) {
            v3 = 0x4CF;
        }
        int v7 = this.l == null ? 0 : this.l.hashCode();
        int v8 = this.m == null ? 0 : this.m.hashCode();
        int v9 = this.n == null ? 0 : this.n.a.hashCode();
        int v10 = this.o == null ? 0 : this.o.hashCode();
        int v11 = this.p == null ? 0 : this.p.hashCode();
        int v12 = this.q == null ? 0 : this.q.hashCode();
        int v13 = this.r == null ? 0 : this.r.hashCode();
        int v14 = this.s == null ? 0 : this.s.hashCode();
        T2 t20 = this.t;
        if(t20 != null) {
            v1 = t20.hashCode();
        }
        return (((((((((((((v + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v3) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "HistoryNodeFragment(__typename=" + this.a + ", id=" + this.b + ", whenEntered=" + this.c + ", amount=" + this.d + ", fee=" + this.e + ", balance=" + this.f + ", summary=" + this.g + ", isPending=" + this.h + ", isCancelled=" + this.i + ", canBeUsedForAppReview=" + this.j + ", shouldDisplayDate=" + this.k + ", statusDescription=" + this.l + ", baseReceiptFields=" + this.m + ", onAgentTransactionEntry=" + this.n + ", onTransferReceivedEntry=" + this.o + ", onTransferSentEntry=" + this.p + ", onTransferReceivedReversalEntry=" + this.q + ", onTransferSentReversalEntry=" + this.r + ", onBillPaymentEntry=" + this.s + ", onReversalDisputeEntry=" + this.t + ")";
    }
}

