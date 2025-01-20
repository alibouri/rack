package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class FavoriteBuyAirtimeRecipientsFragment implements Data {
    public final String a;
    public final List b;

    public FavoriteBuyAirtimeRecipientsFragment(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FavoriteBuyAirtimeRecipientsFragment)) {
            return false;
        }
        return j.a(this.a, ((FavoriteBuyAirtimeRecipientsFragment)object0).a) ? j.a(this.b, ((FavoriteBuyAirtimeRecipientsFragment)object0).b) : false;
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
        return "FavoriteBuyAirtimeRecipientsFragment(id=" + this.a + ", favoriteBuyAirtimeRecipients=" + this.b + ")";
    }
}

