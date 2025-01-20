package R;

import B.F0;
import Bb.A;
import Bb.q;
import D0.J;
import D0.V;
import D0.f0;
import Nb.j;
import Nb.k;
import S.t;
import U.d;
import U.p;
import W5.f;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import c0.b;
import g0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o9.s2;
import v.k0;

public final class n0 extends k implements Function2 {
    public final int X;
    public final int Y;
    public final b Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;

    public n0(int v, Function2 function20, b b0, Function2 function21, Function2 function22, t t0, Function2 function23) {
        this.X = 0;
        this.Y = v;
        this.b0 = function20;
        this.Z = b0;
        this.c0 = function21;
        this.d0 = function22;
        this.f0 = t0;
        this.e0 = function23;
        super(2);
    }

    public n0(F0 f00, f0 f01, ArrayList arrayList0, int v, ArrayList arrayList1, Integer integer0, b b0) {
        this.X = 1;
        this.b0 = f00;
        this.c0 = f01;
        this.d0 = arrayList0;
        this.Y = v;
        this.e0 = arrayList1;
        this.f0 = integer0;
        this.Z = b0;
        super(2);
    }

    public n0(b b0, s2 s20, String s, String s1, Boolean boolean0, Object object0, int v) {
        this.X = 3;
        this.Z = b0;
        this.b0 = s20;
        this.c0 = s;
        this.d0 = s1;
        this.e0 = boolean0;
        this.f0 = object0;
        this.Y = v;
        super(2);
    }

    public n0(Function2 function20, Function2 function21, Function2 function22, int v, F0 f00, Function2 function23, b b0) {
        this.X = 2;
        this.b0 = function20;
        this.c0 = function21;
        this.d0 = function22;
        this.Y = v;
        this.f0 = f00;
        this.e0 = function23;
        this.Z = b0;
        super(2);
    }

    public n0(k0 k00, Modifier modifier0, Function1 function10, c c0, Function1 function11, b b0, int v) {
        this.X = 4;
        this.b0 = k00;
        this.c0 = modifier0;
        this.d0 = function10;
        this.e0 = c0;
        this.f0 = function11;
        this.Z = b0;
        this.Y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        int v51;
        int v50;
        Integer integer2;
        int v49;
        int v48;
        Object object15;
        B8.c c0;
        int v40;
        Object object12;
        ArrayList arrayList3;
        Object object10;
        Object object7;
        Object object4;
        F0 f02;
        Object object2;
        float f1;
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return Ab.t.a;
                }
                r0.b(this.Y, ((Function2)this.b0), this.Z, ((Function2)this.c0), ((Function2)this.d0), ((t)this.f0), ((Function2)this.e0), ((p)object0), 0);
                return Ab.t.a;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return Ab.t.a;
                }
                f0 f00 = (f0)this.c0;
                B.f0 f01 = new B.f0(((F0)this.b0), f00);
                float f = ((ArrayList)this.d0).isEmpty() ? f01.c() : f00.i0(this.Y);
                if(((ArrayList)this.e0).isEmpty()) {
                    f1 = f01.a();
                }
                else {
                    Integer integer0 = (Integer)this.f0;
                    f1 = integer0 == null ? f01.a() : f00.i0(((int)integer0));
                }
                B.r0 r00 = new B.r0(a.e(f01, f00.getLayoutDirection()), f, a.d(f01, f00.getLayoutDirection()), f1);
                this.Z.h(r00, ((p)object0), 0);
                return Ab.t.a;
            }
            case 2: {
                int v = a1.a.h(((a1.a)object1).a);
                int v1 = a1.a.g(((a1.a)object1).a);
                long v2 = a1.a.a(((a1.a)object1).a, 0, 0, 0, 0, 10);
                List list0 = ((f0)object0).q(s0.X, ((Function2)this.b0));
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v3 = list0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    arrayList0.add(((J)list0.get(v4)).a(v2));
                }
                if(arrayList0.isEmpty()) {
                    object2 = null;
                }
                else {
                    object2 = arrayList0.get(0);
                    int v5 = ((V)object2).Y;
                    int v6 = q.y(arrayList0);
                    if(1 <= v6) {
                        for(int v7 = 1; true; ++v7) {
                            Object object3 = arrayList0.get(v7);
                            int v8 = ((V)object3).Y;
                            if(v5 < v8) {
                                object2 = object3;
                                v5 = v8;
                            }
                            if(v7 == v6) {
                                break;
                            }
                        }
                    }
                }
                int v9 = ((V)object2) == null ? 0 : ((V)object2).Y;
                List list1 = ((f0)object0).q(s0.Z, ((Function2)this.c0));
                ArrayList arrayList1 = new ArrayList(list1.size());
                int v10 = list1.size();
                int v11 = 0;
                while(true) {
                    f02 = (F0)this.f0;
                    if(v11 >= v10) {
                        break;
                    }
                    arrayList1.add(((J)list1.get(v11)).a(f.K(-f02.d(((f0)object0), ((f0)object0).getLayoutDirection()) - f02.c(((f0)object0), ((f0)object0).getLayoutDirection()), v2, -f02.b(((f0)object0)))));
                    ++v11;
                    v1 = v1;
                }
                if(arrayList1.isEmpty()) {
                    object4 = null;
                }
                else {
                    object4 = arrayList1.get(0);
                    int v12 = ((V)object4).Y;
                    int v13 = q.y(arrayList1);
                    if(1 <= v13) {
                        Object object5 = object4;
                        int v14 = v12;
                        for(int v15 = 1; true; ++v15) {
                            Object object6 = arrayList1.get(v15);
                            int v16 = ((V)object6).Y;
                            if(v14 < v16) {
                                object5 = object6;
                                v14 = v16;
                            }
                            if(v15 == v13) {
                                break;
                            }
                        }
                        object4 = object5;
                    }
                }
                int v17 = ((V)object4) == null ? 0 : ((V)object4).Y;
                if(arrayList1.isEmpty()) {
                    object7 = null;
                }
                else {
                    object7 = arrayList1.get(0);
                    int v18 = ((V)object7).X;
                    int v19 = q.y(arrayList1);
                    if(1 <= v19) {
                        Object object8 = object7;
                        int v20 = v18;
                        for(int v21 = 1; true; ++v21) {
                            Object object9 = arrayList1.get(v21);
                            int v22 = ((V)object9).X;
                            if(v20 < v22) {
                                object8 = object9;
                                v20 = v22;
                            }
                            if(v21 == v19) {
                                break;
                            }
                        }
                        object7 = object8;
                    }
                }
                int v23 = ((V)object7) == null ? 0 : ((V)object7).X;
                List list2 = ((f0)object0).q(s0.b0, ((Function2)this.d0));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int v24 = list2.size();
                int v25 = 0;
                while(v25 < v24) {
                    V v26 = ((J)list2.get(v25)).a(f.K(-f02.d(((f0)object0), ((f0)object0).getLayoutDirection()) - f02.c(((f0)object0), ((f0)object0).getLayoutDirection()), v2, -f02.b(((f0)object0))));
                    if(v26.Y == 0 || v26.X == 0) {
                        v26 = null;
                    }
                    if(v26 != null) {
                        arrayList2.add(v26);
                    }
                    ++v25;
                    list2 = list2;
                    v24 = v24;
                    arrayList1 = arrayList1;
                }
                int v27 = this.Y;
                if(arrayList2.isEmpty()) {
                    arrayList3 = arrayList2;
                    c0 = null;
                }
                else {
                    if(arrayList2.isEmpty()) {
                        object10 = null;
                    }
                    else {
                        object10 = arrayList2.get(0);
                        int v28 = ((V)object10).X;
                        int v29 = q.y(arrayList2);
                        if(1 <= v29) {
                            int v30 = v28;
                            for(int v31 = 1; true; ++v31) {
                                Object object11 = arrayList2.get(v31);
                                int v32 = ((V)object11).X;
                                if(v30 < v32) {
                                    v30 = v32;
                                    object10 = object11;
                                }
                                else {
                                    object10 = object10;
                                }
                                if(v31 == v29) {
                                    break;
                                }
                            }
                        }
                    }
                    j.c(object10);
                    int v33 = ((V)object10).X;
                    if(arrayList2.isEmpty()) {
                        arrayList3 = arrayList2;
                        object12 = null;
                    }
                    else {
                        object12 = arrayList2.get(0);
                        int v34 = ((V)object12).Y;
                        int v35 = q.y(arrayList2);
                        if(1 <= v35) {
                            int v36 = 1;
                            Object object13 = object12;
                            int v37 = v34;
                            while(true) {
                                Object object14 = arrayList2.get(v36);
                                arrayList3 = arrayList2;
                                int v38 = ((V)object14).Y;
                                if(v37 < v38) {
                                    v37 = v38;
                                    object13 = object14;
                                }
                                if(v36 == v35) {
                                    break;
                                }
                                ++v36;
                                arrayList2 = arrayList3;
                            }
                            object12 = object13;
                        }
                        else {
                            arrayList3 = arrayList2;
                        }
                    }
                    j.c(object12);
                    int v39 = ((V)object12).Y;
                    LayoutDirection layoutDirection0 = LayoutDirection.X;
                    if(v27 != 0) {
                        if(v27 != 2 && v27 != 3) {
                            v40 = (v - v33) / 2;
                        }
                        else if(((f0)object0).getLayoutDirection() == layoutDirection0) {
                            v40 = v - ((f0)object0).I(r0.a) - v33;
                        }
                        else {
                            v40 = ((f0)object0).I(r0.a);
                        }
                    }
                    else if(((f0)object0).getLayoutDirection() == layoutDirection0) {
                        v40 = ((f0)object0).I(r0.a);
                    }
                    else {
                        v40 = v - ((f0)object0).I(r0.a) - v33;
                    }
                    c0 = new B8.c(v40, v39, 5);
                }
                b b0 = new b(0x800FF2D1, new N.c(((Function2)this.e0), 4), true);
                List list3 = ((f0)object0).q(s0.c0, b0);
                ArrayList arrayList4 = new ArrayList(list3.size());
                int v41 = list3.size();
                for(int v42 = 0; v42 < v41; ++v42) {
                    arrayList4.add(((J)list3.get(v42)).a(v2));
                }
                if(arrayList4.isEmpty()) {
                    object15 = null;
                }
                else {
                    object15 = arrayList4.get(0);
                    int v43 = ((V)object15).Y;
                    int v44 = q.y(arrayList4);
                    if(1 <= v44) {
                        for(int v45 = 1; true; ++v45) {
                            Object object16 = arrayList4.get(v45);
                            int v46 = ((V)object16).Y;
                            if(v43 < v46) {
                                v43 = v46;
                                object15 = object16;
                            }
                            else {
                                object15 = object15;
                            }
                            if(v45 == v44) {
                                break;
                            }
                        }
                    }
                }
                Integer integer1 = ((V)object15) == null ? null : ((int)((V)object15).Y);
                if(c0 == null) {
                    integer2 = null;
                }
                else {
                    int v47 = c0.c;
                    if(integer1 == null || v27 == 3) {
                        v48 = ((f0)object0).I(r0.a) + v47;
                        v49 = f02.b(((f0)object0));
                    }
                    else {
                        v48 = ((int)integer1) + v47;
                        v49 = ((f0)object0).I(r0.a);
                    }
                    integer2 = (int)(v49 + v48);
                }
                if(v17 == 0) {
                    v51 = 0;
                }
                else {
                    if(integer2 == null) {
                        v50 = integer1 == null ? f02.b(((f0)object0)) : ((int)integer1);
                    }
                    else {
                        v50 = (int)integer2;
                    }
                    v51 = v17 + v50;
                }
                b b1 = new b(0xB7AD96E0, new n0(((F0)this.f0), ((f0)object0), arrayList0, v9, arrayList4, integer1, this.Z), true);
                List list4 = ((f0)object0).q(s0.Y, b1);
                ArrayList arrayList5 = new ArrayList(list4.size());
                int v52 = list4.size();
                for(int v53 = 0; v53 < v52; ++v53) {
                    arrayList5.add(((J)list4.get(v53)).a(v2));
                }
                p0 p00 = new p0(arrayList5, arrayList0, arrayList1, arrayList4, c0, v, v23, ((F0)this.f0), ((f0)object0), v1, v51, integer1, arrayList3, integer2);
                return ((f0)object0).L(v, v1, A.X, p00);
            }
            case 3: {
                ((Number)object1).intValue();
                this.Z.i(((s2)this.b0), ((String)this.c0), ((String)this.d0), ((Boolean)this.e0), this.f0, ((p)object0), d.O(this.Y) | 1);
                return Ab.t.a;
            }
            default: {
                ((Number)object1).intValue();
                M6.b.b(((k0)this.b0), ((Modifier)this.c0), ((Function1)this.d0), ((c)this.e0), ((Function1)this.f0), this.Z, ((p)object0), d.O(this.Y | 1));
                return Ab.t.a;
            }
        }
    }
}

