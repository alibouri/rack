package q;

import java.util.HashMap;

public final class a extends f {
    public final HashMap c0;

    public a() {
        this.c0 = new HashMap();
    }

    @Override  // q.f
    public final c a(Object object0) {
        return (c)this.c0.get(object0);
    }

    @Override  // q.f
    public final Object c(Object object0, Object object1) {
        c c0 = this.a(object0);
        if(c0 != null) {
            return c0.Y;
        }
        HashMap hashMap0 = this.c0;
        c c1 = new c(object0, object1);
        ++this.b0;
        c c2 = this.Y;
        if(c2 == null) {
            this.X = c1;
        }
        else {
            c2.Z = c1;
            c1.b0 = c2;
        }
        this.Y = c1;
        hashMap0.put(object0, c1);
        return null;
    }

    @Override  // q.f
    public final Object d(Object object0) {
        Object object1 = super.d(object0);
        this.c0.remove(object0);
        return object1;
    }
}

