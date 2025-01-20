package v1;

import O3.j;
import R2.h;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.IconCompat;

public final class n extends j {
    public IconCompat Z;
    public IconCompat b0;
    public boolean c0;

    @Override  // O3.j
    public final void i(h h0) {
        Notification.BigPictureStyle notification$BigPictureStyle0 = new Notification.BigPictureStyle(((Notification.Builder)h0.b)).setBigContentTitle(null);
        IconCompat iconCompat0 = this.Z;
        Context context0 = (Context)h0.a;
        if(iconCompat0 != null) {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                m.a(notification$BigPictureStyle0, iconCompat0.f(context0));
            }
            else if(iconCompat0.d() == 1) {
                IconCompat iconCompat1 = this.Z;
                int v = iconCompat1.a;
                if(v == -1) {
                    notification$BigPictureStyle0 = notification$BigPictureStyle0.bigPicture((iconCompat1.b instanceof Bitmap ? ((Bitmap)iconCompat1.b) : null));
                }
                else if(v == 1) {
                    notification$BigPictureStyle0 = notification$BigPictureStyle0.bigPicture(((Bitmap)iconCompat1.b));
                }
                else {
                    if(v != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat1);
                    }
                    notification$BigPictureStyle0 = notification$BigPictureStyle0.bigPicture(IconCompat.a(((Bitmap)iconCompat1.b), true));
                }
            }
        }
        if(this.c0) {
            IconCompat iconCompat2 = this.b0;
            if(iconCompat2 == null) {
                notification$BigPictureStyle0.bigLargeIcon(null);
            }
            else {
                l.a(notification$BigPictureStyle0, iconCompat2.f(context0));
            }
        }
        if(Build.VERSION.SDK_INT >= 0x1F) {
            m.c(notification$BigPictureStyle0, false);
            m.b(notification$BigPictureStyle0, null);
        }
    }

    @Override  // O3.j
    public final String l() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}

