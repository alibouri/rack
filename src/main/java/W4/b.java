package W4;

import Ab.k;
import Bb.F;
import Bb.n;
import Nb.j;
import java.util.HashMap;

public final class b {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final a k;
    public final HashMap l;
    public static final HashMap m;

    static {
        b.m = F.D(new k[]{new k("embedding.weight", "embed.weight"), new k("dense1.weight", "fc1.weight"), new k("dense2.weight", "fc2.weight"), new k("dense3.weight", "fc3.weight"), new k("dense1.bias", "fc1.bias"), new k("dense2.bias", "fc2.bias"), new k("dense3.bias", "fc3.bias")});
    }

    public b(HashMap hashMap0) {
        Object object0 = hashMap0.get("embed.weight");
        if(object0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = (a)object0;
        Object object1 = hashMap0.get("convs.0.weight");
        if(object1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.b = f.R(((a)object1));
        Object object2 = hashMap0.get("convs.1.weight");
        if(object2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.c = f.R(((a)object2));
        Object object3 = hashMap0.get("convs.2.weight");
        if(object3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.d = f.R(((a)object3));
        Object object4 = hashMap0.get("convs.0.bias");
        if(object4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.e = (a)object4;
        Object object5 = hashMap0.get("convs.1.bias");
        if(object5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f = (a)object5;
        Object object6 = hashMap0.get("convs.2.bias");
        if(object6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.g = (a)object6;
        Object object7 = hashMap0.get("fc1.weight");
        if(object7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.h = f.Q(((a)object7));
        Object object8 = hashMap0.get("fc2.weight");
        if(object8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.i = f.Q(((a)object8));
        Object object9 = hashMap0.get("fc1.bias");
        if(object9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.j = (a)object9;
        Object object10 = hashMap0.get("fc2.bias");
        if(object10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.k = (a)object10;
        this.l = new HashMap();
        for(Object object11: n.z0(new String[]{c.X.a(), c.Y.a()})) {
            String s = j.m(".weight", ((String)object11));
            String s1 = j.m(".bias", ((String)object11));
            a a0 = (a)hashMap0.get(s);
            a a1 = (a)hashMap0.get(s1);
            if(a0 != null) {
                a a2 = f.Q(a0);
                this.l.put(s, a2);
            }
            if(a1 != null) {
                this.l.put(s1, a1);
            }
        }
    }

    public final a a(a a0, String[] arr_s, String s) {
        HashMap hashMap0 = this.l;
        if(f5.a.b(this)) {
            return null;
        }
        try {
            a a1 = f.p(f.t(arr_s, this.a), this.b);
            f.l(a1, this.e);
            f.J(a1);
            a a2 = f.p(a1, this.c);
            f.l(a2, this.f);
            f.J(a2);
            a a3 = f.D(a2, 2);
            a a4 = f.p(a3, this.d);
            f.l(a4, this.g);
            f.J(a4);
            a a5 = f.D(a1, a1.a[1]);
            a a6 = f.D(a3, a3.a[1]);
            a a7 = f.D(a4, a4.a[1]);
            f.y(a5);
            f.y(a6);
            f.y(a7);
            a a8 = f.s(f.n(new a[]{a5, a6, a7, a0}), this.h, this.j);
            f.J(a8);
            a a9 = f.s(a8, this.i, this.k);
            f.J(a9);
            a a10 = (a)hashMap0.get(s + ".weight");
            a a11 = (a)hashMap0.get(s + ".bias");
            if(a10 != null && a11 != null) {
                a a12 = f.s(a9, a10, a11);
                f.O(a12);
                return a12;
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, this);
        }
        return null;
    }
}

