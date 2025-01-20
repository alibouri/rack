package G0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import n0.M;

public final class c0 implements b0 {
    public final Matrix X;
    public final int[] Y;

    public c0() {
        this.X = new Matrix();
        this.Y = new int[2];
    }

    @Override  // G0.b0
    public void a(View view0, float[] arr_f) {
        Matrix matrix0 = this.X;
        matrix0.reset();
        view0.transformMatrixToGlobal(matrix0);
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        view0.getLocationOnScreen(this.Y);
        int v = this.Y[0];
        int v1 = this.Y[1];
        view0.getLocationInWindow(this.Y);
        matrix0.postTranslate(((float)(this.Y[0] - v)), ((float)(this.Y[1] - v1)));
        M.A(matrix0, arr_f);
    }
}

