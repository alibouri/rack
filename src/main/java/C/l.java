package c;

import Nb.j;
import R9.x1;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import f.d;
import g.a;
import java.io.Serializable;
import n2.c;

public final class l implements Runnable {
    public final int X;
    public final Object Y;
    public final int Z;
    public final Object b0;

    public l(int v, int v1, Object object0, Object object1) {
        this.X = v1;
        this.Y = object0;
        this.Z = v;
        this.b0 = object1;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                m m0 = (m)this.Y;
                j.f(m0, "this$0");
                Serializable serializable0 = (Serializable)((a)this.b0).Y;
                String s = (String)m0.a.get(((int)this.Z));
                if(s != null) {
                    d d0 = (d)m0.e.get(s);
                    if((d0 == null ? null : d0.a) == null) {
                        m0.g.remove(s);
                        m0.f.put(s, serializable0);
                        return;
                    }
                    f.a a0 = d0.a;
                    if(m0.d.remove(s)) {
                        a0.b(serializable0);
                    }
                }
                return;
            }
            case 1: {
                j.f(((m)this.Y), "this$0");
                j.f(((IntentSender.SendIntentException)this.b0), "$e");
                Intent intent0 = new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", ((IntentSender.SendIntentException)this.b0));
                ((m)this.Y).a(this.Z, 0, intent0);
                return;
            }
            default: {
                ((c)((x1)this.Y).d).c(this.Z, ((Serializable)this.b0));
            }
        }
    }
}

