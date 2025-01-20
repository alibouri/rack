package i9;

import W8.e;
import android.view.View.OnClickListener;
import android.view.View;

public final class b implements View.OnClickListener {
    public final int X;
    public e Y;

    public b(int v) {
        this.X = v;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        switch(this.X) {
            case 0: {
                this.Y.warnThenContinue(view0);
                return;
            }
            case 1: {
                this.Y.pickFromGallery(view0);
                return;
            }
            case 2: {
                this.Y.onFlashlight(view0);
                return;
            }
            case 3: {
                this.Y.onSubmit(view0);
                return;
            }
            case 4: {
                this.Y.showMoreInfo(view0);
                return;
            }
            case 5: {
                this.Y.onCancel(view0);
                return;
            }
            case 6: {
                this.Y.onRetake(view0);
                return;
            }
            case 7: {
                this.Y.onSnap(view0);
                return;
            }
            case 8: {
                this.Y.warnThenContinue(view0);
                return;
            }
            case 9: {
                this.Y.pickFromGallery(view0);
                return;
            }
            case 10: {
                this.Y.onFlashlight(view0);
                return;
            }
            case 11: {
                this.Y.onSubmit(view0);
                return;
            }
            case 12: {
                this.Y.showMoreInfo(view0);
                return;
            }
            case 13: {
                this.Y.onCancel(view0);
                return;
            }
            case 14: {
                this.Y.onRetake(view0);
                return;
            }
            default: {
                this.Y.onSnap(view0);
            }
        }
    }
}

