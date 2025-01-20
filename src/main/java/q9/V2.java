package q9;

import Ab.o;
import C.l;
import Ea.e0;
import Nb.j;
import W4.f;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import hb.n;
import hd.c;

public final class v2 {
    public final m a;
    public final l b;
    public static final byte[] c;
    public static final o d;

    static {
        v2.c = new byte[]{3, 27, 37, -26, (byte)0x86, -88, 46, -51, (byte)0x8E, 0x75, (byte)0x81, -72, 0x77, -42, -81, 40, 30, -103, 50, 16, 15, -1, 97, 30, (byte)0x8F, (byte)0x91, 6, -19, 76, -39, -106, (byte)0x8B};
        v2.d = f.A(new e0(24));
    }

    public v2(Context context0) {
        j.f(context0, "ctx");
        m m0 = new m(context0, "PinStore");
        C3 c30 = r1.b(context0);
        l l0 = new l(0, 3, C3.class, c30, "accountManager", "getAccountManager()Lcom/wave/accounts/AccountManager;");
        super();
        this.a = m0;
        this.b = l0;
    }

    public final void a() {
        c.a.n("PinRepository");
        c.a.a("Clear PIN", new Object[0]);
        n.a("Clear PIN", null, null, null, null, 30);
        String s = ((B9.f)this.b.get()).h();
        m m0 = this.a;
        if(s != null) {
            m0.getClass();
            ((SharedPreferences)m0.c).edit().remove(s).apply();
            return;
        }
        m0.getClass();
        ((SharedPreferences)m0.c).edit().remove("UserPin").apply();
    }

    public final boolean b() {
        String s = ((B9.f)this.b.get()).h();
        m m0 = this.a;
        if(s != null && ((SharedPreferences)m0.c).contains(s)) {
            return true;
        }
        m0.getClass();
        ((SharedPreferences)m0.c).edit().putString(s, ((SharedPreferences)m0.c).getString("UserPin", null)).apply();
        return ((SharedPreferences)m0.c).contains("UserPin");
    }

    public final void c(String s) {
        j.f(s, "pin");
        c.a.n("PinRepository");
        c.a.a("Set PIN", new Object[0]);
        n.a("Set PIN", null, null, null, null, 30);
        String s1 = ((B9.f)this.b.get()).h();
        String s2 = o0.j(s);
        this.a.getClass();
        SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)this.a.c).edit();
        if(s1 == null) {
            s1 = "UserPin";
        }
        sharedPreferences$Editor0.putString(s1, s2).putString("UserPin", s2).apply();
    }

    public final boolean d(String s) {
        j.f(s, "pin");
        String s1 = ((B9.f)this.b.get()).h();
        m m0 = this.a;
        if(s1 != null && !((SharedPreferences)m0.c).contains(s1)) {
            ((SharedPreferences)m0.c).edit().putString(s1, ((SharedPreferences)m0.c).getString("UserPin", null)).apply();
        }
        if(s1 == null) {
            s1 = "UserPin";
        }
        String s2 = ((SharedPreferences)m0.c).getString(s1, null);
        return s2 != null && s2.equals(o0.j(s));
    }
}

