package i;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController.RecycleListView;
import o9.d;

public final class b implements AdapterView.OnItemClickListener {
    public final AlertController.RecycleListView X;
    public final e Y;
    public final c Z;

    public b(c c0, AlertController.RecycleListView alertController$RecycleListView0, e e0) {
        this.Z = c0;
        this.X = alertController$RecycleListView0;
        this.Y = e0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        c c0 = this.Z;
        boolean[] arr_z = c0.t;
        AlertController.RecycleListView alertController$RecycleListView0 = this.X;
        if(arr_z != null) {
            arr_z[v] = alertController$RecycleListView0.isItemChecked(v);
        }
        d d0 = c0.x;
        boolean z = alertController$RecycleListView0.isItemChecked(v);
        d0.onClick(this.Y.b, v, z);
    }
}

