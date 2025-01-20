package com.sendwave.backend.fragment;

import Nb.j;
import a9.S0;
import a9.T0;
import com.apollographql.apollo.api.Fragment.Data;

public final class CustomerAnnouncementsFragment implements Data {
    public final String a;
    public final S0 b;
    public final T0 c;

    public CustomerAnnouncementsFragment(String s, S0 s00, T0 t00) {
        this.a = s;
        this.b = s00;
        this.c = t00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomerAnnouncementsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((CustomerAnnouncementsFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((CustomerAnnouncementsFragment)object0).b) ? j.a(this.c, ((CustomerAnnouncementsFragment)object0).c) : false;
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
        return "CustomerAnnouncementsFragment(id=" + this.a + ", announcementsV3=" + this.b + ", customerAnnouncements=" + this.c + ")";
    }
}

