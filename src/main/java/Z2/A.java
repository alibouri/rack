package z2;

import Ab.e;
import N4.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {
    public final HashMap a;
    public final HashSet b;
    public final Context c;
    public static volatile a d;
    public static final Object e;

    static {
        a.e = new Object();
    }

    public a(Context context0) {
        this.c = context0.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }

    public final void a(Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        else {
            try {
                HashSet hashSet0 = new HashSet();
                Iterator iterator0 = bundle0.keySet().iterator();
                while(true) {
                    boolean z = iterator0.hasNext();
                    HashSet hashSet1 = this.b;
                    if(!z) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    if("androidx.startup".equals(bundle0.getString(s, null))) {
                        Class class0 = Class.forName(s);
                        if(b.class.isAssignableFrom(class0)) {
                            hashSet1.add(class0);
                        }
                    }
                }
                for(Object object1: hashSet1) {
                    this.b(((Class)object1), hashSet0);
                }
                return;
            }
            catch(ClassNotFoundException classNotFoundException0) {
            }
        }
        throw new e(classNotFoundException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    }

    public final Object b(Class class0, HashSet hashSet0) {
        Object object1;
        HashMap hashMap0;
        if(j.x()) {
            try {
                Trace.beginSection(j.P(class0.getSimpleName()));
            label_2:
                if(hashSet0.contains(class0)) {
                    throw new IllegalStateException("Cannot initialize " + class0.getName() + ". Cycle detected.");
                }
                hashMap0 = this.a;
                if(hashMap0.containsKey(class0)) {
                    object1 = hashMap0.get(class0);
                }
                else {
                    hashSet0.add(class0);
                    goto label_7;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
        }
        else {
            goto label_2;
            try {
            label_7:
                b b0 = (b)class0.getDeclaredConstructor(null).newInstance(null);
                List list0 = b0.a();
                if(!list0.isEmpty()) {
                    for(Object object0: list0) {
                        Class class1 = (Class)object0;
                        if(!hashMap0.containsKey(class1)) {
                            this.b(class1, hashSet0);
                        }
                    }
                }
                object1 = b0.b(this.c);
                hashSet0.remove(class0);
                hashMap0.put(class0, object1);
                goto label_28;
            }
            catch(Throwable throwable1) {
            }
            try {
                throw new e(throwable1);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(Throwable throwable0) {
            }
        }
        Trace.endSection();
        throw throwable0;
    label_28:
        Trace.endSection();
        return object1;
    }

    public static a c(Context context0) {
        if(a.d == null) {
            Object object0 = a.e;
            synchronized(object0) {
                if(a.d == null) {
                    a.d = new a(context0);
                }
            }
        }
        return a.d;
    }
}

