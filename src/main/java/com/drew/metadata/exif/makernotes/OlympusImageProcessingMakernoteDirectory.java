package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusImageProcessingMakernoteDirectory extends b {
    public static final int TagAspectFrame = 4371;
    public static final int TagAspectRatio = 4370;
    public static final int TagBlackLevel2 = 0x600;
    public static final int TagCameraTemperature = 4870;
    public static final int TagColorMatrix = 0x200;
    public static final int TagCoringFilter = 0x310;
    public static final int TagCoringValues = 785;
    public static final int TagCropHeight = 0x615;
    public static final int TagCropLeft = 0x612;
    public static final int TagCropTop = 0x613;
    public static final int TagCropWidth = 0x614;
    public static final int TagDistortionCorrection2 = 0x1011;
    public static final int TagEnhancer = 0x300;
    public static final int TagEnhancerValues = 0x301;
    public static final int TagFaceDetectArea = 4609;
    public static final int TagFaceDetectFrameCrop = 0x1207;
    public static final int TagFaceDetectFrameSize = 0x1203;
    public static final int TagFacesDetected = 0x1200;
    public static final int TagGainBase = 0x610;
    public static final int TagImageProcessingVersion = 0;
    public static final int TagKeystoneCompensation = 6400;
    public static final int TagKeystoneDirection = 6401;
    public static final int TagKeystoneValue = 6406;
    public static final int TagMaxFaces = 4610;
    public static final int TagMultipleExposureMode = 0x101C;
    public static final int TagNoiseReduction2 = 0x1010;
    public static final int TagSensorCalibration = 0x805;
    public static final int TagShadingCompensation2 = 0x1012;
    public static final int TagUnknownBlock1 = 0x635;
    public static final int TagUnknownBlock2 = 1590;
    public static final int TagUnknownBlock3 = 0x1103;
    public static final int TagUnknownBlock4 = 0x1104;
    public static final int TagValidBits = 0x611;
    public static final int TagWbGLevel = 0x11F;
    public static final int TagWbGLevel3000K = 275;
    public static final int TagWbGLevel3300K = 276;
    public static final int TagWbGLevel3600K = 277;
    public static final int TagWbGLevel3900K = 278;
    public static final int TagWbGLevel4000K = 279;
    public static final int TagWbGLevel4300K = 280;
    public static final int TagWbGLevel4500K = 281;
    public static final int TagWbGLevel4800K = 282;
    public static final int TagWbGLevel5300K = 283;
    public static final int TagWbGLevel6000K = 284;
    public static final int TagWbGLevel6600K = 285;
    public static final int TagWbGLevel7500K = 286;
    public static final int TagWbRbLevels = 0x100;
    public static final int TagWbRbLevels3000K = 0x102;
    public static final int TagWbRbLevels3300K = 0x103;
    public static final int TagWbRbLevels3600K = 260;
    public static final int TagWbRbLevels3900K = 0x105;
    public static final int TagWbRbLevels4000K = 0x106;
    public static final int TagWbRbLevels4300K = 0x107;
    public static final int TagWbRbLevels4500K = 0x108;
    public static final int TagWbRbLevels4800K = 0x109;
    public static final int TagWbRbLevels5300K = 0x10A;
    public static final int TagWbRbLevels6000K = 0x10B;
    public static final int TagWbRbLevels6600K = 0x10C;
    public static final int TagWbRbLevels7500K = 0x10D;
    public static final int TagWbRbLevelsCwB1 = 270;
    public static final int TagWbRbLevelsCwB2 = 0x10F;
    public static final int TagWbRbLevelsCwB3 = 0x110;
    public static final int TagWbRbLevelsCwB4 = 273;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusImageProcessingMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Image Processing Version", 0x100, "WB RB Levels");
        com.apollographql.apollo.api.b.z(0x102, hashMap0, "WB RB Levels 3000K", 0x103, "WB RB Levels 3300K");
        com.apollographql.apollo.api.b.z(260, hashMap0, "WB RB Levels 3600K", 0x105, "WB RB Levels 3900K");
        com.apollographql.apollo.api.b.z(0x106, hashMap0, "WB RB Levels 4000K", 0x107, "WB RB Levels 4300K");
        com.apollographql.apollo.api.b.z(0x108, hashMap0, "WB RB Levels 4500K", 0x109, "WB RB Levels 4800K");
        com.apollographql.apollo.api.b.z(0x10A, hashMap0, "WB RB Levels 5300K", 0x10B, "WB RB Levels 6000K");
        com.apollographql.apollo.api.b.z(0x10C, hashMap0, "WB RB Levels 6600K", 0x10D, "WB RB Levels 7500K");
        com.apollographql.apollo.api.b.z(270, hashMap0, "WB RB Levels CWB1", 0x10F, "WB RB Levels CWB2");
        com.apollographql.apollo.api.b.z(0x110, hashMap0, "WB RB Levels CWB3", 273, "WB RB Levels CWB4");
        com.apollographql.apollo.api.b.z(275, hashMap0, "WB G Level 3000K", 276, "WB G Level 3300K");
        com.apollographql.apollo.api.b.z(277, hashMap0, "WB G Level 3600K", 278, "WB G Level 3900K");
        com.apollographql.apollo.api.b.z(279, hashMap0, "WB G Level 4000K", 280, "WB G Level 4300K");
        com.apollographql.apollo.api.b.z(281, hashMap0, "WB G Level 4500K", 282, "WB G Level 4800K");
        com.apollographql.apollo.api.b.z(283, hashMap0, "WB G Level 5300K", 284, "WB G Level 6000K");
        com.apollographql.apollo.api.b.z(285, hashMap0, "WB G Level 6600K", 286, "WB G Level 7500K");
        com.apollographql.apollo.api.b.z(0x11F, hashMap0, "WB G Level", 0x200, "Color Matrix");
        com.apollographql.apollo.api.b.z(0x300, hashMap0, "Enhancer", 0x301, "Enhancer Values");
        com.apollographql.apollo.api.b.z(0x310, hashMap0, "Coring Filter", 785, "Coring Values");
        com.apollographql.apollo.api.b.z(0x600, hashMap0, "Black Level 2", 0x610, "Gain Base");
        com.apollographql.apollo.api.b.z(0x611, hashMap0, "Valid Bits", 0x612, "Crop Left");
        com.apollographql.apollo.api.b.z(0x613, hashMap0, "Crop Top", 0x614, "Crop Width");
        com.apollographql.apollo.api.b.z(0x615, hashMap0, "Crop Height", 0x635, "Unknown Block 1");
        com.apollographql.apollo.api.b.z(1590, hashMap0, "Unknown Block 2", 0x805, "Sensor Calibration");
        com.apollographql.apollo.api.b.z(0x1010, hashMap0, "Noise Reduction 2", 0x1011, "Distortion Correction 2");
        com.apollographql.apollo.api.b.z(0x1012, hashMap0, "Shading Compensation 2", 0x101C, "Multiple Exposure Mode");
        com.apollographql.apollo.api.b.z(0x1103, hashMap0, "Unknown Block 3", 0x1104, "Unknown Block 4");
        com.apollographql.apollo.api.b.z(4370, hashMap0, "Aspect Ratio", 4371, "Aspect Frame");
        com.apollographql.apollo.api.b.z(0x1200, hashMap0, "Faces Detected", 4609, "Face Detect Area");
        com.apollographql.apollo.api.b.z(4610, hashMap0, "Max Faces", 0x1203, "Face Detect Frame Size");
        com.apollographql.apollo.api.b.z(0x1207, hashMap0, "Face Detect Frame Crop", 4870, "Camera Temperature");
        com.apollographql.apollo.api.b.z(6400, hashMap0, "Keystone Compensation", 6401, "Keystone Direction");
        hashMap0.put(6406, "Keystone Value");
    }

    public OlympusImageProcessingMakernoteDirectory() {
        this.setDescriptor(new d(16, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Image Processing";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusImageProcessingMakernoteDirectory._tagNameMap;
    }
}

