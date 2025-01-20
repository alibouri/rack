package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;
import l4.l;

public final class NikonPictureControl2Directory extends b {
    static final boolean $assertionsDisabled = false;
    public static final int TAG_BRIGHTNESS = 57;
    public static final int TAG_CLARITY = 53;
    public static final int TAG_CONTRAST = 55;
    public static final int TAG_FILTER_EFFECT = 0x3F;
    public static final int TAG_HUE = 61;
    private static final HashMap TAG_NAME_MAP = null;
    public static final int TAG_PICTURE_CONTROL_ADJUST = 0x30;
    public static final int TAG_PICTURE_CONTROL_BASE = 24;
    public static final int TAG_PICTURE_CONTROL_NAME = 4;
    public static final int TAG_PICTURE_CONTROL_QUICK_ADJUST = 49;
    public static final int TAG_PICTURE_CONTROL_VERSION = 0;
    public static final int TAG_SATURATION = 59;
    public static final int TAG_SHARPNESS = 51;
    public static final int TAG_TONING_EFFECT = 0x40;
    public static final int TAG_TONING_SATURATION = 65;

    static {
        HashMap hashMap0 = new HashMap();
        NikonPictureControl2Directory.TAG_NAME_MAP = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Picture Control Version", 4, "Picture Control Name");
        com.apollographql.apollo.api.b.z(24, hashMap0, "Picture Control Base", 0x30, "Picture Control Adjust");
        com.apollographql.apollo.api.b.z(49, hashMap0, "Picture Control Quick Adjust", 51, "Sharpness");
        com.apollographql.apollo.api.b.z(53, hashMap0, "Clarity", 55, "Contrast");
        com.apollographql.apollo.api.b.z(57, hashMap0, "Brightness", 59, "Saturation");
        com.apollographql.apollo.api.b.z(61, hashMap0, "Hue", 0x3F, "Filter Effect");
        com.apollographql.apollo.api.b.z(0x40, hashMap0, "Toning Effect", 65, "Toning Saturation");
    }

    public NikonPictureControl2Directory() {
        this.setDescriptor(new d(12, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Nikon PictureControl 2";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return NikonPictureControl2Directory.TAG_NAME_MAP;
    }

    public static NikonPictureControl2Directory read(byte[] arr_b) {
        if(arr_b.length != 68) {
            throw new IllegalArgumentException("Must have 68 bytes.");
        }
        l l0 = new l(0, arr_b);
        NikonPictureControl2Directory nikonPictureControl2Directory0 = new NikonPictureControl2Directory();
        nikonPictureControl2Directory0.setString(0, l0.w(4, l4.d.a).toString());
        nikonPictureControl2Directory0.setString(4, l0.w(20, l4.d.a).toString());
        nikonPictureControl2Directory0.setString(24, l0.w(20, l4.d.a).toString());
        l0.D(4L);
        nikonPictureControl2Directory0.setObject(0x30, l0.a());
        nikonPictureControl2Directory0.setObject(49, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(51, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(53, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(55, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(57, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(59, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(61, l0.a());
        l0.D(1L);
        nikonPictureControl2Directory0.setObject(0x3F, l0.a());
        nikonPictureControl2Directory0.setObject(0x40, l0.a());
        nikonPictureControl2Directory0.setObject(65, l0.a());
        l0.D(2L);
        return nikonPictureControl2Directory0;
    }
}

