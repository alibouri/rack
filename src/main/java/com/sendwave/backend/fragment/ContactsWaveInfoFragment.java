package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;

public final class ContactsWaveInfoFragment implements Data {
    public final String a;
    public final boolean b;

    public ContactsWaveInfoFragment(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContactsWaveInfoFragment)) {
            return false;
        }
        return j.a(this.a, ((ContactsWaveInfoFragment)object0).a) ? this.b == ((ContactsWaveInfoFragment)object0).b : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "ContactsWaveInfoFragment(id=" + this.a + ", hasWaveAccount=" + this.b + ")";
    }
}

