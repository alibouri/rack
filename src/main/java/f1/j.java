package F1;

import V0.a;
import android.os.LocaleList;
import java.util.Locale;

public final class j implements h {
    public final LocaleList a;

    public j(Object object0) {
        this.a = (LocaleList)object0;
    }

    @Override  // F1.h
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override  // F1.h
    public final Object b() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return a.y(((h)object0).b(), this.a);
    }

    @Override  // F1.h
    public final Locale get(int v) {
        return this.a.get(v);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // F1.h
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // F1.h
    public final int size() {
        return this.a.size();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

