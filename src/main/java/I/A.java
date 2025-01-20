package i;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController.RecycleListView;

public final class a extends ArrayAdapter {
    public final AlertController.RecycleListView X;
    public final c Y;

    public a(c c0, ContextThemeWrapper contextThemeWrapper0, int v, CharSequence[] arr_charSequence, AlertController.RecycleListView alertController$RecycleListView0) {
        this.Y = c0;
        this.X = alertController$RecycleListView0;
        super(contextThemeWrapper0, v, 0x1020014, arr_charSequence);
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = super.getView(v, view0, viewGroup0);
        boolean[] arr_z = this.Y.t;
        if(arr_z != null && arr_z[v]) {
            this.X.setItemChecked(v, true);
        }
        return view1;
    }
}

