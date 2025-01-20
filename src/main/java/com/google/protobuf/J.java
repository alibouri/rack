package com.google.protobuf;

public abstract class j {
    public static final i a;
    public static final i b;

    static {
        j.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i i0 = null;
        try {
            i0 = (i)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
        }
        j.b = i0;
    }
}

