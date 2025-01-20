package M0;

import Ab.c;
import Ab.t;
import Nb.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class p extends k implements Function2 {
    public final int X;
    public static final p Y;
    public static final p Z;
    public static final p b0;
    public static final p c0;
    public static final p d0;
    public static final p e0;
    public static final p f0;
    public static final p g0;
    public static final p h0;
    public static final p i0;
    public static final p j0;
    public static final p k0;

    static {
        p.Y = new p(2, 0);
        p.Z = new p(2, 1);
        p.b0 = new p(2, 2);
        p.c0 = new p(2, 3);
        p.d0 = new p(2, 4);
        p.e0 = new p(2, 5);
        p.f0 = new p(2, 6);
        p.g0 = new p(2, 7);
        p.h0 = new p(2, 8);
        p.i0 = new p(2, 9);
        p.j0 = new p(2, 10);
        p.k0 = new p(2, 11);
    }

    public p(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        String s3;
        switch(this.X) {
            case 0: {
                if(((List)object0) != null) {
                    ArrayList arrayList0 = Bb.p.R0(((List)object0));
                    arrayList0.addAll(((List)object1));
                    return arrayList0;
                }
                return (List)object1;
            }
            case 1: {
                t t0 = (t)object1;
                return (t)object0;
            }
            case 2: {
                t t1 = (t)object0;
                t t2 = (t)object1;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            }
            case 3: {
                t t3 = (t)object0;
                t t4 = (t)object1;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            }
            case 4: {
                String s = (String)object0;
                String s1 = (String)object1;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            }
            case 5: {
                g g0 = (g)object1;
                return (g)object0;
            }
            case 6: {
                String s2 = (String)object1;
                return (String)object0;
            }
            case 7: {
                if(((List)object0) != null) {
                    ArrayList arrayList1 = Bb.p.R0(((List)object0));
                    arrayList1.addAll(((List)object1));
                    return arrayList1;
                }
                return (List)object1;
            }
            case 8: {
                ((Number)object1).floatValue();
                return (Float)object0;
            }
            case 9: {
                Boolean boolean0 = (Boolean)object1;
                return (Boolean)object0;
            }
            case 10: {
                if(((a)object0) == null) {
                    s3 = ((a)object1).a;
                }
                else {
                    s3 = ((a)object0).a;
                    if(s3 == null) {
                        s3 = ((a)object1).a;
                    }
                }
                if(((a)object0) != null) {
                    c c0 = ((a)object0).b;
                    return c0 == null ? new a(s3, ((a)object1).b) : new a(s3, c0);
                }
                return new a(s3, ((a)object1).b);
            }
            default: {
                return object0 == null ? object1 : object0;
            }
        }
    }
}

