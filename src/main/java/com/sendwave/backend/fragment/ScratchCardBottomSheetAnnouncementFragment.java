package com.sendwave.backend.fragment;

import Nb.j;
import a9.K6;
import com.apollographql.apollo.api.Fragment.Data;

public final class ScratchCardBottomSheetAnnouncementFragment implements Data {
    public final String a;
    public final K6 b;

    public ScratchCardBottomSheetAnnouncementFragment(String s, K6 k60) {
        this.a = s;
        this.b = k60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScratchCardBottomSheetAnnouncementFragment)) {
            return false;
        }
        return j.a(this.a, ((ScratchCardBottomSheetAnnouncementFragment)object0).a) ? j.a(this.b, ((ScratchCardBottomSheetAnnouncementFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ScratchCardBottomSheetAnnouncementFragment(id=" + this.a + ", scratchCardBottomSheetAnnouncement=" + this.b + ")";
    }
}

