package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class KodakMakernoteDirectory extends b {
    public static final int TAG_BURST_MODE = 10;
    public static final int TAG_BURST_MODE_2 = 24;
    public static final int TAG_COLOR_MODE = 102;
    public static final int TAG_DATE_TIME_STAMP = 100;
    public static final int TAG_DIGITAL_ZOOM = 104;
    public static final int TAG_EXPOSURE_COMPENSATION = 36;
    public static final int TAG_EXPOSURE_TIME = 0x20;
    public static final int TAG_FLASH_FIRED = 93;
    public static final int TAG_FLASH_MODE = 92;
    public static final int TAG_FOCUS_MODE = 56;
    public static final int TAG_F_NUMBER = 30;
    public static final int TAG_IMAGE_HEIGHT = 14;
    public static final int TAG_IMAGE_WIDTH = 12;
    public static final int TAG_ISO = 0x60;
    public static final int TAG_ISO_SETTING = 94;
    public static final int TAG_KODAK_MODEL = 0;
    public static final int TAG_METERING_MODE = 28;
    public static final int TAG_MONTH_DAY_CREATED = 18;
    public static final int TAG_QUALITY = 9;
    public static final int TAG_SEQUENCE_NUMBER = 29;
    public static final int TAG_SHARPNESS = 107;
    public static final int TAG_SHUTTER_MODE = 27;
    public static final int TAG_TIME_CREATED = 20;
    public static final int TAG_TOTAL_ZOOM = 98;
    public static final int TAG_WHITE_BALANCE = 0x40;
    public static final int TAG_YEAR_CREATED = 16;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        KodakMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Kodak Model", 9, "Quality");
        com.apollographql.apollo.api.b.z(10, hashMap0, "Burst Mode", 12, "Image Width");
        com.apollographql.apollo.api.b.z(14, hashMap0, "Image Height", 16, "Year Created");
        com.apollographql.apollo.api.b.z(18, hashMap0, "Month/Day Created", 20, "Time Created");
        com.apollographql.apollo.api.b.z(24, hashMap0, "Burst Mode 2", 27, "Shutter Speed");
        com.apollographql.apollo.api.b.z(28, hashMap0, "Metering Mode", 29, "Sequence Number");
        com.apollographql.apollo.api.b.z(30, hashMap0, "F Number", 0x20, "Exposure Time");
        com.apollographql.apollo.api.b.z(36, hashMap0, "Exposure Compensation", 56, "Focus Mode");
        com.apollographql.apollo.api.b.z(0x40, hashMap0, "White Balance", 92, "Flash Mode");
        com.apollographql.apollo.api.b.z(93, hashMap0, "Flash Fired", 94, "ISO Setting");
        com.apollographql.apollo.api.b.z(0x60, hashMap0, "ISO", 98, "Total Zoom");
        com.apollographql.apollo.api.b.z(100, hashMap0, "Date/Time Stamp", 102, "Color Mode");
        com.apollographql.apollo.api.b.z(104, hashMap0, "Digital Zoom", 107, "Sharpness");
    }

    public KodakMakernoteDirectory() {
        this.setDescriptor(new d(7, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Kodak Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return KodakMakernoteDirectory._tagNameMap;
    }
}

