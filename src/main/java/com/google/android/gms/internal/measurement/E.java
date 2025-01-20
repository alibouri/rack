package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class e implements j, o, Iterable {
    public final TreeMap X;
    public final TreeMap Y;

    public e() {
        this.X = new TreeMap();
        this.Y = new TreeMap();
    }

    public e(List list0) {
        if(list0 != null) {
            for(int v = 0; v < list0.size(); ++v) {
                this.x(v, ((o)list0.get(v)));
            }
        }
    }

    public e(o[] arr_o) {
        this(Arrays.asList(arr_o));
    }

    public final ArrayList A() {
        ArrayList arrayList0 = new ArrayList(this.u());
        for(int v = 0; v < this.u(); ++v) {
            arrayList0.add(this.s(v));
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override  // com.google.android.gms.internal.measurement.j
    public final o c(String s) {
        if("length".equals(s)) {
            return new h(((double)this.u()));
        }
        if(this.d(s)) {
            o o0 = (o)this.Y.get(s);
            if(o0 != null) {
                return o0;
            }
        }
        return o.e;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // com.google.android.gms.internal.measurement.j
    public final boolean d(String s) {
        return "length".equals(s) || this.Y.containsKey(s);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return new d(this.X.keySet().iterator(), this.Y.keySet().iterator());
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(this.u() != ((e)object0).u()) {
            return false;
        }
        TreeMap treeMap0 = this.X;
        if(treeMap0.isEmpty()) {
            return ((e)object0).X.isEmpty();
        }
        for(int v = (int)(((Integer)treeMap0.firstKey())); v <= ((int)(((Integer)treeMap0.lastKey()))); ++v) {
            if(!this.s(v).equals(((e)object0).s(v))) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        TreeMap treeMap0 = this.X;
        if(treeMap0.size() == 1) {
            return this.s(0).g();
        }
        return treeMap0.size() > 0 ? NaN : 0.0;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode() * 0x1F;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        return this.v(",");
    }

    @Override
    public final Iterator iterator() {
        return new g(this);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        o o0 = new e();
        for(Object object0: this.X.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            TreeMap treeMap0 = o0.X;
            if(object1 instanceof j) {
                treeMap0.put(((Integer)map$Entry0.getKey()), ((o)map$Entry0.getValue()));
            }
            else {
                treeMap0.put(((Integer)map$Entry0.getKey()), ((o)map$Entry0.getValue()).l());
            }
        }
        return o0;
    }

    @Override  // com.google.android.gms.internal.measurement.j
    public final void o(String s, o o0) {
        TreeMap treeMap0 = this.Y;
        if(o0 == null) {
            treeMap0.remove(s);
            return;
        }
        treeMap0.put(s, o0);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, R2.h h0, ArrayList arrayList0) {
        TreeMap treeMap1;
        k k0;
        double f4;
        Double double1;
        R2.h h1;
        q q0;
        e e0;
        if("concat".equals(s) || "every".equals(s) || "filter".equals(s) || "forEach".equals(s) || "indexOf".equals(s) || "join".equals(s) || "lastIndexOf".equals(s) || "map".equals(s) || "pop".equals(s) || "push".equals(s) || "reduce".equals(s) || "reduceRight".equals(s) || "reverse".equals(s) || "shift".equals(s) || "slice".equals(s) || "some".equals(s)) {
            e0 = this;
        }
        else if("sort".equals(s)) {
            e0 = this;
        }
        else if(!"splice".equals(s) && !"toString".equals(s)) {
            if("unshift".equals(s)) {
                e0 = this;
                goto label_12;
            }
            return Z1.j(this, new q(s), h0, arrayList0);
        }
        else {
            e0 = this;
        }
    label_12:
        Double double0 = -1.0;
        o o0 = o.e;
        f f0 = o.j;
        f f1 = o.k;
        TreeMap treeMap0 = e0.X;
        switch(s) {
            case "concat": {
                q0 = (e)this.l();
                if(arrayList0.isEmpty()) {
                    return q0;
                }
                Iterator iterator7 = arrayList0.iterator();
                while(true) {
                    if(!iterator7.hasNext()) {
                        return q0;
                    }
                    Object object7 = iterator7.next();
                    o o22 = ((R2.e)h0.b).n(h0, ((o)object7));
                    if(o22 instanceof i) {
                        throw new IllegalStateException("Failed evaluation of arguments");
                    }
                    int v11 = ((e)q0).u();
                    if(o22 instanceof e) {
                        Iterator iterator8 = ((e)o22).z();
                        while(iterator8.hasNext()) {
                            Object object8 = iterator8.next();
                            ((e)q0).x(((int)(((Integer)object8))) + v11, ((e)o22).s(((int)(((Integer)object8)))));
                        }
                    }
                    else {
                        ((e)q0).x(v11, o22);
                    }
                }
            }
            case "every": {
                x1.k("every", 1, arrayList0);
                o o18 = (o)arrayList0.get(0);
                o o19 = ((R2.e)h0.b).n(h0, o18);
                if(!(o19 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                return this.u() == 0 || O.a(e0, h0, ((p)o19), Boolean.FALSE, Boolean.TRUE).u() == this.u() ? f0 : f1;
            }
            case "filter": {
                x1.k("filter", 1, arrayList0);
                o o1 = (o)arrayList0.get(0);
                o o2 = ((R2.e)h0.b).n(h0, o1);
                if(!(o2 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(treeMap0.size() == 0) {
                    return new e();
                }
                e e1 = (e)this.l();
                e e2 = O.a(e0, h0, ((p)o2), null, Boolean.TRUE);
                e e3 = new e();
                Iterator iterator0 = e2.z();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    e3.t(e1.s(((int)(((Integer)object0)))));
                }
                return e3;
            }
            case "forEach": {
                x1.k("forEach", 1, arrayList0);
                o o23 = (o)arrayList0.get(0);
                o o24 = ((R2.e)h0.b).n(h0, o23);
                if(!(o24 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(treeMap0.size() == 0) {
                    return o0;
                }
                O.a(e0, h0, ((p)o24), null, null);
                return o0;
            }
            case "indexOf": {
                x1.q(2, "indexOf", arrayList0);
                if(arrayList0.isEmpty()) {
                    h1 = h0;
                }
                else {
                    o o20 = (o)arrayList0.get(0);
                    h1 = h0;
                    o0 = ((R2.e)h1.b).n(h1, o20);
                }
                if(arrayList0.size() > 1) {
                    o o21 = (o)arrayList0.get(1);
                    double f3 = x1.a(((double)((R2.e)h1.b).n(h1, o21).g()));
                    if(f3 >= ((double)this.u())) {
                        return new h(double0);
                    }
                    double1 = double0;
                    f4 = f3 < 0.0 ? ((double)this.u()) + f3 : f3;
                }
                else {
                    double1 = double0;
                    f4 = 0.0;
                }
                Iterator iterator6 = this.z();
                while(iterator6.hasNext()) {
                    Object object6 = iterator6.next();
                    int v10 = (int)(((Integer)object6));
                    double f5 = (double)v10;
                    if(f5 >= f4 && x1.l(e0.s(v10), o0)) {
                        return new h(f5);
                    }
                    if(false) {
                        break;
                    }
                }
                return new h(double1);
            }
            case "join": {
                x1.q(1, "join", arrayList0);
                if(this.u() == 0) {
                    return o.l;
                }
                if(!arrayList0.isEmpty()) {
                    o o14 = (o)arrayList0.get(0);
                    o o15 = ((R2.e)h0.b).n(h0, o14);
                    return o15 instanceof m || o15 instanceof u ? new q(e0.v("")) : new q(e0.v(o15.i()));
                }
                return new q(e0.v(","));
            }
            case "lastIndexOf": {
                x1.q(2, "lastIndexOf", arrayList0);
                if(!arrayList0.isEmpty()) {
                    o o8 = (o)arrayList0.get(0);
                    o0 = ((R2.e)h0.b).n(h0, o8);
                }
                double f2 = (double)(this.u() - 1);
                if(arrayList0.size() > 1) {
                    o o9 = (o)arrayList0.get(1);
                    o o10 = ((R2.e)h0.b).n(h0, o9);
                    f2 = Double.isNaN(((double)o10.g())) ? ((double)(this.u() - 1)) : x1.a(((double)o10.g()));
                    if(f2 < 0.0) {
                        f2 += (double)this.u();
                    }
                }
                if(f2 < 0.0) {
                    return new h(double0);
                }
                for(int v7 = (int)Math.min(this.u(), f2); v7 >= 0; --v7) {
                    if(e0.y(v7) && x1.l(e0.s(v7), o0)) {
                        return new h(((double)v7));
                    }
                }
                return new h(double0);
            }
            case "map": {
                x1.k("map", 1, arrayList0);
                o o12 = (o)arrayList0.get(0);
                o o13 = ((R2.e)h0.b).n(h0, o12);
                if(!(o13 instanceof p)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                return this.u() == 0 ? new e() : O.a(e0, h0, ((p)o13), null, null);
            }
            case "pop": {
                x1.k("pop", 0, arrayList0);
                int v12 = this.u();
                if(v12 == 0) {
                    return o0;
                }
                o0 = e0.s(v12 - 1);
                e0.w(v12 - 1);
                return o0;
            }
            case "push": {
                if(!arrayList0.isEmpty()) {
                    for(Object object4: arrayList0) {
                        e0.t(((R2.e)h0.b).n(h0, ((o)object4)));
                    }
                }
                return new h(((double)this.u()));
            }
            case "reduce": {
                return O.b(e0, h0, arrayList0, true);
            }
            case "reduceRight": {
                return O.b(e0, h0, arrayList0, false);
            }
            case "reverse": {
                x1.k("reverse", 0, arrayList0);
                int v15 = this.u();
                if(v15 != 0) {
                    for(int v16 = 0; true; ++v16) {
                        if(v16 >= v15 / 2) {
                            break;
                        }
                        if(e0.y(v16)) {
                            o o29 = e0.s(v16);
                            e0.x(v16, null);
                            int v17 = v15 - 1 - v16;
                            if(e0.y(v17)) {
                                e0.x(v16, e0.s(v17));
                            }
                            e0.x(v17, o29);
                        }
                    }
                }
                break;
            }
            case "shift": {
                x1.k("shift", 0, arrayList0);
                if(this.u() != 0) {
                    o0 = e0.s(0);
                    e0.w(0);
                    return o0;
                }
                return o0;
            }
            case "slice": {
                x1.q(2, "slice", arrayList0);
                if(arrayList0.isEmpty()) {
                    return this.l();
                }
                double f6 = (double)this.u();
                o o27 = (o)arrayList0.get(0);
                double f7 = x1.a(((double)((R2.e)h0.b).n(h0, o27).g()));
                double f8 = f7 < 0.0 ? Math.max(f7 + f6, 0.0) : Math.min(f7, f6);
                if(arrayList0.size() == 2) {
                    o o28 = (o)arrayList0.get(1);
                    double f9 = x1.a(((double)((R2.e)h0.b).n(h0, o28).g()));
                    f6 = f9 < 0.0 ? Math.max(f6 + f9, 0.0) : Math.min(f6, f9);
                }
                q0 = new e();
                for(int v14 = (int)f8; ((double)v14) < f6; ++v14) {
                    ((e)q0).t(e0.s(v14));
                }
                return q0;
            }
            case "some": {
                x1.k("some", 1, arrayList0);
                o o16 = (o)arrayList0.get(0);
                o o17 = ((R2.e)h0.b).n(h0, o16);
                if(!(o17 instanceof k)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if(this.u() != 0) {
                    Iterator iterator5 = this.z();
                    while(iterator5.hasNext()) {
                        Object object5 = iterator5.next();
                        int v9 = (int)(((Integer)object5));
                        if(e0.y(v9) && ((k)o17).b(h0, Arrays.asList(new o[]{e0.s(v9), new h(((double)v9)), e0})).a().booleanValue()) {
                            return f0;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return f1;
            }
            case "sort": {
                x1.q(1, "sort", arrayList0);
                if(this.u() >= 2) {
                    ArrayList arrayList1 = this.A();
                    if(arrayList0.isEmpty()) {
                        k0 = null;
                    }
                    else {
                        o o25 = (o)arrayList0.get(0);
                        o o26 = ((R2.e)h0.b).n(h0, o25);
                        if(!(o26 instanceof k)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        k0 = (k)o26;
                    }
                    Collections.sort(arrayList1, new U8.j(k0, h0));
                    treeMap0.clear();
                    int v13 = 0;
                    for(Object object9: arrayList1) {
                        e0.x(v13, ((o)object9));
                        ++v13;
                    }
                    return e0;
                }
                break;
            }
            case "splice": {
                if(arrayList0.isEmpty()) {
                    return new e();
                }
                o o3 = (o)arrayList0.get(0);
                int v = (int)x1.a(((double)((R2.e)h0.b).n(h0, o3).g()));
                if(v < 0) {
                    v = Math.max(0, this.u() + v);
                }
                else if(v > this.u()) {
                    v = this.u();
                }
                int v1 = this.u();
                e e4 = new e();
                if(arrayList0.size() > 1) {
                    o o4 = (o)arrayList0.get(1);
                    int v2 = Math.max(0, ((int)x1.a(((double)((R2.e)h0.b).n(h0, o4).g()))));
                    if(v2 > 0) {
                        for(int v3 = v; v3 < Math.min(v1, v + v2); ++v3) {
                            e4.t(e0.s(v));
                            e0.w(v);
                        }
                    }
                    if(arrayList0.size() > 2) {
                        int v4 = 2;
                        while(v4 < arrayList0.size()) {
                            o o5 = (o)arrayList0.get(v4);
                            o o6 = ((R2.e)h0.b).n(h0, o5);
                            if(o6 instanceof i) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            int v5 = v + v4 - 2;
                            if(v5 < 0) {
                                throw new IllegalArgumentException("Invalid value index: " + v5);
                            }
                            if(v5 >= this.u()) {
                                e0.x(v5, o6);
                                treeMap1 = treeMap0;
                            }
                            else {
                                int v6 = (int)(((Integer)treeMap0.lastKey()));
                                while(v6 >= v5) {
                                    o o7 = (o)treeMap0.get(v6);
                                    if(o7 != null) {
                                        e0.x(v6 + 1, o7);
                                        treeMap0.remove(v6);
                                    }
                                    --v6;
                                    treeMap0 = treeMap0;
                                }
                                treeMap1 = treeMap0;
                                e0.x(v5, o6);
                            }
                            ++v4;
                            treeMap0 = treeMap1;
                        }
                    }
                }
                else {
                    while(v < v1) {
                        e4.t(e0.s(v));
                        e0.x(v, null);
                        ++v;
                    }
                }
                return e4;
            }
            case "toString": {
                x1.k("toString", 0, arrayList0);
                return new q(e0.v(","));
            }
            case "unshift": {
                if(!arrayList0.isEmpty()) {
                    e e5 = new e();
                    for(Object object1: arrayList0) {
                        o o11 = ((R2.e)h0.b).n(h0, ((o)object1));
                        if(o11 instanceof i) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        e5.t(o11);
                    }
                    int v8 = e5.u();
                    Iterator iterator2 = this.z();
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        e5.x(((int)(((Integer)object2))) + v8, e0.s(((int)(((Integer)object2)))));
                    }
                    treeMap0.clear();
                    Iterator iterator3 = e5.z();
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        e0.x(((int)(((Integer)object3))), e5.s(((int)(((Integer)object3)))));
                    }
                }
                return new h(((double)this.u()));
            }
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
        }
        return e0;
    }

    public final o s(int v) {
        if(v >= this.u()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        }
        if(this.y(v)) {
            o o0 = (o)this.X.get(v);
            if(o0 != null) {
                return o0;
            }
        }
        return o.e;
    }

    public final void t(o o0) {
        this.x(this.u(), o0);
    }

    @Override
    public final String toString() {
        return this.v(",");
    }

    // Deobfuscation rating: LOW(20)
    public final int u() {
        return this.X.isEmpty() ? 0 : ((int)(((Integer)this.X.lastKey()))) + 1;
    }

    public final String v(String s) {
        if(s == null) {
            s = "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!this.X.isEmpty()) {
            for(int v = 0; v < this.u(); ++v) {
                o o0 = this.s(v);
                stringBuilder0.append(s);
                if(!(o0 instanceof u) && !(o0 instanceof m)) {
                    stringBuilder0.append(o0.i());
                }
            }
            stringBuilder0.delete(0, s.length());
        }
        return stringBuilder0.toString();
    }

    public final void w(int v) {
        TreeMap treeMap0 = this.X;
        int v1 = (int)(((Integer)treeMap0.lastKey()));
        if(v <= v1 && v >= 0) {
            treeMap0.remove(v);
            if(v == v1) {
                if(!treeMap0.containsKey(((int)(v - 1))) && v - 1 >= 0) {
                    treeMap0.put(((int)(v - 1)), o.e);
                }
                return;
            }
            while(true) {
                ++v;
                if(v > ((int)(((Integer)treeMap0.lastKey())))) {
                    break;
                }
                o o0 = (o)treeMap0.get(v);
                if(o0 != null) {
                    treeMap0.put(((int)(v - 1)), o0);
                    treeMap0.remove(v);
                }
            }
        }
    }

    public final void x(int v, o o0) {
        if(v > 0x7ED4) {
            throw new IllegalStateException("Array too large");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + v);
        }
        TreeMap treeMap0 = this.X;
        if(o0 == null) {
            treeMap0.remove(v);
            return;
        }
        treeMap0.put(v, o0);
    }

    public final boolean y(int v) {
        if(v >= 0) {
            TreeMap treeMap0 = this.X;
            if(v <= ((int)(((Integer)treeMap0.lastKey())))) {
                return treeMap0.containsKey(v);
            }
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + v);
    }

    public final Iterator z() {
        return this.X.keySet().iterator();
    }
}

