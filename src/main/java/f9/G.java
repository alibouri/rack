package f9;

import Nb.j;
import android.content.res.Resources;
import androidx.recyclerview.widget.I;

public final class g extends I {
    public final R1.g u;
    public final int v;

    public g(R1.g g0, int v) {
        super(g0.d);
        this.u = g0;
        this.v = v;
    }

    @Override  // androidx.recyclerview.widget.I
    public final String toString() {
        String s = super.toString();
        j.e(s, "toString(...)");
        String s1 = Vb.j.T(g.class.getSimpleName().length() + 1, s);
        Resources resources0 = this.u.d.getResources();
        String s2 = resources0.getResourceTypeName(this.v);
        j.e(s2, "getResourceTypeName(...)");
        String s3 = resources0.getResourceEntryName(this.v);
        j.e(s3, "getResourceEntryName(...)");
        return "DataBindingViewHolder{" + Vb.j.x0((s1.length() - 1 >= 0 ? s1.length() - 1 : 0), s1) + " " + s2 + "/" + s3 + "}";
    }
}

