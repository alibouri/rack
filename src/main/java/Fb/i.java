package Fb;

import Nb.g;
import Nb.j;
import Nb.x;
import Nb.y;

public abstract class i extends h implements g {
    public final int Y;

    public i(kotlin.coroutines.g g0) {
        super(g0);
        this.Y = 2;
    }

    @Override  // Nb.g
    public final int getArity() {
        return this.Y;
    }

    @Override  // Fb.a
    public final String toString() {
        if(this.X == null) {
            x.a.getClass();
            String s = y.a(this);
            j.e(s, "renderLambdaToString(...)");
            return s;
        }
        return super.toString();
    }
}

