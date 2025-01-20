package com.sendwave.backend.fragment;

import Nb.j;
import a9.i3;
import a9.j3;
import a9.k3;
import com.apollographql.apollo.api.Fragment.Data;

public final class IdPhotoStatusFragment implements Data {
    public final String a;
    public final String b;
    public final i3 c;
    public final k3 d;
    public final j3 e;

    public IdPhotoStatusFragment(String s, String s1, i3 i30, k3 k30, j3 j30) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = s1;
        this.c = i30;
        this.d = k30;
        this.e = j30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IdPhotoStatusFragment)) {
            return false;
        }
        if(!j.a(this.a, ((IdPhotoStatusFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((IdPhotoStatusFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((IdPhotoStatusFragment)object0).c)) {
            return false;
        }
        return j.a(this.d, ((IdPhotoStatusFragment)object0).d) ? j.a(this.e, ((IdPhotoStatusFragment)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.a.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        j3 j30 = this.e;
        if(j30 != null) {
            v1 = j30.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "IdPhotoStatusFragment(__typename=" + this.a + ", button=" + this.b + ", onUserKycIdPhotoStatusWithSimpleText=" + this.c + ", onUserKycIdPhotoStatusWithTextWithIcon=" + this.d + ", onUserKycIdPhotoStatusWithTextInRectangle=" + this.e + ")";
    }
}

