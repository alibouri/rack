package ha;

import A3.e;
import N9.d;
import S9.i;
import X9.j;
import a9.D4;
import com.sendwave.models.CurrencyAmount;
import com.wave.accounts.AccountEvent;
import java.util.List;

public final class m0 {
    public final i a;
    public final CurrencyAmount b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final J f;
    public final j g;
    public final ha.i h;
    public final U2 i;
    public final boolean j;
    public final ia.j k;
    public final boolean l;
    public final D4 m;
    public final d n;
    public final List o;
    public final AccountEvent p;
    public final CurrencyAmount q;

    public m0(i i0, CurrencyAmount currencyAmount0, boolean z, String s, boolean z1, J j0, j j1, ha.i i1, U2 u20, boolean z2, ia.j j2, boolean z3, D4 d40, d d0, List list0, AccountEvent accountEvent0, CurrencyAmount currencyAmount1) {
        Nb.j.f(s, "qrCodeUrl");
        Nb.j.f(j0, "navBarConfig");
        Nb.j.f(j1, "announcementsCarouselState");
        Nb.j.f(u20, "transactionHistoryState");
        Nb.j.f(j2, "loadingSuccessOverlay");
        super();
        this.a = i0;
        this.b = currencyAmount0;
        this.c = z;
        this.d = s;
        this.e = z1;
        this.f = j0;
        this.g = j1;
        this.h = i1;
        this.i = u20;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = d40;
        this.n = d0;
        this.o = list0;
        this.p = accountEvent0;
        this.q = currencyAmount1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m0)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((m0)object0).a)) {
            return false;
        }
        if(!Nb.j.a(this.b, ((m0)object0).b)) {
            return false;
        }
        if(this.c != ((m0)object0).c) {
            return false;
        }
        if(!Nb.j.a(this.d, ((m0)object0).d)) {
            return false;
        }
        if(this.e != ((m0)object0).e) {
            return false;
        }
        if(!Nb.j.a(this.f, ((m0)object0).f)) {
            return false;
        }
        if(!Nb.j.a(this.g, ((m0)object0).g)) {
            return false;
        }
        if(!Nb.j.a(this.h, ((m0)object0).h)) {
            return false;
        }
        if(!Nb.j.a(this.i, ((m0)object0).i)) {
            return false;
        }
        if(this.j != ((m0)object0).j) {
            return false;
        }
        if(this.k != ((m0)object0).k) {
            return false;
        }
        if(this.l != ((m0)object0).l) {
            return false;
        }
        if(!Nb.j.a(this.m, ((m0)object0).m)) {
            return false;
        }
        if(!Nb.j.a(this.n, ((m0)object0).n)) {
            return false;
        }
        if(!Nb.j.a(this.o, ((m0)object0).o)) {
            return false;
        }
        return Nb.j.a(this.p, ((m0)object0).p) ? Nb.j.a(this.q, ((m0)object0).q) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = 0x4D5;
        int v2 = e.s((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.d);
        int v3 = this.e ? 0x4CF : 0x4D5;
        int v4 = this.f.hashCode();
        int v5 = this.g.hashCode();
        int v6 = this.h == null ? 0 : this.h.hashCode();
        int v7 = this.i.hashCode();
        int v8 = this.j ? 0x4CF : 0x4D5;
        int v9 = this.k.hashCode();
        if(this.l) {
            v1 = 0x4CF;
        }
        int v10 = this.m == null ? 0 : this.m.hashCode();
        int v11 = this.n == null ? 0 : this.n.hashCode();
        int v12 = this.o == null ? 0 : this.o.hashCode();
        int v13 = this.p == null ? 0 : this.p.hashCode();
        CurrencyAmount currencyAmount0 = this.q;
        if(currencyAmount0 != null) {
            v = currencyAmount0.hashCode();
        }
        return ((((((v9 + ((v7 + ((v5 + (v4 + (v2 + v3) * 0x1F) * 0x1F) * 0x1F + v6) * 0x1F) * 0x1F + v8) * 0x1F) * 0x1F + v1) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "PersonalHomeUiState(accountSwitcherPillUiState=" + this.a + ", balance=" + this.b + ", isBalanceVisible=" + this.c + ", qrCodeUrl=" + this.d + ", isScanEnabled=" + this.e + ", navBarConfig=" + this.f + ", announcementsCarouselState=" + this.g + ", errorState=" + this.h + ", transactionHistoryState=" + this.i + ", isRefreshing=" + this.j + ", loadingSuccessOverlay=" + this.k + ", shouldSprayConfetti=" + this.l + ", headerAnnouncement=" + this.m + ", tooltip=" + this.n + ", footerAnnouncements=" + this.o + ", accountEvent=" + this.p + ", overdraftAvailable=" + this.q + ")";
    }
}

