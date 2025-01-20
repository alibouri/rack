package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class n0 {
    public static final Unsafe a;
    public static final Class b;
    public static final m0 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe0 = n0.j();
        n0.a = unsafe0;
        n0.b = c.a;
        n0.f(Long.TYPE);
        n0.f(Integer.TYPE);
        m0 m00 = null;
        if(unsafe0 != null) {
            m00 = new l0(unsafe0);  // initializer: Lcom/google/protobuf/m0;-><init>(Lsun/misc/Unsafe;)V
        }
        n0.c = m00;
        boolean z = false;
        n0.d = m00 == null ? false : m00.s();
        n0.e = m00 == null ? false : m00.r();
        n0.f = (long)n0.c(byte[].class);
        n0.c(boolean[].class);
        n0.d(boolean[].class);
        n0.c(int[].class);
        n0.d(int[].class);
        n0.c(long[].class);
        n0.d(long[].class);
        n0.c(float[].class);
        n0.d(float[].class);
        n0.c(double[].class);
        n0.d(double[].class);
        n0.c(Object[].class);
        n0.d(Object[].class);
        Field field0 = n0.e();
        if(field0 != null && m00 != null) {
            m00.j(field0);
        }
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        n0.g = z;
    }

    public static void a(Throwable throwable0) {
        Level level0 = Level.WARNING;
        Logger.getLogger(n0.class.getName()).log(level0, "platform method missing - proto runtime falling back to safer methods: " + throwable0);
    }

    public static Object b(Class class0) {
        try {
            return n0.a.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    // Deobfuscation rating: LOW(20)
    public static int c(Class class0) {
        return n0.e ? n0.c.a(class0) : -1;
    }

    public static void d(Class class0) {
        if(n0.e) {
            n0.c.b(class0);
        }
    }

    public static Field e() {
        Field field0 = null;
        try {
            field0 = Buffer.class.getDeclaredField("address");
        }
        catch(Throwable unused_ex) {
        }
        return field0 == null || field0.getType() != Long.TYPE ? null : field0;
    }

    // Deobfuscation rating: LOW(30)
    public static boolean f(Class class0) {
        return false;
    }

    public static byte g(byte[] arr_b, long v) {
        return n0.c.d(n0.f + v, arr_b);
    }

    public static byte h(long v, Object object0) {
        return (byte)(n0.c.g(-4L & v, object0) >>> ((int)((~v & 3L) << 3)) & 0xFF);
    }

    public static byte i(long v, Object object0) {
        return (byte)(n0.c.g(-4L & v, object0) >>> ((int)((v & 3L) << 3)) & 0xFF);
    }

    public static Unsafe j() {
        try {
            return (Unsafe)AccessController.doPrivileged(new j0());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void k(byte[] arr_b, long v, byte b) {
        n0.c.l(arr_b, n0.f + v, b);
    }

    public static void l(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        n0.n((0xFF & b) << v1 | n0.c.g(-4L & v, object0) & ~(0xFF << v1), -4L & v, object0);
    }

    public static void m(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        n0.n((0xFF & b) << v1 | n0.c.g(-4L & v, object0) & ~(0xFF << v1), -4L & v, object0);
    }

    public static void n(int v, long v1, Object object0) {
        n0.c.o(v, v1, object0);
    }

    public static void o(long v, Object object0, Object object1) {
        n0.c.q(v, object0, object1);
    }
}

