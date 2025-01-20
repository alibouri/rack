package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class CasioType2MakernoteDirectory extends b {
    public static final int TAG_BESTSHOT_MODE = 0x3007;
    public static final int TAG_CCD_ISO_SENSITIVITY = 0x3014;
    public static final int TAG_COLOUR_MODE = 0x3015;
    public static final int TAG_CONTRAST = 0x20;
    public static final int TAG_ENHANCEMENT = 0x3016;
    public static final int TAG_FILTER = 0x3017;
    public static final int TAG_FLASH_DISTANCE = 0x2034;
    public static final int TAG_FOCAL_LENGTH = 29;
    public static final int TAG_FOCUS_MODE_1 = 13;
    public static final int TAG_FOCUS_MODE_2 = 0x3003;
    public static final int TAG_IMAGE_SIZE = 9;
    public static final int TAG_ISO_SENSITIVITY = 20;
    public static final int TAG_OBJECT_DISTANCE = 0x2022;
    public static final int TAG_PREVIEW_THUMBNAIL = 0x2000;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_QUALITY = 0x3002;
    public static final int TAG_QUALITY_MODE = 8;
    public static final int TAG_RECORD_MODE = 0x3000;
    public static final int TAG_SATURATION = 0x1F;
    public static final int TAG_SELF_TIMER = 0x3001;
    public static final int TAG_SHARPNESS = 33;
    public static final int TAG_THUMBNAIL_DIMENSIONS = 2;
    public static final int TAG_THUMBNAIL_OFFSET = 4;
    public static final int TAG_THUMBNAIL_SIZE = 3;
    public static final int TAG_TIME_ZONE = 0x3006;
    public static final int TAG_WHITE_BALANCE_1 = 25;
    public static final int TAG_WHITE_BALANCE_2 = 8210;
    public static final int TAG_WHITE_BALANCE_BIAS = 8209;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        CasioType2MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(2, hashMap0, "Thumbnail Dimensions", 3, "Thumbnail Size");
        com.apollographql.apollo.api.b.z(4, hashMap0, "Thumbnail Offset", 8, "Quality Mode");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Image Size", 13, "Focus Mode");
        com.apollographql.apollo.api.b.z(20, hashMap0, "ISO Sensitivity", 25, "White Balance");
        com.apollographql.apollo.api.b.z(29, hashMap0, "Focal Length", 0x1F, "Saturation");
        com.apollographql.apollo.api.b.z(0x20, hashMap0, "Contrast", 33, "Sharpness");
        com.apollographql.apollo.api.b.z(0xE00, hashMap0, "Print Image Matching (PIM) Info", 0x2000, "Casio Preview Thumbnail");
        com.apollographql.apollo.api.b.z(8209, hashMap0, "White Balance Bias", 8210, "White Balance");
        com.apollographql.apollo.api.b.z(0x2022, hashMap0, "Object Distance", 0x2034, "Flash Distance");
        com.apollographql.apollo.api.b.z(0x3000, hashMap0, "Record Mode", 0x3001, "Self Timer");
        com.apollographql.apollo.api.b.z(0x3002, hashMap0, "Quality", 0x3003, "Focus Mode");
        com.apollographql.apollo.api.b.z(0x3006, hashMap0, "Time Zone", 0x3007, "BestShot Mode");
        com.apollographql.apollo.api.b.z(0x3014, hashMap0, "CCD ISO Sensitivity", 0x3015, "Colour Mode");
        com.apollographql.apollo.api.b.z(0x3016, hashMap0, "Enhancement", 0x3017, "Filter");
    }

    public CasioType2MakernoteDirectory() {
        this.setDescriptor(new d(5, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Casio Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return CasioType2MakernoteDirectory._tagNameMap;
    }
}

