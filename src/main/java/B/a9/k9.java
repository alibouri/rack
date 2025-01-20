package a9;

import Nb.j;
import java.util.List;
import m5.b;

public final class k9 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final l9 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final Boolean m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final boolean q;
    public final o9 r;
    public final boolean s;
    public final String t;
    public final List u;
    public final String v;
    public final boolean w;
    public final n9 x;
    public final boolean y;
    public final Boolean z;

    public k9(int v, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, int v1, l9 l90, boolean z5, boolean z6, boolean z7, List list0, Boolean boolean0, boolean z8, boolean z9, Boolean boolean1, boolean z10, o9 o90, boolean z11, String s, List list1, String s1, boolean z12, n9 n90, boolean z13, Boolean boolean2) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = v1;
        this.h = l90;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = list0;
        this.m = boolean0;
        this.n = z8;
        this.o = z9;
        this.p = boolean1;
        this.q = z10;
        this.r = o90;
        this.s = z11;
        this.t = s;
        this.u = list1;
        this.v = s1;
        this.w = z12;
        this.x = n90;
        this.y = z13;
        this.z = boolean2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k9)) {
            return false;
        }
        if(this.a != ((k9)object0).a) {
            return false;
        }
        if(this.b != ((k9)object0).b) {
            return false;
        }
        if(this.c != ((k9)object0).c) {
            return false;
        }
        if(this.d != ((k9)object0).d) {
            return false;
        }
        if(this.e != ((k9)object0).e) {
            return false;
        }
        if(this.f != ((k9)object0).f) {
            return false;
        }
        if(this.g != ((k9)object0).g) {
            return false;
        }
        if(!j.a(this.h, ((k9)object0).h)) {
            return false;
        }
        if(this.i != ((k9)object0).i) {
            return false;
        }
        if(this.j != ((k9)object0).j) {
            return false;
        }
        if(this.k != ((k9)object0).k) {
            return false;
        }
        if(!j.a(this.l, ((k9)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((k9)object0).m)) {
            return false;
        }
        if(this.n != ((k9)object0).n) {
            return false;
        }
        if(this.o != ((k9)object0).o) {
            return false;
        }
        if(!j.a(this.p, ((k9)object0).p)) {
            return false;
        }
        if(this.q != ((k9)object0).q) {
            return false;
        }
        if(!j.a(this.r, ((k9)object0).r)) {
            return false;
        }
        if(this.s != ((k9)object0).s) {
            return false;
        }
        if(!j.a(this.t, ((k9)object0).t)) {
            return false;
        }
        if(!j.a(this.u, ((k9)object0).u)) {
            return false;
        }
        if(!j.a(this.v, ((k9)object0).v)) {
            return false;
        }
        if(this.w != ((k9)object0).w) {
            return false;
        }
        if(!j.a(this.x, ((k9)object0).x)) {
            return false;
        }
        return this.y == ((k9)object0).y ? j.a(this.z, ((k9)object0).z) : false;
    }

    // Deobfuscation rating: LOW(26)
    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = 0;
        int v2 = b.q(this.u, (((this.r.hashCode() + (((((b.q(this.l, ((((this.h.hashCode() + ((((((this.a * 0x1F + (this.b ? 0x4CF : 0x4D5)) * 0x1F + (this.c ? 0x4CF : 0x4D5)) * 0x1F + (this.d ? 0x4CF : 0x4D5)) * 0x1F + (this.e ? 0x4CF : 0x4D5)) * 0x1F + (this.f ? 0x4CF : 0x4D5)) * 0x1F + this.g) * 0x1F) * 0x1F + (this.i ? 0x4CF : 0x4D5)) * 0x1F + (this.j ? 0x4CF : 0x4D5)) * 0x1F + (this.k ? 0x4CF : 0x4D5)) * 0x1F, 0x1F) + (this.m == null ? 0 : this.m.hashCode())) * 0x1F + (this.n ? 0x4CF : 0x4D5)) * 0x1F + (this.o ? 0x4CF : 0x4D5)) * 0x1F + (this.p == null ? 0 : this.p.hashCode())) * 0x1F + (this.q ? 0x4CF : 0x4D5)) * 0x1F) * 0x1F + (this.s ? 0x4CF : 0x4D5)) * 0x1F + (this.t == null ? 0 : this.t.hashCode())) * 0x1F, 0x1F);
        int v3 = this.v == null ? 0 : this.v.hashCode();
        int v4 = this.w ? 0x4CF : 0x4D5;
        int v5 = this.x == null ? 0 : this.x.hashCode();
        if(this.y) {
            v = 0x4CF;
        }
        Boolean boolean0 = this.z;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return ((((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "AppProps(qrRefreshInterval=" + this.a + ", restrictScreenshots=" + this.b + ", linkedAccountsEnabled=" + this.c + ", qrScanEnabled=" + this.d + ", useQrTimeOffset=" + this.e + ", convertCiNumbersTo10Digits=" + this.f + ", undoSentTransfersTimeWindowSeconds=" + this.g + ", appUpdaterParams=" + this.h + ", promptForAppReview=" + this.i + ", indicateContactsWithWaveAccount=" + this.j + ", paymentCardsEnabled=" + this.k + ", ostrichEasterEggs=" + this.l + ", showScratchCardRewards=" + this.m + ", savingsWalletEnabled=" + this.n + ", showSavingsBottomSheetAnnouncement=" + this.o + ", showTransportPlaceholder=" + this.p + ", deviceApprovalRecentAutofill=" + this.q + ", txHistoryOfflineSyncProps=" + this.r + ", canScanQrSendScreen=" + this.s + ", countryIso2FromIp=" + this.t + ", enabledTravelerCorridorNotificationList=" + this.u + ", receiptHistoryEntryIdForCieMigration=" + this.v + ", accountSwitcherEnabled=" + this.w + ", pricePromoBottomSheet=" + this.x + ", showBusinessSearch=" + this.y + ", isOverdraftEnabled=" + this.z + ")";
    }
}

