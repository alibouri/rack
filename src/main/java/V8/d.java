package v8;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes.Builder;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

public final class d {
    public final Context a;
    public boolean b;
    public boolean c;

    public d(Activity activity0) {
        this.b = true;
        this.c = false;
        activity0.setVolumeControlStream(3);
        this.a = activity0.getApplicationContext();
    }

    public final void a() {
        MediaPlayer mediaPlayer0 = new MediaPlayer();
        mediaPlayer0.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer0.setOnCompletionListener(new b());  // initializer: Ljava/lang/Object;-><init>()V
        mediaPlayer0.setOnErrorListener(new c());  // initializer: Ljava/lang/Object;-><init>()V
        try {
            AssetFileDescriptor assetFileDescriptor0 = this.a.getResources().openRawResourceFd(0x7F110002);  // raw:zxing_beep
            try {
                mediaPlayer0.setDataSource(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), assetFileDescriptor0.getLength());
            }
            finally {
                assetFileDescriptor0.close();
            }
            mediaPlayer0.setVolume(0.1f, 0.1f);
            mediaPlayer0.prepare();
            mediaPlayer0.start();
            return;
        }
        catch(IOException iOException0) {
        }
        Log.w("d", iOException0);
        mediaPlayer0.reset();
        mediaPlayer0.release();
    }

    public final void b() {
        synchronized(this) {
            if(this.b) {
                this.a();
            }
            if(this.c) {
                Vibrator vibrator0 = (Vibrator)this.a.getSystemService("vibrator");
                if(vibrator0 != null) {
                    vibrator0.vibrate(200L);
                }
            }
        }
    }
}

