package u9;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonDismissListener;

public final class h implements PopupWindow.OnDismissListener {
    public final Balloon X;
    public final OnBalloonDismissListener Y;

    public h(Balloon balloon0, OnBalloonDismissListener onBalloonDismissListener0) {
        this.X = balloon0;
        this.Y = onBalloonDismissListener0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        Balloon balloon0 = this.X;
        FrameLayout frameLayout0 = (FrameLayout)balloon0.Z.Z;
        Animation animation0 = frameLayout0.getAnimation();
        if(animation0 != null) {
            animation0.cancel();
            animation0.reset();
        }
        frameLayout0.clearAnimation();
        balloon0.d();
        OnBalloonDismissListener onBalloonDismissListener0 = this.Y;
        if(onBalloonDismissListener0 != null) {
            onBalloonDismissListener0.b();
        }
    }
}

