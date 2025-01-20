package o9;

import Ea.r;
import Nb.j;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.I;

public final class m1 extends I {
    public final int A;
    public final r u;
    public final TextView v;
    public final TextView w;
    public final View x;
    public final int y;
    public final int z;

    public m1(View view0, r r0) {
        j.f(r0, "onIndexClicked");
        super(view0);
        this.u = r0;
        View view1 = view0.findViewById(0x7F0A01FE);  // id:name
        j.e(view1, "findViewById(...)");
        this.v = (TextView)view1;
        View view2 = view0.findViewById(0x7F0A0253);  // id:price
        j.e(view2, "findViewById(...)");
        this.w = (TextView)view2;
        View view3 = view0.findViewById(0x7F0A00C2);  // id:check
        j.e(view3, "findViewById(...)");
        this.x = view3;
        this.y = view0.getContext().getColor(0x7F060046);  // color:WaveBlue400
        this.z = view0.getContext().getColor(0x7F06007B);  // color:black
        this.A = view0.getContext().getColor(0x7F060018);  // color:Gray500
    }
}

