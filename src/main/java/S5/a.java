package s5;

import Y8.o;
import v.h;

public final class a {
    public final int a;
    public final long b;

    public a(int v, long v1) {
        if(v == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = v;
        this.b = v1;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof a && (h.b(this.a, ((a)object0).a) && this.b == ((a)object0).b);
    }

    @Override
    public final int hashCode() {
        return (h.d(this.a) ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("BackendResponse{status=");
        switch(this.a) {
            case 1: {
                s = "OK";
                break;
            }
            case 2: {
                s = "TRANSIENT_ERROR";
                break;
            }
            case 3: {
                s = "FATAL_ERROR";
                break;
            }
            case 4: {
                s = "INVALID_PAYLOAD";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", nextRequestWaitMillis=");
        return o.w(this.b, "}", stringBuilder0);
    }
}

