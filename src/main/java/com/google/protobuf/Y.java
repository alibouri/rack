package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class y extends b implements z, RandomAccess {
    public final List Y;

    static {
        new y();
    }

    public y() {
        super(false);
        this.Y = Collections.emptyList();
    }

    public y(int v) {
        this(new ArrayList(v));
    }

    public y(ArrayList arrayList0) {
        super(true);
        this.Y = arrayList0;
    }

    @Override
    public final void add(int v, Object object0) {
        this.a();
        this.Y.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.protobuf.b
    public final boolean addAll(int v, Collection collection0) {
        this.a();
        if(collection0 instanceof z) {
            collection0 = ((z)collection0).k();
        }
        boolean z = this.Y.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.protobuf.b
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.Y.size(), collection0);
    }

    @Override  // com.google.protobuf.b
    public final void clear() {
        this.a();
        this.Y.clear();
        ++this.modCount;
    }

    @Override  // com.google.protobuf.t
    public final t f(int v) {
        List list0 = this.Y;
        if(v < list0.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(list0);
        return new y(arrayList0);
    }

    @Override
    public final Object get(int v) {
        String s;
        List list0 = this.Y;
        Object object0 = list0.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof e) {
            ((e)object0).getClass();
            s = ((e)object0).size() == 0 ? "" : new String(((e)object0).Y, ((e)object0).d(), ((e)object0).size(), u.a);
            int v1 = ((e)object0).d();
            if(q0.a.c(((e)object0).Y, v1, ((e)object0).size() + v1) == 0) {
                list0.set(v, s);
                return s;
            }
        }
        else {
            s = new String(((byte[])object0), u.a);
            if(q0.a.c(((byte[])object0), 0, ((byte[])object0).length) == 0) {
                list0.set(v, s);
                return s;
            }
        }
        return s;
    }

    @Override  // com.google.protobuf.z
    public final z h() {
        return this.X ? new i0(this) : this;
    }

    @Override  // com.google.protobuf.z
    public final Object j(int v) {
        return this.Y.get(v);
    }

    @Override  // com.google.protobuf.z
    public final List k() {
        return Collections.unmodifiableList(this.Y);
    }

    @Override  // com.google.protobuf.z
    public final void n(e e0) {
        this.a();
        this.Y.add(e0);
        ++this.modCount;
    }

    @Override  // com.google.protobuf.b
    public final Object remove(int v) {
        this.a();
        Object object0 = this.Y.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof e) {
            ((e)object0).getClass();
            return ((e)object0).size() == 0 ? "" : new String(((e)object0).Y, ((e)object0).d(), ((e)object0).size(), u.a);
        }
        return new String(((byte[])object0), u.a);
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a();
        Object object1 = this.Y.set(v, ((String)object0));
        if(object1 instanceof String) {
            return (String)object1;
        }
        if(object1 instanceof e) {
            ((e)object1).getClass();
            return ((e)object1).size() == 0 ? "" : new String(((e)object1).Y, ((e)object1).d(), ((e)object1).size(), u.a);
        }
        return new String(((byte[])object1), u.a);
    }

    @Override
    public final int size() {
        return this.Y.size();
    }
}

