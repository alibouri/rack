package J9;

import M6.e;
import M6.f;
import M6.j;
import N6.k;
import N6.q;
import O6.a;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.util.Log;
import com.sendwave.remit.util.CountryPhoneInputView;
import com.sendwave.util.Country;
import com.wave.components.PlayStoreUpdaterFragment;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import hd.c;
import o6.i;

public final class h implements DialogInterface.OnClickListener {
    public final int X;
    public final Object Y;

    public h(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        switch(this.X) {
            case 0: {
                c.a.n("PlayStoreUpdater");
                c.a.a("user accepted update-ready prompt, installing", new Object[0]);
                PlayStoreUpdaterFragment playStoreUpdaterFragment0 = (PlayStoreUpdaterFragment)this.Y;
                e e0 = playStoreUpdaterFragment0.X0;
                if(e0 != null) {
                    j j0 = e0.a;
                    q q1 = j0.a;
                    if(q1 == null) {
                        Object[] arr_object = {-9};
                        k k0 = j.e;
                        k0.getClass();
                        if(Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", k.f(k0.Y, "onError(%d)", arr_object));
                        }
                        o6.k.d(new a(-9));
                    }
                    else {
                        j.e.e("completeUpdate(%s)", new Object[]{"com.wave.personal"});
                        i i0 = new i();
                        f f0 = new f(q1, i0, i0, new f(j0, i0, i0, "com.wave.personal", 1), 2);
                        q1.a().post(f0);
                    }
                    e e1 = playStoreUpdaterFragment0.X0;
                    if(e1 != null) {
                        synchronized(e1) {
                            e1.b.b(playStoreUpdaterFragment0);
                        }
                        return;
                    }
                    Nb.j.p("appUpdateManager");
                    throw null;
                }
                Nb.j.p("appUpdateManager");
                throw null;
            }
            case 1: {
                ((T8.j)this.Y).a.finish();
                return;
            }
            case 2: {
                Country country0 = (Country)((CountryPhoneInputView)this.Y).f0.get(v);
                ((CountryPhoneInputView)this.Y).c(country0, ((CountryPhoneInputView)this.Y).l0);
                ((CountryPhoneInputView)this.Y).findViewById(0x7F0A0240).clearFocus();  // id:phone_country_button
                ((CountryPhoneInputView)this.Y).h0.requestFocus();
                return;
            }
            default: {
                Xb.q q0 = ((NearbyAgentsActivity)this.Y).J0;
                if(q0 != null) {
                    q0.b0(Boolean.FALSE);
                    return;
                }
                Nb.j.p("locationCompletable");
                throw null;
            }
        }
    }
}

