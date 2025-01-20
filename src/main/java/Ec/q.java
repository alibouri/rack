package Ec;

import Fc.f;
import H6.e;
import Nb.j;
import java.io.FileNotFoundException;
import java.util.List;

public abstract class q {
    public static final y a;

    static {
        y y0;
        try {
            y0 = new z();  // initializer: Ljava/lang/Object;-><init>()V
        }
        catch(ClassNotFoundException unused_ex) {
            y0 = new y();  // initializer: Ljava/lang/Object;-><init>()V
        }
        q.a = y0;
        String s = System.getProperty("java.io.tmpdir");
        j.e(s, "getProperty(...)");
        e.m(s, false);
        ClassLoader classLoader0 = f.class.getClassLoader();
        j.e(classLoader0, "getClassLoader(...)");
        new f(classLoader0);
    }

    public abstract void a(C arg1);

    public final void b(C c0) {
        j.f(c0, "path");
        this.a(c0);
    }

    public final boolean c(C c0) {
        j.f(c0, "path");
        return this.f(c0) != null;
    }

    public abstract List d(C arg1);

    public final p e(C c0) {
        j.f(c0, "path");
        p p0 = this.f(c0);
        if(p0 == null) {
            throw new FileNotFoundException("no such file: " + c0);
        }
        return p0;
    }

    public abstract p f(C arg1);

    public abstract x g(C arg1);

    public abstract J h(C arg1);

    public abstract L i(C arg1);
}

