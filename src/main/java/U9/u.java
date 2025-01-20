package u9;

import Nb.j;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import q8.c;

public final class u {
    public static final c a;
    public static volatile u b;
    public static SharedPreferences c;

    static {
        u.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static void a(String s) {
        j.f(s, "name");
        SharedPreferences sharedPreferences0 = u.c;
        if(sharedPreferences0 != null) {
            int v = sharedPreferences0.getInt("SHOWED_UP" + s, 0);
            SharedPreferences sharedPreferences1 = u.c;
            if(sharedPreferences1 != null) {
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences1.edit();
                sharedPreferences$Editor0.putInt("SHOWED_UP" + s, v + 1);
                sharedPreferences$Editor0.apply();
                return;
            }
            j.p("sharedPreferenceManager");
            throw null;
        }
        j.p("sharedPreferenceManager");
        throw null;
    }
}

