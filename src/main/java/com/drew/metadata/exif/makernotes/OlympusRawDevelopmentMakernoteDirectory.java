package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusRawDevelopmentMakernoteDirectory extends b {
    public static final int TagRawDevColorSpace = 0x108;
    public static final int TagRawDevContrastValue = 0x106;
    public static final int TagRawDevEditStatus = 0x10B;
    public static final int TagRawDevEngine = 0x109;
    public static final int TagRawDevExposureBiasValue = 0x100;
    public static final int TagRawDevGrayPoint = 0x103;
    public static final int TagRawDevMemoryColorEmphasis = 0x105;
    public static final int TagRawDevNoiseReduction = 0x10A;
    public static final int TagRawDevSaturationEmphasis = 260;
    public static final int TagRawDevSettings = 0x10C;
    public static final int TagRawDevSharpnessValue = 0x107;
    public static final int TagRawDevVersion = 0;
    public static final int TagRawDevWbFineAdjustment = 0x102;
    public static final int TagRawDevWhiteBalanceValue = 0x101;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusRawDevelopmentMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Raw Dev Version", 0x100, "Raw Dev Exposure Bias Value");
        com.apollographql.apollo.api.b.z(0x101, hashMap0, "Raw Dev White Balance Value", 0x102, "Raw Dev WB Fine Adjustment");
        com.apollographql.apollo.api.b.z(0x103, hashMap0, "Raw Dev Gray Point", 260, "Raw Dev Saturation Emphasis");
        com.apollographql.apollo.api.b.z(0x105, hashMap0, "Raw Dev Memory Color Emphasis", 0x106, "Raw Dev Contrast Value");
        com.apollographql.apollo.api.b.z(0x107, hashMap0, "Raw Dev Sharpness Value", 0x108, "Raw Dev Color Space");
        com.apollographql.apollo.api.b.z(0x109, hashMap0, "Raw Dev Engine", 0x10A, "Raw Dev Noise Reduction");
        com.apollographql.apollo.api.b.z(0x10B, hashMap0, "Raw Dev Edit Status", 0x10C, "Raw Dev Settings");
    }

    public OlympusRawDevelopmentMakernoteDirectory() {
        this.setDescriptor(new d(17, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Raw Development";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusRawDevelopmentMakernoteDirectory._tagNameMap;
    }
}

