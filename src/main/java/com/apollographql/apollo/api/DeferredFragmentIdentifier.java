package com.apollographql.apollo.api;

import M.J;
import Nb.j;
import java.util.List;

public final class DeferredFragmentIdentifier {
    private final String label;
    private final List path;

    public DeferredFragmentIdentifier(List list0, String s) {
        j.f(list0, "path");
        super();
        this.path = list0;
        this.label = s;
    }

    public final List component1() {
        return this.path;
    }

    public final String component2() {
        return this.label;
    }

    public final DeferredFragmentIdentifier copy(List list0, String s) {
        j.f(list0, "path");
        return new DeferredFragmentIdentifier(list0, s);
    }

    public static DeferredFragmentIdentifier copy$default(DeferredFragmentIdentifier deferredFragmentIdentifier0, List list0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = deferredFragmentIdentifier0.path;
        }
        if((v & 2) != 0) {
            s = deferredFragmentIdentifier0.label;
        }
        return deferredFragmentIdentifier0.copy(list0, s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeferredFragmentIdentifier)) {
            return false;
        }
        return j.a(this.path, ((DeferredFragmentIdentifier)object0).path) ? j.a(this.label, ((DeferredFragmentIdentifier)object0).label) : false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List getPath() {
        return this.path;
    }

    @Override
    public int hashCode() {
        int v = this.path.hashCode();
        return this.label == null ? v * 0x1F : v * 0x1F + this.label.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DeferredFragmentIdentifier(path=");
        stringBuilder0.append(this.path);
        stringBuilder0.append(", label=");
        return J.g(stringBuilder0, this.label, ')');
    }
}

