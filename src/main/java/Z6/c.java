package Z6;

import E7.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashSet;
import m7.b;
import m7.e;
import m7.f;
import m7.i;
import m7.r;
import x7.a;

public final class c implements a {
    public final int a;
    public final Object b;
    public final Object c;

    public c(Object object0, int v, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // x7.a
    public final Object get() {
        boolean z1;
        if(this.a != 0) {
            f f0 = (f)this.b;
            f0.getClass();
            b b0 = (b)this.c;
            e e0 = b0.f;
            C c0 = new C();  // initializer: Ljava/lang/Object;-><init>()V
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            for(Object object0: b0.c) {
                int v = ((i)object0).c;
                int v1 = ((i)object0).b;
                r r0 = ((i)object0).a;
                if(v == 0) {
                    if(v1 == 2) {
                        hashSet3.add(r0);
                    }
                    else {
                        hashSet0.add(r0);
                    }
                }
                else if(v == 2) {
                    hashSet2.add(r0);
                }
                else if(v1 == 2) {
                    hashSet4.add(r0);
                }
                else {
                    hashSet1.add(r0);
                }
            }
            if(!b0.g.isEmpty()) {
                hashSet0.add(r.a(u7.b.class));
            }
            c0.X = Collections.unmodifiableSet(hashSet0);
            c0.Y = Collections.unmodifiableSet(hashSet1);
            Collections.unmodifiableSet(hashSet2);
            c0.Z = Collections.unmodifiableSet(hashSet3);
            Collections.unmodifiableSet(hashSet4);
            c0.b0 = f0;
            return e0.d(c0);
        }
        String s = ((g)this.b).d();
        u7.b b1 = (u7.b)((g)this.b).d.a(u7.b.class);
        Context context0 = (Context)this.c;
        Object object1 = new C7.a();  // initializer: Ljava/lang/Object;-><init>()V
        if(Build.VERSION.SDK_INT >= 24) {
            context0 = w1.a.a(context0);
        }
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.common.prefs:" + s, 0);
        boolean z = true;
        if(sharedPreferences0.contains("firebase_data_collection_default_enabled")) {
            z1 = sharedPreferences0.getBoolean("firebase_data_collection_default_enabled", true);
        }
        else {
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 != null) {
                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.wave.personal", 0x80);
                    if(applicationInfo0 != null && (applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                        z = applicationInfo0.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
                z1 = z;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                z1 = z;
                object1.a = z1;
                return object1;
            }
        }
        object1.a = z1;
        return object1;
    }
}

