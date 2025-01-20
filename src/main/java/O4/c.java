package O4;

import f5.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public final class c {
    public final String a;
    public final String b;
    public final List c;
    public static final CopyOnWriteArraySet d;

    static {
        c.d = new CopyOnWriteArraySet();
    }

    public c(String s, String s1, List list0) {
        this.a = s;
        this.b = s1;
        this.c = list0;
    }

    // Deobfuscation rating: LOW(20)
    public static final CopyOnWriteArraySet a() {
        return a.b(c.class) ? null : c.d;
    }

    public final ArrayList b() {
        if(a.b(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    // Deobfuscation rating: LOW(20)
    public final String c() {
        return a.b(this) ? null : this.a;
    }
}

