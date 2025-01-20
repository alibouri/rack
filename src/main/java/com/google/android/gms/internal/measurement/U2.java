package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public abstract class u2 {
    public static final char[] a;

    static {
        char[] arr_c = new char[80];
        u2.a = arr_c;
        Arrays.fill(arr_c, ' ');
    }

    public static void a(int v, StringBuilder stringBuilder0) {
        while(true) {
            int v1 = 80;
            if(v <= 0) {
                break;
            }
            if(v <= 80) {
                v1 = v;
            }
            stringBuilder0.append(u2.a, 0, v1);
            v -= v1;
        }
    }

    public static void b(c2 c20, StringBuilder stringBuilder0, int v) {
        boolean z1;
        HashSet hashSet0 = new HashSet();
        HashMap hashMap0 = new HashMap();
        TreeMap treeMap0 = new TreeMap();
        Method[] arr_method = c20.getClass().getDeclaredMethods();
        for(int v2 = 0; v2 < arr_method.length; ++v2) {
            Method method0 = arr_method[v2];
            if(!Modifier.isStatic(method0.getModifiers()) && method0.getName().length() >= 3) {
                if(method0.getName().startsWith("set")) {
                    hashSet0.add(method0.getName());
                }
                else if(Modifier.isPublic(method0.getModifiers()) && method0.getParameterTypes().length == 0) {
                    if(method0.getName().startsWith("has")) {
                        hashMap0.put(method0.getName(), method0);
                    }
                    else if(method0.getName().startsWith("get")) {
                        treeMap0.put(method0.getName(), method0);
                    }
                }
            }
        }
        for(Object object0: treeMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = ((String)map$Entry0.getKey()).substring(3);
            if(s.endsWith("List") && !s.endsWith("OrBuilderList") && !s.equals("List")) {
                Method method1 = (Method)map$Entry0.getValue();
                if(method1 != null && method1.getReturnType().equals(List.class)) {
                    u2.c(stringBuilder0, v, s.substring(0, s.length() - 4), c2.f(method1, c20, new Object[0]));
                    continue;
                }
            }
            if(s.endsWith("Map") && !s.equals("Map")) {
                Method method2 = (Method)map$Entry0.getValue();
                if(method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    u2.c(stringBuilder0, v, s.substring(0, s.length() - 3), c2.f(method2, c20, new Object[0]));
                    continue;
                }
            }
            if(hashSet0.contains("set" + s) && (!s.endsWith("Bytes") || !treeMap0.containsKey("get" + s.substring(0, s.length() - 5)))) {
                Method method3 = (Method)map$Entry0.getValue();
                Method method4 = (Method)hashMap0.get("has" + s);
                if(method3 != null) {
                    boolean z = true;
                    Object object1 = c2.f(method3, c20, new Object[0]);
                    if(method4 == null) {
                        if(!(object1 instanceof Boolean)) {
                            if(!(object1 instanceof Integer)) {
                                if(!(object1 instanceof Float)) {
                                    if(!(object1 instanceof Double)) {
                                        if(object1 instanceof String) {
                                            z1 = object1.equals("");
                                        }
                                        else if(object1 instanceof T1) {
                                            z1 = object1.equals(T1.Z);
                                        }
                                        else if(!(object1 instanceof N1)) {
                                            if(object1 instanceof Enum && ((Enum)object1).ordinal() == 0) {
                                                z1 = true;
                                            }
                                        }
                                        else if(object1 == ((c2)((c2)(((N1)object1))).e(6))) {
                                            z1 = true;
                                        }
                                    }
                                    else if(Double.doubleToRawLongBits(((double)(((Double)object1)))) == 0L) {
                                        z1 = true;
                                    }
                                }
                                else if(Float.floatToRawIntBits(((float)(((Float)object1)))) == 0) {
                                    z1 = true;
                                }
                            }
                            else if(((int)(((Integer)object1))) == 0) {
                                z1 = true;
                            }
                        }
                        else if(!((Boolean)object1).booleanValue()) {
                            z1 = true;
                        }
                        else {
                            z1 = false;
                        }
                        if(z1) {
                            z = false;
                        }
                    }
                    else {
                        z = ((Boolean)c2.f(method4, c20, new Object[0])).booleanValue();
                    }
                    if(z) {
                        u2.c(stringBuilder0, v, s, object1);
                    }
                }
            }
        }
        D2 d20 = c20.zzb;
        if(d20 != null) {
            for(int v1 = 0; v1 < d20.a; ++v1) {
                u2.c(stringBuilder0, v, String.valueOf(d20.b[v1] >>> 3), d20.c[v1]);
            }
        }
    }

    public static void c(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 instanceof List) {
            for(Object object1: ((List)object0)) {
                u2.c(stringBuilder0, v, s, object1);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                u2.c(stringBuilder0, v, s, ((Map.Entry)object2));
            }
            return;
        }
        stringBuilder0.append('\n');
        u2.a(v, stringBuilder0);
        if(!s.isEmpty()) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(Character.toLowerCase(s.charAt(0)));
            for(int v1 = 1; v1 < s.length(); ++v1) {
                int v2 = s.charAt(v1);
                if(Character.isUpperCase(((char)v2))) {
                    stringBuilder1.append("_");
                }
                stringBuilder1.append(Character.toLowerCase(((char)v2)));
            }
            s = stringBuilder1.toString();
        }
        stringBuilder0.append(s);
        if(object0 instanceof String) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(x1.f(new T1(((String)object0).getBytes(e2.a))));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof T1) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(x1.f(((T1)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof c2) {
            stringBuilder0.append(" {");
            u2.b(((c2)object0), stringBuilder0, v + 2);
            stringBuilder0.append("\n");
            u2.a(v, stringBuilder0);
            stringBuilder0.append("}");
            return;
        }
        if(object0 instanceof Map.Entry) {
            stringBuilder0.append(" {");
            u2.c(stringBuilder0, v + 2, "key", ((Map.Entry)object0).getKey());
            u2.c(stringBuilder0, v + 2, "value", ((Map.Entry)object0).getValue());
            stringBuilder0.append("\n");
            u2.a(v, stringBuilder0);
            stringBuilder0.append("}");
            return;
        }
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
    }
}

