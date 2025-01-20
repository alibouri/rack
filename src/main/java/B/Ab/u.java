package Ab;

import Nb.j;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

public final class u implements h, Serializable {
    public Function0 X;
    public Object Y;

    @Override  // Ab.h
    public final Object getValue() {
        if(this.Y == r.a) {
            Function0 function00 = this.X;
            j.c(function00);
            this.Y = function00.invoke();
            this.X = null;
        }
        return this.Y;
    }

    @Override
    public final String toString() {
        return this.Y == r.a ? "Lazy value not initialized yet." : String.valueOf(this.getValue());
    }

    private final Object writeReplace() {
        return new d(this.getValue());
    }
}

