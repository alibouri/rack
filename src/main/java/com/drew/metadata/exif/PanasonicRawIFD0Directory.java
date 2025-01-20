package com.drew.metadata.exif;

import com.drew.metadata.b;
import java.util.HashMap;

public class PanasonicRawIFD0Directory extends b {
    public static final int TagBlackLevel1 = 8;
    public static final int TagBlackLevel2 = 9;
    public static final int TagBlackLevel3 = 10;
    public static final int TagBlackLevelBlue = 30;
    public static final int TagBlackLevelGreen = 29;
    public static final int TagBlackLevelRed = 28;
    public static final int TagBlueBalance = 18;
    public static final int TagCropBottom = 49;
    public static final int TagCropLeft = 0x30;
    public static final int TagCropRight = 50;
    public static final int TagCropTop = 0x2F;
    public static final int TagDistortionInfo = 281;
    public static final int TagHighIsoMultiplierBlue = 26;
    public static final int TagHighIsoMultiplierGreen = 25;
    public static final int TagHighIsoMultiplierRed = 24;
    public static final int TagIso = 23;
    public static final int TagJpgFromRaw = 46;
    public static final int TagLinearityLimitBlue = 16;
    public static final int TagLinearityLimitGreen = 15;
    public static final int TagLinearityLimitRed = 14;
    public static final int TagMake = 0x10F;
    public static final int TagModel = 0x110;
    public static final int TagOrientation = 274;
    public static final int TagPanasonicRawVersion = 1;
    public static final int TagRawDataOffset = 280;
    public static final int TagRedBalance = 17;
    public static final int TagRowsPerStrip = 278;
    public static final int TagSensorBottomBorder = 6;
    public static final int TagSensorHeight = 3;
    public static final int TagSensorLeftBorder = 5;
    public static final int TagSensorRightBorder = 7;
    public static final int TagSensorTopBorder = 4;
    public static final int TagSensorWidth = 2;
    public static final int TagStripByteCounts = 279;
    public static final int TagStripOffsets = 273;
    public static final int TagWbBlueLevel = 38;
    public static final int TagWbGreenLevel = 37;
    public static final int TagWbInfo = 19;
    public static final int TagWbInfo2 = 39;
    public static final int TagWbRedLevel = 36;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PanasonicRawIFD0Directory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Panasonic Raw Version", 2, "Sensor Width");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Sensor Height", 4, "Sensor Top Border");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Sensor Left Border", 6, "Sensor Bottom Border");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Sensor Right Border", 8, "Black Level 1");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Black Level 2", 10, "Black Level 3");
        com.apollographql.apollo.api.b.z(14, hashMap0, "Linearity Limit Red", 15, "Linearity Limit Green");
        com.apollographql.apollo.api.b.z(16, hashMap0, "Linearity Limit Blue", 17, "Red Balance");
        com.apollographql.apollo.api.b.z(18, hashMap0, "Blue Balance", 23, "ISO");
        com.apollographql.apollo.api.b.z(24, hashMap0, "High ISO Multiplier Red", 25, "High ISO Multiplier Green");
        com.apollographql.apollo.api.b.z(26, hashMap0, "High ISO Multiplier Blue", 28, "Black Level Red");
        com.apollographql.apollo.api.b.z(29, hashMap0, "Black Level Green", 30, "Black Level Blue");
        com.apollographql.apollo.api.b.z(36, hashMap0, "WB Red Level", 37, "WB Green Level");
        com.apollographql.apollo.api.b.z(38, hashMap0, "WB Blue Level", 46, "Jpg From Raw");
        com.apollographql.apollo.api.b.z(0x2F, hashMap0, "Crop Top", 0x30, "Crop Left");
        com.apollographql.apollo.api.b.z(49, hashMap0, "Crop Bottom", 50, "Crop Right");
        com.apollographql.apollo.api.b.z(0x10F, hashMap0, "Make", 0x110, "Model");
        com.apollographql.apollo.api.b.z(273, hashMap0, "Strip Offsets", 274, "Orientation");
        com.apollographql.apollo.api.b.z(278, hashMap0, "Rows Per Strip", 279, "Strip Byte Counts");
        hashMap0.put(280, "Raw Data Offset");
    }

    public PanasonicRawIFD0Directory() {
        this.setDescriptor(new A4.b(25, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PanasonicRaw Exif IFD0";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PanasonicRawIFD0Directory._tagNameMap;
    }
}

