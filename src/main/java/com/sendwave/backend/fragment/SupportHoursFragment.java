package com.sendwave.backend.fragment;

import Nb.j;
import a9.e8;
import com.apollographql.apollo.api.Fragment.Data;

public final class SupportHoursFragment implements Data {
    public final e8 a;

    public SupportHoursFragment(e8 e80) {
        this.a = e80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SupportHoursFragment ? j.a(this.a, ((SupportHoursFragment)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "SupportHoursFragment(supportHours=" + this.a + ")";
    }
}

