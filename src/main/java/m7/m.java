package m7;

import x7.a;

public final class m implements a {
    public volatile Object a;
    public volatile a b;
    public static final Object c;

    static {
        m.c = new Object();
    }

    public m(a a0) {
        this.a = m.c;
        this.b = a0;
    }

    @Override  // x7.a
    public final Object get() {
        Object object0 = this.a;
        Object object1 = m.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.a;
                if(object0 == object1) {
                    object0 = this.b.get();
                    this.a = object0;
                    this.b = null;
                }
            }
        }
        return object0;
    }
}

