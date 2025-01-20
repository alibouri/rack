package J1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import m5.b;

public final class d implements c, e {
    public final int X;
    public ClipData Y;
    public int Z;
    public int b0;
    public Uri c0;
    public Bundle d0;

    public d() {
        this.X = 0;
        super();
    }

    public d(d d0) {
        this.X = 1;
        super();
        ClipData clipData0 = d0.Y;
        clipData0.getClass();
        this.Y = clipData0;
        int v = d0.Z;
        if(v < 0) {
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if(v > 5) {
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.Z = v;
        int v1 = d0.b0;
        if((v1 & 1) != v1) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(v1) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
        this.b0 = v1;
        this.c0 = d0.c0;
        this.d0 = d0.d0;
    }

    @Override  // J1.e
    public ClipData a() {
        return this.Y;
    }

    @Override  // J1.c
    public f b() {
        return new f(new d(this));
    }

    @Override  // J1.c
    public void c(Bundle bundle0) {
        this.d0 = bundle0;
    }

    @Override  // J1.c
    public void d(Uri uri0) {
        this.c0 = uri0;
    }

    @Override  // J1.e
    public int e() {
        return this.b0;
    }

    @Override  // J1.c
    public void f(int v) {
        this.b0 = v;
    }

    @Override  // J1.e
    public ContentInfo g() {
        return null;
    }

    @Override  // J1.e
    public int h() {
        return this.Z;
    }

    @Override
    public String toString() {
        String s;
        if(this.X != 1) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder("ContentInfoCompat{clip=");
        stringBuilder0.append(this.Y.getDescription());
        stringBuilder0.append(", source=");
        int v = this.Z;
        switch(v) {
            case 0: {
                s = "SOURCE_APP";
                break;
            }
            case 1: {
                s = "SOURCE_CLIPBOARD";
                break;
            }
            case 2: {
                s = "SOURCE_INPUT_METHOD";
                break;
            }
            case 3: {
                s = "SOURCE_DRAG_AND_DROP";
                break;
            }
            case 4: {
                s = "SOURCE_AUTOFILL";
                break;
            }
            case 5: {
                s = "SOURCE_PROCESS_TEXT";
                break;
            }
            default: {
                s = String.valueOf(v);
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", flags=");
        stringBuilder0.append(((this.b0 & 1) == 0 ? String.valueOf(this.b0) : "FLAG_CONVERT_TO_PLAIN_TEXT"));
        String s1 = "";
        stringBuilder0.append((this.c0 == null ? "" : ", hasLinkUri(" + this.c0.toString().length() + ")"));
        if(this.d0 != null) {
            s1 = ", hasExtras";
        }
        return b.y(stringBuilder0, s1, "}");
    }
}

