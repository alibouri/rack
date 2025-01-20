package q5;

import java.util.Arrays;

public final class k extends r {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final n g;

    public k(long v, Integer integer0, long v1, byte[] arr_b, String s, long v2, n n0) {
        this.a = v;
        this.b = integer0;
        this.c = v1;
        this.d = arr_b;
        this.e = s;
        this.f = v2;
        this.g = n0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof r && this.a == ((k)(((r)object0))).a) {
            Integer integer0 = this.b;
            if(integer0 != null) {
                if(integer0.equals(((k)(((r)object0))).b)) {
                label_8:
                    if(this.c == ((k)(((r)object0))).c && Arrays.equals(this.d, (((r)object0) instanceof k ? ((k)(((r)object0))).d : ((k)(((r)object0))).d))) {
                        String s = ((k)(((r)object0))).e;
                        String s1 = this.e;
                        if(s1 != null) {
                            if(s1.equals(s)) {
                            label_15:
                                if(this.f == ((k)(((r)object0))).f) {
                                    n n0 = ((k)(((r)object0))).g;
                                    return this.g == null ? n0 == null : this.g.equals(n0);
                                }
                            }
                        }
                        else if(s == null) {
                            goto label_15;
                        }
                    }
                }
            }
            else if(((k)(((r)object0))).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = Arrays.hashCode(this.d);
        int v2 = ((((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ v1) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003;
        n n0 = this.g;
        if(n0 != null) {
            v = n0.hashCode();
        }
        return v2 ^ v;
    }

    @Override
    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}

