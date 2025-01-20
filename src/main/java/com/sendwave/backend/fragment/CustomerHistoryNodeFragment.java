package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import Y8.o;
import a9.b1;
import a9.c1;
import a9.d1;
import a9.e1;
import a9.f1;
import a9.g1;
import a9.h1;
import a9.i1;
import a9.j1;
import a9.k1;
import a9.l1;
import a9.m1;
import a9.n1;
import a9.o1;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class CustomerHistoryNodeFragment implements Data {
    public final e1 A;
    public final String a;
    public final String b;
    public final Date c;
    public final CurrencyAmount d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final b1 n;
    public final i1 o;
    public final k1 p;
    public final j1 q;
    public final l1 r;
    public final c1 s;
    public final n1 t;
    public final o1 u;
    public final f1 v;
    public final d1 w;
    public final g1 x;
    public final m1 y;
    public final h1 z;

    public CustomerHistoryNodeFragment(String s, String s1, Date date0, CurrencyAmount currencyAmount0, String s2, boolean z, boolean z1, boolean z2, boolean z3, String s3, String s4, String s5, List list0, b1 b10, i1 i10, k1 k10, j1 j10, l1 l10, c1 c10, n1 n10, o1 o10, f1 f10, d1 d10, g1 g10, m1 m10, h1 h10, e1 e10) {
        j.f(s, "__typename");
        j.f(s1, "id");
        super();
        this.a = s;
        this.b = s1;
        this.c = date0;
        this.d = currencyAmount0;
        this.e = s2;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
        this.j = s3;
        this.k = s4;
        this.l = s5;
        this.m = list0;
        this.n = b10;
        this.o = i10;
        this.p = k10;
        this.q = j10;
        this.r = l10;
        this.s = c10;
        this.t = n10;
        this.u = o10;
        this.v = f10;
        this.w = d10;
        this.x = g10;
        this.y = m10;
        this.z = h10;
        this.A = e10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomerHistoryNodeFragment)) {
            return false;
        }
        if(!j.a(this.a, ((CustomerHistoryNodeFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((CustomerHistoryNodeFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((CustomerHistoryNodeFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((CustomerHistoryNodeFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((CustomerHistoryNodeFragment)object0).e)) {
            return false;
        }
        if(this.f != ((CustomerHistoryNodeFragment)object0).f) {
            return false;
        }
        if(this.g != ((CustomerHistoryNodeFragment)object0).g) {
            return false;
        }
        if(this.h != ((CustomerHistoryNodeFragment)object0).h) {
            return false;
        }
        if(this.i != ((CustomerHistoryNodeFragment)object0).i) {
            return false;
        }
        if(!j.a(this.j, ((CustomerHistoryNodeFragment)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((CustomerHistoryNodeFragment)object0).k)) {
            return false;
        }
        if(!j.a(this.l, ((CustomerHistoryNodeFragment)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((CustomerHistoryNodeFragment)object0).m)) {
            return false;
        }
        if(!j.a(this.n, ((CustomerHistoryNodeFragment)object0).n)) {
            return false;
        }
        if(!j.a(this.o, ((CustomerHistoryNodeFragment)object0).o)) {
            return false;
        }
        if(!j.a(this.p, ((CustomerHistoryNodeFragment)object0).p)) {
            return false;
        }
        if(!j.a(this.q, ((CustomerHistoryNodeFragment)object0).q)) {
            return false;
        }
        if(!j.a(this.r, ((CustomerHistoryNodeFragment)object0).r)) {
            return false;
        }
        if(!j.a(this.s, ((CustomerHistoryNodeFragment)object0).s)) {
            return false;
        }
        if(!j.a(this.t, ((CustomerHistoryNodeFragment)object0).t)) {
            return false;
        }
        if(!j.a(this.u, ((CustomerHistoryNodeFragment)object0).u)) {
            return false;
        }
        if(!j.a(this.v, ((CustomerHistoryNodeFragment)object0).v)) {
            return false;
        }
        if(!j.a(this.w, ((CustomerHistoryNodeFragment)object0).w)) {
            return false;
        }
        if(!j.a(this.x, ((CustomerHistoryNodeFragment)object0).x)) {
            return false;
        }
        if(!j.a(this.y, ((CustomerHistoryNodeFragment)object0).y)) {
            return false;
        }
        return j.a(this.z, ((CustomerHistoryNodeFragment)object0).z) ? j.a(this.A, ((CustomerHistoryNodeFragment)object0).A) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.d, (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F, 0x1F);
        int v1 = 0;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        int v3 = 0x4D5;
        int v4 = this.f ? 0x4CF : 0x4D5;
        int v5 = this.g ? 0x4CF : 0x4D5;
        int v6 = this.h ? 0x4CF : 0x4D5;
        if(this.i) {
            v3 = 0x4CF;
        }
        int v7 = this.j == null ? 0 : this.j.hashCode();
        int v8 = this.k == null ? 0 : this.k.hashCode();
        int v9 = this.l == null ? 0 : this.l.hashCode();
        int v10 = this.m == null ? 0 : this.m.hashCode();
        int v11 = this.n == null ? 0 : this.n.a.hashCode();
        int v12 = this.o == null ? 0 : this.o.hashCode();
        int v13 = this.p == null ? 0 : this.p.hashCode();
        int v14 = this.q == null ? 0 : this.q.hashCode();
        int v15 = this.r == null ? 0 : this.r.hashCode();
        int v16 = this.s == null ? 0 : this.s.hashCode();
        int v17 = this.t == null ? 0 : this.t.a.hashCode();
        int v18 = this.u == null ? 0 : this.u.a.hashCode();
        int v19 = this.v == null ? 0 : this.v.hashCode();
        int v20 = this.w == null ? 0 : this.w.hashCode();
        int v21 = this.x == null ? 0 : this.x.hashCode();
        int v22 = this.y == null ? 0 : this.y.a.hashCode();
        int v23 = this.z == null ? 0 : this.z.a.hashCode();
        e1 e10 = this.A;
        if(e10 != null) {
            v1 = e10.a.hashCode();
        }
        return ((((((((((((((((((((((v + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v3) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v19) * 0x1F + v20) * 0x1F + v21) * 0x1F + v22) * 0x1F + v23) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "CustomerHistoryNodeFragment(__typename=" + this.a + ", id=" + this.b + ", whenEntered=" + this.c + ", amount=" + this.d + ", summary=" + this.e + ", isPending=" + this.f + ", isCancelled=" + this.g + ", canBeUsedForAppReview=" + this.h + ", shouldDisplayDate=" + this.i + ", statusDescription=" + this.j + ", userFacingTransactionId=" + this.k + ", walletId=" + this.l + ", baseReceiptFields=" + this.m + ", onAgentTransactionEntry=" + this.n + ", onTransferReceivedEntry=" + this.o + ", onTransferSentEntry=" + this.p + ", onTransferReceivedReversalEntry=" + this.q + ", onTransferSentReversalEntry=" + this.r + ", onBillPaymentEntry=" + this.s + ", onUserLinkedAccountTransferB2WEntry=" + this.t + ", onUserLinkedAccountTransferW2BEntry=" + this.u + ", onPurchaseEntry=" + this.v + ", onMerchantSaleEntry=" + this.w + ", onReversalDisputeEntry=" + this.x + ", onTransferToSavingsEntry=" + this.y + ", onTransferFromSavingsEntry=" + this.z + ", onPaymentCardTransferEntry=" + this.A + ")";
    }
}

