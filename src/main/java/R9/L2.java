package R9;

import Gb.b;
import com.sendwave.backend.type.ActionSource.SCAN_QR_SEND_SCREEN;
import com.sendwave.backend.type.ActionSource;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class l2 extends Enum {
    public final boolean X;
    public final Integer Y;
    public final SCAN_QR_SEND_SCREEN Z;
    public static final enum l2 b0;
    public static final enum l2 c0;
    public static final l2[] d0;

    static {
        l2.b0 = new l2("ScantoSendP2P", 0, false, 0x7F1203A5, SCAN_QR_SEND_SCREEN.X);  // string:scan_qr_to_send "Scan a QR code to send"
        l2.c0 = new l2("Default", 2, true, null, null);
        l2[] arr_l2 = {l2.b0, new l2("ScanToReceivePromo", 1, false, 0x7F1203A4, null), l2.c0};  // string:scan_qr_to_receive_promo "Scan a QR code to receive a promo"
        l2.d0 = arr_l2;
        new b(arr_l2);
    }

    public l2(String s, int v, boolean z, Integer integer0, SCAN_QR_SEND_SCREEN actionSource$SCAN_QR_SEND_SCREEN0) {
        super(s, v);
        this.X = z;
        this.Y = integer0;
        this.Z = actionSource$SCAN_QR_SEND_SCREEN0;
    }

    public final ActionSource a() {
        return this.Z;
    }

    public static l2 valueOf(String s) {
        return (l2)Enum.valueOf(l2.class, s);
    }

    public static l2[] values() {
        return (l2[])l2.d0.clone();
    }
}

