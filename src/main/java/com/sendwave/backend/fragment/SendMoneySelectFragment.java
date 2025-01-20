package com.sendwave.backend.fragment;

import A3.e;
import Nb.j;
import a9.y7;
import com.apollographql.apollo.api.Fragment.Data;

public final class SendMoneySelectFragment implements Data {
    public final String a;
    public final String b;
    public final String c;
    public final y7 d;
    public final SendMoneyDialogFragment e;
    public final FavoriteRecipientsFragment f;

    public SendMoneySelectFragment(String s, String s1, String s2, y7 y70, SendMoneyDialogFragment sendMoneyDialogFragment0, FavoriteRecipientsFragment favoriteRecipientsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = y70;
        this.e = sendMoneyDialogFragment0;
        this.f = favoriteRecipientsFragment0;
    }

    public final SendMoneyDialogFragment a() {
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SendMoneySelectFragment)) {
            return false;
        }
        if(!j.a(this.a, ((SendMoneySelectFragment)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((SendMoneySelectFragment)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((SendMoneySelectFragment)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((SendMoneySelectFragment)object0).d)) {
            return false;
        }
        return j.a(this.e, ((SendMoneySelectFragment)object0).e) ? j.a(this.f, ((SendMoneySelectFragment)object0).f) : false;
    }

    public final String getId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        return this.d == null ? this.f.hashCode() + (this.e.hashCode() + v * 0x1F) * 0x1F : this.f.hashCode() + (this.e.hashCode() + (v + this.d.hashCode()) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SendMoneySelectFragment(__typename=" + this.a + ", id=" + this.b + ", country=" + this.c + ", user=" + this.d + ", sendMoneyDialogFragment=" + this.e + ", favoriteRecipientsFragment=" + this.f + ")";
    }
}

