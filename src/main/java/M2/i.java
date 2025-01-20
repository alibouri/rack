package m2;

import J1.b;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

public final class i extends RecyclerViewAccessibilityDelegate {
    public final RecyclerView f;
    public final J g;
    public final h h;

    public i(RecyclerView recyclerView0) {
        super(recyclerView0);
        this.g = this.e;
        this.h = new h(this);
        this.f = recyclerView0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public final b j() {
        return this.h;
    }
}

