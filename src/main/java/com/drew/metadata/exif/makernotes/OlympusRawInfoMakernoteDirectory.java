package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusRawInfoMakernoteDirectory extends b {
    public static final int TagBlackLevel2 = 0x600;
    public static final int TagCmContrast = 0x2022;
    public static final int TagCmExposureCompensation = 0x2000;
    public static final int TagCmHue = 0x2021;
    public static final int TagCmSaturation = 0x2020;
    public static final int TagCmSharpness = 0x2023;
    public static final int TagCmWhiteBalance = 0x2001;
    public static final int TagCmWhiteBalanceComp = 0x2002;
    public static final int TagCmWhiteBalanceGrayPoint = 0x2010;
    public static final int TagColorMatrix2 = 0x200;
    public static final int TagContrastSetting = 0x1012;
    public static final int TagCoringFilter = 0x310;
    public static final int TagCoringValues = 785;
    public static final int TagCropHeight = 0x615;
    public static final int TagCropLeft = 0x612;
    public static final int TagCropTop = 0x613;
    public static final int TagCropWidth = 0x614;
    public static final int TagHueSetting = 0x1011;
    public static final int TagLightSource = 0x1000;
    public static final int TagRawInfoVersion = 0;
    public static final int TagSaturationSetting = 0x1010;
    public static final int TagSharpnessSetting = 0x1013;
    public static final int TagValidPixelDepth = 0x611;
    public static final int TagWbRbLevelsAuto = 0x110;
    public static final int TagWbRbLevelsCloudy = 289;
    public static final int TagWbRbLevelsCoolWhiteFluor = 306;
    public static final int TagWbRbLevelsDayWhiteFluor = 305;
    public static final int TagWbRbLevelsDaylightFluor = 304;
    public static final int TagWbRbLevelsEveningSunlight = 292;
    public static final int TagWbRbLevelsFineWeather = 290;
    public static final int TagWbRbLevelsShade = 0x120;
    public static final int TagWbRbLevelsTungsten = 291;
    public static final int TagWbRbLevelsUsed = 0x100;
    public static final int TagWbRbLevelsWhiteFluorescent = 307;
    public static final int TagWhiteBalanceComp = 0x1001;
    public static final int TagYCbCrCoefficients = 0x601;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusRawInfoMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Raw Info Version", 0x100, "WB RB Levels Used");
        com.apollographql.apollo.api.b.z(0x110, hashMap0, "WB RB Levels Auto", 0x120, "WB RB Levels Shade");
        com.apollographql.apollo.api.b.z(289, hashMap0, "WB RB Levels Cloudy", 290, "WB RB Levels Fine Weather");
        com.apollographql.apollo.api.b.z(291, hashMap0, "WB RB Levels Tungsten", 292, "WB RB Levels Evening Sunlight");
        com.apollographql.apollo.api.b.z(304, hashMap0, "WB RB Levels Daylight Fluor", 305, "WB RB Levels Day White Fluor");
        com.apollographql.apollo.api.b.z(306, hashMap0, "WB RB Levels Cool White Fluor", 307, "WB RB Levels White Fluorescent");
        com.apollographql.apollo.api.b.z(0x200, hashMap0, "Color Matrix 2", 0x310, "Coring Filter");
        com.apollographql.apollo.api.b.z(785, hashMap0, "Coring Values", 0x600, "Black Level 2");
        com.apollographql.apollo.api.b.z(0x601, hashMap0, "YCbCrCoefficients", 0x611, "Valid Pixel Depth");
        com.apollographql.apollo.api.b.z(0x612, hashMap0, "Crop Left", 0x613, "Crop Top");
        com.apollographql.apollo.api.b.z(0x614, hashMap0, "Crop Width", 0x615, "Crop Height");
        com.apollographql.apollo.api.b.z(0x1000, hashMap0, "Light Source", 0x1001, "White Balance Comp");
        com.apollographql.apollo.api.b.z(0x1010, hashMap0, "Saturation Setting", 0x1011, "Hue Setting");
        com.apollographql.apollo.api.b.z(0x1012, hashMap0, "Contrast Setting", 0x1013, "Sharpness Setting");
        com.apollographql.apollo.api.b.z(0x2000, hashMap0, "CM Exposure Compensation", 0x2001, "CM White Balance");
        com.apollographql.apollo.api.b.z(0x2002, hashMap0, "CM White Balance Comp", 0x2010, "CM White Balance Gray Point");
        com.apollographql.apollo.api.b.z(0x2020, hashMap0, "CM Saturation", 0x2021, "CM Hue");
        com.apollographql.apollo.api.b.z(0x2022, hashMap0, "CM Contrast", 0x2023, "CM Sharpness");
    }

    public OlympusRawInfoMakernoteDirectory() {
        this.setDescriptor(new d(18, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Raw Info";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusRawInfoMakernoteDirectory._tagNameMap;
    }
}

