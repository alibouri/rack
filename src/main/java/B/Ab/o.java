package Ab;

import Nb.j;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

public final class o implements h, Serializable {
    public Function0 X;
    public volatile Object Y;
    public final Object Z;

    public o(Function0 function00) {
        j.f(function00, "initializer");
        super();
        this.X = function00;
        this.Y = r.a;
        this.Z = this;
    }

    @Override  // Ab.h
    public final Object getValue() {
        Object object0 = this.Y;
        r r0 = r.a;
        if(object0 != r0) {
            return object0;
        }
        synchronized(this.Z) {
            Object object2 = this.Y;
            if(object2 == r0) {
                Function0 function00 = this.X;
                j.c(function00);
                object2 = function00.invoke();
                this.Y = object2;
                this.X = null;
            }
            return object2;
        }
    }

    @Override
    public final String toString() {
        return this.Y == r.a ? "Lazy value not initialized yet." : String.valueOf(this.getValue());
    }

    private final Object writeReplace() {
        return new d(this.getValue());
    }
}

