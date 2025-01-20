package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.b;

public final class m extends FrameLayout implements b {
    public final CollapsibleActionView b0;

    public m(View view0) {
        super(view0.getContext());
        this.b0 = (CollapsibleActionView)view0;
        this.addView(view0);
    }

    @Override  // androidx.appcompat.view.b
    public final void b() {
        this.b0.onActionViewExpanded();
    }

    @Override  // androidx.appcompat.view.b
    public final void e() {
        this.b0.onActionViewCollapsed();
    }
}

