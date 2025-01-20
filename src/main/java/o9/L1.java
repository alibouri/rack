package o9;

import E7.o;
import F0.W;
import J1.r;
import Nb.j;
import android.view.View.OnClickListener;
import android.view.View;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonClickListener;
import com.skydoves.balloon.OnBalloonOverlayClickListener;
import com.wave.voip.VoipCallActivity;
import com.wave.voip.VoipCallParams;
import com.wave.voip.call.VoipCaller.CallParams;
import hb.n;
import q9.o0;
import q9.z3;

public final class l1 implements View.OnClickListener {
    public final int X;
    public final Object Y;
    public final Object Z;

    public l1(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.Z;
        Object object1 = this.Y;
        switch(this.X) {
            case 0: {
                ((m1)object1).u.n(((int)((h1)object0).a));
                return;
            }
            case 1: {
                if(((VoipCaller.CallParams)((W)((o)object1).Y).i) == null) {
                    n.b(new IllegalStateException("VOIP call banner clicked while no call is active."), null, null, 14);
                    return;
                }
                boolean z = false;
                view0.setEnabled(false);
                view0.postDelayed(new r(view0, 1), 500L);
                VoipCaller.CallParams voipCaller$CallParams0 = (VoipCaller.CallParams)((W)((o)object1).Y).i;
                if(voipCaller$CallParams0 != null) {
                    z = voipCaller$CallParams0.c0;
                }
                VoipCallParams voipCallParams0 = new VoipCallParams(null, z, pb.n.Y);
                o0.F(((z3)object0), VoipCallActivity.class, voipCallParams0);
                return;
            }
            case 2: {
                if(((OnBalloonOverlayClickListener)object1) != null) {
                    ((OnBalloonOverlayClickListener)object1).b();
                }
                if(((Balloon)object0).Y.D) {
                    ((Balloon)object0).d();
                }
                return;
            }
            default: {
                if(((OnBalloonClickListener)object1) != null) {
                    j.c(view0);
                    ((OnBalloonClickListener)object1).b(view0);
                }
                ((Balloon)object0).Y.getClass();
            }
        }
    }
}

