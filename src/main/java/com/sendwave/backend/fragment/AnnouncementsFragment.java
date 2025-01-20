package com.sendwave.backend.fragment;

import Nb.j;
import a9.v;
import a9.w;
import com.apollographql.apollo.api.Fragment.Data;

public final class AnnouncementsFragment implements Data {
    public final String a;
    public final v b;
    public final w c;

    public AnnouncementsFragment(String s, v v0, w w0) {
        this.a = s;
        this.b = v0;
        this.c = w0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnnouncementsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((AnnouncementsFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((AnnouncementsFragment)object0).b) ? j.a(this.c, ((AnnouncementsFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "AnnouncementsFragment(id=" + this.a + ", announcementsV3=" + this.b + ", customerAnnouncements=" + this.c + ")";
    }
}

