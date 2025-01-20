package u9;

import Bb.z;
import Nb.j;
import android.view.View;
import java.util.List;
import m5.b;

public final class v {
    public final View a;
    public final List b;
    public final l c;
    public final int d;
    public final int e;
    public final x f;
    public final int g;
    public final int h;

    public v(View view0, l l0, int v, int v1) {
        this.a = view0;
        this.b = z.X;
        this.c = l0;
        this.d = v;
        this.e = v1;
        this.f = x.X;
        this.g = 0;
        this.h = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(!j.a(this.a, ((v)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((v)object0).b)) {
            return false;
        }
        if(this.c != ((v)object0).c) {
            return false;
        }
        if(this.d != ((v)object0).d) {
            return false;
        }
        if(this.e != ((v)object0).e) {
            return false;
        }
        if(this.f != ((v)object0).f) {
            return false;
        }
        return this.g == ((v)object0).g ? this.h == ((v)object0).h : false;
    }

    @Override
    public final int hashCode() {
        return ((this.f.hashCode() + (((this.c.hashCode() + b.q(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F + this.d) * 0x1F + this.e) * 0x1F) * 0x1F + this.g) * 0x1F + this.h;
    }

    @Override
    public final String toString() {
        return "BalloonPlacement(anchor=" + this.a + ", subAnchors=" + this.b + ", align=" + this.c + ", xOff=" + this.d + ", yOff=" + this.e + ", type=" + this.f + ", width=" + this.g + ", height=" + this.h + ")";
    }
}

