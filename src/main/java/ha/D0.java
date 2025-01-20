package ha;

import Ab.t;
import kotlin.jvm.functions.Function0;

public final class d0 implements Function0 {
    public final int X;
    public final n Y;

    public d0(n n0, int v) {
        this.X = v;
        this.Y = n0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                this.Y.r.invoke();
                return t.a;
            }
            case 1: {
                this.Y.r.invoke();
                return t.a;
            }
            case 2: {
                this.Y.r.invoke();
                return t.a;
            }
            case 3: {
                this.Y.e.invoke();
                this.Y.a().invoke();
                return t.a;
            }
            case 4: {
                this.Y.s.invoke();
                return t.a;
            }
            default: {
                this.Y.t.invoke();
                return t.a;
            }
        }
    }
}

