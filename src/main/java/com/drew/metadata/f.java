package com.drew.metadata;

public final class f {
    public final int a;
    public final b b;

    public f(int v, b b0) {
        this.a = v;
        this.b = b0;
    }

    @Override
    public final String toString() {
        b b0 = this.b;
        int v = this.a;
        String s = b0.getDescription(v);
        if(s == null) {
            s = b0.getString(v) + " (unable to formulate description)";
        }
        return "[" + b0.getName() + "] " + b0.getTagName(v) + " - " + s;
    }
}

