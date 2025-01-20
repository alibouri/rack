package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class PentaxMakernoteDirectory extends b {
    public static final int TAG_CAPTURE_MODE = 1;
    public static final int TAG_COLOUR = 23;
    public static final int TAG_CONTRAST = 12;
    public static final int TAG_DAYLIGHT_SAVINGS = 0x1001;
    public static final int TAG_DIGITAL_ZOOM = 10;
    public static final int TAG_FLASH_MODE = 4;
    public static final int TAG_FOCUS_MODE = 3;
    public static final int TAG_ISO_SPEED = 20;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_QUALITY_LEVEL = 2;
    public static final int TAG_SATURATION = 13;
    public static final int TAG_SHARPNESS = 11;
    public static final int TAG_TIME_ZONE = 0x1000;
    public static final int TAG_WHITE_BALANCE = 7;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PentaxMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Capture Mode", 2, "Quality Level");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Focus Mode", 4, "Flash Mode");
        com.apollographql.apollo.api.b.z(7, hashMap0, "White Balance", 10, "Digital Zoom");
        com.apollographql.apollo.api.b.z(11, hashMap0, "Sharpness", 12, "Contrast");
        com.apollographql.apollo.api.b.z(13, hashMap0, "Saturation", 20, "ISO Speed");
        com.apollographql.apollo.api.b.z(23, hashMap0, "Colour", 0xE00, "Print Image Matching (PIM) Info");
        com.apollographql.apollo.api.b.z(0x1000, hashMap0, "Time Zone", 0x1001, "Daylight Savings");
    }

    public PentaxMakernoteDirectory() {
        this.setDescriptor(new d(19, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Pentax Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PentaxMakernoteDirectory._tagNameMap;
    }
}

