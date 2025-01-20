package u2;

import Nb.j;
import R2.f;
import java.util.Locale;
import m5.b;

public final class a {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public a(String s, String s1, boolean z, int v, String s2, int v1) {
        int v2;
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = v;
        this.e = s2;
        this.f = v1;
        Locale locale0 = Locale.US;
        j.e(locale0, "US");
        String s3 = s1.toUpperCase(locale0);
        j.e(s3, "this as java.lang.String).toUpperCase(locale)");
        if(Vb.j.R(s3, "INT", false)) {
            v2 = 3;
        }
        else if(Vb.j.R(s3, "CHAR", false) || Vb.j.R(s3, "CLOB", false) || Vb.j.R(s3, "TEXT", false)) {
            v2 = 2;
        }
        else if(Vb.j.R(s3, "BLOB", false)) {
            v2 = 5;
        }
        else if(Vb.j.R(s3, "REAL", false) || Vb.j.R(s3, "FLOA", false) || Vb.j.R(s3, "DOUB", false)) {
            v2 = 4;
        }
        else {
            v2 = 1;
        }
        this.g = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(this.d != ((a)object0).d) {
            return false;
        }
        if(!this.a.equals(((a)object0).a)) {
            return false;
        }
        if(this.c != ((a)object0).c) {
            return false;
        }
        int v = ((a)object0).f;
        String s = ((a)object0).e;
        String s1 = this.e;
        int v1 = this.f;
        if(v1 == 1 && v == 2 && s1 != null && !f.q(s1, s)) {
            return false;
        }
        if(v1 == 2 && v == 1 && s != null && !f.q(s, s1)) {
            return false;
        }
        if(v1 != 0 && v1 == v) {
            if(s1 != null) {
                return f.q(s1, s) ? this.g == ((a)object0).g : false;
            }
            return s == null ? this.g == ((a)object0).g : false;
        }
        return this.g == ((a)object0).g;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.g) * 0x1F;
        return this.c ? (v + 0x4CF) * 0x1F + this.d : (v + 0x4D5) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Column{name=\'");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\', type=\'");
        stringBuilder0.append(this.b);
        stringBuilder0.append("\', affinity=\'");
        stringBuilder0.append(this.g);
        stringBuilder0.append("\', notNull=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", primaryKeyPosition=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", defaultValue=\'");
        return b.y(stringBuilder0, (this.e == null ? "undefined" : this.e), "\'}");
    }
}

