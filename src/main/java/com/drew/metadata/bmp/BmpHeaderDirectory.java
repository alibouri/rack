package com.drew.metadata.bmp;

import com.drew.metadata.b;
import java.util.HashMap;
import p4.a;
import p4.c;
import p4.d;
import p4.e;
import p4.f;

public class BmpHeaderDirectory extends b {
    public static final int TAG_ALPHA_MASK = 15;
    public static final int TAG_BITMAP_TYPE = -2;
    public static final int TAG_BITS_PER_PIXEL = 4;
    public static final int TAG_BLUE_MASK = 14;
    public static final int TAG_COLOR_ENCODING = 11;
    public static final int TAG_COLOR_SPACE_TYPE = 16;
    public static final int TAG_COLOUR_PLANES = 3;
    public static final int TAG_COMPRESSION = 5;
    public static final int TAG_GAMMA_BLUE = 19;
    public static final int TAG_GAMMA_GREEN = 18;
    public static final int TAG_GAMMA_RED = 17;
    public static final int TAG_GREEN_MASK = 13;
    public static final int TAG_HEADER_SIZE = -1;
    public static final int TAG_IMAGE_HEIGHT = 1;
    public static final int TAG_IMAGE_WIDTH = 2;
    public static final int TAG_IMPORTANT_COLOUR_COUNT = 9;
    public static final int TAG_INTENT = 20;
    public static final int TAG_LINKED_PROFILE = 21;
    public static final int TAG_PALETTE_COLOUR_COUNT = 8;
    public static final int TAG_RED_MASK = 12;
    public static final int TAG_RENDERING = 10;
    public static final int TAG_X_PIXELS_PER_METER = 6;
    public static final int TAG_Y_PIXELS_PER_METER = 7;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        BmpHeaderDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(-2, hashMap0, "Bitmap type", -1, "Header Size");
        com.apollographql.apollo.api.b.z(1, hashMap0, "Image Height", 2, "Image Width");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Planes", 4, "Bits Per Pixel");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Compression", 6, "X Pixels per Meter");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Y Pixels per Meter", 8, "Palette Colour Count");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Important Colour Count", 10, "Rendering");
        com.apollographql.apollo.api.b.z(11, hashMap0, "Color Encoding", 12, "Red Mask");
        com.apollographql.apollo.api.b.z(13, hashMap0, "Green Mask", 14, "Blue Mask");
        com.apollographql.apollo.api.b.z(15, hashMap0, "Alpha Mask", 16, "Color Space Type");
        com.apollographql.apollo.api.b.z(17, hashMap0, "Red Gamma Curve", 18, "Green Gamma Curve");
        com.apollographql.apollo.api.b.z(19, hashMap0, "Blue Gamma Curve", 20, "Rendering Intent");
        hashMap0.put(21, "Linked Profile File Name");
    }

    public BmpHeaderDirectory() {
        this.setDescriptor(new A4.b(22, this));
    }

    public a getBitmapType() {
        Integer integer0 = this.getInteger(-2);
        if(integer0 != null) {
            int v = (int)integer0;
            a[] arr_a = a.values();
            for(int v1 = 0; v1 < arr_a.length; ++v1) {
                a a0 = arr_a[v1];
                if(a0.X == v) {
                    return a0;
                }
            }
        }
        return null;
    }

    public p4.b getColorEncoding() {
        Integer integer0 = this.getInteger(11);
        return integer0 == null || ((int)integer0) != 0 ? null : p4.b.X;
    }

    public c getColorSpaceType() {
        Long long0 = this.getLongObject(16);
        if(long0 != null) {
            long v = (long)long0;
            c[] arr_c = c.values();
            for(int v1 = 0; v1 < arr_c.length; ++v1) {
                c c0 = arr_c[v1];
                if(c0.X == v) {
                    return c0;
                }
            }
        }
        return null;
    }

    public d getCompression() {
        Integer integer0 = this.getInteger(5);
        if(integer0 != null) {
            Integer integer1 = this.getInteger(-1);
            if(integer1 != null) {
                int v = (int)integer1;
                switch(((int)integer0)) {
                    case 0: {
                        return d.X;
                    }
                    case 1: {
                        return d.Y;
                    }
                    case 2: {
                        return d.Z;
                    }
                    case 3: {
                        return v == 0x40 ? d.c0 : d.b0;
                    }
                    case 4: {
                        return v == 0x40 ? d.e0 : d.d0;
                    }
                    case 5: {
                        return d.f0;
                    }
                    case 6: {
                        return d.g0;
                    }
                    case 11: {
                        return d.h0;
                    }
                    case 12: {
                        return d.i0;
                    }
                    case 13: {
                        return d.j0;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "BMP Header";
    }

    public e getRendering() {
        Integer integer0 = this.getInteger(10);
        if(integer0 != null) {
            int v = (int)integer0;
            e[] arr_e = e.values();
            for(int v1 = 0; v1 < arr_e.length; ++v1) {
                e e0 = arr_e[v1];
                if(e0.X == v) {
                    return e0;
                }
            }
        }
        return null;
    }

    public f getRenderingIntent() {
        Integer integer0 = this.getInteger(20);
        if(integer0 != null) {
            long v = (long)(((int)integer0));
            f[] arr_f = f.values();
            for(int v1 = 0; v1 < arr_f.length; ++v1) {
                f f0 = arr_f[v1];
                if(((long)f0.X) == v) {
                    return f0;
                }
            }
        }
        return null;
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return BmpHeaderDirectory._tagNameMap;
    }
}

