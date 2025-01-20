package com.google.android.gms.internal.measurement;

import R2.h;
import T8.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class x1 {
    public static m a;
    public static final int[] b;

    static {
        x1.b = new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static double a(double f) {
        if(Double.isNaN(f)) {
            return 0.0;
        }
        if(!Double.isInfinite(f)) {
            int v = Double.compare(f, 0.0);
            if(v != 0 && f == -0.0) {
                return v <= 0 ? Math.floor(Math.abs(f)) * -1.0 : Math.floor(Math.abs(f)) * 1.0;
            }
        }
        return f;
    }

    public static int b(int v) {
        return -(v & 1) ^ v >>> 1;
    }

    public static long c(long v) {
        return -(v & 1L) ^ v >>> 1;
    }

    public static E d(String s) {
        E e0;
        if(s == null || s.isEmpty()) {
            e0 = null;
        }
        else {
            Integer integer0 = Integer.parseInt(s);
            e0 = (E)E.j1.get(integer0);
        }
        if(e0 == null) {
            throw new IllegalArgumentException("Unsupported commandId " + s);
        }
        return e0;
    }

    public static Object e(o o0) {
        if(o.f.equals(o0)) {
            return null;
        }
        if(o.e.equals(o0)) {
            return "";
        }
        if(o0 instanceof n) {
            return x1.g(((n)o0));
        }
        if(o0 instanceof e) {
            Object object0 = new ArrayList();
            ((e)o0).getClass();
            for(int v = 0; v < ((e)o0).u(); ++v) {
                if(v >= ((e)o0).u()) {
                    throw new NoSuchElementException("Out of bounds index: " + v);
                }
                Object object1 = x1.e(((e)o0).s(v));
                if(object1 != null) {
                    ((ArrayList)object0).add(object1);
                }
            }
            return object0;
        }
        return !o0.g().isNaN() ? o0.g() : o0.i();
    }

    public static String f(T1 t10) {
        StringBuilder stringBuilder0 = new StringBuilder(t10.g());
        for(int v = 0; v < t10.g(); ++v) {
            int v1 = t10.a(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static HashMap g(n n0) {
        HashMap hashMap0 = new HashMap();
        n0.getClass();
        for(Object object0: new ArrayList(n0.X.keySet())) {
            String s = (String)object0;
            Object object1 = x1.e(n0.c(s));
            if(object1 != null) {
                hashMap0.put(s, object1);
            }
        }
        return hashMap0;
    }

    public static void h(h h0) {
        int v = x1.m(((double)h0.i("runtime.counter").g()) + 1.0);
        if(v > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        h0.m("runtime.counter", new com.google.android.gms.internal.measurement.h(((double)v)));
    }

    public static void i(m m0) {
        synchronized(x1.class) {
            if(x1.a == null) {
                x1.a = m0;
                return;
            }
        }
        throw new IllegalStateException("init() already called");
    }

    public static void j(E e0, int v, ArrayList arrayList0) {
        x1.k(e0.name(), v, arrayList0);
    }

    public static void k(String s, int v, List list0) {
        if(list0.size() != v) {
            throw new IllegalArgumentException(s + " operation requires " + v + " parameters found " + list0.size());
        }
    }

    public static boolean l(o o0, o o1) {
        if(!o0.getClass().equals(o1.getClass())) {
            return false;
        }
        if(!(o0 instanceof u) && !(o0 instanceof com.google.android.gms.internal.measurement.m)) {
            if(o0 instanceof com.google.android.gms.internal.measurement.h) {
                return Double.isNaN(((double)o0.g())) || Double.isNaN(((double)o1.g())) ? false : o0.g().equals(o1.g());
            }
            if(o0 instanceof q) {
                return o0.i().equals(o1.i());
            }
            return o0 instanceof f ? o0.a().equals(o1.a()) : o0 == o1;
        }
        return true;
    }

    public static int m(double f) {
        if(!Double.isNaN(f) && !Double.isInfinite(f)) {
            int v = Double.compare(f, 0.0);
            if(v != 0) {
                return v <= 0 ? ((int)(((long)(Math.floor(Math.abs(f)) * -1.0 % 4294967296.0)))) : ((int)(((long)(Math.floor(Math.abs(f)) * 1.0 % 4294967296.0))));
            }
        }
        return 0;
    }

    public static void n(E e0, int v, ArrayList arrayList0) {
        x1.o(e0.name(), v, arrayList0);
    }

    public static void o(String s, int v, List list0) {
        if(list0.size() < v) {
            throw new IllegalArgumentException(s + " operation requires at least " + v + " parameters found " + list0.size());
        }
    }

    public static boolean p(o o0) {
        if(o0 == null) {
            return false;
        }
        Double double0 = o0.g();
        return !double0.isNaN() && ((double)double0) < 0.0 && double0.equals(Math.floor(((double)double0)));
    }

    public static void q(int v, String s, ArrayList arrayList0) {
        if(arrayList0.size() > v) {
            throw new IllegalArgumentException(s + " operation requires at most " + v + " parameters found " + arrayList0.size());
        }
    }
}

