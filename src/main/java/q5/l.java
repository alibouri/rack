package q5;

import java.util.ArrayList;

public final class l extends s {
    public final long a;
    public final long b;
    public final j c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public l(long v, long v1, j j0, Integer integer0, String s, ArrayList arrayList0) {
        this.a = v;
        this.b = v1;
        this.c = j0;
        this.d = integer0;
        this.e = s;
        this.f = arrayList0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof s && (this.a == ((l)(((s)object0))).a && this.b == ((l)(((s)object0))).b && this.c.equals(((l)(((s)object0))).c))) {
            Integer integer0 = ((l)(((s)object0))).d;
            Integer integer1 = this.d;
            if(integer1 != null) {
                if(integer1.equals(integer0)) {
                label_9:
                    String s = ((l)(((s)object0))).e;
                    String s1 = this.e;
                    if(s1 == null) {
                        return s == null ? this.f.equals(((l)(((s)object0))).f) && w.X.equals(w.X) : false;
                    }
                    return s1.equals(s) ? this.f.equals(((l)(((s)object0))).f) && w.X.equals(w.X) : false;
                }
            }
            else if(integer0 == null) {
                goto label_9;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ this.c.hashCode()) * 1000003;
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((v ^ v2) * 1000003 ^ v1) * 1000003 ^ this.f.hashCode()) * 1000003 ^ w.X.hashCode();
    }

    @Override
    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + w.X + "}";
    }
}

