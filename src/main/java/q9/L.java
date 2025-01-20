package q9;

import B4.e;
import Nb.j;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.Set;

public final class l implements SharedPreferences.Editor, s1 {
    public final SharedPreferences.Editor a;

    public l(m m0) {
        this.a = ((SharedPreferences)m0.c).edit();
    }

    @Override  // q9.s1
    public final s1 a(e e0) {
        j.f(e0, "key");
        this.remove(e0.a);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final void apply() {
        this.a.apply();
    }

    @Override  // q9.s1
    public final s1 b(e e0, Object object0) {
        o0.O(this, e0, object0);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor clear() {
        return this.a.clear();
    }

    @Override  // android.content.SharedPreferences$Editor
    public final boolean commit() {
        return this.a.commit();
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putBoolean(String s, boolean z) {
        return this.a.putBoolean(s, z);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putFloat(String s, float f) {
        return this.a.putFloat(s, f);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putInt(String s, int v) {
        return this.a.putInt(s, v);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putLong(String s, long v) {
        return this.a.putLong(s, v);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putString(String s, String s1) {
        return this.a.putString(s, s1);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putStringSet(String s, Set set0) {
        return this.a.putStringSet(s, set0);
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor remove(String s) {
        return this.a.remove(s);
    }
}

