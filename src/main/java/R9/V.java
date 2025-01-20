package R9;

import N4.j;
import android.content.Intent;
import android.net.Uri;
import com.wave.customer.BuyAirtimeSelectActivity;
import kotlin.coroutines.g;
import kotlin.coroutines.k;
import q9.j3;
import q9.r1;
import v1.b;

public final class v extends j3 implements t {
    public final BuyAirtimeSelectActivity b;
    public final BuyAirtimeSelectActivity c;

    public v(BuyAirtimeSelectActivity buyAirtimeSelectActivity0) {
        this.c = buyAirtimeSelectActivity0;
        super(buyAirtimeSelectActivity0);
        this.b = buyAirtimeSelectActivity0;
    }

    @Override  // R9.t
    public final Object c(boolean z, g g0) {
        BuyAirtimeSelectActivity buyAirtimeSelectActivity0 = this.c;
        buyAirtimeSelectActivity0.getClass();
        r1.b(buyAirtimeSelectActivity0).e().d("requesting contacts permission", null);
        if(!b.g(buyAirtimeSelectActivity0, "android.permission.READ_CONTACTS") && z) {
            k k0 = new k(j.w(g0));
            buyAirtimeSelectActivity0.I0 = k0;
            buyAirtimeSelectActivity0.startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.wave.personal")), 2);
            return k0.c();
        }
        k k1 = new k(j.w(g0));
        buyAirtimeSelectActivity0.I0 = k1;
        b.f(this.b, new String[]{"android.permission.READ_CONTACTS"}, 1);
        return k1.c();
    }
}

