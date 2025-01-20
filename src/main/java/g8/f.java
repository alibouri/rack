package g8;

import e8.k;
import e8.s;
import e8.t;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k8.a;
import v1.r;

public final class f implements t, Cloneable {
    public List X;
    public List Y;
    public static final f Z;

    static {
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f0.X = Collections.emptyList();
        f0.Y = Collections.emptyList();
        f.Z = f0;
    }

    @Override  // e8.t
    public final s b(k k0, a a0) {
        boolean z2;
        boolean z1;
        boolean z = !Enum.class.isAssignableFrom(a0.a) && (a0.a.isAnonymousClass() || a0.a.isLocalClass());
        if(z) {
            z1 = true;
        }
        else {
            this.c(true);
            z1 = false;
        }
        if(z) {
            z2 = true;
        }
        else {
            this.c(false);
            z2 = false;
        }
        return !z1 && !z2 ? null : new e(this, z2, z1, k0, a0);
    }

    public final void c(boolean z) {
        Iterator iterator0 = (z ? this.X : this.Y).iterator();
        if(iterator0.hasNext()) {
            throw r.e(iterator0);
        }
    }

    @Override
    public final Object clone() {
        try {
            return (f)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }
}

