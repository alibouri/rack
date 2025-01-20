package E7;

import E.f0;
import Z6.g;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import o6.i;
import o6.k;
import o6.p;

public final class t implements Runnable {
    public final int X;
    public final FirebaseMessaging Y;
    public final i Z;

    public t(FirebaseMessaging firebaseMessaging0, i i0, int v) {
        this.X = v;
        this.Y = firebaseMessaging0;
        this.Z = i0;
        super();
    }

    @Override
    public final void run() {
        i i1;
        if(this.X != 0) {
            i i0 = this.Z;
            this.Y.getClass();
            try {
                i0.b(this.Y.a());
            }
            catch(Exception exception0) {
                i0.a(exception0);
            }
            return;
        }
        try {
            i1 = this.Z;
            this.Y.c.getClass();
            Bundle bundle0 = new Bundle();
            bundle0.putString("delete", "1");
            String s = f0.d(((g)this.Y.c.b));
            p p0 = this.Y.c.b0(s, "*", bundle0);
            k.a(this.Y.c.x(p0));
            F f0 = FirebaseMessaging.d(this.Y.b);
            String s1 = this.Y.e();
            String s2 = f0.d(this.Y.a);
            synchronized(f0) {
                SharedPreferences.Editor sharedPreferences$Editor0 = f0.a.edit();
                sharedPreferences$Editor0.remove(F.a(s1, s2));
                sharedPreferences$Editor0.commit();
            }
            i1.b(null);
        }
        catch(Exception exception1) {
            i1.a(exception1);
        }
    }
}

