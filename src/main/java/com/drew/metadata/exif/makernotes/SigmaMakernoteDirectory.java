package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class SigmaMakernoteDirectory extends b {
    public static final int TAG_ADJUSTMENT_MODE = 21;
    public static final int TAG_AUTO_BRACKET = 25;
    public static final int TAG_AUTO_FOCUS_MODE = 5;
    public static final int TAG_COLOR_ADJUSTMENT = 20;
    public static final int TAG_COLOR_SPACE = 11;
    public static final int TAG_CONTRAST = 13;
    public static final int TAG_DRIVE_MODE = 3;
    public static final int TAG_EXPOSURE = 12;
    public static final int TAG_EXPOSURE_MODE = 8;
    public static final int TAG_FILL_LIGHT = 18;
    public static final int TAG_FIRMWARE = 23;
    public static final int TAG_FOCUS_SETTING = 6;
    public static final int TAG_HIGHLIGHT = 15;
    public static final int TAG_LENS_RANGE = 10;
    public static final int TAG_METERING_MODE = 9;
    public static final int TAG_QUALITY = 22;
    public static final int TAG_RESOLUTION_MODE = 4;
    public static final int TAG_SATURATION = 16;
    public static final int TAG_SERIAL_NUMBER = 2;
    public static final int TAG_SHADOW = 14;
    public static final int TAG_SHARPNESS = 17;
    public static final int TAG_SOFTWARE = 24;
    public static final int TAG_WHITE_BALANCE = 7;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        SigmaMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(2, hashMap0, "Serial Number", 3, "Drive Mode");
        com.apollographql.apollo.api.b.z(4, hashMap0, "Resolution Mode", 5, "Auto Focus Mode");
        com.apollographql.apollo.api.b.z(6, hashMap0, "Focus Setting", 7, "White Balance");
        com.apollographql.apollo.api.b.z(8, hashMap0, "Exposure Mode", 9, "Metering Mode");
        com.apollographql.apollo.api.b.z(10, hashMap0, "Lens Range", 11, "Color Space");
        com.apollographql.apollo.api.b.z(12, hashMap0, "Exposure", 13, "Contrast");
        com.apollographql.apollo.api.b.z(14, hashMap0, "Shadow", 15, "Highlight");
        com.apollographql.apollo.api.b.z(16, hashMap0, "Saturation", 17, "Sharpness");
        com.apollographql.apollo.api.b.z(18, hashMap0, "Fill Light", 20, "Color Adjustment");
        com.apollographql.apollo.api.b.z(21, hashMap0, "Adjustment Mode", 22, "Quality");
        com.apollographql.apollo.api.b.z(23, hashMap0, "Firmware", 24, "Software");
        hashMap0.put(25, "Auto Bracket");
    }

    public SigmaMakernoteDirectory() {
        this.setDescriptor(new d(26, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Sigma Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return SigmaMakernoteDirectory._tagNameMap;
    }
}

