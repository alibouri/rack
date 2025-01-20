package V0;

import Nb.j;
import java.util.Locale;

public final class b {
    public final Locale a;

    public b(Locale locale0) {
        this.a = locale0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        return this == object0 ? true : j.a(this.a.toLanguageTag(), ((b)object0).a.toLanguageTag());
    }

    @Override
    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    @Override
    public final String toString() {
        return this.a.toLanguageTag();
    }
}

