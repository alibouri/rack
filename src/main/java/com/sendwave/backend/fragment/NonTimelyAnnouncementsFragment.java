package com.sendwave.backend.fragment;

import Nb.j;
import a9.A4;
import com.apollographql.apollo.api.Fragment.Data;

public final class NonTimelyAnnouncementsFragment implements Data {
    public final A4 a;

    public NonTimelyAnnouncementsFragment(A4 a40) {
        this.a = a40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof NonTimelyAnnouncementsFragment ? j.a(this.a, ((NonTimelyAnnouncementsFragment)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "NonTimelyAnnouncementsFragment(nonTimelyAnnouncement=" + this.a + ")";
    }
}

