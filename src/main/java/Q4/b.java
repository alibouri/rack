package Q4;

import Nb.j;
import R4.c;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

public final class b implements AdapterView.OnItemClickListener {
    public c X;
    public WeakReference Y;
    public WeakReference Z;
    public AdapterView.OnItemClickListener b0;
    public boolean c0;

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        j.f(view0, "view");
        AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = this.b0;
        if(adapterView$OnItemClickListener0 != null) {
            adapterView$OnItemClickListener0.onItemClick(adapterView0, view0, v, v1);
        }
        View view1 = (View)this.Z.get();
        AdapterView adapterView1 = (AdapterView)this.Y.get();
        if(view1 != null && adapterView1 != null) {
            Q4.c.c(this.X, view1, adapterView1);
        }
    }
}

