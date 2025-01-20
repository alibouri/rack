package t3;

import A3.b;
import M4.s;
import android.graphics.Path.FillType;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import r3.j;
import u3.a;
import z3.n;

public final class q implements c, l, a {
    public final Path a;
    public final boolean b;
    public final j c;
    public final u3.l d;
    public boolean e;
    public final s f;

    public q(j j0, b b0, n n0) {
        this.a = new Path();
        this.f = new s(5, false);
        n0.getClass();
        this.b = n0.d;
        this.c = j0;
        u3.l l0 = new u3.l(((List)n0.c.Y));
        this.d = l0;
        b0.d(l0);
        l0.a(this);
    }

    @Override  // u3.a
    public final void b() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        ArrayList arrayList0 = null;
        for(int v = 0; v < ((ArrayList)list0).size(); ++v) {
            c c0 = (c)((ArrayList)list0).get(v);
            if(c0 instanceof t3.s && ((t3.s)c0).c == 1) {
                this.f.X.add(((t3.s)c0));
                ((t3.s)c0).d(this);
            }
            else if(c0 instanceof p) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                ((p)c0).b.a(this);
                arrayList0.add(((p)c0));
            }
        }
        this.d.j = arrayList0;
    }

    @Override  // t3.l
    public final Path getPath() {
        Path path0 = this.a;
        u3.l l0 = this.d;
        if(this.e) {
            l0.getClass();
            return path0;
        }
        path0.reset();
        if(this.b) {
            this.e = true;
            return path0;
        }
        Path path1 = (Path)l0.d();
        if(path1 == null) {
            return path0;
        }
        path0.set(path1);
        path0.setFillType(Path.FillType.EVEN_ODD);
        this.f.i(path0);
        this.e = true;
        return path0;
    }
}

