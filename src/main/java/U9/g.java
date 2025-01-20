package u9;

import Ab.e;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.skydoves.balloon.Balloon;

public final class g implements Runnable {
    public final int X;
    public final Balloon Y;

    public g(Balloon balloon0, int v) {
        this.X = v;
        this.Y = balloon0;
        super();
    }

    @Override
    public final void run() {
        Animation animation0;
        Balloon balloon0 = this.Y;
        if(this.X != 0) {
            j j0 = balloon0.Y;
            int v = j0.N;
            if(v == 0x80000000) {
                switch(j0.M.ordinal()) {
                    case 1: {
                        if(j0.h) {
                            switch(j0.n.ordinal()) {
                                case 0: {
                                    v = 0x7F010015;  // anim:balloon_heartbeat_top
                                    break;
                                }
                                case 1: {
                                    v = 0x7F010011;  // anim:balloon_heartbeat_bottom
                                    break;
                                }
                                case 2: {
                                    v = 0x7F010014;  // anim:balloon_heartbeat_right
                                    break;
                                }
                                case 3: {
                                    v = 0x7F010013;  // anim:balloon_heartbeat_left
                                    break;
                                }
                                default: {
                                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                            }
                        }
                        else {
                            v = 0x7F010012;  // anim:balloon_heartbeat_center
                        }
                        goto label_33;
                    }
                    case 2: {
                        switch(j0.n.ordinal()) {
                            case 0: {
                                v = 0x7F01001C;  // anim:balloon_shake_top
                                goto label_33;
                            }
                            case 1: {
                                v = 0x7F010019;  // anim:balloon_shake_bottom
                                goto label_33;
                            }
                            case 2: {
                                v = 0x7F01001B;  // anim:balloon_shake_right
                                goto label_33;
                            }
                            case 3: {
                                v = 0x7F01001A;  // anim:balloon_shake_left
                                goto label_33;
                            }
                            default: {
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                    }
                    case 3: {
                        animation0 = AnimationUtils.loadAnimation(balloon0.X, 0x7F01000E);  // anim:balloon_fade
                        break;
                    }
                    default: {
                        animation0 = null;
                    }
                }
            }
            else {
            label_33:
                animation0 = AnimationUtils.loadAnimation(balloon0.X, v);
            }
            if(animation0 != null) {
                ((FrameLayout)balloon0.Z.Z).startAnimation(animation0);
            }
            return;
        }
        Handler handler0 = new Handler(Looper.getMainLooper());
        g g0 = new g(balloon0, 1);
        balloon0.Y.getClass();
        handler0.postDelayed(g0, 0L);
    }
}

