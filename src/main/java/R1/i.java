package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintSet;

public final class i {
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public float d0;
    public int e;
    public float e0;
    public float f;
    public int f0;
    public boolean g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int[] i0;
    public int j;
    public String j0;
    public int k;
    public String k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public int o0;
    public int p;
    public static final SparseIntArray p0;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public int z;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        i.p0 = sparseIntArray0;
        sparseIntArray0.append(43, 24);
        sparseIntArray0.append(44, 25);
        sparseIntArray0.append(46, 28);
        sparseIntArray0.append(0x2F, 29);
        sparseIntArray0.append(52, 35);
        sparseIntArray0.append(51, 34);
        sparseIntArray0.append(24, 4);
        sparseIntArray0.append(23, 3);
        sparseIntArray0.append(19, 1);
        sparseIntArray0.append(61, 6);
        sparseIntArray0.append(62, 7);
        sparseIntArray0.append(0x1F, 17);
        sparseIntArray0.append(0x20, 18);
        sparseIntArray0.append(33, 19);
        sparseIntArray0.append(15, 90);
        sparseIntArray0.append(0, 26);
        sparseIntArray0.append(0x30, 0x1F);
        sparseIntArray0.append(49, 0x20);
        sparseIntArray0.append(30, 10);
        sparseIntArray0.append(29, 9);
        sparseIntArray0.append(66, 13);
        sparseIntArray0.append(69, 16);
        sparseIntArray0.append(67, 14);
        sparseIntArray0.append(0x40, 11);
        sparseIntArray0.append(68, 15);
        sparseIntArray0.append(65, 12);
        sparseIntArray0.append(55, 38);
        sparseIntArray0.append(41, 37);
        sparseIntArray0.append(40, 39);
        sparseIntArray0.append(54, 40);
        sparseIntArray0.append(39, 20);
        sparseIntArray0.append(53, 36);
        sparseIntArray0.append(28, 5);
        sparseIntArray0.append(42, 91);
        sparseIntArray0.append(50, 91);
        sparseIntArray0.append(45, 91);
        sparseIntArray0.append(22, 91);
        sparseIntArray0.append(18, 91);
        sparseIntArray0.append(3, 23);
        sparseIntArray0.append(5, 27);
        sparseIntArray0.append(7, 30);
        sparseIntArray0.append(8, 8);
        sparseIntArray0.append(4, 33);
        sparseIntArray0.append(6, 2);
        sparseIntArray0.append(1, 22);
        sparseIntArray0.append(2, 21);
        sparseIntArray0.append(56, 41);
        sparseIntArray0.append(34, 42);
        sparseIntArray0.append(17, 87);
        sparseIntArray0.append(16, 88);
        sparseIntArray0.append(71, 76);
        sparseIntArray0.append(25, 61);
        sparseIntArray0.append(27, 62);
        sparseIntArray0.append(26, 0x3F);
        sparseIntArray0.append(60, 69);
        sparseIntArray0.append(38, 70);
        sparseIntArray0.append(12, 71);
        sparseIntArray0.append(10, 72);
        sparseIntArray0.append(11, 73);
        sparseIntArray0.append(13, 74);
        sparseIntArray0.append(9, 75);
        sparseIntArray0.append(58, 84);
        sparseIntArray0.append(59, 86);
        sparseIntArray0.append(58, 83);
        sparseIntArray0.append(37, 85);
        sparseIntArray0.append(56, 87);
        sparseIntArray0.append(34, 88);
        sparseIntArray0.append(91, 89);
        sparseIntArray0.append(15, 90);
    }

    public final void a(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, n.e);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = i.p0;
            switch(sparseIntArray0.get(v2)) {
                case 1: {
                    this.p = ConstraintSet.f(typedArray0, v2, this.p);
                    break;
                }
                case 2: {
                    this.I = typedArray0.getDimensionPixelSize(v2, this.I);
                    break;
                }
                case 3: {
                    this.o = ConstraintSet.f(typedArray0, v2, this.o);
                    break;
                }
                case 4: {
                    this.n = ConstraintSet.f(typedArray0, v2, this.n);
                    break;
                }
                case 5: {
                    this.y = typedArray0.getString(v2);
                    break;
                }
                case 6: {
                    this.C = typedArray0.getDimensionPixelOffset(v2, this.C);
                    break;
                }
                case 7: {
                    this.D = typedArray0.getDimensionPixelOffset(v2, this.D);
                    break;
                }
                case 8: {
                    this.J = typedArray0.getDimensionPixelSize(v2, this.J);
                    break;
                }
                case 9: {
                    this.v = ConstraintSet.f(typedArray0, v2, this.v);
                    break;
                }
                case 10: {
                    this.u = ConstraintSet.f(typedArray0, v2, this.u);
                    break;
                }
                case 11: {
                    this.P = typedArray0.getDimensionPixelSize(v2, this.P);
                    break;
                }
                case 12: {
                    this.Q = typedArray0.getDimensionPixelSize(v2, this.Q);
                    break;
                }
                case 13: {
                    this.M = typedArray0.getDimensionPixelSize(v2, this.M);
                    break;
                }
                case 14: {
                    this.O = typedArray0.getDimensionPixelSize(v2, this.O);
                    break;
                }
                case 15: {
                    this.R = typedArray0.getDimensionPixelSize(v2, this.R);
                    break;
                }
                case 16: {
                    this.N = typedArray0.getDimensionPixelSize(v2, this.N);
                    break;
                }
                case 17: {
                    this.d = typedArray0.getDimensionPixelOffset(v2, this.d);
                    break;
                }
                case 18: {
                    this.e = typedArray0.getDimensionPixelOffset(v2, this.e);
                    break;
                }
                case 19: {
                    this.f = typedArray0.getFloat(v2, this.f);
                    break;
                }
                case 20: {
                    this.w = typedArray0.getFloat(v2, this.w);
                    break;
                }
                case 21: {
                    this.c = typedArray0.getLayoutDimension(v2, this.c);
                    break;
                }
                case 22: {
                    this.b = typedArray0.getLayoutDimension(v2, this.b);
                    break;
                }
                case 23: {
                    this.F = typedArray0.getDimensionPixelSize(v2, this.F);
                    break;
                }
                case 24: {
                    this.h = ConstraintSet.f(typedArray0, v2, this.h);
                    break;
                }
                case 25: {
                    this.i = ConstraintSet.f(typedArray0, v2, this.i);
                    break;
                }
                case 26: {
                    this.E = typedArray0.getInt(v2, this.E);
                    break;
                }
                case 27: {
                    this.G = typedArray0.getDimensionPixelSize(v2, this.G);
                    break;
                }
                case 28: {
                    this.j = ConstraintSet.f(typedArray0, v2, this.j);
                    break;
                }
                case 29: {
                    this.k = ConstraintSet.f(typedArray0, v2, this.k);
                    break;
                }
                case 30: {
                    this.K = typedArray0.getDimensionPixelSize(v2, this.K);
                    break;
                }
                case 0x1F: {
                    this.s = ConstraintSet.f(typedArray0, v2, this.s);
                    break;
                }
                case 0x20: {
                    this.t = ConstraintSet.f(typedArray0, v2, this.t);
                    break;
                }
                case 33: {
                    this.H = typedArray0.getDimensionPixelSize(v2, this.H);
                    break;
                }
                case 34: {
                    this.m = ConstraintSet.f(typedArray0, v2, this.m);
                    break;
                }
                case 35: {
                    this.l = ConstraintSet.f(typedArray0, v2, this.l);
                    break;
                }
                case 36: {
                    this.x = typedArray0.getFloat(v2, this.x);
                    break;
                }
                case 37: {
                    this.U = typedArray0.getFloat(v2, this.U);
                    break;
                }
                case 38: {
                    this.T = typedArray0.getFloat(v2, this.T);
                    break;
                }
                case 39: {
                    this.V = typedArray0.getInt(v2, this.V);
                    break;
                }
                case 40: {
                    this.W = typedArray0.getInt(v2, this.W);
                    break;
                }
                case 41: {
                    ConstraintSet.g(this, typedArray0, v2, 0);
                    break;
                }
                case 42: {
                    ConstraintSet.g(this, typedArray0, v2, 1);
                    break;
                }
                case 61: {
                    this.z = ConstraintSet.f(typedArray0, v2, this.z);
                    break;
                }
                case 62: {
                    this.A = typedArray0.getDimensionPixelSize(v2, this.A);
                    break;
                }
                case 0x3F: {
                    this.B = typedArray0.getFloat(v2, this.B);
                    break;
                }
                case 69: {
                    this.d0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 70: {
                    this.e0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 72: {
                    this.f0 = typedArray0.getInt(v2, this.f0);
                    break;
                }
                case 73: {
                    this.g0 = typedArray0.getDimensionPixelSize(v2, this.g0);
                    break;
                }
                case 74: {
                    this.j0 = typedArray0.getString(v2);
                    break;
                }
                case 75: {
                    this.n0 = typedArray0.getBoolean(v2, this.n0);
                    break;
                }
                case 76: {
                    this.o0 = typedArray0.getInt(v2, this.o0);
                    break;
                }
                case 77: {
                    this.q = ConstraintSet.f(typedArray0, v2, this.q);
                    break;
                }
                case 78: {
                    this.r = ConstraintSet.f(typedArray0, v2, this.r);
                    break;
                }
                case 0x4F: {
                    this.S = typedArray0.getDimensionPixelSize(v2, this.S);
                    break;
                }
                case 80: {
                    this.L = typedArray0.getDimensionPixelSize(v2, this.L);
                    break;
                }
                case 81: {
                    this.X = typedArray0.getInt(v2, this.X);
                    break;
                }
                case 82: {
                    this.Y = typedArray0.getInt(v2, this.Y);
                    break;
                }
                case 83: {
                    this.a0 = typedArray0.getDimensionPixelSize(v2, this.a0);
                    break;
                }
                case 84: {
                    this.Z = typedArray0.getDimensionPixelSize(v2, this.Z);
                    break;
                }
                case 85: {
                    this.c0 = typedArray0.getDimensionPixelSize(v2, this.c0);
                    break;
                }
                case 86: {
                    this.b0 = typedArray0.getDimensionPixelSize(v2, this.b0);
                    break;
                }
                case 87: {
                    this.l0 = typedArray0.getBoolean(v2, this.l0);
                    break;
                }
                case 88: {
                    this.m0 = typedArray0.getBoolean(v2, this.m0);
                    break;
                }
                case 89: {
                    this.k0 = typedArray0.getString(v2);
                    break;
                }
                case 90: {
                    this.g = typedArray0.getBoolean(v2, this.g);
                    break;
                }
                case 91: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
        typedArray0.recycle();
    }
}

