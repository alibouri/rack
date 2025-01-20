package com.google.protobuf;

public final class m implements L {
    public final int a;
    public static final m b;

    static {
        m.b = new m(0);
    }

    public m(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.protobuf.L
    public final W a(Class class0) {
        if(this.a != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        Class class1 = p.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (W)p.n(class0.asSubclass(class1)).m(3);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.protobuf.L
    public final boolean b(Class class0) {
        return this.a == 0 ? p.class.isAssignableFrom(class0) : false;
    }
}

