package q9;

import Nb.j;
import android.content.Context;
import android.content.SharedPreferences;
import com.apollographql.apollo.api.b;
import hb.n;
import java.util.Map;
import java.util.Set;

public final class m implements z1 {
    public final int a;
    public final Object b;
    public final Object c;

    public m(Context context0, String s) {
        this.a = 0;
        j.f(s, "name");
        j.f(context0, "ctx");
        super();
        this.b = s;
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences(s, 0);
        j.e(sharedPreferences0, "getSharedPreferences(...)");
        this.c = sharedPreferences0;
    }

    public m(t1 t10, Context context0) {
        this.a = 1;
        j.f(context0, "ctx");
        super();
        this.b = t10;
        this.c = context0;
    }

    @Override  // q9.z1
    public final String a(x1 x10) {
        if(this.a != 0) {
            j.f(x10, "key");
            return this.j(x10.a);
        }
        j.f(x10, "key");
        return this.j(x10.a);
    }

    @Override  // q9.z1
    public final boolean b(String s, boolean z) {
        if(this.a != 0) {
            j.f(s, "key");
            return this.m().b(s, z);
        }
        j.f(s, "key");
        return ((SharedPreferences)this.c).getBoolean(s, z);
    }

    @Override  // q9.z1
    public final Set c(String s) {
        if(this.a != 0) {
            j.f(s, "key");
            return this.m().c(s);
        }
        j.f(s, "key");
        return ((SharedPreferences)this.c).getStringSet(s, null);
    }

    @Override  // q9.z1
    public final s1 d() {
        return this.a != 0 ? this.m().d() : new l(this);
    }

    @Override  // q9.z1
    public final Map e() {
        if(this.a != 0) {
            return this.m().e();
        }
        Map map0 = ((SharedPreferences)this.c).getAll();
        j.e(map0, "getAll(...)");
        return map0;
    }

    @Override  // q9.z1
    public final long f(long v, String s) {
        return this.a == 0 ? ((SharedPreferences)this.c).getLong(s, v) : this.m().f(v, s);
    }

    @Override  // q9.z1
    public final int g(String s) {
        if(this.a != 0) {
            j.f(s, "key");
            return this.m().g(s);
        }
        j.f(s, "key");
        return ((SharedPreferences)this.c).getInt(s, 0);
    }

    @Override  // q9.z1
    public final long h(w1 w10) {
        return o0.q(this, w10);
    }

    @Override  // q9.z1
    public final boolean i(String s) {
        return this.a == 0 ? ((SharedPreferences)this.c).contains(s) : this.m().i(s);
    }

    @Override  // q9.z1
    public final String j(String s) {
        return this.a == 0 ? ((SharedPreferences)this.c).getString(s, null) : this.m().j(s);
    }

    @Override  // q9.z1
    public final boolean k(u1 u10) {
        if(this.a != 0) {
            j.f(u10, "key");
            return this.b(u10.a, u10.b);
        }
        j.f(u10, "key");
        return this.b(u10.a, u10.b);
    }

    @Override  // q9.z1
    public final int l(v1 v10) {
        if(this.a != 0) {
            j.f(v10, "key");
            return this.g(v10.a);
        }
        j.f(v10, "key");
        return this.g(v10.a);
    }

    public z1 m() {
        Context context0 = (Context)this.c;
        String s = r1.b(context0).g().j("selected_mobile");
        String s1 = ((t1)this.b).X;
        if(s == null) {
            n.d("Getting a user-scoped pref while no user is logged in is likely a mistake.", null, b.t("group", s1), false, 10);
            return new j2();  // initializer: Ljava/lang/Object;-><init>()V
        }
        return new m(context0, b.q(s1, "_", s));
    }

    public Set n(y1 y10) {
        j.f(y10, "key");
        return this.c(y10.a);
    }
}

