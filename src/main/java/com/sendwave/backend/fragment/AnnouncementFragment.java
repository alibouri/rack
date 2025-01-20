package com.sendwave.backend.fragment;

import a9.d;
import a9.e;
import a9.j;
import com.apollographql.apollo.api.Fragment.Data;

public final class AnnouncementFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final e h;
    public final String i;
    public final d j;
    public final j k;

    public AnnouncementFragment(String s, String s1, String s2, Integer integer0, String s3, String s4, String s5, e e0, String s6, d d0, j j0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = integer0;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = e0;
        this.i = s6;
        this.j = d0;
        this.k = j0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnnouncementFragment)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((AnnouncementFragment)object0).a)) {
            return false;
        }
        if(!Nb.j.a(this.b, ((AnnouncementFragment)object0).b)) {
            return false;
        }
        if(!Nb.j.a(this.c, ((AnnouncementFragment)object0).c)) {
            return false;
        }
        if(!Nb.j.a(this.d, ((AnnouncementFragment)object0).d)) {
            return false;
        }
        if(!Nb.j.a(this.e, ((AnnouncementFragment)object0).e)) {
            return false;
        }
        if(!Nb.j.a(this.f, ((AnnouncementFragment)object0).f)) {
            return false;
        }
        if(!Nb.j.a(this.g, ((AnnouncementFragment)object0).g)) {
            return false;
        }
        if(!Nb.j.a(this.h, ((AnnouncementFragment)object0).h)) {
            return false;
        }
        if(!Nb.j.a(this.i, ((AnnouncementFragment)object0).i)) {
            return false;
        }
        return Nb.j.a(this.j, ((AnnouncementFragment)object0).j) ? Nb.j.a(this.k, ((AnnouncementFragment)object0).k) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = A3.e.s(A3.e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        int v4 = this.f == null ? 0 : this.f.hashCode();
        int v5 = this.g == null ? 0 : this.g.hashCode();
        int v6 = this.h == null ? 0 : this.h.hashCode();
        int v7 = this.i == null ? 0 : this.i.hashCode();
        int v8 = this.j == null ? 0 : this.j.hashCode();
        j j0 = this.k;
        if(j0 != null) {
            v1 = j0.hashCode();
        }
        return (((((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "AnnouncementFragment(id=" + this.a + ", title=" + this.b + ", message=" + this.c + ", sortOrder=" + this.d + ", icon=" + this.e + ", actionUri=" + this.f + ", animationUrl=" + this.g + ", frequency=" + this.h + ", voiceMessageUri=" + this.i + ", detail=" + this.j + ", styling=" + this.k + ")";
    }
}

