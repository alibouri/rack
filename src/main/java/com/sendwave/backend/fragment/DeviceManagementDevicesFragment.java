package com.sendwave.backend.fragment;

import Nb.j;
import a9.e2;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;
import m5.b;

public final class DeviceManagementDevicesFragment implements Data {
    public final String a;
    public final List b;
    public final e2 c;

    public DeviceManagementDevicesFragment(String s, List list0, e2 e20) {
        this.a = s;
        this.b = list0;
        this.c = e20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeviceManagementDevicesFragment)) {
            return false;
        }
        if(!j.a(this.a, ((DeviceManagementDevicesFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((DeviceManagementDevicesFragment)object0).b) ? j.a(this.c, ((DeviceManagementDevicesFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.q(this.b, this.a.hashCode() * 0x1F, 0x1F);
    }

    @Override
    public final String toString() {
        return "DeviceManagementDevicesFragment(id=" + this.a + ", deviceManagementDevices=" + this.b + ", appProps=" + this.c + ")";
    }
}

