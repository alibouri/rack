package v8;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;

public final class b implements MediaPlayer.OnCompletionListener {
    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        mediaPlayer0.stop();
        mediaPlayer0.reset();
        mediaPlayer0.release();
    }
}

