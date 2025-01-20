package o9;

import Ab.t;
import Bb.r;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import a9.d0;
import a9.g0;
import a9.h0;
import com.sendwave.shared.paybill.AddOnsFieldSelectResult;
import com.sendwave.shared.paybill.AddOnsFieldSelectWithToggleActivity;
import com.sendwave.shared.paybill.AddOnsFieldSelectWithToggleParams;
import com.sendwave.shared.paybill.conflictingIndices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public final h d0;
    public final HashMap e0;

    public g(h h0, HashMap hashMap0, kotlin.coroutines.g g0) {
        this.d0 = h0;
        this.e0 = hashMap0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((R9)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object8;
        conflictingIndices[] arr_conflictingIndices;
        int v1;
        Object object2;
        Object object1 = a.X;
        h h0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object2 = h0.g0.e(this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_11;
            }
            case 1: {
                f.b0(object0);
                object2 = object0;
            label_11:
                String s = h0.Z.c;
                Object object3 = h0.b0;
                String s1 = ((h0)object3).e;
                if(s1 == null) {
                    s1 = s;
                }
                String s2 = ((h0)object3).d;
                String s3 = ((h0)object3).f;
                if(s3 == null) {
                    s3 = s2;
                }
                ArrayList arrayList0 = new ArrayList(r.b0(((h0)object3).a));
                for(Object object4: ((h0)object3).a) {
                    arrayList0.add(h.j(((d0)object4)));
                }
                Object[] arr_object = arrayList0.toArray(new String[0]);
                boolean[] arr_z = h0.k0;
                List list0 = ((h0)object3).b;
                if(list0 == null) {
                    v1 = 0;
                    arr_conflictingIndices = new conflictingIndices[0];
                }
                else {
                    ArrayList arrayList1 = new ArrayList(r.b0(list0));
                    for(Object object5: list0) {
                        Object object6 = this.e0.get(((g0)object5).a);
                        Nb.j.c(object6);
                        int v = ((Number)object6).intValue();
                        Object object7 = this.e0.get(((g0)object5).b);
                        Nb.j.c(object7);
                        arrayList1.add(new conflictingIndices(v, ((Number)object7).intValue()));
                    }
                    v1 = 0;
                    arr_conflictingIndices = (conflictingIndices[])arrayList1.toArray(new conflictingIndices[0]);
                    if(arr_conflictingIndices == null) {
                        arr_conflictingIndices = new conflictingIndices[0];
                    }
                }
                AddOnsFieldSelectWithToggleParams addOnsFieldSelectWithToggleParams0 = new AddOnsFieldSelectWithToggleParams(s, s1, s2, s3, ((String[])arr_object), arr_z, arr_conflictingIndices);
                this.c0 = 2;
                object8 = ((d)object2).l(AddOnsFieldSelectWithToggleActivity.class, addOnsFieldSelectWithToggleParams0, AddOnsFieldSelectResult.class, this);
                if(object8 == object1) {
                    return object1;
                }
                goto label_56;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        object8 = object0;
        v1 = 0;
    label_56:
        h0.k0 = ((AddOnsFieldSelectResult)object8).X;
        ArrayList arrayList2 = h0.h0;
        arrayList2.clear();
        boolean[] arr_z1 = h0.k0;
        int v2 = 0;
        while(v2 < arr_z1.length) {
            if(arr_z1[v2]) {
                arrayList2.add(((d0)((h0)h0.b0).a.get(v1)).a);
            }
            ++v2;
            ++v1;
        }
        h0.l();
        return t.a;
    }
}

