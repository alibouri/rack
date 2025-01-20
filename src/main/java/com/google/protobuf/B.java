package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class b extends AbstractList implements t {
    public boolean X;

    public b(boolean z) {
        this.X = z;
    }

    public final void a() {
        if(!this.X) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean add(Object object0) {
        this.a();
        return super.add(object0);
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        this.a();
        return super.addAll(v, collection0);
    }

    @Override
    public boolean addAll(Collection collection0) {
        this.a();
        return super.addAll(collection0);
    }

    @Override
    public void clear() {
        this.a();
        super.clear();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof List)) {
            return false;
        }
        if(!(object0 instanceof RandomAccess)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((List)object0).size()) {
            return false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.get(v1).equals(((List)object0).get(v1))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int v = this.size();
        int v1 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + this.get(v2).hashCode();
        }
        return v1;
    }

    @Override
    public abstract Object remove(int arg1);

    @Override
    public final boolean remove(Object object0) {
        this.a();
        int v = this.indexOf(object0);
        if(v == -1) {
            return false;
        }
        this.remove(v);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        this.a();
        return super.removeAll(collection0);
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        this.a();
        return super.retainAll(collection0);
    }
}

