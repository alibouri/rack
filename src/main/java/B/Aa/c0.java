package Aa;

import N9.d;
import Nb.j;
import com.sendwave.models.CurrencyAmount;
import java.util.List;
import m5.b;
import s9.g;

public final class c0 {
    public final boolean a;
    public final boolean b;
    public final CurrencyAmount c;
    public final Z d;
    public final List e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final d j;
    public final b0 k;
    public final g l;
    public final boolean m;
    public final String n;
    public final Integer o;
    public final boolean p;
    public final boolean q;

    public c0(boolean z, boolean z1, CurrencyAmount currencyAmount0, Z z2, List list0, String s, String s1, boolean z3, boolean z4, d d0, b0 b00, g g0, boolean z5, String s2, Integer integer0) {
        j.f(z2, "lockState");
        j.f(list0, "transactions");
        j.f(g0, "supportSheetState");
        super();
        this.a = z;
        this.b = z1;
        this.c = currencyAmount0;
        this.d = z2;
        this.e = list0;
        this.f = s;
        this.g = s1;
        this.h = z3;
        this.i = z4;
        this.j = d0;
        this.k = b00;
        this.l = g0;
        this.m = z5;
        this.n = s2;
        this.o = integer0;
        this.p = list0.size() >= 25;
        this.q = z2 instanceof Y;
    }

    public static c0 a(c0 c00, boolean z, boolean z1, CurrencyAmount currencyAmount0, Z z2, List list0, String s, String s1, boolean z3, boolean z4, d d0, b0 b00, g g0, boolean z5, String s2, Integer integer0, int v) {
        Z z6 = (v & 8) == 0 ? z2 : c00.d;
        List list1 = (v & 16) == 0 ? list0 : c00.e;
        g g1 = (v & 0x800) == 0 ? g0 : c00.l;
        c00.getClass();
        j.f(z6, "lockState");
        j.f(list1, "transactions");
        j.f(g1, "supportSheetState");
        return new c0(((v & 1) == 0 ? z : c00.a), ((v & 2) == 0 ? z1 : c00.b), ((v & 4) == 0 ? currencyAmount0 : c00.c), z6, list1, ((v & 0x20) == 0 ? s : c00.f), ((v & 0x40) == 0 ? s1 : c00.g), ((v & 0x80) == 0 ? z3 : c00.h), ((v & 0x100) == 0 ? z4 : c00.i), ((v & 0x200) == 0 ? d0 : c00.j), ((v & 0x400) == 0 ? b00 : c00.k), g1, ((v & 0x1000) == 0 ? z5 : c00.m), ((v & 0x2000) == 0 ? s2 : c00.n), ((v & 0x4000) == 0 ? integer0 : c00.o));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c0)) {
            return false;
        }
        if(this.a != ((c0)object0).a) {
            return false;
        }
        if(this.b != ((c0)object0).b) {
            return false;
        }
        if(!j.a(this.c, ((c0)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((c0)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((c0)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((c0)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((c0)object0).g)) {
            return false;
        }
        if(this.h != ((c0)object0).h) {
            return false;
        }
        if(this.i != ((c0)object0).i) {
            return false;
        }
        if(!j.a(this.j, ((c0)object0).j)) {
            return false;
        }
        if(this.k != ((c0)object0).k) {
            return false;
        }
        if(!j.a(this.l, ((c0)object0).l)) {
            return false;
        }
        if(this.m != ((c0)object0).m) {
            return false;
        }
        return j.a(this.n, ((c0)object0).n) ? j.a(this.o, ((c0)object0).o) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = 0;
        int v2 = b.q(this.e, (this.d.hashCode() + (((this.a ? 0x4CF : 0x4D5) * 0x1F + (this.b ? 0x4CF : 0x4D5)) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F) * 0x1F, 0x1F);
        int v3 = this.f == null ? 0 : this.f.hashCode();
        int v4 = this.g == null ? 0 : this.g.hashCode();
        int v5 = this.h ? 0x4CF : 0x4D5;
        int v6 = this.i ? 0x4CF : 0x4D5;
        int v7 = this.j == null ? 0 : this.j.hashCode();
        int v8 = this.k == null ? 0 : this.k.hashCode();
        int v9 = this.l.hashCode();
        if(this.m) {
            v = 0x4CF;
        }
        int v10 = this.n == null ? 0 : this.n.hashCode();
        Integer integer0 = this.o;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (((v9 + ((((((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F) * 0x1F + v) * 0x1F + v10) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SavingsUiState(loading=" + this.a + ", offline=" + this.b + ", savingsBalance=" + this.c + ", lockState=" + this.d + ", transactions=" + this.e + ", snackbarMessage=" + this.f + ", unlockText=" + this.g + ", shouldRestrictFromLocking=" + this.h + ", lockVaultButtonVisible=" + this.i + ", tooltip=" + this.j + ", visibleSheet=" + this.k + ", supportSheetState=" + this.l + ", shouldShowLockAbuserBottomSheet=" + this.m + ", restrictFromLockingBottomSheetMessage=" + this.n + ", numRemainingLocksAllowedInMonth=" + this.o + ")";
    }
}

