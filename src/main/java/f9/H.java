package f9;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import com.sendwave.components.DropdownTextView;
import i.c;
import i.e;

public final class h implements AdapterView.OnItemClickListener {
    public final int X;
    public Object Y;
    public final Object Z;

    public h(DropdownTextView dropdownTextView0) {
        this.X = 0;
        super();
        this.Z = dropdownTextView0;
    }

    public h(c c0, e e0) {
        this.X = 1;
        super();
        this.Z = c0;
        this.Y = e0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.Z;
        if(this.X != 0) {
            DialogInterface.OnClickListener dialogInterface$OnClickListener0 = ((c)object0).r;
            e e0 = (e)this.Y;
            dialogInterface$OnClickListener0.onClick(e0.b, v);
            if(!((c)object0).v) {
                e0.b.dismiss();
            }
            return;
        }
        AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = (AdapterView.OnItemClickListener)this.Y;
        if(adapterView$OnItemClickListener0 != null) {
            adapterView$OnItemClickListener0.onItemClick(adapterView0, view0, v, v1);
        }
        if((((DropdownTextView)object0).getImeOptions() & 5) != 0) {
            View view1 = ((DropdownTextView)object0).focusSearch(130);
            if(view1 != null) {
                view1.requestFocus();
            }
        }
    }
}

