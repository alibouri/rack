package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class CasioType1MakernoteDirectory extends b {
    public static final int TAG_CCD_SENSITIVITY = 20;
    public static final int TAG_CONTRAST = 12;
    public static final int TAG_DIGITAL_ZOOM = 10;
    public static final int TAG_FLASH_INTENSITY = 5;
    public static final int TAG_FLASH_MODE = 4;
    public static final int TAG_FOCUSING_MODE = 3;
    public static final int TAG_OBJECT_DISTANCE = 6;
    public static final int TAG_QUALITY = 2;
    public static final int TAG_RECORDING_MODE = 1;
    public static final int TAG_SATURATION = 13;
    public static final int TAG_SHARPNESS = 11;
    public static final int TAG_UNKNOWN_1 = 8;
    public static final int TAG_UNKNOWN_2 = 9;
    public static final int TAG_UNKNOWN_3 = 14;
    public static final int TAG_UNKNOWN_4 = 15;
    public static final int TAG_UNKNOWN_5 = 16;
    public static final int TAG_UNKNOWN_6 = 17;
    public static final int TAG_UNKNOWN_7 = 18;
    public static final int TAG_UNKNOWN_8 = 19;
    public static final int TAG_WHITE_BALANCE = 7;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        CasioType1MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(20, hashMap0, "CCD Sensitivity", 12, "Contrast");
        com.apollographql.apollo.api.b.z(10, hashMap0, "Digital Zoom", 5, "Flash Intensity");
        com.apollographql.apollo.api.b.z(4, hashMap0, "Flash Mode", 3, "Focusing Mode");
        com.apollographql.apollo.api.b.z(6, hashMap0, "Object Distance", 2, "Quality");
        com.apollographql.apollo.api.b.z(1, hashMap0, "Recording Mode", 13, "Saturation");
        com.apollographql.apollo.api.b.z(11, hashMap0, "Sharpness", 8, "Makernote Unknown 1");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Makernote Unknown 2", 14, "Makernote Unknown 3");
        com.apollographql.apollo.api.b.z(15, hashMap0, "Makernote Unknown 4", 16, "Makernote Unknown 5");
        com.apollographql.apollo.api.b.z(17, hashMap0, "Makernote Unknown 6", 18, "Makernote Unknown 7");
        com.apollographql.apollo.api.b.z(19, hashMap0, "Makernote Unknown 8", 7, "White Balance");
    }

    public CasioType1MakernoteDirectory() {
        this.setDescriptor(new d(4, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Casio Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return CasioType1MakernoteDirectory._tagNameMap;
    }
}

