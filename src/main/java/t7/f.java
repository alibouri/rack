package t7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import m5.b;
import q7.c;
import q7.d;
import q7.e;
import s7.a;

public final class f implements e {
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final a d;
    public final h e;
    public static final Charset f;
    public static final c g;
    public static final c h;
    public static final a i;

    static {
        f.f = Charset.forName("UTF-8");
        t7.a a0 = new t7.a(1);
        f.g = new c("key", b.D(b.C(t7.e.class, a0)));
        t7.a a1 = new t7.a(2);
        f.h = new c("value", b.D(b.C(t7.e.class, a1)));
        f.i = new a(1);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream0, HashMap hashMap0, HashMap hashMap1, a a0) {
        this.e = new h(this);
        this.a = byteArrayOutputStream0;
        this.b = hashMap0;
        this.c = hashMap1;
        this.d = a0;
    }

    @Override  // q7.e
    public final e a(c c0, Object object0) {
        this.h(c0, object0, true);
        return this;
    }

    public final void b(c c0, double f, boolean z) {
        if(z && f == 0.0) {
            return;
        }
        this.k(f.j(c0) << 3 | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(f).array());
    }

    public final void c(c c0, int v, boolean z) {
        if(z && v == 0) {
            return;
        }
        t7.e e0 = (t7.e)(((Annotation)c0.b.get(t7.e.class)));
        if(e0 == null) {
            throw new q7.b("Field has no @Protobuf config");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.k(((t7.a)e0).a << 3);
        this.k(v);
    }

    @Override  // q7.e
    public final e d(c c0, boolean z) {
        this.c(c0, ((int)z), true);
        return this;
    }

    @Override  // q7.e
    public final e e(c c0, int v) {
        this.c(c0, v, true);
        return this;
    }

    @Override  // q7.e
    public final e f(c c0, long v) {
        if(v != 0L) {
            t7.e e0 = (t7.e)(((Annotation)c0.b.get(t7.e.class)));
            if(e0 == null) {
                throw new q7.b("Field has no @Protobuf config");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            this.k(((t7.a)e0).a << 3);
            this.l(v);
            return this;
        }
        return this;
    }

    @Override  // q7.e
    public final e g(c c0, double f) {
        this.b(c0, f, true);
        return this;
    }

    public final void h(c c0, Object object0, boolean z) {
        if(object0 == null) {
            return;
        }
        if(object0 instanceof CharSequence) {
            if(z && ((CharSequence)object0).length() == 0) {
                return;
            }
            this.k(f.j(c0) << 3 | 2);
            byte[] arr_b = ((CharSequence)object0).toString().getBytes(f.f);
            this.k(arr_b.length);
            this.a.write(arr_b);
            return;
        }
        if(object0 instanceof Collection) {
            for(Object object1: ((Collection)object0)) {
                this.h(c0, object1, false);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                this.i(f.i, c0, ((Map.Entry)object2), false);
            }
            return;
        }
        if(object0 instanceof Double) {
            this.b(c0, ((double)(((Double)object0))), z);
            return;
        }
        if(object0 instanceof Float) {
            float f = (float)(((Float)object0));
            if(!z || f == 0.0f) {
                this.k(f.j(c0) << 3 | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
            }
            return;
        }
        if(object0 instanceof Number) {
            long v = ((Number)object0).longValue();
            if(!z || v != 0L) {
                t7.e e0 = (t7.e)(((Annotation)c0.b.get(t7.e.class)));
                if(e0 == null) {
                    throw new q7.b("Field has no @Protobuf config");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                this.k(((t7.a)e0).a << 3);
                this.l(v);
                return;
            }
            return;
        }
        if(object0 instanceof Boolean) {
            this.c(c0, ((int)((Boolean)object0).booleanValue()), z);
            return;
        }
        if(object0 instanceof byte[]) {
            if(z && ((byte[])object0).length == 0) {
                return;
            }
            this.k(f.j(c0) << 3 | 2);
            this.k(((byte[])object0).length);
            this.a.write(((byte[])object0));
            return;
        }
        Class class0 = object0.getClass();
        d d0 = (d)this.b.get(class0);
        if(d0 != null) {
            this.i(d0, c0, object0, z);
            return;
        }
        Class class1 = object0.getClass();
        q7.f f1 = (q7.f)this.c.get(class1);
        if(f1 != null) {
            this.e.a = false;
            this.e.c = c0;
            this.e.b = z;
            f1.a(object0, this.e);
            return;
        }
        if(object0 instanceof t7.c) {
            this.c(c0, ((t7.c)object0).a(), true);
            return;
        }
        if(object0 instanceof Enum) {
            this.c(c0, ((Enum)object0).ordinal(), true);
            return;
        }
        this.i(this.d, c0, object0, z);
    }

    public final void i(d d0, c c0, Object object0, boolean z) {
        long v1;
        try(t7.b b0 = new t7.b()) {  // initializer: Ljava/io/OutputStream;-><init>()V
            b0.X = 0L;
            OutputStream outputStream0 = this.a;
            this.a = b0;
            try {
                d0.a(object0, this);
            }
            finally {
                this.a = outputStream0;
            }
        }
        v1 = b0.X;
        if(z && v1 == 0L) {
            return;
        }
        this.k(f.j(c0) << 3 | 2);
        this.l(v1);
        d0.a(object0, this);
    }

    public static int j(c c0) {
        t7.e e0 = (t7.e)(((Annotation)c0.b.get(t7.e.class)));
        if(e0 == null) {
            throw new q7.b("Field has no @Protobuf config");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return ((t7.a)e0).a;
    }

    public final void k(int v) {
        while(((long)(v & 0xFFFFFF80)) != 0L) {
            this.a.write(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(v & 0x7F);
    }

    public final void l(long v) {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.a.write(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(((int)v) & 0x7F);
    }
}

