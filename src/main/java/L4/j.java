package l4;

import java.io.InputStream;
import java.util.ArrayList;

public final class j extends i {
    public final InputStream b;
    public final int c;
    public final ArrayList d;
    public boolean e;
    public long f;

    public j(InputStream inputStream0, int v) {
        this.d = new ArrayList();
        this.c = 0x800;
        this.b = inputStream0;
        this.f = -1L;
    }

    @Override  // l4.i
    public final void E(int v, int v1) {
        if(v < 0) {
            throw new a(String.format("Attempt to read from buffer using a negative index (%d)", v));  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
        }
        if(v1 < 0) {
            throw new a("Number of requested bytes must be zero or greater");  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
        }
        if(((long)v) + ((long)v1) - 1L > 0x7FFFFFFFL) {
            throw new a(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", v, v1));  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
        }
        if(!this.F(v, v1)) {
            throw new a(v, this.f, v1);
        }
    }

    public final boolean F(int v, int v1) {
        if(v >= 0 && v1 >= 0) {
            long v2 = ((long)v) + ((long)v1) - 1L;
            if(v2 > 0x7FFFFFFFL) {
                return false;
            }
            if(this.e) {
                return ((long)(((int)v2))) < this.f;
            }
            int v3 = this.c;
            while(true) {
                ArrayList arrayList0 = this.d;
                if(((int)v2) / v3 < arrayList0.size()) {
                    break;
                }
                byte[] arr_b = new byte[v3];
                int v4 = 0;
                while(!this.e && v4 != v3) {
                    int v5 = this.b.read(arr_b, v4, v3 - v4);
                    if(v5 == -1) {
                        this.e = true;
                        int v6 = arrayList0.size() * v3 + v4;
                        if(this.f == -1L) {
                            this.f = (long)v6;
                        }
                        if(((long)(((int)v2))) < this.f) {
                            continue;
                        }
                        arrayList0.add(arr_b);
                        return false;
                    }
                    v4 += v5;
                }
                arrayList0.add(arr_b);
            }
            return true;
        }
        return false;
    }

    @Override  // l4.i
    public final byte b(int v) {
        byte[] arr_b = (byte[])this.d.get(v / this.c);
        return arr_b[v % this.c];
    }

    @Override  // l4.i
    public final byte[] d(int v, int v1) {
        this.E(v, v1);
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v1 != 0; v2 += v4) {
            int v3 = v % this.c;
            int v4 = Math.min(v1, this.c - v3);
            System.arraycopy(((byte[])this.d.get(v / this.c)), v3, arr_b, v2, v4);
            v1 -= v4;
            v += v4;
        }
        return arr_b;
    }

    @Override  // l4.i
    public final long n() {
        long v = this.f;
        if(v != -1L) {
            return v;
        }
        this.F(0x7FFFFFFF, 1);
        return this.f;
    }
}

