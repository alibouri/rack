package rb;

import Ab.o;
import E9.a;
import Xb.u0;
import ac.B0;
import ac.h;
import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.twilio.audioswitch.AudioSwitch;
import com.twilio.voice.Call.Listener;
import com.twilio.voice.Call;
import com.twilio.voice.CallException;
import com.wave.voip.call.VoipCaller.CallParams;
import dc.e;
import java.util.Set;
import pb.d;

public final class l implements AudioManager.OnAudioFocusChangeListener, Listener, v {
    public final Context a;
    public final sb.l b;
    public final a c;
    public final e d;
    public VoipCaller.CallParams e;
    public Call f;
    public final B0 g;
    public final AudioSwitch h;
    public final B0 i;
    public final B0 j;
    public final B0 k;
    public final B0 l;
    public u m;
    public final h n;
    public final o o;
    public final u0 p;

    static {
    }

    public l(Context context0, sb.l l0, a a0, e e0) {
    }

    public final void a(d d0) {
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onCallQualityWarningsChanged(Call call0, Set set0, Set set1) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onConnectFailure(Call call0, CallException callException0) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onConnected(Call call0) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onDisconnected(Call call0, CallException callException0) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onReconnected(Call call0) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onReconnecting(Call call0, CallException callException0) {
    }

    @Override  // com.twilio.voice.Call$Listener
    public final void onRinging(Call call0) {
    }
}

