package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusRawDevelopment2MakernoteDirectory extends b {
    public static final int TagRawDevArtFilter = 289;
    public static final int TagRawDevAutoGradation = 281;
    public static final int TagRawDevColorSpace = 0x109;
    public static final int TagRawDevContrastValue = 0x105;
    public static final int TagRawDevEngine = 0x10B;
    public static final int TagRawDevExposureBiasValue = 0x100;
    public static final int TagRawDevGradation = 274;
    public static final int TagRawDevGrayPoint = 260;
    public static final int TagRawDevMemoryColorEmphasis = 0x108;
    public static final int TagRawDevNoiseReduction = 0x10A;
    public static final int TagRawDevPictureMode = 0x10C;
    public static final int TagRawDevPmBwFilter = 0x110;
    public static final int TagRawDevPmContrast = 270;
    public static final int TagRawDevPmNoiseFilter = 0x120;
    public static final int TagRawDevPmPictureTone = 273;
    public static final int TagRawDevPmSaturation = 0x10D;
    public static final int TagRawDevPmSharpness = 0x10F;
    public static final int TagRawDevSaturation3 = 275;
    public static final int TagRawDevSaturationEmphasis = 0x107;
    public static final int TagRawDevSharpnessValue = 0x106;
    public static final int TagRawDevVersion = 0;
    public static final int TagRawDevWbFineAdjustment = 0x103;
    public static final int TagRawDevWhiteBalance = 0x101;
    public static final int TagRawDevWhiteBalanceValue = 0x102;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusRawDevelopment2MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Raw Dev Version", 0x100, "Raw Dev Exposure Bias Value");
        com.apollographql.apollo.api.b.z(0x101, hashMap0, "Raw Dev White Balance", 0x102, "Raw Dev White Balance Value");
        com.apollographql.apollo.api.b.z(0x103, hashMap0, "Raw Dev WB Fine Adjustment", 260, "Raw Dev Gray Point");
        com.apollographql.apollo.api.b.z(0x105, hashMap0, "Raw Dev Contrast Value", 0x106, "Raw Dev Sharpness Value");
        com.apollographql.apollo.api.b.z(0x107, hashMap0, "Raw Dev Saturation Emphasis", 0x108, "Raw Dev Memory Color Emphasis");
        com.apollographql.apollo.api.b.z(0x109, hashMap0, "Raw Dev Color Space", 0x10A, "Raw Dev Noise Reduction");
        com.apollographql.apollo.api.b.z(0x10B, hashMap0, "Raw Dev Engine", 0x10C, "Raw Dev Picture Mode");
        com.apollographql.apollo.api.b.z(0x10D, hashMap0, "Raw Dev PM Saturation", 270, "Raw Dev PM Contrast");
        com.apollographql.apollo.api.b.z(0x10F, hashMap0, "Raw Dev PM Sharpness", 0x110, "Raw Dev PM BW Filter");
        com.apollographql.apollo.api.b.z(273, hashMap0, "Raw Dev PM Picture Tone", 274, "Raw Dev Gradation");
        com.apollographql.apollo.api.b.z(275, hashMap0, "Raw Dev Saturation 3", 281, "Raw Dev Auto Gradation");
        com.apollographql.apollo.api.b.z(0x120, hashMap0, "Raw Dev PM Noise Filter", 289, "Raw Dev Art Filter");
    }

    public OlympusRawDevelopment2MakernoteDirectory() {
        this.setDescriptor(new e(this));  // initializer: Lcom/drew/metadata/g;-><init>(Lcom/drew/metadata/b;)V
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Raw Development 2";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusRawDevelopment2MakernoteDirectory._tagNameMap;
    }
}

