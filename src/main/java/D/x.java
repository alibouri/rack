package D;

import Bb.q;
import Bb.z;
import E.f;
import Nb.j;
import Q.C;
import U5.a;
import b4.A0;
import java.util.ArrayList;
import java.util.List;
import pc.r;
import pc.s;
import pc.y;
import uc.g;

public final class x {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public x(h h0) {
        this.g = h0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new u(0, 0));
        this.a = arrayList0;
        this.e = -1;
        this.h = new ArrayList();
        this.i = z.X;
    }

    public x(g g0, ArrayList arrayList0, int v, C c0, A0 a00, int v1, int v2, int v3) {
        j.f(g0, "call");
        j.f(a00, "request");
        super();
        this.g = g0;
        this.a = arrayList0;
        this.b = v;
        this.h = c0;
        this.i = a00;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    public static x a(x x0, int v, C c0, A0 a00, int v1) {
        if((v1 & 1) != 0) {
            v = x0.b;
        }
        if((v1 & 2) != 0) {
            c0 = (C)x0.h;
        }
        if((v1 & 4) != 0) {
            a00 = (A0)x0.i;
        }
        int v2 = x0.c;
        int v3 = x0.d;
        int v4 = x0.e;
        x0.getClass();
        j.f(a00, "request");
        return new x(((g)x0.g), x0.a, v, c0, a00, v2, v3, v4);
    }

    public int b() {
        return ((int)Math.sqrt(((double)this.e()) * 1.0 / ((double)this.f))) + 1;
    }

    public w c(int v) {
        boolean z = true;
        if(!((h)this.g).c) {
            int v2 = this.f;
            int v3 = v * v2;
            int v4 = this.e() - v3;
            if(v2 > v4) {
                v2 = v4;
            }
            if(v2 < 0) {
                v2 = 0;
            }
            if(v2 == ((List)this.i).size()) {
                return new w(v3, 0, this.i);
            }
            ArrayList arrayList0 = new ArrayList(v2);
            for(int v1 = 0; v1 < v2; ++v1) {
                arrayList0.add(new b(1L));
            }
            this.i = arrayList0;
            return new w(v3, 0, arrayList0);
        }
        ArrayList arrayList1 = this.a;
        int v5 = Math.min(v / this.b(), arrayList1.size() - 1);
        int v6 = this.b() * v5;
        int v7 = ((u)arrayList1.get(v5)).a;
        int v8 = ((u)arrayList1.get(v5)).b;
        int v9 = this.b;
        ArrayList arrayList2 = (ArrayList)this.h;
        if(v6 <= v9 && v9 <= v) {
            v7 = this.c;
            v8 = this.d;
            v6 = v9;
        }
        else if(v5 == this.e) {
            int v10 = v - v6;
            if(v10 < arrayList2.size()) {
                v7 = ((Number)arrayList2.get(v10)).intValue();
                v6 = v;
                v8 = 0;
            }
        }
        if(v6 % this.b() != 0 || (2 > v - v6 || v - v6 >= this.b())) {
            z = false;
        }
        if(z) {
            this.e = v5;
            arrayList2.clear();
        }
        if(v6 > v) {
            throw new IllegalStateException("currentLine > lineIndex");
        }
        while(v6 < v && v7 < this.e()) {
            if(z) {
                arrayList2.add(v7);
            }
            int v11 = 0;
            while(v11 < this.f && v7 < this.e()) {
                if(v8 == 0) {
                    v8 = this.g(v7);
                }
                v11 += v8;
                if(v11 > this.f) {
                    break;
                }
                ++v7;
                v8 = 0;
            }
            ++v6;
            if(v6 % this.b() == 0 && v7 < this.e()) {
                if(arrayList1.size() != v6 / this.b()) {
                    throw new IllegalStateException("invalid starting point");
                }
                arrayList1.add(new u(v7, v8));
            }
        }
        this.b = v;
        this.c = v7;
        this.d = v8;
        ArrayList arrayList3 = new ArrayList();
        int v12 = 0;
        int v13 = v7;
        while(v12 < this.f && v13 < this.e()) {
            if(v8 == 0) {
                v8 = this.g(v13);
            }
            v12 += v8;
            if(v12 > this.f) {
                break;
            }
            ++v13;
            arrayList3.add(new b(a.l(v8)));
            v8 = 0;
        }
        return new w(v7, 0, arrayList3);
    }

    public int d(int v) {
        int v4;
        if(this.e() <= 0) {
            return 0;
        }
        if(v >= this.e()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if(!((h)this.g).c) {
            return v / this.f;
        }
        ArrayList arrayList0 = this.a;
        Bb.x x0 = new Bb.x(v, 1);
        int v1 = arrayList0.size();
        q.R(arrayList0.size(), 0, v1);
        int v2 = v1 - 1;
        int v3 = 0;
        while(true) {
            if(v3 > v2) {
                v4 = -(v3 + 1);
                break;
            }
            v4 = v3 + v2 >>> 1;
            int v5 = ((Number)x0.n(arrayList0.get(v4))).intValue();
            if(v5 < 0) {
                v3 = v4 + 1;
            }
            else {
                if(v5 <= 0) {
                    break;
                }
                v2 = v4 - 1;
            }
        }
        if(v4 < 0) {
            v4 = -v4 - 2;
        }
        int v6 = this.b() * v4;
        int v7 = ((u)arrayList0.get(v4)).a;
        if(v7 > v) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int v8 = 0;
        while(v7 < v) {
            int v9 = this.g(v7);
            v8 += v9;
            int v10 = this.f;
            if(v8 >= v10) {
                if(v8 == v10) {
                    ++v6;
                    v8 = 0;
                }
                else {
                    ++v6;
                    v8 = v9;
                }
            }
            if(v6 % this.b() == 0 && v6 / this.b() >= arrayList0.size()) {
                arrayList0.add(new u(v7 + 1 - (v8 <= 0 ? 0 : 1), 0));
            }
            ++v7;
        }
        return this.g(v) + v8 <= this.f ? v6 : v6 + 1;
    }

    public int e() {
        return ((h)this.g).b.Y;
    }

    public y f(A0 a00) {
        j.f(a00, "request");
        ArrayList arrayList0 = this.a;
        int v = this.b;
        if(v >= arrayList0.size()) {
            throw new IllegalStateException("Check failed.");
        }
        ++this.f;
        C c0 = (C)this.h;
        if(c0 != null) {
            if(!((j1.b)c0.d).e(((r)a00.b))) {
                throw new IllegalStateException(("network interceptor " + arrayList0.get(v - 1) + " must retain the same host and port").toString());
            }
            if(this.f != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList0.get(v - 1) + " must call proceed() exactly once").toString());
            }
        }
        x x0 = x.a(this, v + 1, null, a00, 58);
        s s0 = (s)arrayList0.get(v);
        y y0 = s0.a(x0);
        if(y0 == null) {
            throw new NullPointerException("interceptor " + s0 + " returned null");
        }
        if(c0 != null && v + 1 < arrayList0.size() && x0.f != 1) {
            throw new IllegalStateException(("network interceptor " + s0 + " must call proceed() exactly once").toString());
        }
        if(y0.e0 == null) {
            throw new IllegalStateException(("interceptor " + s0 + " returned a response with no body").toString());
        }
        return y0;
    }

    public int g(int v) {
        f f0 = ((h)this.g).b.i(v);
        return (int)((b)((D.f)f0.c).b.j(v.a, ((int)(v - f0.a)))).a;
    }
}

