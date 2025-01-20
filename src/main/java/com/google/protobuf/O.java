package com.google.protobuf;

public final class o implements S {
    static {
        if(h.a == null) {
            Class class0 = h.class;
            synchronized(class0) {
                if(h.a == null) {
                    h h0 = null;
                    Class class1 = g.a;
                    if(class1 != null) {
                        try {
                            h0 = (h)class1.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    if(h0 == null) {
                        h0 = h.b;
                    }
                    h.a = h0;
                }
            }
        }
    }
}

