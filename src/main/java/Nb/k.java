package Nb;

import java.io.Serializable;

public abstract class k implements g, Serializable {
    private final int arity;

    public k(int v) {
        this.arity = v;
    }

    @Override  // Nb.g
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        x.a.getClass();
        String s = y.a(this);
        j.e(s, "renderLambdaToString(...)");
        return s;
    }
}

