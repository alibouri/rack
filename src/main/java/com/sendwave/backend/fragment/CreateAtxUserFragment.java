package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;

public final class CreateAtxUserFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final RequestedDocumentsFragment d;

    public CreateAtxUserFragment(String s, String s1, String s2, RequestedDocumentsFragment requestedDocumentsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = requestedDocumentsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CreateAtxUserFragment)) {
            return false;
        }
        if(!j.a(this.a, ((CreateAtxUserFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((CreateAtxUserFragment)object0).b)) {
            return false;
        }
        return j.a(this.c, ((CreateAtxUserFragment)object0).c) ? j.a(this.d, ((CreateAtxUserFragment)object0).d) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
    }

    @Override
    public final String toString() {
        return "CreateAtxUserFragment(__typename=" + this.a + ", id=" + this.b + ", contactMobile=" + this.c + ", requestedDocumentsFragment=" + this.d + ")";
    }
}

