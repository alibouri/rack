package c2;

import android.view.View;
import androidx.fragment.app.Fragment;

public final class q extends z {
    public final Fragment X;

    public q(Fragment fragment0) {
        this.X = fragment0;
    }

    @Override  // c2.z
    public final View k(int v) {
        Fragment fragment0 = this.X;
        View view0 = fragment0.F0;
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + fragment0 + " does not have a view");
        }
        return view0.findViewById(v);
    }

    @Override  // c2.z
    public final boolean l() {
        return this.X.F0 != null;
    }
}

