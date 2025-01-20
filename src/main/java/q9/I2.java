package q9;

import B4.e;
import Nb.j;
import android.content.SharedPreferences.Editor;
import java.util.Set;

public final class i2 implements s1 {
    @Override  // q9.s1
    public final s1 a(e e0) {
        j.f(e0, "key");
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final void apply() {
    }

    @Override  // q9.s1
    public final s1 b(e e0, Object object0) {
        o0.O(this, e0, object0);
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor clear() {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final boolean commit() {
        return true;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putBoolean(String s, boolean z) {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putFloat(String s, float f) {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putInt(String s, int v) {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putLong(String s, long v) {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putString(String s, String s1) {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor putStringSet(String s, Set set0) {
        return this;
    }

    @Override  // android.content.SharedPreferences$Editor
    public final SharedPreferences.Editor remove(String s) {
        return this;
    }
}

