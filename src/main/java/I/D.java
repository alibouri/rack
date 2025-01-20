package i;

import android.widget.ArrayAdapter;

public final class d extends ArrayAdapter {
    @Override  // android.widget.ArrayAdapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

