package r5;

import java.util.Set;
import o5.c;
import o5.e;
import o5.f;

public final class n implements f {
    public final Set a;
    public final i b;
    public final o c;

    public n(Set set0, i i0, o o0) {
        this.a = set0;
        this.b = i0;
        this.c = o0;
    }

    public final C3.i a(String s, c c0, e e0) {
        Set set0 = this.a;
        if(!set0.contains(c0)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c0, set0));
        }
        return new C3.i(this.b, s, c0, e0, this.c);
    }
}

