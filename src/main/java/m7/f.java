package m7;

import E7.p;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.M1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import v7.d;
import x7.a;

public final class f implements c {
    public final HashMap X;
    public final HashMap Y;
    public final HashMap Z;
    public final HashSet b0;
    public final k c0;
    public final AtomicReference d0;
    public final d e0;
    public static final p f0;

    static {
        f.f0 = new p(5);
    }

    public f(ArrayList arrayList0, ArrayList arrayList1, d d0) {
        this.X = new HashMap();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.b0 = new HashSet();
        this.d0 = new AtomicReference();
        k k0 = new k();
        this.c0 = k0;
        this.e0 = d0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(b.c(k0, k.class, new Class[]{u7.c.class, u7.b.class}));
        arrayList2.add(b.c(this, f.class, new Class[0]));
        for(Object object0: arrayList1) {
            b b0 = (b)object0;
            if(b0 != null) {
                arrayList2.add(b0);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object1: arrayList0) {
            arrayList3.add(object1);
        }
        ArrayList arrayList4 = new ArrayList();
        synchronized(this) {
            Iterator iterator2 = arrayList3.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                a a0 = (a)object2;
                try {
                    ComponentRegistrar componentRegistrar0 = (ComponentRegistrar)a0.get();
                    if(componentRegistrar0 == null) {
                        continue;
                    }
                    arrayList2.addAll(this.e0.w(componentRegistrar0));
                    iterator2.remove();
                }
                catch(l l0) {
                    iterator2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", l0);
                }
            }
            Iterator iterator3 = arrayList2.iterator();
            while(iterator3.hasNext()) {
                Object object3 = iterator3.next();
                Object[] arr_object = ((b)object3).b.toArray();
                int v1 = 0;
            label_46:
                if(v1 >= arr_object.length) {
                    continue;
                }
                Object object4 = arr_object[v1];
                if(object4.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                    if(this.b0.contains(object4.toString())) {
                        iterator3.remove();
                        continue;
                    }
                    this.b0.add(object4.toString());
                }
                ++v1;
                goto label_46;
            }
            if(this.X.isEmpty()) {
                Pb.a.x(arrayList2);
            }
            else {
                ArrayList arrayList5 = new ArrayList(this.X.keySet());
                arrayList5.addAll(arrayList2);
                Pb.a.x(arrayList5);
            }
            for(Object object5: arrayList2) {
                m m0 = new m(new Z6.c(this, 1, ((b)object5)));
                this.X.put(((b)object5), m0);
            }
            arrayList4.addAll(this.e(arrayList2));
            arrayList4.addAll(this.f());
            this.c();
        }
        for(Object object6: arrayList4) {
            ((Runnable)object6).run();
        }
        Boolean boolean0 = (Boolean)this.d0.get();
        if(boolean0 != null) {
            this.b(this.X, boolean0.booleanValue());
        }
    }

    @Override  // m7.c
    public final Object a(Class class0) {
        return this.k(r.a(class0));
    }

    public final void b(HashMap hashMap0, boolean z) {
        ArrayDeque arrayDeque0;
        for(Object object0: hashMap0.entrySet()) {
            b b0 = (b)((Map.Entry)object0).getKey();
            a a0 = (a)((Map.Entry)object0).getValue();
            if(b0.d == 1 || b0.d == 2 && z) {
                a0.get();
            }
        }
        k k0 = this.c0;
        synchronized(k0) {
            arrayDeque0 = k0.b;
            if(arrayDeque0 == null) {
                arrayDeque0 = null;
            }
            else {
                k0.b = null;
            }
        }
        if(arrayDeque0 != null) {
            Iterator iterator1 = arrayDeque0.iterator();
            if(iterator1.hasNext()) {
                throw v1.r.e(iterator1);
            }
        }
    }

    public final void c() {
        for(Object object0: this.X.keySet()) {
            b b0 = (b)object0;
            for(Object object1: b0.c) {
                i i0 = (i)object1;
                if(i0.b == 2 && !this.Z.containsKey(i0.a)) {
                    Set set0 = Collections.emptySet();
                    n n0 = new n();  // initializer: Ljava/lang/Object;-><init>()V
                    n0.b = null;
                    n0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    n0.a.addAll(set0);
                    this.Z.put(i0.a, n0);
                }
                else if(!this.Y.containsKey(i0.a)) {
                    switch(i0.b) {
                        case 1: {
                            throw new j("Unsatisfied dependency for component " + b0 + ": " + i0.a);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        case 2: {
                            continue;
                        }
                    }
                    m7.p p0 = new m7.p();  // initializer: Ljava/lang/Object;-><init>()V
                    p0.a = m7.p.c;
                    p0.b = m7.p.d;
                    this.Y.put(i0.a, p0);
                }
            }
        }
    }

    @Override  // m7.c
    public final a d(r r0) {
        synchronized(this) {
            Q4.i.o(r0, "Null interface requested.");
            return (a)this.Y.get(r0);
        }
    }

    public final ArrayList e(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            b b0 = (b)object0;
            if(b0.e == 0) {
                a a0 = (a)this.X.get(b0);
                for(Object object1: b0.b) {
                    r r0 = (r)object1;
                    HashMap hashMap0 = this.Y;
                    if(hashMap0.containsKey(r0)) {
                        arrayList1.add(new M1(((m7.p)(((a)hashMap0.get(r0)))), 13, a0));
                    }
                    else {
                        hashMap0.put(r0, a0);
                    }
                }
            }
        }
        return arrayList1;
    }

    public final ArrayList f() {
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.X.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            b b0 = (b)map$Entry0.getKey();
            if(b0.e != 0) {
                a a0 = (a)map$Entry0.getValue();
                for(Object object1: b0.b) {
                    r r0 = (r)object1;
                    if(!hashMap0.containsKey(r0)) {
                        hashMap0.put(r0, new HashSet());
                    }
                    ((Set)hashMap0.get(r0)).add(a0);
                }
            }
        }
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            Object object3 = map$Entry1.getKey();
            HashMap hashMap1 = this.Z;
            if(hashMap1.containsKey(object3)) {
                n n1 = (n)hashMap1.get(map$Entry1.getKey());
                for(Object object4: ((Set)map$Entry1.getValue())) {
                    arrayList0.add(new M1(n1, 14, ((a)object4)));
                }
            }
            else {
                r r1 = (r)map$Entry1.getKey();
                Set set0 = (Set)(((Collection)map$Entry1.getValue()));
                n n0 = new n();  // initializer: Ljava/lang/Object;-><init>()V
                n0.b = null;
                n0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                n0.a.addAll(set0);
                hashMap1.put(r1, n0);
            }
        }
        return arrayList0;
    }

    @Override  // m7.c
    public final Set h(r r0) {
        synchronized(this) {
            n n0 = (n)this.Z.get(r0);
            if(n0 != null) {
                return (Set)n0.get();
            }
        }
        return (Set)f.f0.get();
    }

    @Override  // m7.c
    public final Object k(r r0) {
        a a0 = this.d(r0);
        return a0 == null ? null : a0.get();
    }

    @Override  // m7.c
    public final a l(Class class0) {
        return this.d(r.a(class0));
    }
}

