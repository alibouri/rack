package com.wave.customer;

import D8.a;
import Nb.j;
import R1.d;
import R9.Z0;
import R9.Z1;
import R9.a2;
import R9.l2;
import R9.o2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c2.U;
import c2.x;
import ca.Y;
import com.sendwave.util.WaveBarcodeView;
import java.util.Arrays;
import q9.r1;

public final class QrScanFragment extends Fragment {
    public a2 X0;
    public boolean Y0;
    public Y Z0;

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        j.f(layoutInflater0, "inflater");
        Y y0 = (Y)d.a(layoutInflater0, 0x7F0D00E7, viewGroup0);  // layout:scan_qr
        this.Z0 = y0;
        U u0 = this.P0;
        if(u0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        y0.r(u0);
        j.e(y0.d, "getRoot(...)");
        return y0.d;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void C() {
        this.D0 = true;
        a2 a20 = this.X0;
        if(a20 != null) {
            a20.d = true;
            a20.e.a();
            a20.g.removeCallbacksAndMessages(null);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void D() {
        FrameLayout frameLayout0 = this.Z0 == null ? null : this.Z0.r;
        if(frameLayout0 != null) {
            frameLayout0.setOnClickListener(null);
        }
        this.Z0 = null;
        this.X0 = null;
        this.D0 = true;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void G() {
        this.D0 = true;
        a2 a20 = this.X0;
        if(a20 != null) {
            a20.e.a();
            a20.b.e();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void H() {
        this.D0 = true;
        a2 a20 = this.X0;
        if(a20 != null) {
            a20.d();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void I(Bundle bundle0) {
        a2 a20 = this.X0;
        if(a20 != null) {
            bundle0.putInt("SAVED_ORIENTATION_LOCK", a20.c);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void L(View view0, Bundle bundle0) {
        l2 l20;
        j.f(view0, "view");
        x x0 = this.j();
        WaveBarcodeView waveBarcodeView0 = null;
        QrScanOrCardActivity qrScanOrCardActivity0 = x0 instanceof QrScanOrCardActivity ? ((QrScanOrCardActivity)x0) : null;
        if(qrScanOrCardActivity0 == null) {
            l20 = l2.c0;
        }
        else {
            o2 o20 = qrScanOrCardActivity0.J();
            if(o20 == null) {
                l20 = l2.c0;
            }
            else {
                QrScanOrCardParams qrScanOrCardParams0 = o20.Z;
                if(qrScanOrCardParams0 == null) {
                    l20 = l2.c0;
                }
                else {
                    l20 = qrScanOrCardParams0.b0;
                    if(l20 == null) {
                        l20 = l2.c0;
                    }
                }
            }
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0A027E);  // id:scan_instructions
        Integer integer0 = l20.Y;
        if(integer0 != null) {
            textView0.setText(r1.d(integer0.intValue(), new Object[0]));
        }
        FrameLayout frameLayout0 = this.Z0 == null ? null : this.Z0.r;
        if(frameLayout0 != null) {
            frameLayout0.setOnClickListener(new Z1(0, this));
        }
        Z0.b(this.O()).d();
        x x1 = this.j();
        Y y0 = this.Z0;
        if(y0 != null) {
            waveBarcodeView0 = y0.q;
        }
        this.X0 = new a2(this, x1, waveBarcodeView0);
        a a0 = new a(this.j());
        a0.d = QrScanOrCardActivity.class;
        a0.b.put("SCAN_ORIENTATION_LOCKED", Boolean.FALSE);
        a0.c = Arrays.asList(new String[]{"QR_CODE"});
        a2 a20 = this.X0;
        if(a20 != null) {
            a20.c(a0.a(), bundle0);
        }
        a2 a21 = this.X0;
        if(a21 != null) {
            a21.b.B0 = 2;
            a21.b.C0 = a21.i;
            a21.b.k();
        }
    }
}

