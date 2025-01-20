package T8;

public final class p {
    public final byte[] a;
    public int b;
    public int c;

    public p(byte[] arr_b) {
        this.a = arr_b;
    }

    public p(byte[] arr_b, int v, int v1) {
        this.a = arr_b;
        this.b = v;
        this.c = v1;
    }

    public int a() {
        return (this.a.length - this.b) * 8 - this.c;
    }

    public int b(int v) {
        if(v <= 0 || v > 0x20 || v > this.a()) {
            throw new IllegalArgumentException(String.valueOf(v));
        }
        int v1 = this.c;
        int v2 = 0;
        byte[] arr_b = this.a;
        if(v1 > 0) {
            int v3 = v >= 8 - v1 ? 8 - v1 : v;
            int v4 = 8 - v1 - v3;
            int v5 = this.b;
            int v6 = (0xFF >> 8 - v3 << v4 & arr_b[v5]) >> v4;
            v -= v3;
            int v7 = v1 + v3;
            this.c = v7;
            if(v7 == 8) {
                this.c = 0;
                this.b = v5 + 1;
            }
            v2 = v6;
        }
        if(v > 0) {
            while(v >= 8) {
                int v8 = this.b;
                this.b = v8 + 1;
                v += -8;
                v2 = v2 << 8 | arr_b[v8] & 0xFF;
            }
            if(v > 0) {
                v2 = v2 << v | (arr_b[this.b] & 0xFF >> 8 - v << 8 - v) >> 8 - v;
                this.c += v;
            }
        }
        return v2;
    }
}

