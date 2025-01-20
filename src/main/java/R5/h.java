package r5;

import b4.A0;
import java.util.HashMap;

public final class h {
    public final String a;
    public final Integer b;
    public final k c;
    public final long d;
    public final long e;
    public final HashMap f;

    public h(String s, Integer integer0, k k0, long v, long v1, HashMap hashMap0) {
        this.a = s;
        this.b = integer0;
        this.c = k0;
        this.d = v;
        this.e = v1;
        this.f = hashMap0;
    }

    public final String a(String s) {
        String s1 = (String)this.f.get(s);
        return s1 == null ? "" : s1;
    }

    public final int b(String s) {
        String s1 = (String)this.f.get(s);
        return s1 == null ? 0 : ((int)Integer.valueOf(s1));
    }

    public final A0 c() {
        A0 a00 = new A0(6);
        String s = this.a;
        if(s == null) {
            throw new NullPointerException("Null transportName");
        }
        a00.b = s;
        a00.c = this.b;
        k k0 = this.c;
        if(k0 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        a00.d = k0;
        a00.e = (long)this.d;
        a00.f = (long)this.e;
        a00.g = new HashMap(this.f);
        return a00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof h && this.a.equals(((h)object0).a)) {
            Integer integer0 = ((h)object0).b;
            Integer integer1 = this.b;
            if(integer1 == null) {
                return integer0 == null ? this.c.equals(((h)object0).c) && this.d == ((h)object0).d && this.e == ((h)object0).e && this.f.equals(((h)object0).f) : false;
            }
            return integer1.equals(integer0) ? this.c.equals(((h)object0).c) && this.d == ((h)object0).d && this.e == ((h)object0).e && this.f.equals(((h)object0).f) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? ((((v ^ 1000003) * 0xD5009D89 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode() : (((((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}

