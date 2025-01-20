package r1;

import android.view.ViewGroup.MarginLayoutParams;
import o1.h;

public final class d extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public o1.d p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int v = this.width;
        if(v == -2 && this.W) {
            this.a0 = false;
            if(this.L == 0) {
                this.L = 1;
            }
        }
        int v1 = this.height;
        if(v1 == -2 && this.X) {
            this.b0 = false;
            if(this.M == 0) {
                this.M = 1;
            }
        }
        if(v == -1 || v == 0) {
            this.a0 = false;
            if(v == 0 && this.L == 1) {
                this.width = -2;
                this.W = true;
            }
        }
        if(v1 == -1 || v1 == 0) {
            this.b0 = false;
            if(v1 == 0 && this.M == 1) {
                this.height = -2;
                this.X = true;
            }
        }
        if(this.c == -1.0f || this.a == -1 || this.b != -1) {
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if(!(this.p0 instanceof h)) {
                this.p0 = new h();
            }
            ((h)this.p0).W(this.V);
        }
    }

    @Override  // android.view.ViewGroup$MarginLayoutParams
    public final void resolveLayoutDirection(int v) {
        int v1 = this.leftMargin;
        int v2 = this.rightMargin;
        super.resolveLayoutDirection(v);
        boolean z = false;
        boolean z1 = 1 == this.getLayoutDirection();
        this.h0 = -1;
        this.i0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = this.w;
        this.k0 = this.y;
        float f = this.E;
        this.l0 = f;
        int v3 = this.a;
        this.m0 = v3;
        int v4 = this.b;
        this.n0 = v4;
        float f1 = this.c;
        this.o0 = f1;
        if(z1) {
            int v5 = this.s;
            if(v5 == -1) {
                int v6 = this.t;
                if(v6 != -1) {
                    this.i0 = v6;
                    z = true;
                }
            }
            else {
                this.h0 = v5;
                z = true;
            }
            int v7 = this.u;
            if(v7 != -1) {
                this.g0 = v7;
                z = true;
            }
            int v8 = this.v;
            if(v8 != -1) {
                this.f0 = v8;
                z = true;
            }
            int v9 = this.A;
            if(v9 != 0x80000000) {
                this.k0 = v9;
            }
            int v10 = this.B;
            if(v10 != 0x80000000) {
                this.j0 = v10;
            }
            if(z) {
                this.l0 = 1.0f - f;
            }
            if(this.d0 && this.V == 1 && this.d) {
                if(f1 != -1.0f) {
                    this.o0 = 1.0f - f1;
                    this.m0 = -1;
                    this.n0 = -1;
                }
                else if(v3 != -1) {
                    this.n0 = v3;
                    this.m0 = -1;
                    this.o0 = -1.0f;
                }
                else if(v4 != -1) {
                    this.m0 = v4;
                    this.n0 = -1;
                    this.o0 = -1.0f;
                }
            }
        }
        else {
            int v11 = this.s;
            if(v11 != -1) {
                this.g0 = v11;
            }
            int v12 = this.t;
            if(v12 != -1) {
                this.f0 = v12;
            }
            int v13 = this.u;
            if(v13 != -1) {
                this.h0 = v13;
            }
            int v14 = this.v;
            if(v14 != -1) {
                this.i0 = v14;
            }
            int v15 = this.A;
            if(v15 != 0x80000000) {
                this.j0 = v15;
            }
            int v16 = this.B;
            if(v16 != 0x80000000) {
                this.k0 = v16;
            }
        }
        if(this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
            int v17 = this.g;
            if(v17 == -1) {
                int v18 = this.h;
                if(v18 != -1) {
                    this.i0 = v18;
                    if(this.rightMargin <= 0 && v2 > 0) {
                        this.rightMargin = v2;
                    }
                }
            }
            else {
                this.h0 = v17;
                if(this.rightMargin <= 0 && v2 > 0) {
                    this.rightMargin = v2;
                }
            }
            int v19 = this.e;
            if(v19 == -1) {
                int v20 = this.f;
                if(v20 != -1) {
                    this.g0 = v20;
                    if(this.leftMargin <= 0 && v1 > 0) {
                        this.leftMargin = v1;
                    }
                }
            }
            else {
                this.f0 = v19;
                if(this.leftMargin <= 0 && v1 > 0) {
                    this.leftMargin = v1;
                }
            }
        }
    }
}

