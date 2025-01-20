package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class FavoriteRecipientsFragment implements Data {
    public final String a;
    public final List b;

    public FavoriteRecipientsFragment(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FavoriteRecipientsFragment)) {
            return false;
        }
        return j.a(this.a, ((FavoriteRecipientsFragment)object0).a) ? j.a(this.b, ((FavoriteRecipientsFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "FavoriteRecipientsFragment(id=" + this.a + ", favoriteRecipients=" + this.b + ")";
    }
}

