package com.sendwave.backend.fragment;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Fragment.Data;
import com.apollographql.apollo.api.b;
import com.sendwave.models.CurrencyAmount;

public final class CreateAtxWalletFragment implements Data {
    public final String a;
    public final CurrencyAmount b;
    public final boolean c;

    public CreateAtxWalletFragment(String s, CurrencyAmount currencyAmount0, boolean z) {
        this.a = s;
        this.b = currencyAmount0;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CreateAtxWalletFragment)) {
            return false;
        }
        if(!j.a(this.a, ((CreateAtxWalletFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((CreateAtxWalletFragment)object0).b) ? this.c == ((CreateAtxWalletFragment)object0).c : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.b, this.a.hashCode() * 0x1F, 0x1F);
        return this.c ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CreateAtxWalletFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", balance=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isSendwaveRecipient=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

