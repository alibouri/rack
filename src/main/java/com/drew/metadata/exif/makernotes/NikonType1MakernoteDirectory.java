package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class NikonType1MakernoteDirectory extends b {
    public static final int TAG_CCD_SENSITIVITY = 6;
    public static final int TAG_COLOR_MODE = 4;
    public static final int TAG_CONVERTER = 11;
    public static final int TAG_DIGITAL_ZOOM = 10;
    public static final int TAG_FOCUS = 8;
    public static final int TAG_IMAGE_ADJUSTMENT = 5;
    public static final int TAG_QUALITY = 3;
    public static final int TAG_UNKNOWN_1 = 2;
    public static final int TAG_UNKNOWN_2 = 9;
    public static final int TAG_UNKNOWN_3 = 0xF00;
    public static final int TAG_WHITE_BALANCE = 7;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        NikonType1MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(6, hashMap0, "CCD Sensitivity", 4, "Color Mode");
        com.apollographql.apollo.api.b.z(10, hashMap0, "Digital Zoom", 11, "Fisheye Converter");
        com.apollographql.apollo.api.b.z(8, hashMap0, "Focus", 5, "Image Adjustment");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Quality", 2, "Makernote Unknown 1");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Makernote Unknown 2", 0xF00, "Makernote Unknown 3");
        hashMap0.put(7, "White Balance");
    }

    public NikonType1MakernoteDirectory() {
        this.setDescriptor(new d(13, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Nikon Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return NikonType1MakernoteDirectory._tagNameMap;
    }
}

