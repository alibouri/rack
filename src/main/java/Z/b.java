package Z;

import Ob.d;

public final class b extends a implements d {
    public final h Z;
    public Object b0;

    public b(h h0, Object object0, Object object1) {
        super(object0, object1);
        this.Z = h0;
        this.b0 = object1;
    }

    @Override  // Z.a
    public final Object getValue() {
        return this.b0;
    }

    @Override  // Z.a
    public final Object setValue(Object object0) {
        Object object1 = this.b0;
        this.b0 = object0;
        f f0 = (f)this.Z.Y;
        e e0 = f0.b0;
        Object object2 = this.X;
        if(e0.containsKey(object2)) {
            if(f0.Z) {
                n n0 = f0.X[f0.Y];
                Object object3 = n0.X[n0.Z];
                e0.put(object2, object0);
                f0.c((object3 == null ? 0 : object3.hashCode()), e0.Y, object3, 0);
            }
            else {
                e0.put(object2, object0);
            }
            f0.e0 = e0.b0;
        }
        return object1;
    }
}

