package T1;

import Ab.t;
import Fb.j;
import W5.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public Iterator c0;
    public Object d0;
    public int e0;
    public Object f0;
    public final List g0;
    public final ArrayList h0;

    public g(List list0, ArrayList arrayList0, kotlin.coroutines.g g0) {
        this.g0 = list0;
        this.h0 = arrayList0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(object0, ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new g(this.g0, this.h0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        List list1;
        Iterator iterator1;
        int v = this.e0;
        if(v == 0) {
            f.b0(object0);
            object0 = this.f0;
            iterator1 = this.g0.iterator();
            list1 = this.h0;
        }
        else {
            switch(v) {
                case 1: {
                    Object object1 = this.d0;
                    Iterator iterator0 = this.c0;
                    List list0 = (List)this.f0;
                    f.b0(object0);
                    if(!((Boolean)object0).booleanValue()) {
                        object0 = object1;
                        iterator1 = iterator0;
                        list1 = list0;
                        break;
                    }
                    list0.add(new T1.f(1, null, 0));
                    this.f0 = list0;
                    this.c0 = iterator0;
                    this.d0 = null;
                    this.e0 = 2;
                    throw null;
                }
                case 2: {
                    iterator1 = this.c0;
                    list1 = (List)this.f0;
                    f.b0(object0);
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        if(!iterator1.hasNext()) {
            return object0;
        }
        Object object2 = iterator1.next();
        if(object2 != null) {
            throw new ClassCastException();
        }
        this.f0 = list1;
        this.c0 = iterator1;
        this.d0 = object0;
        this.e0 = 1;
        throw null;
    }
}

