package X1;

import R2.h;
import Y1.a;
import Y1.b;
import java.nio.ByteBuffer;

public final class u {
    public final int a;
    public final h b;
    public volatile int c;
    public static final ThreadLocal d;

    static {
        u.d = new ThreadLocal();
    }

    public u(h h0, int v) {
        this.c = 0;
        this.b = h0;
        this.a = v;
    }

    public final int a(int v) {
        a a0 = this.c();
        int v1 = a0.a(16);
        if(v1 != 0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)a0.b0;
            int v2 = v1 + a0.X;
            return byteBuffer0.getInt(v * 4 + (byteBuffer0.getInt(v2) + v2 + 4));
        }
        return 0;
    }

    public final int b() {
        a a0 = this.c();
        int v = a0.a(16);
        if(v != 0) {
            int v1 = v + a0.X;
            int v2 = ((ByteBuffer)a0.b0).getInt(v1);
            return ((ByteBuffer)a0.b0).getInt(v2 + v1);
        }
        return 0;
    }

    public final a c() {
        ThreadLocal threadLocal0 = u.d;
        a a0 = (a)threadLocal0.get();
        if(a0 == null) {
            a0 = new a();  // initializer: LCb/f;-><init>()V
            threadLocal0.set(a0);
        }
        b b0 = (b)this.b.a;
        int v = b0.a(6);
        if(v != 0) {
            int v1 = v + b0.X;
            int v2 = ((ByteBuffer)b0.b0).getInt(v1);
            int v3 = this.a * 4 + (v2 + v1 + 4);
            int v4 = ((ByteBuffer)b0.b0).getInt(v3) + v3;
            ByteBuffer byteBuffer0 = (ByteBuffer)b0.b0;
            a0.b0 = byteBuffer0;
            if(byteBuffer0 != null) {
                a0.X = v4;
                int v5 = v4 - byteBuffer0.getInt(v4);
                a0.Y = v5;
                a0.Z = ((ByteBuffer)a0.b0).getShort(v5);
                return a0;
            }
            a0.X = 0;
            a0.Y = 0;
            a0.Z = 0;
        }
        return a0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(", id:");
        a a0 = this.c();
        int v = a0.a(4);
        stringBuilder0.append(Integer.toHexString((v == 0 ? 0 : ((ByteBuffer)a0.b0).getInt(v + a0.X))));
        stringBuilder0.append(", codepoints:");
        int v2 = this.b();
        for(int v1 = 0; v1 < v2; ++v1) {
            stringBuilder0.append(Integer.toHexString(this.a(v1)));
            stringBuilder0.append(" ");
        }
        return stringBuilder0.toString();
    }
}

