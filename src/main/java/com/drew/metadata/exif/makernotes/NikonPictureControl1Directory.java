package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;
import l4.l;

public final class NikonPictureControl1Directory extends b {
    static final boolean $assertionsDisabled = false;
    public static final int TAG_BRIGHTNESS = 52;
    public static final int TAG_CONTRAST = 51;
    public static final int TAG_FILTER_EFFECT = 55;
    public static final int TAG_HUE_ADJUSTMENT = 54;
    private static final HashMap TAG_NAME_MAP = null;
    public static final int TAG_PICTURE_CONTROL_ADJUST = 0x30;
    public static final int TAG_PICTURE_CONTROL_BASE = 24;
    public static final int TAG_PICTURE_CONTROL_NAME = 4;
    public static final int TAG_PICTURE_CONTROL_QUICK_ADJUST = 49;
    public static final int TAG_PICTURE_CONTROL_VERSION = 0;
    public static final int TAG_SATURATION = 53;
    public static final int TAG_SHARPNESS = 50;
    public static final int TAG_TONING_EFFECT = 56;
    public static final int TAG_TONING_SATURATION = 57;

    static {
        HashMap hashMap0 = new HashMap();
        NikonPictureControl1Directory.TAG_NAME_MAP = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Picture Control Version", 4, "Picture Control Name");
        com.apollographql.apollo.api.b.z(24, hashMap0, "Picture Control Base", 0x30, "Picture Control Adjust");
        com.apollographql.apollo.api.b.z(49, hashMap0, "Picture Control Quick Adjust", 50, "Sharpness");
        com.apollographql.apollo.api.b.z(51, hashMap0, "Contrast", 52, "Brightness");
        com.apollographql.apollo.api.b.z(53, hashMap0, "Saturation", 54, "Hue Adjustment");
        com.apollographql.apollo.api.b.z(55, hashMap0, "Filter Effect", 56, "Toning Effect");
        hashMap0.put(57, "Toning Saturation");
    }

    public NikonPictureControl1Directory() {
        this.setDescriptor(new d(11, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Nikon PictureControl 1";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return NikonPictureControl1Directory.TAG_NAME_MAP;
    }

    public static NikonPictureControl1Directory read(byte[] arr_b) {
        if(arr_b.length != 58) {
            throw new IllegalArgumentException("Must have 58 bytes.");
        }
        l l0 = new l(0, arr_b);
        NikonPictureControl1Directory nikonPictureControl1Directory0 = new NikonPictureControl1Directory();
        nikonPictureControl1Directory0.setObject(0, l0.w(4, l4.d.a));
        nikonPictureControl1Directory0.setObject(4, l0.w(20, l4.d.a));
        nikonPictureControl1Directory0.setObject(24, l0.w(20, l4.d.a));
        l0.D(4L);
        nikonPictureControl1Directory0.setObject(0x30, l0.B());
        nikonPictureControl1Directory0.setObject(49, l0.B());
        nikonPictureControl1Directory0.setObject(50, l0.B());
        nikonPictureControl1Directory0.setObject(51, l0.B());
        nikonPictureControl1Directory0.setObject(52, l0.B());
        nikonPictureControl1Directory0.setObject(53, l0.B());
        nikonPictureControl1Directory0.setObject(54, l0.B());
        nikonPictureControl1Directory0.setObject(55, l0.B());
        nikonPictureControl1Directory0.setObject(56, l0.B());
        nikonPictureControl1Directory0.setObject(57, l0.B());
        return nikonPictureControl1Directory0;
    }
}

