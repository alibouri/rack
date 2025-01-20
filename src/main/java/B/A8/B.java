package a8;

import A3.e;
import Nb.j;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final a d;

    public b(String s, String s1, String s2, a a0) {
        j.f(s, "appId");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = a0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!j.a(this.a, ((b)object0).a)) {
            return false;
        }
        if(!this.b.equals(((b)object0).b)) {
            return false;
        }
        return this.c.equals(((b)object0).c) ? this.d.equals(((b)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (r.Y.hashCode() + e.s(((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + 47594038) * 0x1F, 0x1F, this.c)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=2.0.0, osVersion=" + this.c + ", logEnvironment=" + r.Y + ", androidAppInfo=" + this.d + ')';
    }
}

