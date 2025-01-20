package k2;

import Bb.p;
import java.util.AbstractList;
import java.util.ArrayList;
import m5.b;

public final class e1 extends AbstractList implements A1, P {
    public final ArrayList X;
    public int Y;
    public int Z;
    public int b0;
    public boolean c0;
    public int d0;
    public int e0;

    public e1() {
        this.X = new ArrayList();
        this.c0 = true;
    }

    public e1(e1 e10) {
        ArrayList arrayList0 = new ArrayList();
        this.X = arrayList0;
        this.c0 = true;
        arrayList0.addAll(e10.X);
        this.Y = e10.Y;
        this.Z = e10.Z;
        this.b0 = e10.b0;
        this.c0 = e10.c0;
        this.d0 = e10.d0;
        this.e0 = e10.e0;
    }

    @Override  // k2.A1
    public final int a() {
        return this.Y;
    }

    @Override  // k2.A1
    public final int c() {
        return this.Z;
    }

    @Override  // k2.A1
    public final int d() {
        return this.d0;
    }

    public final int e() {
        return this.Y + this.d0 + this.Z;
    }

    @Override
    public final Object get(int v) {
        int v1 = v - this.Y;
        if(v >= 0 && v < this.e()) {
            return v1 < 0 || v1 >= this.d0 ? null : this.getItem(v1);
        }
        StringBuilder stringBuilder0 = b.A(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.e());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override  // k2.A1
    public final Object getItem(int v) {
        ArrayList arrayList0 = this.X;
        int v1 = arrayList0.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            int v3 = ((w1)arrayList0.get(v2)).X.size();
            if(v3 > v) {
                break;
            }
            v -= v3;
        }
        return ((w1)arrayList0.get(v2)).X.get(v);
    }

    @Override
    public final int size() {
        return this.e();
    }

    @Override
    public final String toString() {
        return "leading " + this.Y + ", dataCount " + this.d0 + ", trailing " + this.Z + ' ' + p.v0(this.X, " ", null, null, null, 62);
    }
}

