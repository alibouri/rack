package q0;

import android.app.Notification;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RenderNode;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthTdscdma;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.wave.voip.call.VoipCallService;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public abstract class f {
    public static boolean B(CellInfo cellInfo0) {
        return cellInfo0 instanceof CellInfoTdscdma;
    }

    public static int b(AudioAttributes audioAttributes0) {
        return audioAttributes0.getAllowedCapturePolicy();
    }

    public static RenderNode d() {
        return new RenderNode("graphicsLayer");
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder audioAttributes$Builder0, int v) {
        return audioAttributes$Builder0.setAllowedCapturePolicy(v);
    }

    public static CellInfoNr f(CellInfo cellInfo0) {
        return (CellInfoNr)cellInfo0;
    }

    public static CellInfoTdscdma g(CellInfo cellInfo0) {
        return (CellInfoTdscdma)cellInfo0;
    }

    public static CellSignalStrength h(CellInfoNr cellInfoNr0) {
        return cellInfoNr0.getCellSignalStrength();
    }

    public static CellSignalStrengthTdscdma i(CellInfoTdscdma cellInfoTdscdma0) {
        return cellInfoTdscdma0.getCellSignalStrength();
    }

    public static String j(SSLSocket sSLSocket0) {
        return sSLSocket0.getApplicationProtocol();
    }

    public static void o(RenderNode renderNode0, int v, int v1) {
        renderNode0.setPosition(0, 0, v, v1);
    }

    public static void s(CoordinatorLayout coordinatorLayout0, Context context0, int[] arr_v, AttributeSet attributeSet0, TypedArray typedArray0) {
        coordinatorLayout0.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, 0x7F04011D, 0);  // attr:coordinatorLayoutStyle
    }

    public static void t(VoipCallService voipCallService0, Notification notification0) {
        voipCallService0.startForeground(1, notification0, 4);
    }

    public static void u(SSLParameters sSLParameters0, String[] arr_s) {
        sSLParameters0.setApplicationProtocols(arr_s);
    }

    public static boolean w(CellInfo cellInfo0) {
        return cellInfo0 instanceof CellInfoNr;
    }

    public static RenderNode y() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }
}

