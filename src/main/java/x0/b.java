package x0;

import Nb.j;
import android.view.KeyEvent;

public final class b {
    public final KeyEvent a;

    public b(KeyEvent keyEvent0) {
        this.a = keyEvent0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b && j.a(this.a, ((b)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}

