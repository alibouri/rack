package com.sendwave.backend.fragment;

import A3.e;
import M.J;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.Date;
import java.util.List;

public final class SecurityQuestionFragment implements Data {
    public final String a;
    public final String b;
    public final Date c;
    public final boolean d;
    public final List e;

    public SecurityQuestionFragment(String s, String s1, Date date0, boolean z, List list0) {
        this.a = s;
        this.b = s1;
        this.c = date0;
        this.d = z;
        this.e = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SecurityQuestionFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SecurityQuestionFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SecurityQuestionFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((SecurityQuestionFragment)object0).c)) {
            return false;
        }
        return this.d == ((SecurityQuestionFragment)object0).d ? j.a(this.e, ((SecurityQuestionFragment)object0).e) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = this.c == null ? 0 : this.c.hashCode();
        return this.d ? this.e.hashCode() + ((v + v1) * 0x1F + 0x4CF) * 0x1F : this.e.hashCode() + ((v + v1) * 0x1F + 0x4D5) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SecurityQuestionFragment(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", questionLabel=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", whenExpires=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", isCorrectlyAnswered=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", fields=");
        return J.h(stringBuilder0, this.e, ")");
    }
}

