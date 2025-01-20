package t3;

import android.graphics.Matrix;
import android.graphics.Path.Op;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import u3.n;
import v.h;
import z3.g;

public final class k implements j, l {
    public final Path a;
    public final Path b;
    public final Path c;
    public final ArrayList d;
    public final g e;

    public k(g g0) {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = new ArrayList();
        g0.getClass();
        this.e = g0;
    }

    public final void b(Path.Op path$Op0) {
        Matrix matrix1;
        Matrix matrix0;
        Path path0 = this.b;
        path0.reset();
        Path path1 = this.a;
        path1.reset();
        ArrayList arrayList0 = this.d;
        for(int v = arrayList0.size() - 1; v >= 1; --v) {
            l l0 = (l)arrayList0.get(v);
            if(l0 instanceof d) {
                ArrayList arrayList1 = (ArrayList)((d)l0).d();
                for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
                    Path path2 = ((l)arrayList1.get(v1)).getPath();
                    n n0 = ((d)l0).k;
                    if(n0 == null) {
                        matrix0 = ((d)l0).d;
                        matrix0.reset();
                    }
                    else {
                        matrix0 = n0.d();
                    }
                    path2.transform(matrix0);
                    path0.addPath(path2);
                }
            }
            else {
                path0.addPath(l0.getPath());
            }
        }
        l l1 = (l)arrayList0.get(0);
        if(l1 instanceof d) {
            List list0 = ((d)l1).d();
            for(int v2 = 0; v2 < ((ArrayList)list0).size(); ++v2) {
                Path path3 = ((l)((ArrayList)list0).get(v2)).getPath();
                n n1 = ((d)l1).k;
                if(n1 == null) {
                    matrix1 = ((d)l1).d;
                    matrix1.reset();
                }
                else {
                    matrix1 = n1.d();
                }
                path3.transform(matrix1);
                path1.addPath(path3);
            }
        }
        else {
            path1.set(l1.getPath());
        }
        this.c.op(path1, path0, path$Op0);
    }

    @Override  // t3.c
    public final void c(List list0, List list1) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.d;
            if(v >= arrayList0.size()) {
                break;
            }
            ((l)arrayList0.get(v)).c(list0, list1);
        }
    }

    @Override  // t3.j
    public final void d(ListIterator listIterator0) {
        while(listIterator0.hasPrevious() && listIterator0.previous() != this) {
        }
        while(listIterator0.hasPrevious()) {
            c c0 = (c)listIterator0.previous();
            if(c0 instanceof l) {
                this.d.add(((l)c0));
                listIterator0.remove();
            }
        }
    }

    @Override  // t3.l
    public final Path getPath() {
        Path path0 = this.c;
        path0.reset();
        g g0 = this.e;
        if(g0.b) {
            return path0;
        }
        switch(h.d(g0.a)) {
            case 0: {
                for(int v = 0; true; ++v) {
                    ArrayList arrayList0 = this.d;
                    if(v >= arrayList0.size()) {
                        break;
                    }
                    path0.addPath(((l)arrayList0.get(v)).getPath());
                }
                return path0;
            }
            case 1: {
                this.b(Path.Op.UNION);
                return path0;
            }
            case 2: {
                this.b(Path.Op.REVERSE_DIFFERENCE);
                return path0;
            }
            case 3: {
                this.b(Path.Op.INTERSECT);
                return path0;
            }
            case 4: {
                this.b(Path.Op.XOR);
                return path0;
            }
            default: {
                return path0;
            }
        }
    }
}

