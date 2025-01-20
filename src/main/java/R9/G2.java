package R9;

import android.graphics.Color;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout.Tab;
import com.wave.customer.QrScanOrCardActivity;

public final class g2 implements OnTabSelectedListener {
    public final QrScanOrCardActivity a;

    public g2(QrScanOrCardActivity qrScanOrCardActivity0) {
        this.a = qrScanOrCardActivity0;
    }

    @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
    public final void a(Tab tabLayout$Tab0) {
        if(tabLayout$Tab0 != null) {
            int v = tabLayout$Tab0.b;
            QrScanOrCardActivity qrScanOrCardActivity0 = this.a;
            qrScanOrCardActivity0.K().b(v, false);
            o2 o20 = qrScanOrCardActivity0.J();
            o20.d0.getClass();
            o20.d0.l(null, v);
            if(qrScanOrCardActivity0.I().getSelectedTabPosition() == 0) {
                qrScanOrCardActivity0.I().setSelectedTabIndicatorColor(Color.parseColor("#9A9A9A"));
                qrScanOrCardActivity0.I().n(Color.parseColor("#C4C4C4"), Color.parseColor("#FFFFFF"));
                qrScanOrCardActivity0.I().setBackgroundResource(0x7F080326);  // drawable:tab_bg_rounded_dark
                return;
            }
            qrScanOrCardActivity0.I().setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
            qrScanOrCardActivity0.I().n(Color.parseColor("#353535"), Color.parseColor("#000000"));
            qrScanOrCardActivity0.I().setBackgroundResource(0x7F080327);  // drawable:tab_bg_rounded_light
        }
    }
}

