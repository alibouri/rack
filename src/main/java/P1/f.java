package p1;

import java.util.ArrayList;

public class f implements e {
    public o a;
    public boolean b;
    public boolean c;
    public final o d;
    public int e;
    public int f;
    public int g;
    public int h;
    public g i;
    public boolean j;
    public final ArrayList k;
    public final ArrayList l;

    public f(o o0) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = 1;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = o0;
    }

    @Override  // p1.e
    public final void a(e e0) {
        ArrayList arrayList0 = this.l;
        for(Object object0: arrayList0) {
            if(!((f)object0).j) {
                return;
            }
            if(false) {
                break;
            }
        }
        this.c = true;
        o o0 = this.a;
        if(o0 != null) {
            o0.a(this);
        }
        if(this.b) {
            this.d.a(this);
            return;
        }
        f f0 = null;
        int v = 0;
        for(Object object1: arrayList0) {
            f f1 = (f)object1;
            if(!(f1 instanceof g)) {
                ++v;
                f0 = f1;
            }
        }
        if(f0 != null && v == 1 && f0.j) {
            g g0 = this.i;
            if(g0 != null) {
                if(g0.j) {
                    this.f = this.h * g0.g;
                    goto label_31;
                }
                return;
            }
        label_31:
            this.d(f0.g + this.f);
        }
        o o1 = this.a;
        if(o1 != null) {
            o1.a(this);
        }
    }

    public final void b(o o0) {
        this.k.add(o0);
        if(this.j) {
            o0.a(o0);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int v) {
        if(this.j) {
            return;
        }
        this.j = true;
        this.g = v;
        for(Object object0: this.k) {
            ((e)object0).a(((e)object0));
        }
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.d.b.i0);
        stringBuilder0.append(":");
        switch(this.e) {
            case 1: {
                s = "UNKNOWN";
                break;
            }
            case 2: {
                s = "HORIZONTAL_DIMENSION";
                break;
            }
            case 3: {
                s = "VERTICAL_DIMENSION";
                break;
            }
            case 4: {
                s = "LEFT";
                break;
            }
            case 5: {
                s = "RIGHT";
                break;
            }
            case 6: {
                s = "TOP";
                break;
            }
            case 7: {
                s = "BOTTOM";
                break;
            }
            case 8: {
                s = "BASELINE";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        Integer integer0 = this.j ? ((int)this.g) : "unresolved";
        stringBuilder0.append(integer0);
        stringBuilder0.append(") <t=");
        stringBuilder0.append(this.l.size());
        stringBuilder0.append(":d=");
        stringBuilder0.append(this.k.size());
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

