package J9;

import Aa.n;
import Ab.o;
import Nb.j;
import Vb.q;
import W4.f;
import Xb.J;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.wave.customer.CustomerApp;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import q9.C3;
import q9.l3;
import q9.m3;
import q9.p1;
import q9.q3;
import q9.r3;
import q9.t3;

public abstract class l extends C3 implements q3 {
    public final o u0;
    public final String v0;

    public l() {
        this.u0 = f.A(new n(9, this));
        this.v0 = "transaction_receipts";
    }

    @Override  // q9.C3
    public void onCreate() {
        super.onCreate();
        B9.f f0 = this.d();
        k k0 = new k(this);
        f0.m.add(k0);
    }

    public final Intent v(Uri uri0, C3 c30) {
        boolean z2;
        j.f(uri0, "uri");
        j.f(c30, "appContext");
        ((CustomerApp)this).B0.getClass();
        String s = uri0.getPath();
        String s1 = s == null ? "/" : Vb.j.j0("/intents", s);
        Function2 function20 = (Function2)((HashMap)((CustomerApp)this).B0.b0).get(s1);
        kotlin.coroutines.j j0 = kotlin.coroutines.j.X;
        Intent intent0 = function20 == null ? null : ((Intent)J.t(j0, new t3(function20, uri0, null)));
        if(intent0 == null) {
            intent0 = new Intent("android.intent.action.VIEW", uri0);
            j.e("wave", "getString(...)");
            boolean z = false;
            boolean z1 = true;
            if("wave".equals(uri0.getScheme())) {
                j.e("mm", "getString(...)");
                z2 = "mm".equals(uri0.getHost());
            }
            else {
                z2 = false;
            }
            if(j.a(uri0.getScheme(), "https") && j.a(uri0.getHost(), "www.wave.com")) {
                String s2 = uri0.getPath();
                if(s2 == null) {
                    s2 = "";
                }
                if(q.O(s2, "/checkout", false)) {
                    z = true;
                }
            }
            try {
                if(z2 || z) {
                    intent0.setPackage("com.wave.personal");
                    ComponentName componentName0 = intent0.resolveActivity(c30.getPackageManager());
                    if(componentName0 == null) {
                        throw new p1("The URI is invalid");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    String s3 = componentName0.getClassName();
                    j.e(s3, "getClassName(...)");
                    ((CustomerApp)this).B0.getClass();
                    Function1 function10 = (Function1)((HashMap)((CustomerApp)this).B0.Z).get(s3);
                    if(function10 != null) {
                        z1 = ((Boolean)J.t(j0, new r3(function10, null))).booleanValue();
                    }
                    if(!z1) {
                        throw new l3("User is not authorized to access this Activity");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    intent0.addFlags(0x10000000);
                    String s4 = componentName0.getClassName();
                    j.e(s4, "getClassName(...)");
                    intent0.putExtra("com.wave.typeSafeExtras", ((CustomerApp)this).w(uri0, s4));
                    return intent0;
                }
                return intent0;
            }
            catch(p1 p10) {
            }
        }
        else {
            return intent0;
        }
        if(uri0.getPort() <= this.h()) {
            throw p10;
        }
        throw new m3("The URI couldn\'t be processed, app probably needs update");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    }
}

