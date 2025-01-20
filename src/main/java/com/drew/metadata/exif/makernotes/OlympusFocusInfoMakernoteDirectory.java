package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusFocusInfoMakernoteDirectory extends b {
    public static final int TagAfInfo = 808;
    public static final int TagAfPoint = 0x308;
    public static final int TagAutoFocus = 0x209;
    public static final int TagExternalFlash = 4609;
    public static final int TagExternalFlashBounce = 0x1204;
    public static final int TagExternalFlashGuideNumber = 0x1203;
    public static final int TagExternalFlashZoom = 0x1205;
    public static final int TagFocusDistance = 0x305;
    public static final int TagFocusInfoVersion = 0;
    public static final int TagFocusStepCount = 0x301;
    public static final int TagFocusStepInfinity = 0x303;
    public static final int TagFocusStepNear = 0x304;
    public static final int TagImageStabilization = 0x1600;
    public static final int TagInternalFlash = 0x1208;
    public static final int TagMacroLed = 0x120A;
    public static final int TagManualFlash = 0x1209;
    public static final int TagSceneArea = 529;
    public static final int TagSceneDetect = 0x210;
    public static final int TagSceneDetectData = 530;
    public static final int TagSensorTemperature = 0x1500;
    public static final int TagZoomStepCount = 0x300;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusFocusInfoMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Focus Info Version", 0x209, "Auto Focus");
        com.apollographql.apollo.api.b.z(0x210, hashMap0, "Scene Detect", 529, "Scene Area");
        com.apollographql.apollo.api.b.z(530, hashMap0, "Scene Detect Data", 0x300, "Zoom Step Count");
        com.apollographql.apollo.api.b.z(0x301, hashMap0, "Focus Step Count", 0x303, "Focus Step Infinity");
        com.apollographql.apollo.api.b.z(0x304, hashMap0, "Focus Step Near", 0x305, "Focus Distance");
        com.apollographql.apollo.api.b.z(0x308, hashMap0, "AF Point", 808, "AF Info");
        com.apollographql.apollo.api.b.z(4609, hashMap0, "External Flash", 0x1203, "External Flash Guide Number");
        com.apollographql.apollo.api.b.z(0x1204, hashMap0, "External Flash Bounce", 0x1205, "External Flash Zoom");
        com.apollographql.apollo.api.b.z(0x1208, hashMap0, "Internal Flash", 0x1209, "Manual Flash");
        com.apollographql.apollo.api.b.z(0x120A, hashMap0, "Macro LED", 0x1500, "Sensor Temperature");
        hashMap0.put(0x1600, "Image Stabilization");
    }

    public OlympusFocusInfoMakernoteDirectory() {
        this.setDescriptor(new d(15, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Focus Info";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusFocusInfoMakernoteDirectory._tagNameMap;
    }
}

