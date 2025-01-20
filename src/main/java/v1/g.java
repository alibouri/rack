package V1;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.x;
import java.util.ArrayList;
import java.util.Collection;
import v.h;

public final class g extends v {
    private static final g DEFAULT_INSTANCE = null;
    private static volatile W PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x strings_;

    static {
        g g0 = new g();
        g.DEFAULT_INSTANCE = g0;
        v.h(g.class, g0);
    }

    public g() {
        this.strings_ = Z.b0;
    }

    @Override  // androidx.datastore.preferences.protobuf.v
    public final Object d(int v) {
        switch(h.d(v)) {
            case 0: {
                return (byte)1;
            }
            case 1: {
                return null;
            }
            case 2: {
                return new a0(g.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"strings_"});
            }
            case 3: {
                return new g();
            }
            case 4: {
                return new f(g.DEFAULT_INSTANCE);  // initializer: Landroidx/datastore/preferences/protobuf/t;-><init>(Landroidx/datastore/preferences/protobuf/v;)V
            }
            case 5: {
                return g.DEFAULT_INSTANCE;
            }
            case 6: {
                W w0 = g.PARSER;
                if(w0 == null) {
                    Class class0 = g.class;
                    synchronized(class0) {
                        w0 = g.PARSER;
                        if(w0 == null) {
                            w0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
                            g.PARSER = w0;
                        }
                    }
                }
                return w0;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    public static void i(g g0, Iterable iterable0) {
        x x0 = g0.strings_;
        if(!((b)x0).X) {
            int v = x0.size();
            g0.strings_ = x0.f((v == 0 ? 10 : v * 2));
        }
        x x1 = g0.strings_;
        iterable0.getClass();
        if(iterable0 instanceof D) {
            int v1 = x1.size();
            for(Object object0: ((D)iterable0).k()) {
                if(object0 == null) {
                    String s = "Element at index " + (((D)x1).size() - v1) + " is null.";
                    for(int v2 = ((D)x1).size() - 1; v2 >= v1; --v2) {
                        ((D)x1).remove(v2);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof androidx.datastore.preferences.protobuf.g) {
                    ((D)x1).p(((androidx.datastore.preferences.protobuf.g)object0));
                }
                else {
                    ((D)x1).add(((String)object0));
                }
            }
            return;
        }
        if(iterable0 instanceof X) {
            x1.addAll(((Collection)iterable0));
            return;
        }
        if(x1 instanceof ArrayList && iterable0 instanceof Collection) {
            ((ArrayList)x1).ensureCapacity(((Collection)iterable0).size() + x1.size());
        }
        int v3 = x1.size();
        for(Object object1: iterable0) {
            if(object1 == null) {
                String s1 = "Element at index " + (x1.size() - v3) + " is null.";
                for(int v4 = x1.size() - 1; v4 >= v3; --v4) {
                    x1.remove(v4);
                }
                throw new NullPointerException(s1);
            }
            x1.add(object1);
        }
    }

    public static g j() {
        return g.DEFAULT_INSTANCE;
    }

    public final x k() {
        return this.strings_;
    }

    public static f l() {
        return (f)(((t)g.DEFAULT_INSTANCE.d(5)));
    }
}

