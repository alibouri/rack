package a8;

import A3.e;
import Nb.j;
import java.util.ArrayList;

public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final s e;
    public final ArrayList f;

    public a(String s, String s1, String s2, String s3, s s4, ArrayList arrayList0) {
        j.f(s1, "versionName");
        j.f(s2, "appBuildVersion");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = arrayList0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!this.a.equals(((a)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((a)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((a)object0).c)) {
            return false;
        }
        if(!this.d.equals(((a)object0).d)) {
            return false;
        }
        return this.e.equals(((a)object0).e) ? this.f.equals(((a)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() + e.s(e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}

