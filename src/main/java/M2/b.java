package m2;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import o.f0;
import o.o0;

public final class b implements AdapterView.OnItemSelectedListener {
    public final int X;
    public final Object Y;

    public b(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    private final void a(AdapterView adapterView0) {
    }

    private final void b(AdapterView adapterView0) {
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        if(this.X != 0) {
            if(v != -1) {
                f0 f00 = ((o0)this.Y).Z;
                if(f00 != null) {
                    f00.setListSelectionHidden(false);
                }
            }
            return;
        }
        if(v >= 0) {
            DropDownPreference dropDownPreference0 = (DropDownPreference)this.Y;
            String s = dropDownPreference0.l0[v].toString();
            if(!s.equals(dropDownPreference0.m0)) {
                dropDownPreference0.getClass();
                dropDownPreference0.k(s);
            }
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

