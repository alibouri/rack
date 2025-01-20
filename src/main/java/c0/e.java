package c0;

import U.Q0;
import U.j0;
import b0.b;

public final class e extends Z.e {
    public f d0;

    public e(f f0) {
        this.X = new b();  // initializer: Ljava/lang/Object;-><init>()V
        this.Y = f0.X;
        this.c0 = f0.Y;
        this.d0 = f0;
    }

    public final f b() {
        f f0 = this.d0;
        if(this.Y != f0.X) {
            this.X = new b();  // initializer: Ljava/lang/Object;-><init>()V
            f0 = new f(this.Y, this.c0);  // initializer: LZ/c;-><init>(LZ/m;I)V
        }
        this.d0 = f0;
        return f0;
    }

    @Override  // Z.e
    public final boolean containsKey(Object object0) {
        return object0 instanceof j0 ? super.containsKey(((j0)object0)) : false;
    }

    @Override
    public final boolean containsValue(Object object0) {
        return object0 instanceof Q0 ? super.containsValue(((Q0)object0)) : false;
    }

    @Override  // Z.e
    public final Object get(Object object0) {
        return !(object0 instanceof j0) ? null : ((Q0)super.get(((j0)object0)));
    }

    @Override
    public final Object getOrDefault(Object object0, Object object1) {
        return !(object0 instanceof j0) ? object1 : ((Q0)super.getOrDefault(((j0)object0), ((Q0)object1)));
    }

    @Override  // Z.e
    public final Object remove(Object object0) {
        return !(object0 instanceof j0) ? null : ((Q0)super.remove(((j0)object0)));
    }
}

