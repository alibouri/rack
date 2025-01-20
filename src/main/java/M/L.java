package M;

import Ab.e;
import B.m0;
import Nb.j;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import m5.b;
import s.u;
import s.v;
import v.h;

public final class l implements M {
    public final u a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final boolean e;
    public final q f;

    public l(u u0, ArrayList arrayList0, int v, int v1, boolean z, q q0) {
        this.a = u0;
        this.b = arrayList0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = q0;
        if(arrayList0.size() <= 1) {
            throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList0.size() + '.').toString());
        }
    }

    @Override  // M.M
    public final boolean a() {
        return this.e;
    }

    @Override  // M.M
    public final boolean b(M m0) {
        if(this.f != null && m0 != null && m0 instanceof l && this.e == ((l)m0).e && this.c == ((l)m0).c && this.d == ((l)m0).d) {
            ArrayList arrayList0 = this.b;
            ArrayList arrayList1 = ((l)m0).b;
            if(arrayList0.size() == arrayList1.size()) {
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    o o0 = (o)arrayList0.get(v1);
                    o o1 = (o)arrayList1.get(v1);
                    o0.getClass();
                    if(o0.a != o1.a || o0.c != o1.c || o0.d != o1.d) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // M.M
    public final o c() {
        return this.e ? this.g() : this.k();
    }

    @Override  // M.M
    public final q d() {
        return this.f;
    }

    @Override  // M.M
    public final o e() {
        return this.l() == 1 ? this.k() : this.g();
    }

    @Override  // M.M
    public final void f(Function1 function10) {
        int v = this.o(this.e().a);
        int v1 = this.o((this.l() == 1 ? this.g() : this.k()).a);
        int v2 = v + 1;
        if(v2 >= v1) {
            return;
        }
        while(v2 < v1) {
            function10.n(this.b.get(v2));
            ++v2;
        }
    }

    @Override  // M.M
    public final o g() {
        int v = this.p(this.c, true);
        return (o)this.b.get(v);
    }

    @Override  // M.M
    public final int h() {
        return this.c;
    }

    @Override  // M.M
    public final int i() {
        return this.d;
    }

    @Override  // M.M
    public final v j(q q0) {
        v v1;
        p p0 = q0.a;
        long v = p0.c;
        p p1 = q0.b;
        boolean z = q0.c;
        if(Long.compare(v, p1.c) == 0) {
            if((!z || p0.b >= p1.b) && (z || p0.b > p1.b)) {
                throw new IllegalStateException(("unexpectedly miss-crossed selection: " + q0).toString());
            }
            v1 = new v();
            v1.g(v, q0);
            return v1;
        }
        v1 = new v();
        p p2 = q0.a;
        o o0 = this.e();
        int v2 = this.e().f.a.a.X.length();
        l.n(v1, q0, o0, (z ? p1 : p2).b, v2);
        this.f(new m0(this, v1, q0, 8));
        if(z) {
            p1 = p2;
        }
        l.n(v1, q0, (this.l() == 1 ? this.g() : this.k()), 0, p1.b);
        return v1;
    }

    @Override  // M.M
    public final o k() {
        int v = this.p(this.d, false);
        return (o)this.b.get(v);
    }

    @Override  // M.M
    public final int l() {
        int v = this.c;
        int v1 = this.d;
        if(v >= v1) {
            return v <= v1 ? ((o)this.b.get(v / 2)).b() : 1;
        }
        return 2;
    }

    @Override  // M.M
    public final int m() {
        return this.b.size();
    }

    public static void n(v v0, q q0, o o0, int v1, int v2) {
        q q1;
        boolean z = false;
        if(q0.c) {
            p p0 = o0.a(v2);
            p p1 = o0.a(v1);
            if(v2 > v1) {
                z = true;
            }
            q1 = new q(p0, p1, z);
        }
        else {
            p p2 = o0.a(v1);
            p p3 = o0.a(v2);
            if(v1 > v2) {
                z = true;
            }
            q1 = new q(p2, p3, z);
        }
        if(v1 > v2) {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + q1).toString());
        }
        int v3 = v0.c(o0.a);
        Object[] arr_object = v0.c;
        Object object0 = arr_object[v3];
        v0.b[v3] = o0.a;
        arr_object[v3] = q1;
    }

    public final int o(long v) {
        try {
            return this.a.b(v);
        }
        catch(NoSuchElementException noSuchElementException0) {
            throw new IllegalStateException(b.t(v, "Invalid selectableId: "), noSuchElementException0);
        }
    }

    public final int p(int v, boolean z) {
        switch(h.d(this.l())) {
            case 0: {
                if(z) {
                    z = false;
                    return (v - !z) / 2;
                }
                break;
            }
            case 1: {
                return (v - !z) / 2;
            }
            case 2: {
                break;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        return v / 2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", startPosition=");
        boolean z = true;
        stringBuilder0.append(((float)(this.c + 1)) / 2.0f);
        stringBuilder0.append(", endPosition=");
        stringBuilder0.append(((float)(this.d + 1)) / 2.0f);
        stringBuilder0.append(", crossed=");
        stringBuilder0.append(A3.e.C(this.l()));
        stringBuilder0.append(", infos=");
        StringBuilder stringBuilder1 = new StringBuilder("[\n\t");
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            o o0 = (o)arrayList0.get(v1);
            if(z) {
                z = false;
            }
            else {
                stringBuilder1.append(",\n\t");
            }
            ++v1;
            stringBuilder1.append(v1 + " -> " + o0);
        }
        stringBuilder1.append("\n]");
        String s = stringBuilder1.toString();
        j.e(s, "StringBuilder().apply(builderAction).toString()");
        stringBuilder0.append(s);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

