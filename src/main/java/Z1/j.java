package z1;

import N4.o;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.Typeface;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import y1.e;
import y1.f;

public final class j extends o {
    @Override  // N4.o
    public final G1.j A(G1.j[] arr_j, int v) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public static Font P(FontFamily fontFamily0, int v) {
        FontStyle fontStyle0 = new FontStyle(((v & 1) == 0 ? 400 : 700), ((v & 2) == 0 ? 0 : 1));
        Font font0 = fontFamily0.getFont(0);
        int v2 = j.R(fontStyle0, font0.getStyle());
        for(int v1 = 1; v1 < fontFamily0.getSize(); ++v1) {
            Font font1 = fontFamily0.getFont(v1);
            int v3 = j.R(fontStyle0, font1.getStyle());
            if(v3 < v2) {
                font0 = font1;
                v2 = v3;
            }
        }
        return font0;
    }

    public static FontFamily Q(G1.j[] arr_j, ContentResolver contentResolver0) {
        FontFamily.Builder fontFamily$Builder0 = null;
        for(int v = 0; v < arr_j.length; ++v) {
            G1.j j0 = arr_j[v];
            try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(j0.a, "r", null)) {
                if(parcelFileDescriptor0 != null) {
                    Font font0 = new Font.Builder(parcelFileDescriptor0).setWeight(j0.c).setSlant(((int)j0.d)).setTtcIndex(j0.b).build();
                    if(fontFamily$Builder0 == null) {
                        fontFamily$Builder0 = new FontFamily.Builder(font0);
                    }
                    else {
                        fontFamily$Builder0.addFont(font0);
                    }
                }
            }
            catch(IOException iOException0) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", iOException0);
            }
        }
        return fontFamily$Builder0 == null ? null : fontFamily$Builder0.build();
    }

    public static int R(FontStyle fontStyle0, FontStyle fontStyle1) {
        int v = Math.abs(fontStyle0.getWeight() - fontStyle1.getWeight());
        return fontStyle0.getSlant() == fontStyle1.getSlant() ? v / 100 : v / 100 + 2;
    }

    @Override  // N4.o
    public final Typeface m(Context context0, e e0, Resources resources0, int v) {
        try {
            f[] arr_f = e0.a;
            FontFamily.Builder fontFamily$Builder0 = null;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= arr_f.length) {
                    if(fontFamily$Builder0 != null) {
                        FontFamily fontFamily0 = fontFamily$Builder0.build();
                        return new Typeface.CustomFallbackBuilder(fontFamily0).setStyle(j.P(fontFamily0, v).getStyle()).build();
                    }
                    return null;
                }
                f f0 = arr_f[v1];
                try {
                    Font font0 = new Font.Builder(resources0, f0.f).setWeight(f0.b).setSlant(((int)f0.c)).setTtcIndex(f0.e).setFontVariationSettings(f0.d).build();
                    if(fontFamily$Builder0 == null) {
                        fontFamily$Builder0 = new FontFamily.Builder(font0);
                    }
                    else {
                        fontFamily$Builder0.addFont(font0);
                    }
                }
                catch(IOException unused_ex) {
                }
            }
        }
        catch(Exception exception0) {
        }
        Log.w("TypefaceCompatApi29Impl", "Font load failed", exception0);
        return null;
    }

    @Override  // N4.o
    public final Typeface n(Context context0, G1.j[] arr_j, int v) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        try {
            FontFamily fontFamily0 = j.Q(arr_j, contentResolver0);
            return fontFamily0 == null ? null : new Typeface.CustomFallbackBuilder(fontFamily0).setStyle(j.P(fontFamily0, v).getStyle()).build();
        }
        catch(Exception exception0) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", exception0);
            return null;
        }
    }

    @Override  // N4.o
    public final Typeface o(Context context0, List list0, int v) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        try {
            FontFamily fontFamily0 = j.Q(((G1.j[])list0.get(0)), contentResolver0);
            if(fontFamily0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder typeface$CustomFallbackBuilder0 = new Typeface.CustomFallbackBuilder(fontFamily0);
            for(int v1 = 1; v1 < list0.size(); ++v1) {
                FontFamily fontFamily1 = j.Q(((G1.j[])list0.get(v1)), contentResolver0);
                if(fontFamily1 != null) {
                    typeface$CustomFallbackBuilder0.addCustomFallback(fontFamily1);
                }
            }
            return typeface$CustomFallbackBuilder0.setStyle(j.P(fontFamily0, v).getStyle()).build();
        }
        catch(Exception exception0) {
        }
        Log.w("TypefaceCompatApi29Impl", "Font load failed", exception0);
        return null;
    }

    @Override  // N4.o
    public final Typeface p(Context context0, InputStream inputStream0) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override  // N4.o
    public final Typeface q(Context context0, Resources resources0, int v, String s, int v1) {
        try {
            Font font0 = new Font.Builder(resources0, v).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(font0).build()).setStyle(font0.getStyle()).build();
        }
        catch(Exception exception0) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", exception0);
            return null;
        }
    }
}

