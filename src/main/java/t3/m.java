package t3;

import A3.b;
import M4.s;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import r3.j;
import u3.a;
import u3.e;
import u3.f;
import z3.h;

public final class m implements c, l, a {
    public final Path a;
    public final Path b;
    public final PathMeasure c;
    public final float[] d;
    public final j e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final f i;
    public final e j;
    public final f k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final s p;
    public boolean q;

    public m(j j0, b b0, h h0) {
        this.a = new Path();
        this.b = new Path();
        this.c = new PathMeasure();
        this.d = new float[2];
        this.p = new s(5, false);
        this.e = j0;
        h0.getClass();
        int v = h0.a;
        this.f = v;
        this.g = h0.i;
        this.h = h0.j;
        f f0 = h0.b.r();
        this.i = f0;
        e e0 = h0.c.e();
        this.j = e0;
        f f1 = h0.d.r();
        this.k = f1;
        f f2 = h0.f.r();
        this.m = f2;
        f f3 = h0.h.r();
        this.o = f3;
        if(v == 1) {
            this.l = h0.e.r();
            this.n = h0.g.r();
        }
        else {
            this.l = null;
            this.n = null;
        }
        b0.d(f0);
        b0.d(e0);
        b0.d(f1);
        b0.d(f2);
        b0.d(f3);
        if(v == 1) {
            b0.d(this.l);
            b0.d(this.n);
        }
        f0.a(this);
        e0.a(this);
        f1.a(this);
        f2.a(this);
        f3.a(this);
        if(v == 1) {
            this.l.a(this);
            this.n.a(this);
        }
    }

    @Override  // u3.a
    public final void b() {
        this.q = false;
        this.e.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        for(int v = 0; v < ((ArrayList)list0).size(); ++v) {
            c c0 = (c)((ArrayList)list0).get(v);
            if(c0 instanceof t3.s && ((t3.s)c0).c == 1) {
                this.p.X.add(((t3.s)c0));
                ((t3.s)c0).d(this);
            }
        }
    }

    @Override  // t3.l
    public final Path getPath() {
        float f69;
        int v7;
        double f56;
        float f36;
        float f35;
        float f34;
        float f33;
        float f32;
        float f31;
        float f30;
        float f27;
        float f26;
        double f19;
        float f18;
        float f17;
        float f16;
        Path path0 = this.a;
        if(this.q) {
            return path0;
        }
        path0.reset();
        if(this.g) {
            this.q = true;
            return path0;
        }
        int v = v.h.d(this.f);
        e e0 = this.j;
        f f0 = this.m;
        f f1 = this.o;
        double f2 = 0.0;
        f f3 = this.k;
        f f4 = this.i;
        switch(v) {
            case 0: {
                float f5 = (float)(((Float)f4.d()));
                if(f3 != null) {
                    f2 = (double)(((float)(((Float)f3.d()))));
                }
                double f6 = Math.toRadians(f2 - 90.0);
                float f7 = (float)(6.283185 / ((double)f5));
                if(this.h) {
                    f7 *= -1.0f;
                }
                float f8 = f7;
                float f9 = f8 / 2.0f;
                float f10 = f5 - ((float)(((int)f5)));
                int v1 = Float.compare(f10, 0.0f);
                if(v1 != 0) {
                    f6 += (double)((1.0f - f10) * f9);
                }
                float f11 = (float)(((Float)f0.d()));
                float f12 = (float)(((Float)this.l.d()));
                float f13 = this.n == null ? 0.0f : ((float)(((Float)this.n.d()))) / 100.0f;
                float f14 = f1 == null ? 0.0f : ((float)(((Float)f1.d()))) / 100.0f;
                if(v1 == 0) {
                    float f20 = (float)(Math.cos(f6) * ((double)f11));
                    float f21 = (float)(((double)f11) * Math.sin(f6));
                    path0.moveTo(f20, f21);
                    f19 = f6 + ((double)f9);
                    f17 = f20;
                    f18 = f21;
                    f16 = 0.0f;
                }
                else {
                    float f15 = m5.b.o(f11, f12, f10, f12);
                    f16 = f15;
                    f17 = (float)(Math.cos(f6) * ((double)f15));
                    f18 = (float)(Math.sin(f6) * ((double)f15));
                    path0.moveTo(f17, f18);
                    f19 = f6 + ((double)(f8 * f10 / 2.0f));
                }
                double f22 = Math.ceil(f5);
                double f23 = f19;
                int v2 = 0;
                int v3 = 0;
                while(((double)v2) < f22 * 2.0) {
                    float f24 = v3 == 0 ? f12 : f11;
                    int v4 = Float.compare(f16, 0.0f);
                    float f25 = v4 == 0 || ((double)v2) != f22 * 2.0 - 2.0 ? f9 : f8 * f10 / 2.0f;
                    if(v4 == 0 || ((double)v2) != f22 * 2.0 - 1.0) {
                        f26 = f12;
                        f27 = f11;
                    }
                    else {
                        f26 = f12;
                        f27 = f11;
                        f24 = f16;
                    }
                    float f28 = (float)(Math.cos(f23) * ((double)f24));
                    float f29 = (float)(((double)f24) * Math.sin(f23));
                    if(f13 != 0.0f || f14 != 0.0f) {
                        f30 = f8;
                        double f37 = (double)(((float)(Math.atan2(f18, f17) - 1.570796)));
                        f31 = f29;
                        double f38 = (double)(((float)(Math.atan2(f29, f28) - 1.570796)));
                        float f39 = (v3 == 0 ? f27 : f26) * (v3 == 0 ? f14 : f13) * 0.47829f;
                        float f40 = ((float)Math.cos(f37)) * f39;
                        float f41 = f39 * ((float)Math.sin(f37));
                        float f42 = (v3 == 0 ? f26 : f27) * (v3 == 0 ? f13 : f14) * 0.47829f;
                        float f43 = ((float)Math.cos(f38)) * f42;
                        float f44 = f42 * ((float)Math.sin(f38));
                        if(v1 != 0) {
                            if(v2 == 0) {
                                f40 *= f10;
                                f41 *= f10;
                            }
                            else if(((double)v2) == f22 * 2.0 - 1.0) {
                                f43 *= f10;
                                f44 *= f10;
                            }
                        }
                        f32 = f26;
                        f33 = f27;
                        f34 = f9;
                        f36 = f10;
                        path0.cubicTo(f17 - f40, f18 - f41, f28 + f43, f31 + f44, f28, f31);
                        f35 = f25;
                    }
                    else {
                        path0.lineTo(f28, f29);
                        f30 = f8;
                        f31 = f29;
                        f32 = f26;
                        f33 = f27;
                        f34 = f9;
                        f35 = f25;
                        f36 = f10;
                    }
                    f23 += (double)f35;
                    v3 ^= 1;
                    ++v2;
                    f12 = f32;
                    f11 = f33;
                    f10 = f36;
                    f17 = f28;
                    f9 = f34;
                    f8 = f30;
                    f18 = f31;
                }
                PointF pointF0 = (PointF)e0.d();
                path0.offset(pointF0.x, pointF0.y);
                path0.close();
                break;
            }
            case 1: {
                int v5 = (int)Math.floor(((float)(((Float)f4.d()))));
                if(f3 != null) {
                    f2 = (double)(((float)(((Float)f3.d()))));
                }
                double f45 = Math.toRadians(f2 - 90.0);
                float f46 = (float)(((Float)f1.d()));
                float f47 = (float)(((Float)f0.d()));
                double f48 = (double)f47;
                float f49 = (float)(Math.cos(f45) * f48);
                float f50 = (float)(Math.sin(f45) * f48);
                path0.moveTo(f49, f50);
                double f51 = (double)(((float)(6.283185 / ((double)v5))));
                double f52 = Math.ceil(v5);
                double f53 = f45 + f51;
                int v6 = 0;
                while(((double)v6) < f52) {
                    float f54 = (float)(Math.cos(f53) * f48);
                    float f55 = (float)(Math.sin(f53) * f48);
                    if(f46 / 100.0f == 0.0f) {
                        v7 = v6;
                        f56 = f48;
                        f69 = f47;
                        if(((double)v6) != f52 - 1.0) {
                            path0.lineTo(f54, f55);
                            f53 += f51;
                        }
                    }
                    else {
                        f56 = f48;
                        double f57 = (double)(((float)(Math.atan2(f50, f49) - 1.570796)));
                        v7 = v6;
                        double f58 = (double)(((float)(Math.atan2(f55, f54) - 1.570796)));
                        float f59 = f47 * (f46 / 100.0f) * 0.25f;
                        float f60 = ((float)Math.cos(f57)) * f59;
                        float f61 = ((float)Math.sin(f57)) * f59;
                        float f62 = ((float)Math.cos(f58)) * f59;
                        float f63 = f59 * ((float)Math.sin(f58));
                        if(((double)v6) == f52 - 1.0) {
                            this.b.reset();
                            this.b.moveTo(f49, f50);
                            float f64 = f49 - f60;
                            float f65 = f50 - f61;
                            float f66 = f62 + f54;
                            float f67 = f55 + f63;
                            this.b.cubicTo(f64, f65, f66, f67, f54, f55);
                            this.c.setPath(this.b, false);
                            float f68 = this.c.getLength();
                            f69 = f47;
                            this.c.getPosTan(f68 * 0.9999f, this.d, null);
                            path0.cubicTo(f64, f65, f66, f67, this.d[0], this.d[1]);
                        }
                        else {
                            f69 = f47;
                            path0.cubicTo(f49 - f60, f50 - f61, f54 + f62, f55 + f63, f54, f55);
                        }
                        f53 += f51;
                    }
                    v6 = v7 + 1;
                    f49 = f54;
                    f50 = f55;
                    f47 = f69;
                    f48 = f56;
                    f51 = f51;
                }
                PointF pointF1 = (PointF)e0.d();
                path0.offset(pointF1.x, pointF1.y);
                path0.close();
            }
        }
        path0.close();
        this.p.i(path0);
        this.q = true;
        return path0;
    }
}

