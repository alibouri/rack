package com.sendwave.backend.fragment;

import Nb.j;
import Y8.o;
import a9.D6;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.LockUnlockState;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class SavingsWalletFragment implements Data {
    public final String a;
    public final CurrencyAmount b;
    public final LockUnlockState c;
    public final Date d;
    public final Boolean e;
    public final String f;
    public final Integer g;
    public final List h;
    public final D6 i;

    public SavingsWalletFragment(String s, CurrencyAmount currencyAmount0, LockUnlockState lockUnlockState0, Date date0, Boolean boolean0, String s1, Integer integer0, List list0, D6 d60) {
        this.a = s;
        this.b = currencyAmount0;
        this.c = lockUnlockState0;
        this.d = date0;
        this.e = boolean0;
        this.f = s1;
        this.g = integer0;
        this.h = list0;
        this.i = d60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SavingsWalletFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SavingsWalletFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SavingsWalletFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((SavingsWalletFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((SavingsWalletFragment)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((SavingsWalletFragment)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((SavingsWalletFragment)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((SavingsWalletFragment)object0).g)) {
            return false;
        }
        return j.a(this.h, ((SavingsWalletFragment)object0).h) ? j.a(this.i, ((SavingsWalletFragment)object0).i) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = o.n(this.b, (this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F);
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f == null ? 0 : this.f.hashCode();
        int v6 = this.g == null ? 0 : this.g.hashCode();
        int v7 = this.h == null ? 0 : this.h.hashCode();
        D6 d60 = this.i;
        if(d60 != null) {
            v = d60.a.hashCode();
        }
        return ((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "SavingsWalletFragment(id=" + this.a + ", balance=" + this.b + ", state=" + this.c + ", whenUnlocks=" + this.d + ", shouldRestrictFromLocking=" + this.e + ", restrictFromLockingBottomSheetMessage=" + this.f + ", numRemainingLocksAllowedInMonth=" + this.g + ", introScreen=" + this.h + ", historyConnection=" + this.i + ")";
    }
}

