package com.google.android.gms.internal.measurement;

import M.J;
import R2.h;
import R2.k;
import io.sentry.g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m5.b;

public final class t {
    public final ArrayList a;
    public final int b;

    public t(int v) {
        this.b = v;
        super();
        this.a = new ArrayList();
    }

    public static o a(B b0, Iterator iterator0, o o0) {
        if(iterator0 != null) {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                o o1 = b0.i(((o)object0)).g(((e)o0));
                if(o1 instanceof i) {
                    if("break".equals(((i)o1).Y)) {
                        return o.e;
                    }
                    if("return".equals(((i)o1).Y)) {
                        return (i)o1;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return o.e;
    }

    public final o b(String s, h h0, ArrayList arrayList0) {
        o o24;
        o o120;
        o o77;
        o o55;
        o o0 = null;
        int v = 0;
        switch(this.b) {
            case 0: {
                switch(x1.d(s)) {
                    case 1: {
                        x1.j(E.d0, 2, arrayList0);
                        o o31 = (o)arrayList0.get(0);
                        int v2 = x1.m(((double)((R2.e)h0.b).n(h0, o31).g()));
                        o o32 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(v2 & x1.m(((double)((R2.e)h0.b).n(h0, o32).g())))));
                    }
                    case 2: {
                        x1.j(E.e0, 2, arrayList0);
                        o o33 = (o)arrayList0.get(0);
                        int v3 = x1.m(((double)((R2.e)h0.b).n(h0, o33).g()));
                        o o34 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(v3 << ((int)(((long)x1.m(((double)((R2.e)h0.b).n(h0, o34).g()))) & 0x1FL)))));
                    }
                    case 3: {
                        x1.j(E.f0, 1, arrayList0);
                        o o35 = (o)arrayList0.get(0);
                        return new com.google.android.gms.internal.measurement.h(((double)(~x1.m(((double)((R2.e)h0.b).n(h0, o35).g())))));
                    }
                    case 4: {
                        x1.j(E.g0, 2, arrayList0);
                        o o36 = (o)arrayList0.get(0);
                        int v4 = x1.m(((double)((R2.e)h0.b).n(h0, o36).g()));
                        o o37 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(v4 | x1.m(((double)((R2.e)h0.b).n(h0, o37).g())))));
                    }
                    case 5: {
                        x1.j(E.h0, 2, arrayList0);
                        o o38 = (o)arrayList0.get(0);
                        int v5 = x1.m(((double)((R2.e)h0.b).n(h0, o38).g()));
                        o o39 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(v5 >> ((int)(((long)x1.m(((double)((R2.e)h0.b).n(h0, o39).g()))) & 0x1FL)))));
                    }
                    case 6: {
                        x1.j(E.i0, 2, arrayList0);
                        o o40 = (o)arrayList0.get(0);
                        double f = (double)((R2.e)h0.b).n(h0, o40).g();
                        o o41 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)((((long)x1.m(f)) & 0xFFFFFFFFL) >>> ((int)(((long)x1.m(((double)((R2.e)h0.b).n(h0, o41).g()))) & 0x1FL)))));
                    }
                    case 7: {
                        x1.j(E.j0, 2, arrayList0);
                        o o42 = (o)arrayList0.get(0);
                        int v6 = x1.m(((double)((R2.e)h0.b).n(h0, o42).g()));
                        o o43 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(v6 ^ x1.m(((double)((R2.e)h0.b).n(h0, o43).g())))));
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
            }
            case 1: {
                x1.k(x1.d(s).name(), 2, arrayList0);
                o o44 = (o)arrayList0.get(0);
                o o45 = ((R2.e)h0.b).n(h0, o44);
                o o46 = (o)arrayList0.get(1);
                o o47 = ((R2.e)h0.b).n(h0, o46);
                switch(x1.d(s)) {
                    case 1: {
                        return t.e(o45, o47) ? o.j : o.k;
                    }
                    case 2: {
                        return t.g(o47, o45) ? o.j : o.k;
                    }
                    case 3: {
                        return t.h(o47, o45) ? o.j : o.k;
                    }
                    case 4: {
                        return x1.l(o45, o47) ? o.j : o.k;
                    }
                    case 5: {
                        return x1.l(o45, o47) ? o.k : o.j;
                    }
                    case 6: {
                        return t.g(o45, o47) ? o.j : o.k;
                    }
                    case 7: {
                        return t.h(o45, o47) ? o.j : o.k;
                    }
                    case 8: {
                        return t.e(o45, o47) ? o.k : o.j;
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
            }
            case 2: {
                switch(x1.d(s)) {
                    case 1: {
                        x1.j(E.b0, 3, arrayList0);
                        o o48 = (o)arrayList0.get(0);
                        o o49 = ((R2.e)h0.b).n(h0, o48);
                        o o50 = (o)arrayList0.get(1);
                        String s2 = ((R2.e)h0.b).n(h0, o50).i();
                        o o51 = (o)arrayList0.get(2);
                        o o52 = ((R2.e)h0.b).n(h0, o51);
                        if(!(o52 instanceof e)) {
                            throw new IllegalArgumentException(b.w("Function arguments for Apply are not a list found ", o52.getClass().getCanonicalName()));
                        }
                        if(s2.isEmpty()) {
                            throw new IllegalArgumentException("Function name for apply is undefined");
                        }
                        return o49.r(s2, h0, ((e)o52).A());
                    }
                    case 2: {
                        return h0.e().g(new e(arrayList0));
                    }
                    case 3: {
                        x1.j(E.l0, 0, arrayList0);
                        return o.h;
                    }
                    case 4: 
                    case 5: {
                        if(!arrayList0.isEmpty()) {
                            o o53 = (o)arrayList0.get(0);
                            o o54 = ((R2.e)h0.b).n(h0, o53);
                            if(o54 instanceof e) {
                                return h0.g(((e)o54));
                            }
                        }
                        return o.e;
                    }
                    case 6: {
                        x1.j(E.l0, 0, arrayList0);
                        return o.g;
                    }
                    case 7: {
                        x1.n(E.s0, 2, arrayList0);
                        o55 = t.c(h0, arrayList0);
                        String s3 = o55.X;
                        if(s3 == null) {
                            h0.m("", o55);
                            return o55;
                        }
                        h0.m(s3, o55);
                        return o55;
                    }
                    case 8: {
                        return t.c(h0, arrayList0);
                    }
                    case 9: {
                        x1.n(E.L0, 2, arrayList0);
                        o o60 = (o)arrayList0.get(0);
                        o o61 = ((R2.e)h0.b).n(h0, o60);
                        o o62 = (o)arrayList0.get(1);
                        o o63 = ((R2.e)h0.b).n(h0, o62);
                        if(arrayList0.size() > 2) {
                            o o64 = (o)arrayList0.get(2);
                            o0 = ((R2.e)h0.b).n(h0, o64);
                        }
                        u u0 = o.e;
                        if(o61.a().booleanValue()) {
                            o55 = h0.g(((e)o63));
                        }
                        else if(o0 == null) {
                            o55 = u0;
                        }
                        else {
                            o55 = h0.g(((e)o0));
                        }
                        return o55 instanceof i ? o55 : u0;
                    }
                    case 10: {
                        return new e(arrayList0);
                    }
                    case 11: {
                        if(arrayList0.isEmpty()) {
                            return o.i;
                        }
                        x1.j(E.a1, 1, arrayList0);
                        o o56 = (o)arrayList0.get(0);
                        return new i("return", ((R2.e)h0.b).n(h0, o56));
                    }
                    case 12: {
                        x1.j(E.d1, 3, arrayList0);
                        o o65 = (o)arrayList0.get(0);
                        o o66 = ((R2.e)h0.b).n(h0, o65);
                        o o67 = (o)arrayList0.get(1);
                        o o68 = ((R2.e)h0.b).n(h0, o67);
                        o o69 = (o)arrayList0.get(2);
                        o o70 = ((R2.e)h0.b).n(h0, o69);
                        if(!(o68 instanceof e)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if(!(o70 instanceof e)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        boolean z1 = false;
                        while(v < ((e)o68).u()) {
                            if(z1) {
                            label_271:
                                o o72 = ((e)o70).s(v);
                                o o73 = ((R2.e)h0.b).n(h0, o72);
                                if(o73 instanceof i) {
                                    return ((i)o73).Y.equals("break") ? o.e : o73;
                                }
                                z1 = true;
                            }
                            else {
                                o o71 = ((e)o68).s(v);
                                if(o66.equals(((R2.e)h0.b).n(h0, o71))) {
                                    goto label_271;
                                }
                            }
                            ++v;
                        }
                        if(((e)o68).u() + 1 == ((e)o70).u()) {
                            o o74 = ((e)o70).s(((e)o68).u());
                            o55 = ((R2.e)h0.b).n(h0, o74);
                            if(o55 instanceof i) {
                                String s4 = ((i)o55).Y;
                                if(s4.equals("return") || s4.equals("continue")) {
                                    return o55;
                                }
                            }
                        }
                        return o.e;
                    }
                    case 13: {
                        x1.j(E.e1, 3, arrayList0);
                        o o57 = (o)arrayList0.get(0);
                        if(((R2.e)h0.b).n(h0, o57).a().booleanValue()) {
                            o o58 = (o)arrayList0.get(1);
                            return ((R2.e)h0.b).n(h0, o58);
                        }
                        o o59 = (o)arrayList0.get(2);
                        return ((R2.e)h0.b).n(h0, o59);
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
            }
            case 3: {
                switch(x1.d(s)) {
                    case 1: {
                        x1.j(E.Z, 2, arrayList0);
                        o o76 = (o)arrayList0.get(0);
                        o77 = ((R2.e)h0.b).n(h0, o76);
                        if(o77.a().booleanValue()) {
                            o o78 = (o)arrayList0.get(1);
                            return ((R2.e)h0.b).n(h0, o78);
                        }
                        break;
                    }
                    case 2: {
                        x1.j(E.R0, 1, arrayList0);
                        o o75 = (o)arrayList0.get(0);
                        return new f(Boolean.valueOf(!((R2.e)h0.b).n(h0, o75).a().booleanValue()));
                    }
                    case 3: {
                        x1.j(E.U0, 2, arrayList0);
                        o o79 = (o)arrayList0.get(0);
                        o77 = ((R2.e)h0.b).n(h0, o79);
                        if(!o77.a().booleanValue()) {
                            o o80 = (o)arrayList0.get(1);
                            return ((R2.e)h0.b).n(h0, o80);
                        }
                        break;
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
                return o77;
            }
            case 4: {
                switch(A.a[x1.d(s).ordinal()]) {
                    case 1: {
                        x1.j(E.x0, 3, arrayList0);
                        if(!(arrayList0.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                        }
                        String s5 = ((o)arrayList0.get(0)).i();
                        o o81 = (o)arrayList0.get(1);
                        o o82 = ((R2.e)h0.b).n(h0, o81);
                        o o83 = (o)arrayList0.get(2);
                        o o84 = ((R2.e)h0.b).n(h0, o83);
                        Iterator iterator2 = o82.e();
                        if(iterator2 != null) {
                            while(iterator2.hasNext()) {
                                Object object2 = iterator2.next();
                                h0.k(s5, ((o)object2));
                                o o85 = h0.g(((e)o84));
                                if(o85 instanceof i) {
                                    if("break".equals(((i)o85).Y)) {
                                        return o.e;
                                    }
                                    if("return".equals(((i)o85).Y)) {
                                        return (i)o85;
                                    }
                                    if(false) {
                                        break;
                                    }
                                }
                            }
                        }
                        return o.e;
                    }
                    case 2: {
                        x1.j(E.y0, 3, arrayList0);
                        if(!(arrayList0.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        }
                        String s6 = ((o)arrayList0.get(0)).i();
                        o o86 = (o)arrayList0.get(1);
                        o o87 = ((R2.e)h0.b).n(h0, o86);
                        o o88 = (o)arrayList0.get(2);
                        o o89 = ((R2.e)h0.b).n(h0, o88);
                        return t.a(new k(h0, 10, s6), o87.e(), o89);
                    }
                    case 3: {
                        x1.j(E.z0, 3, arrayList0);
                        if(!(arrayList0.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                        }
                        String s7 = ((o)arrayList0.get(0)).i();
                        o o90 = (o)arrayList0.get(1);
                        o o91 = ((R2.e)h0.b).n(h0, o90);
                        o o92 = (o)arrayList0.get(2);
                        o o93 = ((R2.e)h0.b).n(h0, o92);
                        Iterator iterator3 = o91.e();
                        if(iterator3 != null) {
                            while(iterator3.hasNext()) {
                                Object object3 = iterator3.next();
                                h h1 = h0.e();
                                h1.k(s7, ((o)object3));
                                o o94 = h1.g(((e)o93));
                                if(o94 instanceof i) {
                                    if("break".equals(((i)o94).Y)) {
                                        return o.e;
                                    }
                                    if("return".equals(((i)o94).Y)) {
                                        return (i)o94;
                                    }
                                    if(false) {
                                        break;
                                    }
                                }
                            }
                        }
                        return o.e;
                    }
                    case 4: {
                        x1.j(E.A0, 4, arrayList0);
                        o o95 = (o)arrayList0.get(0);
                        o o96 = ((R2.e)h0.b).n(h0, o95);
                        if(!(o96 instanceof e)) {
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        }
                        o o97 = (o)arrayList0.get(1);
                        o o98 = (o)arrayList0.get(2);
                        o o99 = (o)arrayList0.get(3);
                        o o100 = ((R2.e)h0.b).n(h0, o99);
                        h h2 = h0.e();
                        for(int v7 = 0; v7 < ((e)o96).u(); ++v7) {
                            String s8 = ((e)o96).s(v7).i();
                            h2.m(s8, h0.i(s8));
                        }
                        while(((R2.e)h0.b).n(h0, o97).a().booleanValue()) {
                            o o101 = h0.g(((e)o100));
                            if(o101 instanceof i) {
                                if("break".equals(((i)o101).Y)) {
                                    break;
                                }
                                if("return".equals(((i)o101).Y)) {
                                    return (i)o101;
                                }
                            }
                            h h3 = h0.e();
                            for(int v8 = 0; v8 < ((e)o96).u(); ++v8) {
                                String s9 = ((e)o96).s(v8).i();
                                h3.m(s9, h2.i(s9));
                            }
                            h3.h(o98);
                            h2 = h3;
                        }
                        return o.e;
                    }
                    case 5: {
                        x1.j(E.B0, 3, arrayList0);
                        if(!(arrayList0.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        }
                        String s10 = ((o)arrayList0.get(0)).i();
                        o o102 = (o)arrayList0.get(1);
                        o o103 = ((R2.e)h0.b).n(h0, o102);
                        o o104 = (o)arrayList0.get(2);
                        o o105 = ((R2.e)h0.b).n(h0, o104);
                        return t.f(new g1(h0, 10, s10), o103, o105);
                    }
                    case 6: {
                        x1.j(E.C0, 3, arrayList0);
                        if(!(arrayList0.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        }
                        String s11 = ((o)arrayList0.get(0)).i();
                        o o106 = (o)arrayList0.get(1);
                        o o107 = ((R2.e)h0.b).n(h0, o106);
                        o o108 = (o)arrayList0.get(2);
                        o o109 = ((R2.e)h0.b).n(h0, o108);
                        return t.f(new k(h0, 10, s11), o107, o109);
                    }
                    case 7: {
                        x1.j(E.D0, 3, arrayList0);
                        if(!(arrayList0.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        }
                        String s12 = ((o)arrayList0.get(0)).i();
                        o o110 = (o)arrayList0.get(1);
                        o o111 = ((R2.e)h0.b).n(h0, o110);
                        o o112 = (o)arrayList0.get(2);
                        o o113 = ((R2.e)h0.b).n(h0, o112);
                        return t.f(new E1(h0, 10, s12), o111, o113);
                    }
                    case 8: {
                        x1.j(E.i1, 4, arrayList0);
                        o o114 = (o)arrayList0.get(0);
                        o o115 = (o)arrayList0.get(1);
                        o o116 = (o)arrayList0.get(2);
                        o o117 = (o)arrayList0.get(3);
                        o o118 = ((R2.e)h0.b).n(h0, o117);
                        if(((R2.e)h0.b).n(h0, o116).a().booleanValue()) {
                            o o119 = h0.g(((e)o118));
                            if(o119 instanceof i) {
                                o120 = (i)o119;
                                if(!"break".equals(o120.Y)) {
                                    if(!"return".equals(o120.Y)) {
                                        goto label_435;
                                    }
                                    return o120;
                                }
                            }
                            else {
                                goto label_435;
                            }
                        }
                        else {
                        label_435:
                            while(((R2.e)h0.b).n(h0, o114).a().booleanValue()) {
                                o o121 = h0.g(((e)o118));
                                if(o121 instanceof i) {
                                    o120 = (i)o121;
                                    if("break".equals(o120.Y)) {
                                        break;
                                    }
                                    if("return".equals(o120.Y)) {
                                        return o120;
                                    }
                                }
                                h0.h(o115);
                            }
                        }
                        return o.e;
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
            }
            case 5: {
                switch(C.a[x1.d(s).ordinal()]) {
                    case 1: {
                        x1.j(E.Y, 2, arrayList0);
                        o o122 = (o)arrayList0.get(0);
                        o o123 = ((R2.e)h0.b).n(h0, o122);
                        o o124 = (o)arrayList0.get(1);
                        o o125 = ((R2.e)h0.b).n(h0, o124);
                        if(!(o123 instanceof j) && !(o123 instanceof q) && !(o125 instanceof j) && !(o125 instanceof q)) {
                            double f1 = (double)o123.g();
                            return new com.google.android.gms.internal.measurement.h(((double)(((double)o125.g()) + f1)));
                        }
                        return new q(com.apollographql.apollo.api.b.p(o123.i(), o125.i()));
                    }
                    case 2: {
                        x1.j(E.t0, 2, arrayList0);
                        o o126 = (o)arrayList0.get(0);
                        double f2 = (double)((R2.e)h0.b).n(h0, o126).g();
                        o o127 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(f2 / ((double)((R2.e)h0.b).n(h0, o127).g()))));
                    }
                    case 3: {
                        x1.j(E.O0, 2, arrayList0);
                        o o128 = (o)arrayList0.get(0);
                        double f3 = (double)((R2.e)h0.b).n(h0, o128).g();
                        o o129 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(f3 % ((double)((R2.e)h0.b).n(h0, o129).g()))));
                    }
                    case 4: {
                        x1.j(E.P0, 2, arrayList0);
                        o o130 = (o)arrayList0.get(0);
                        double f4 = (double)((R2.e)h0.b).n(h0, o130).g();
                        o o131 = (o)arrayList0.get(1);
                        return new com.google.android.gms.internal.measurement.h(((double)(f4 * ((double)((R2.e)h0.b).n(h0, o131).g()))));
                    }
                    case 5: {
                        x1.j(E.Q0, 1, arrayList0);
                        o o132 = (o)arrayList0.get(0);
                        return new com.google.android.gms.internal.measurement.h(((double)(((double)((R2.e)h0.b).n(h0, o132).g()) * -1.0)));
                    }
                    case 6: 
                    case 7: {
                        x1.k(s, 2, arrayList0);
                        o o133 = (o)arrayList0.get(0);
                        o o134 = ((R2.e)h0.b).n(h0, o133);
                        h0.h(((o)arrayList0.get(1)));
                        return o134;
                    }
                    case 8: 
                    case 9: {
                        x1.k(s, 1, arrayList0);
                        o o135 = (o)arrayList0.get(0);
                        return ((R2.e)h0.b).n(h0, o135);
                    }
                    case 10: {
                        x1.j(E.c1, 2, arrayList0);
                        o o136 = (o)arrayList0.get(0);
                        o o137 = ((R2.e)h0.b).n(h0, o136);
                        o o138 = (o)arrayList0.get(1);
                        double f5 = (double)((R2.e)h0.b).n(h0, o138).g();
                        return new com.google.android.gms.internal.measurement.h(((double)(((double)o137.g()) + f5 * -1.0)));
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
            }
            case 6: {
                if(s == null || s.isEmpty() || !h0.l(s)) {
                    throw new IllegalArgumentException("Command not found: " + s);
                }
                o o139 = h0.i(s);
                if(!(o139 instanceof com.google.android.gms.internal.measurement.k)) {
                    throw new IllegalArgumentException(J.e("Function ", s, " is not defined"));
                }
                return ((com.google.android.gms.internal.measurement.k)o139).b(h0, arrayList0);
            }
            default: {
            alab1:
                switch(D.a[x1.d(s).ordinal()]) {
                    case 1: {
                        x1.j(E.c0, 2, arrayList0);
                        o o1 = (o)arrayList0.get(0);
                        o o2 = ((R2.e)h0.b).n(h0, o1);
                        if(!(o2 instanceof q)) {
                            throw new IllegalArgumentException(b.w("Expected string for assign var. got ", o2.getClass().getCanonicalName()));
                        }
                        boolean z = h0.l(((q)o2).X);
                        String s1 = ((q)o2).X;
                        if(!z) {
                            throw new IllegalArgumentException("Attempting to assign undefined value " + s1);
                        }
                        o o3 = (o)arrayList0.get(1);
                        o o4 = ((R2.e)h0.b).n(h0, o3);
                        h0.m(s1, o4);
                        return o4;
                    }
                    case 2: {
                        x1.n(E.n0, 2, arrayList0);
                        if(arrayList0.size() % 2 != 0) {
                            throw new IllegalArgumentException("CONST requires an even number of arguments, found " + arrayList0.size());
                        }
                        while(v < arrayList0.size() - 1) {
                            o o5 = (o)arrayList0.get(v);
                            o o6 = ((R2.e)h0.b).n(h0, o5);
                            if(!(o6 instanceof q)) {
                                throw new IllegalArgumentException(b.w("Expected string for const name. got ", o6.getClass().getCanonicalName()));
                            }
                            o o7 = (o)arrayList0.get(v + 1);
                            o o8 = ((R2.e)h0.b).n(h0, o7);
                            h0.k(((q)o6).X, o8);
                            ((HashMap)h0.d).put(((q)o6).X, Boolean.TRUE);
                            v += 2;
                        }
                        return o.e;
                    }
                    case 3: {
                        if(arrayList0.isEmpty()) {
                            return new e();
                        }
                        o24 = new e();
                        Iterator iterator1 = arrayList0.iterator();
                        while(true) {
                            if(!iterator1.hasNext()) {
                                break alab1;
                            }
                            Object object1 = iterator1.next();
                            o o25 = ((R2.e)h0.b).n(h0, ((o)object1));
                            if(o25 instanceof i) {
                                throw new IllegalStateException("Failed to evaluate array element");
                            }
                            ((e)o24).x(v, o25);
                            ++v;
                        }
                    }
                    case 4: {
                        if(arrayList0.isEmpty()) {
                            return new n();
                        }
                        if(arrayList0.size() % 2 == 0) {
                            o24 = new n();
                            while(true) {
                                if(v >= arrayList0.size() - 1) {
                                    break alab1;
                                }
                                o o26 = (o)arrayList0.get(v);
                                o o27 = ((R2.e)h0.b).n(h0, o26);
                                o o28 = (o)arrayList0.get(v + 1);
                                o o29 = ((R2.e)h0.b).n(h0, o28);
                                if(o27 instanceof i || o29 instanceof i) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                ((n)o24).o(o27.i(), o29);
                                v += 2;
                            }
                        }
                        throw new IllegalArgumentException("CREATE_OBJECT requires an even number of arguments, found " + arrayList0.size());
                    }
                    case 5: {
                        x1.n(E.v0, 1, arrayList0);
                        o24 = o.e;
                        while(true) {
                            if(v >= arrayList0.size()) {
                                break alab1;
                            }
                            o o30 = (o)arrayList0.get(v);
                            o24 = ((R2.e)h0.b).n(h0, o30);
                            if(o24 instanceof i) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            ++v;
                        }
                    }
                    case 6: {
                        x1.j(E.E0, 1, arrayList0);
                        o o9 = (o)arrayList0.get(0);
                        o o10 = ((R2.e)h0.b).n(h0, o9);
                        if(!(o10 instanceof q)) {
                            throw new IllegalArgumentException(b.w("Expected string for get var. got ", o10.getClass().getCanonicalName()));
                        }
                        return h0.i(((q)o10).X);
                    }
                    case 7: 
                    case 8: {
                        x1.j(E.G0, 2, arrayList0);
                        o o11 = (o)arrayList0.get(0);
                        o o12 = ((R2.e)h0.b).n(h0, o11);
                        o o13 = (o)arrayList0.get(1);
                        o o14 = ((R2.e)h0.b).n(h0, o13);
                        if(o12 instanceof e && x1.p(o14)) {
                            return ((e)o12).s(o14.g().intValue());
                        }
                        if(o12 instanceof j) {
                            return ((j)o12).c(o14.i());
                        }
                        if(o12 instanceof q) {
                            if("length".equals(o14.i())) {
                                return new com.google.android.gms.internal.measurement.h(((double)((q)o12).X.length()));
                            }
                            if(x1.p(o14) && ((double)o14.g()) >= ((double)((q)o12).X.length())) {
                                int v1 = o14.g().intValue();
                                return new q(String.valueOf(((q)o12).X.charAt(v1)));
                            }
                        }
                        return o.e;
                    }
                    case 9: {
                        x1.j(E.T0, 0, arrayList0);
                        return o.f;
                    }
                    case 10: {
                        x1.j(E.b1, 3, arrayList0);
                        o o15 = (o)arrayList0.get(0);
                        o o16 = ((R2.e)h0.b).n(h0, o15);
                        o o17 = (o)arrayList0.get(1);
                        o o18 = ((R2.e)h0.b).n(h0, o17);
                        o o19 = (o)arrayList0.get(2);
                        o o20 = ((R2.e)h0.b).n(h0, o19);
                        if(o16 == o.e || o16 == o.f) {
                            throw new IllegalStateException("Can\'t set property " + o18.i() + " of " + o16.i());
                        }
                        if(o16 instanceof e && o18 instanceof com.google.android.gms.internal.measurement.h) {
                            ((e)o16).x(((com.google.android.gms.internal.measurement.h)o18).X.intValue(), o20);
                            return o20;
                        }
                        if(o16 instanceof j) {
                            ((j)o16).o(o18.i(), o20);
                            return o20;
                        }
                        return o20;
                    }
                    case 11: {
                        x1.j(E.f1, 1, arrayList0);
                        o o21 = (o)arrayList0.get(0);
                        o o22 = ((R2.e)h0.b).n(h0, o21);
                        if(o22 instanceof u) {
                            return new q("undefined");
                        }
                        if(o22 instanceof f) {
                            return new q("boolean");
                        }
                        if(o22 instanceof com.google.android.gms.internal.measurement.h) {
                            return new q("number");
                        }
                        if(o22 instanceof q) {
                            return new q("string");
                        }
                        if(o22 instanceof p) {
                            return new q("function");
                        }
                        if(o22 instanceof r || o22 instanceof i) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", o22));
                        }
                        return new q("object");
                    }
                    case 12: {
                        x1.j(E.g1, 0, arrayList0);
                        return o.e;
                    }
                    case 13: {
                        x1.n(E.h1, 1, arrayList0);
                        for(Object object0: arrayList0) {
                            o o23 = ((R2.e)h0.b).n(h0, ((o)object0));
                            if(!(o23 instanceof q)) {
                                throw new IllegalArgumentException(b.w("Expected string for var name. got ", o23.getClass().getCanonicalName()));
                            }
                            h0.k(((q)o23).X, o.e);
                        }
                        return o.e;
                    }
                    default: {
                        this.d(s);
                        throw null;
                    }
                }
                return o24;
            }
        }
    }

    public static p c(h h0, ArrayList arrayList0) {
        x1.n(E.w0, 2, arrayList0);
        o o0 = (o)arrayList0.get(0);
        o o1 = ((R2.e)h0.b).n(h0, o0);
        o o2 = (o)arrayList0.get(1);
        o o3 = ((R2.e)h0.b).n(h0, o2);
        if(!(o3 instanceof e)) {
            throw new IllegalArgumentException(b.w("FN requires an ArrayValue of parameter names found ", o3.getClass().getCanonicalName()));
        }
        ArrayList arrayList1 = ((e)o3).A();
        List list0 = new ArrayList();
        if(arrayList0.size() > 2) {
            list0 = arrayList0.subList(2, arrayList0.size());
        }
        return new p(o1.i(), arrayList1, list0, h0);
    }

    public final void d(String s) {
        E e0 = x1.d(s);
        if(!this.a.contains(e0)) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + s);
    }

    public static boolean e(o o0, o o1) {
        com.google.android.gms.internal.measurement.h h0;
        while(true) {
            if(o0.getClass().equals(o1.getClass())) {
                if(!(o0 instanceof u) && !(o0 instanceof m)) {
                    if(o0 instanceof com.google.android.gms.internal.measurement.h) {
                        return !Double.isNaN(((double)o0.g())) && !Double.isNaN(((double)o1.g())) && ((double)o0.g()) == ((double)o1.g());
                    }
                    if(o0 instanceof q) {
                        return o0.i().equals(o1.i());
                    }
                    return o0 instanceof f ? o0.a().equals(o1.a()) : o0 == o1;
                }
                return true;
            }
            if((o0 instanceof u || o0 instanceof m) && (o1 instanceof u || o1 instanceof m)) {
                break;
            }
            if(o0 instanceof com.google.android.gms.internal.measurement.h && o1 instanceof q) {
                o1 = new com.google.android.gms.internal.measurement.h(o1.g());
            }
            else {
                if(o0 instanceof q && o1 instanceof com.google.android.gms.internal.measurement.h) {
                    h0 = new com.google.android.gms.internal.measurement.h(o0.g());
                }
                else if(o0 instanceof f) {
                    h0 = new com.google.android.gms.internal.measurement.h(o0.g());
                }
                else if(o1 instanceof f) {
                    o1 = new com.google.android.gms.internal.measurement.h(o1.g());
                    continue;
                }
                else if(!(o0 instanceof q) && !(o0 instanceof com.google.android.gms.internal.measurement.h) || !(o1 instanceof j)) {
                    if(!(o0 instanceof j) || !(o1 instanceof q) && !(o1 instanceof com.google.android.gms.internal.measurement.h)) {
                        return false;
                    }
                    h0 = new q(o0.i());
                }
                else {
                    o1 = new q(o1.i());
                    continue;
                }
                o0 = h0;
            }
        }
        return true;
    }

    public static o f(B b0, o o0, o o1) {
        if(!(o0 instanceof Iterable)) {
            throw new IllegalArgumentException("Non-iterable type in for...of loop.");
        }
        return t.a(b0, ((Iterable)o0).iterator(), o1);
    }

    public static boolean g(o o0, o o1) {
        if(o0 instanceof j) {
            o0 = new q(o0.i());
        }
        if(o1 instanceof j) {
            o1 = new q(o1.i());
        }
        if(o0 instanceof q && o1 instanceof q) {
            return ((q)o0).X.compareTo(((q)o1).X) < 0;
        }
        double f = (double)o0.g();
        double f1 = (double)o1.g();
        return !Double.isNaN(f) && !Double.isNaN(f1) && (Double.compare(f, 0.0) != 0 || f1 != -0.0) && (f != -0.0 || f1 != 0.0) ? Double.compare(f, f1) < 0 : false;
    }

    public static boolean h(o o0, o o1) {
        if(o0 instanceof j) {
            o0 = new q(o0.i());
        }
        if(o1 instanceof j) {
            o1 = new q(o1.i());
        }
        return (o0 instanceof q && o1 instanceof q || !Double.isNaN(((double)o0.g())) && !Double.isNaN(((double)o1.g()))) && !t.g(o1, o0);
    }
}

