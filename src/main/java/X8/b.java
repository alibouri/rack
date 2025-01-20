package x8;

import java.util.Arrays;

public final class b implements Cloneable {
    public final int X;
    public final int Y;
    public final int Z;
    public final int[] b0;

    public b(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.X = v;
        this.Y = v1;
        int v2 = (v + 0x1F) / 0x20;
        this.Z = v2;
        this.b0 = new int[v2 * v1];
    }

    public b(int v, int v1, int v2, int[] arr_v) {
        this.X = v;
        this.Y = v1;
        this.Z = v2;
        this.b0 = arr_v;
    }

    public final void b(int v, int v1) {
        int v2 = v / 0x20 + v1 * this.Z;
        this.b0[v2] ^= 1 << (v & 0x1F);
    }

    public final boolean c(int v, int v1) {
        return (this.b0[v / 0x20 + v1 * this.Z] >>> (v & 0x1F) & 1) != 0;
    }

    @Override
    public final Object clone() {
        int[] arr_v = (int[])this.b0.clone();
        return new b(this.X, this.Y, this.Z, arr_v);
    }

    public final int[] d() {
        int[] arr_v = this.b0;
        int v;
        for(v = arr_v.length - 1; v >= 0 && arr_v[v] == 0; --v) {
        }
        if(v < 0) {
            return null;
        }
        int v1 = v / this.Z;
        int v2 = v % this.Z << 5;
        int v3 = arr_v[v];
        int v4;
        for(v4 = 0x1F; v3 >>> v4 == 0; --v4) {
        }
        return new int[]{v2 + v4, v1};
    }

    public final a e(a a0, int v) {
        int v2 = this.X;
        if(a0.Y < v2) {
            a0 = new a(v2);
        }
        else {
            for(int v3 = 0; v3 < a0.X.length; ++v3) {
                a0.X[v3] = 0;
            }
        }
        int v4 = this.Z;
        for(int v1 = 0; v1 < v4; ++v1) {
            a0.X[(v1 << 5) / 0x20] = this.b0[v * v4 + v1];
        }
        return a0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b ? this.X == ((b)object0).X && this.Y == ((b)object0).Y && this.Z == ((b)object0).Z && Arrays.equals(this.b0, ((b)object0).b0) : false;
    }

    public final int[] f() {
        int[] arr_v;
        int v = 0;
        int v1;
        for(v1 = 0; true; ++v1) {
            arr_v = this.b0;
            if(v1 >= arr_v.length || arr_v[v1] != 0) {
                break;
            }
        }
        if(v1 == arr_v.length) {
            return null;
        }
        int v2 = v1 / this.Z;
        int v3 = v1 % this.Z << 5;
        int v4 = arr_v[v1];
        while(v4 << 0x1F - v == 0) {
            ++v;
        }
        return new int[]{v3 + v, v2};
    }

    public final void g(int v, int v1) {
        int v2 = v / 0x20 + v1 * this.Z;
        this.b0[v2] |= 1 << (v & 0x1F);
    }

    public final void h(int v, int v1, int v2, int v3) {
        if(v1 < 0 || v < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if(v3 <= 0 || v2 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int v4 = v2 + v;
        int v5 = v3 + v1;
        if(v5 > this.Y || v4 > this.X) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while(v1 < v5) {
            int v6 = this.Z * v1;
            for(int v7 = v; v7 < v4; ++v7) {
                int v8 = v7 / 0x20 + v6;
                this.b0[v8] |= 1 << (v7 & 0x1F);
            }
            ++v1;
        }
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.b0) + (((this.X * 0x1F + this.X) * 0x1F + this.Y) * 0x1F + this.Z) * 0x1F;
    }

    @Override
    public final String toString() {
        int v = this.X;
        int v1 = this.Y;
        StringBuilder stringBuilder0 = new StringBuilder((v + 1) * v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            for(int v3 = 0; v3 < v; ++v3) {
                stringBuilder0.append((this.c(v3, v2) ? "X " : "  "));
            }
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }
}

