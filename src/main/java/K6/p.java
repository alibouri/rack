package K6;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.c;
import androidx.fragment.app.ListFragment;
import o.D;
import o.o0;

public final class p implements AdapterView.OnItemClickListener {
    public final int X;
    public final Object Y;

    public p(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0;
        switch(this.X) {
            case 0: {
                View view1 = null;
                q q0 = (q)this.Y;
                if(v < 0) {
                    o0 o00 = q0.f0;
                    object0 = o00.w0.isShowing() ? o00.Z.getSelectedItem() : null;
                }
                else {
                    object0 = q0.getAdapter().getItem(v);
                }
                q.a(q0, object0);
                AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = q0.getOnItemClickListener();
                o0 o01 = q0.f0;
                if(adapterView$OnItemClickListener0 != null) {
                    if(view0 == null || v < 0) {
                        if(o01.w0.isShowing()) {
                            view1 = o01.Z.getSelectedView();
                        }
                        view0 = view1;
                        v = o01.w0.isShowing() ? o01.Z.getSelectedItemPosition() : -1;
                        v1 = o01.w0.isShowing() ? o01.Z.getSelectedItemId() : 0x8000000000000000L;
                    }
                    adapterView$OnItemClickListener0.onItemClick(o01.Z, view0, v, v1);
                }
                o01.dismiss();
                return;
            }
            case 1: {
                ListView listView0 = (ListView)adapterView0;
                ((ListFragment)this.Y).getClass();
                return;
            }
            default: {
                D d0 = (D)this.Y;
                d0.E0.setSelection(v);
                c c0 = d0.E0;
                if(c0.getOnItemClickListener() != null) {
                    c0.performItemClick(view0, v, d0.B0.getItemId(v));
                }
                d0.dismiss();
            }
        }
    }
}

