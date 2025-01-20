package v8;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer;
import android.util.Log;

public final class c implements MediaPlayer.OnErrorListener {
    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        Log.w("d", "Failed to beep " + v + ", " + v1);
        mediaPlayer0.stop();
        mediaPlayer0.reset();
        mediaPlayer0.release();
        return true;
    }
}

