package com.sendwave.backend.fragment;

import Nb.j;
import a9.k6;
import com.apollographql.apollo.api.Fragment.Data;

public final class PendingDeviceApprovalFragment implements Data {
    public final k6 a;

    public PendingDeviceApprovalFragment(k6 k60) {
        this.a = k60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PendingDeviceApprovalFragment ? j.a(this.a, ((PendingDeviceApprovalFragment)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "PendingDeviceApprovalFragment(pendingDeviceApproval=" + this.a + ")";
    }
}

