package q2;

import Bb.A;
import I2.k;
import J2.q;
import Nb.j;
import S2.h;
import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import r.t;
import r2.a;
import w2.c;

public final class u {
    public final Context a;
    public final Class b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public Executor g;
    public Executor h;
    public q i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean m;
    public final long n;
    public final k o;
    public final LinkedHashSet p;
    public HashSet q;

    public u(Context context0, Class class0, String s) {
        j.f(context0, "context");
        super();
        this.a = context0;
        this.b = class0;
        this.c = s;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.k = 1;
        this.l = true;
        this.n = -1L;
        this.o = new k(3);
        this.p = new LinkedHashSet();
    }

    public final void a(a[] arr_a) {
        j.f(arr_a, "migrations");
        if(this.q == null) {
            this.q = new HashSet();
        }
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            HashSet hashSet0 = this.q;
            j.c(hashSet0);
            hashSet0.add(((int)a0.a));
            HashSet hashSet1 = this.q;
            j.c(hashSet1);
            hashSet1.add(((int)a0.b));
        }
        a[] arr_a1 = (a[])Arrays.copyOf(arr_a, arr_a.length);
        this.o.a(arr_a1);
    }

    public final v b() {
        ArrayList arrayList2;
        boolean z2;
        ArrayList arrayList1;
        Object object2;
        int v2;
        Executor executor0 = this.g;
        if(executor0 == null && this.h == null) {
            this.h = p.a.d;
            this.g = p.a.d;
        }
        else if(executor0 != null && this.h == null) {
            this.h = executor0;
        }
        else if(executor0 == null) {
            this.g = this.h;
        }
        HashSet hashSet0 = this.q;
        LinkedHashSet linkedHashSet0 = this.p;
        if(hashSet0 != null) {
            for(Object object0: hashSet0) {
                int v = ((Number)object0).intValue();
                if(linkedHashSet0.contains(v)) {
                    throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + v).toString());
                }
                if(false) {
                    break;
                }
            }
        }
        q q0 = this.i;
        if(q0 == null) {
            q0 = new t();  // initializer: Ljava/lang/Object;-><init>()V
        }
        if(Long.compare(this.n, 0L) > 0) {
            throw this.c == null ? new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.") : new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayList0 = this.d;
        boolean z = this.j;
        int v1 = this.k;
        if(v1 == 0) {
            throw null;
        }
        Context context0 = this.a;
        j.f(context0, "context");
        if(v1 == 1) {
            Object object1 = context0.getSystemService("activity");
            ActivityManager activityManager0 = object1 instanceof ActivityManager ? ((ActivityManager)object1) : null;
            v2 = activityManager0 == null || activityManager0.isLowRamDevice() ? 2 : 3;
        }
        else {
            v2 = v1;
        }
        Executor executor1 = this.g;
        if(executor1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor2 = this.h;
        if(executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        i i0 = new i(context0, this.c, q0, this.o, arrayList0, z, v2, executor1, executor2, this.l, this.m, linkedHashSet0, this.e, this.f);
        Class class0 = this.b;
        Package package0 = class0.getPackage();
        j.c(package0);
        String s = package0.getName();
        String s1 = class0.getCanonicalName();
        j.c(s1);
        j.e(s, "fullPackage");
        if(s.length() != 0) {
            s1 = s1.substring(s.length() + 1);
            j.e(s1, "this as java.lang.String).substring(startIndex)");
        }
        String s2 = s1.replace('.', '_');
        j.e(s2, "replace(...)");
        try {
            Class class1 = Class.forName((s.length() == 0 ? s2 + "_Impl" : s + '.' + (s2 + "_Impl")), true, class0.getClassLoader());
            j.d(class1, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            object2 = class1.getDeclaredConstructor(((Class[])i0)).newInstance(((Object[])i0));
        }
        catch(ClassNotFoundException unused_ex) {
            throw new RuntimeException("Cannot find implementation for " + class0.getCanonicalName() + ". " + (s2 + "_Impl") + " does not exist");
        }
        catch(IllegalAccessException unused_ex) {
            throw new RuntimeException("Cannot access the constructor " + class0.getCanonicalName());
        }
        catch(InstantiationException unused_ex) {
            throw new RuntimeException("Failed to create an instance of " + class0.getCanonicalName());
        }
        ((v)object2).getClass();
        ((v)object2).d = ((v)object2).e(null);
        Set set0 = ((v)object2).h();
        BitSet bitSet0 = new BitSet();
        Iterator iterator1 = set0.iterator();
        while(true) {
            boolean z1 = iterator1.hasNext();
            LinkedHashMap linkedHashMap0 = ((v)object2).h;
            arrayList1 = 0.n;
            if(!z1) {
                break;
            }
            Object object3 = iterator1.next();
            Class class2 = (Class)object3;
            int v3 = arrayList1.size() - 1;
            if(v3 >= 0) {
                while(true) {
                    if(class2.isAssignableFrom(arrayList1.get(v3).getClass())) {
                        bitSet0.set(v3);
                        goto label_84;
                    }
                    if(v3 - 1 < 0) {
                        break;
                    }
                    --v3;
                }
            }
            v3 = -1;
        label_84:
            if(v3 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + class2.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap0.put(class2, arrayList1.get(v3));
        }
        int v4 = arrayList1.size() - 1;
        if(v4 >= 0) {
            while(bitSet0.get(v4)) {
                if(v4 - 1 < 0) {
                    goto label_95;
                }
                --v4;
            }
            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
        }
    label_95:
        for(Object object4: ((v)object2).f(linkedHashMap0)) {
            a a0 = (a)object4;
            int v5 = a0.a;
            k k0 = 0.d;
            LinkedHashMap linkedHashMap1 = k0.a;
            if(linkedHashMap1.containsKey(v5)) {
                Map map0 = (Map)linkedHashMap1.get(v5);
                if(map0 == null) {
                    map0 = A.X;
                }
                z2 = map0.containsKey(((int)a0.b));
            }
            else {
                z2 = false;
            }
            if(!z2) {
                k0.a(new a[]{a0});
            }
        }
        c c0 = ((v)object2).g();
        D d0 = (D)v.r(D.class, c0);
        c c1 = ((v)object2).g();
        q2.a a1 = (q2.a)v.r(q2.a.class, c1);
        ((v)object2).g().setWriteAheadLoggingEnabled(0.g == 3);
        ((v)object2).g = 0.e;
        ((v)object2).b = 0.h;
        ((v)object2).c = new h(0.i);
        ((v)object2).f = 0.f;
        Map map1 = ((v)object2).i();
        BitSet bitSet1 = new BitSet();
        Iterator iterator3 = map1.entrySet().iterator();
        while(true) {
            boolean z3 = iterator3.hasNext();
            arrayList2 = 0.m;
            if(!z3) {
                break;
            }
            Object object5 = iterator3.next();
            Class class3 = (Class)((Map.Entry)object5).getKey();
            for(Object object6: ((List)((Map.Entry)object5).getValue())) {
                Class class4 = (Class)object6;
                int v6 = arrayList2.size() - 1;
                if(v6 >= 0) {
                    while(true) {
                        if(class4.isAssignableFrom(arrayList2.get(v6).getClass())) {
                            bitSet1.set(v6);
                            goto label_142;
                        }
                        if(v6 - 1 < 0) {
                            break;
                        }
                        --v6;
                    }
                }
                v6 = -1;
            label_142:
                if(v6 < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + class4 + ") for " + class3.getCanonicalName() + " is missing in the database configuration.").toString());
                }
                Object object7 = arrayList2.get(v6);
                ((v)object2).l.put(class4, object7);
            }
        }
        int v7 = arrayList2.size() - 1;
        if(v7 >= 0) {
            while(bitSet1.get(v7)) {
                if(v7 - 1 < 0) {
                    return (v)object2;
                }
                --v7;
            }
            throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(v7) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
        }
        return (v)object2;
    }
}

