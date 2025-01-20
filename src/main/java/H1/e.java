package h1;

import java.util.Arrays;

public final class e implements Comparable {
    public boolean X;
    public int Y;
    public int Z;
    public int b0;
    public float c0;
    public boolean d0;
    public final float[] e0;
    public final float[] f0;
    public b[] g0;
    public int h0;
    public int i0;
    public int j0;

    public e(int v) {
        this.Y = -1;
        this.Z = -1;
        this.b0 = 0;
        this.d0 = false;
        this.e0 = new float[9];
        this.f0 = new float[9];
        this.g0 = new b[16];
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = v;
    }

    public final void a(b b0) {
        for(int v = 0; true; ++v) {
            int v1 = this.h0;
            if(v >= v1) {
                break;
            }
            if(this.g0[v] == b0) {
                return;
            }
        }
        b[] arr_b = this.g0;
        if(v1 >= arr_b.length) {
            this.g0 = (b[])Arrays.copyOf(arr_b, arr_b.length * 2);
        }
        int v2 = this.h0;
        this.g0[v2] = b0;
        this.h0 = v2 + 1;
    }

    public final void b(b b0) {
        int v = this.h0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.g0[v1] == b0) {
                while(v1 < v - 1) {
                    this.g0[v1] = this.g0[v1 + 1];
                    ++v1;
                }
                --this.h0;
                return;
            }
        }
    }

    public final void c() {
        this.j0 = 5;
        this.b0 = 0;
        this.Y = -1;
        this.Z = -1;
        this.c0 = 0.0f;
        this.d0 = false;
        int v = this.h0;
        for(int v1 = 0; v1 < v; ++v1) {
            this.g0[v1] = null;
        }
        this.h0 = 0;
        this.i0 = 0;
        this.X = false;
        Arrays.fill(this.f0, 0.0f);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.Y - ((e)object0).Y;
    }

    public final void d(c c0, float f) {
        this.c0 = f;
        this.d0 = true;
        int v = this.h0;
        this.Z = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            this.g0[v1].h(c0, this, false);
        }
        this.h0 = 0;
    }

    public final void e(c c0, b b0) {
        int v = this.h0;
        for(int v1 = 0; v1 < v; ++v1) {
            this.g0[v1].i(c0, b0, false);
        }
        this.h0 = 0;
    }

    @Override
    public final String toString() {
        return "" + this.Y;
    }
}

