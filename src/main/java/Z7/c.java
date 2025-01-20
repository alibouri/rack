package Z7;

import Y8.o;

public final class c extends e {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public c(String s, String s1, String s2, String s3, long v) {
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v;
    }

    // Deobfuscation rating: MEDIUM(60)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof e && (this.b.equals(((c)(((e)object0))).b) && this.c.equals(((c)(((e)object0))).c) && this.d.equals(((c)(((e)object0))).d) && this.e.equals(((c)(((e)object0))).e) && this.f == ((c)(((e)object0))).f);
    }

    @Override
    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ ((int)(this.f >>> 0x20 ^ this.f));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RolloutAssignment{rolloutId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", variantId=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", parameterKey=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", parameterValue=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", templateVersion=");
        return o.w(this.f, "}", stringBuilder0);
    }
}

