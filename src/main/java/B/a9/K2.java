package a9;

import A3.e;
import Nb.j;

public final class k2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final n2 i;
    public final m2 j;
    public final l2 k;

    public k2(String s, String s1, String s2, String s3, boolean z, boolean z1, boolean z2, boolean z3, n2 n20, m2 m20, l2 l20) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = z3;
        this.i = n20;
        this.j = m20;
        this.k = l20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k2)) {
            return false;
        }
        if(!j.a(this.a, ((k2)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((k2)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((k2)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((k2)object0).d)) {
            return false;
        }
        if(this.e != ((k2)object0).e) {
            return false;
        }
        if(this.f != ((k2)object0).f) {
            return false;
        }
        if(this.g != ((k2)object0).g) {
            return false;
        }
        if(this.h != ((k2)object0).h) {
            return false;
        }
        if(!j.a(this.i, ((k2)object0).i)) {
            return false;
        }
        return j.a(this.j, ((k2)object0).j) ? j.a(this.k, ((k2)object0).k) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = 0x4D5;
        int v5 = this.e ? 0x4CF : 0x4D5;
        int v6 = this.f ? 0x4CF : 0x4D5;
        int v7 = this.g ? 0x4CF : 0x4D5;
        if(this.h) {
            v4 = 0x4CF;
        }
        int v8 = this.i == null ? 0 : this.i.a.hashCode();
        int v9 = this.j == null ? 0 : this.j.a.hashCode();
        l2 l20 = this.k;
        if(l20 != null) {
            v1 = l20.hashCode();
        }
        return ((((((((v + v2) * 0x1F + v3) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v4) * 0x1F + v8) * 0x1F + v9) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "DocumentField(__typename=" + this.a + ", fieldName=" + this.b + ", displayName=" + this.c + ", defaultValue=" + this.d + ", isRequired=" + this.e + ", isReviewable=" + this.f + ", isEditable=" + this.g + ", isVisible=" + this.h + ", onDocumentTextField=" + this.i + ", onDocumentMultiChoiceField=" + this.j + ", onDocumentDateField=" + this.k + ")";
    }
}

