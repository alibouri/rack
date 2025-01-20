package com.sendwave.backend.fragment;

import Nb.j;
import a9.G8;
import com.apollographql.apollo.api.Fragment.Data;

public final class TestUserIdFragment implements Data {
    public final String a;
    public final G8 b;

    public TestUserIdFragment(String s, G8 g80) {
        this.a = s;
        this.b = g80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TestUserIdFragment)) {
            return false;
        }
        return j.a(this.a, ((TestUserIdFragment)object0).a) ? j.a(this.b, ((TestUserIdFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.a.hashCode();
    }

    @Override
    public final String toString() {
        return "TestUserIdFragment(id=" + this.a + ", primaryWallet=" + this.b + ")";
    }
}

