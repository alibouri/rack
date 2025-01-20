package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.DeviceManagementDevicesFragment;
import com.sendwave.backend.fragment.ScratchCardBottomSheetAnnouncementFragment;
import com.sendwave.backend.fragment.TooltipsFragment;
import com.sendwave.backend.fragment.TransportFragment;
import com.sendwave.backend.fragment.UserAppPropsFragment;

public final class a1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final ScratchCardBottomSheetAnnouncementFragment d;
    public final UserAppPropsFragment e;
    public final TooltipsFragment f;
    public final TransportFragment g;
    public final DeviceManagementDevicesFragment h;

    public a1(String s, String s1, boolean z, ScratchCardBottomSheetAnnouncementFragment scratchCardBottomSheetAnnouncementFragment0, UserAppPropsFragment userAppPropsFragment0, TooltipsFragment tooltipsFragment0, TransportFragment transportFragment0, DeviceManagementDevicesFragment deviceManagementDevicesFragment0) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = scratchCardBottomSheetAnnouncementFragment0;
        this.e = userAppPropsFragment0;
        this.f = tooltipsFragment0;
        this.g = transportFragment0;
        this.h = deviceManagementDevicesFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a1)) {
            return false;
        }
        if(!j.a(this.a, ((a1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((a1)object0).b)) {
            return false;
        }
        if(this.c != ((a1)object0).c) {
            return false;
        }
        if(!j.a(this.d, ((a1)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((a1)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((a1)object0).f)) {
            return false;
        }
        return j.a(this.g, ((a1)object0).g) ? j.a(this.h, ((a1)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c ? this.h.hashCode() + (this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (v + 0x4CF) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F : this.h.hashCode() + (this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (v + 0x4D5) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", needsNewPin=" + this.c + ", scratchCardBottomSheetAnnouncementFragment=" + this.d + ", userAppPropsFragment=" + this.e + ", tooltipsFragment=" + this.f + ", transportFragment=" + this.g + ", deviceManagementDevicesFragment=" + this.h + ")";
    }
}

