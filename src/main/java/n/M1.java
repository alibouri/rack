package N;

import B.F0;
import B.w;
import B8.c;
import Bb.A;
import Bb.q;
import D0.J;
import D0.V;
import D0.f0;
import Nb.k;
import W5.f;
import a1.a;
import androidx.compose.ui.unit.LayoutDirection;
import c0.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class m1 extends k implements Function2 {
    public final Function2 X;
    public final b Y;
    public final Function2 Z;
    public final int b0;
    public final boolean c0;
    public final F0 d0;
    public final Function2 e0;
    public final b f0;

    public m1(Function2 function20, b b0, Function2 function21, int v, boolean z, F0 f00, Function2 function22, b b1) {
        this.X = function20;
        this.Y = b0;
        this.Z = function21;
        this.b0 = v;
        this.c0 = z;
        this.d0 = f00;
        this.e0 = function22;
        this.f0 = b1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        int v44;
        int v43;
        Integer integer1;
        int v42;
        int v41;
        Object object14;
        Object object13;
        int v33;
        Object object10;
        ArrayList arrayList3;
        Object object7;
        Object object4;
        F0 f00;
        Object object2;
        int v = a.h(((a)object1).a);
        int v1 = a.g(((a)object1).a);
        long v2 = a.a(((a)object1).a, 0, 0, 0, 0, 10);
        List list0 = ((f0)object0).q(p1.X, this.X);
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
        List list1 = ((f0)object0).q(p1.Z, this.Y);
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v10 = list1.size();
        int v11 = 0;
        while(true) {
            f00 = this.d0;
            if(v11 >= v10) {
                break;
            }
            arrayList1.add(((J)list1.get(v11)).a(f.K(-f00.d(((f0)object0), ((f0)object0).getLayoutDirection()) - f00.c(((f0)object0), ((f0)object0).getLayoutDirection()), v2, -f00.b(((f0)object0)))));
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
        List list2 = ((f0)object0).q(p1.b0, this.Z);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v18 = list2.size();
        int v19 = 0;
        while(v19 < v18) {
            arrayList2.add(((J)list2.get(v19)).a(f.K(-f00.d(((f0)object0), ((f0)object0).getLayoutDirection()) - f00.c(((f0)object0), ((f0)object0).getLayoutDirection()), v2, -f00.b(((f0)object0)))));
            ++v19;
            v18 = v18;
            list2 = list2;
        }
        if(arrayList2.isEmpty()) {
            arrayList3 = arrayList1;
            object13 = null;
        }
        else {
            if(arrayList2.isEmpty()) {
                object7 = null;
            }
            else {
                object7 = arrayList2.get(0);
                int v20 = ((V)object7).X;
                int v21 = q.y(arrayList2);
                if(1 <= v21) {
                    Object object8 = object7;
                    int v22 = v20;
                    for(int v23 = 1; true; ++v23) {
                        Object object9 = arrayList2.get(v23);
                        int v24 = ((V)object9).X;
                        if(v22 < v24) {
                            v22 = v24;
                            object8 = object9;
                        }
                        if(v23 == v21) {
                            break;
                        }
                    }
                    object7 = object8;
                }
            }
            int v25 = ((V)object7) == null ? 0 : ((V)object7).X;
            if(arrayList2.isEmpty()) {
                arrayList3 = arrayList1;
                object10 = null;
            }
            else {
                object10 = arrayList2.get(0);
                int v26 = ((V)object10).Y;
                int v27 = q.y(arrayList2);
                if(1 <= v27) {
                    Object object11 = object10;
                    int v28 = v26;
                    int v29 = 1;
                    while(true) {
                        Object object12 = arrayList2.get(v29);
                        arrayList3 = arrayList1;
                        int v30 = ((V)object12).Y;
                        if(v28 < v30) {
                            v28 = v30;
                            object11 = object12;
                        }
                        if(v29 == v27) {
                            break;
                        }
                        ++v29;
                        arrayList1 = arrayList3;
                    }
                    object10 = object11;
                }
                else {
                    arrayList3 = arrayList1;
                }
            }
            int v31 = ((V)object10) == null ? 0 : ((V)object10).Y;
            if(v25 == 0 || v31 == 0) {
                object13 = null;
            }
            else {
                int v32 = this.b0;
                LayoutDirection layoutDirection0 = LayoutDirection.X;
                if(v32 != 0) {
                    if(v32 != 2) {
                        v33 = (v - v25) / 2;
                    }
                    else if(((f0)object0).getLayoutDirection() == layoutDirection0) {
                        v33 = v - ((f0)object0).I(o1.b) - v25;
                    }
                    else {
                        v33 = ((f0)object0).I(o1.b);
                    }
                }
                else if(((f0)object0).getLayoutDirection() == layoutDirection0) {
                    v33 = ((f0)object0).I(o1.b);
                }
                else {
                    v33 = v - ((f0)object0).I(o1.b) - v25;
                }
                object13 = new c(v33, v31, 3);
            }
        }
        b b0 = new b(424088350, new w(object13, 12, this.e0), true);
        List list3 = ((f0)object0).q(p1.c0, b0);
        ArrayList arrayList4 = new ArrayList(list3.size());
        int v34 = list3.size();
        for(int v35 = 0; v35 < v34; ++v35) {
            arrayList4.add(((J)list3.get(v35)).a(v2));
        }
        if(arrayList4.isEmpty()) {
            object14 = null;
        }
        else {
            object14 = arrayList4.get(0);
            int v36 = ((V)object14).Y;
            int v37 = q.y(arrayList4);
            if(1 <= v37) {
                for(int v38 = 1; true; ++v38) {
                    Object object15 = arrayList4.get(v38);
                    int v39 = ((V)object15).Y;
                    if(v36 < v39) {
                        v36 = v39;
                        object14 = object15;
                    }
                    if(v38 == v37) {
                        break;
                    }
                }
            }
        }
        Integer integer0 = ((V)object14) == null ? null : ((int)((V)object14).Y);
        if(object13 == null) {
            integer1 = null;
        }
        else {
            int v40 = object13.c;
            if(integer0 == null) {
                v41 = ((f0)object0).I(o1.b) + v40;
                v42 = f00.b(((f0)object0));
            }
            else if(this.c0) {
                v41 = (int)integer0;
                v42 = v40 / 2;
            }
            else {
                v41 = ((int)integer0) + v40;
                v42 = ((f0)object0).I(o1.b);
            }
            integer1 = (int)(v42 + v41);
        }
        if(v17 == 0) {
            v44 = 0;
        }
        else {
            if(integer1 == null) {
                v43 = integer0 == null ? f00.b(((f0)object0)) : ((int)integer0);
            }
            else {
                v43 = (int)integer1;
            }
            v44 = v17 + v43;
        }
        b b1 = new b(0xDDFA902F, new l1(this.d0, ((f0)object0), arrayList0, arrayList4, integer0, this.f0, 0), true);
        List list4 = ((f0)object0).q(p1.Y, b1);
        ArrayList arrayList5 = new ArrayList(list4.size());
        int v45 = list4.size();
        for(int v46 = 0; v46 < v45; ++v46) {
            arrayList5.add(((J)list4.get(v46)).a(a.a(v2, 0, 0, 0, v1 - v9, 7)));
        }
        k1 k10 = new k1(arrayList5, arrayList0, arrayList3, arrayList4, arrayList2, v9, v1, v44, integer0, ((c)object13), integer1);
        return ((f0)object0).L(v, v1, A.X, k10);
    }
}

