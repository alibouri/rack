package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class OlympusCameraSettingsMakernoteDirectory extends b {
    public static final int TagAeLock = 0x201;
    public static final int TagAfAreas = 0x304;
    public static final int TagAfFineTune = 0x306;
    public static final int TagAfFineTuneAdj = 0x307;
    public static final int TagAfPointSelected = 0x305;
    public static final int TagAfSearch = 0x303;
    public static final int TagArtFilter = 0x529;
    public static final int TagArtFilterEffect = 0x52F;
    public static final int TagCameraSettingsVersion = 0;
    public static final int TagColorCreatorEffect = 1330;
    public static final int TagColorSpace = 0x507;
    public static final int TagCompressionFactor = 0x50D;
    public static final int TagContrastSetting = 0x505;
    public static final int TagCustomSaturation = 0x503;
    public static final int TagDateTimeUtc = 0x908;
    public static final int TagDistortionCorrection = 0x50B;
    public static final int TagDriveMode = 0x600;
    public static final int TagExposureMode = 0x200;
    public static final int TagExposureShift = 0x203;
    public static final int TagExtendedWBDetect = 0x902;
    public static final int TagFlashControlMode = 0x404;
    public static final int TagFlashExposureComp = 0x401;
    public static final int TagFlashIntensity = 0x405;
    public static final int TagFlashMode = 0x400;
    public static final int TagFlashRemoteControl = 0x403;
    public static final int TagFocusMode = 0x301;
    public static final int TagFocusProcess = 770;
    public static final int TagGradation = 0x50F;
    public static final int TagImageQuality2 = 0x603;
    public static final int TagImageStabilization = 0x604;
    public static final int TagMacroMode = 0x300;
    public static final int TagMagicFilter = 0x52C;
    public static final int TagManometerPressure = 0x900;
    public static final int TagManometerReading = 0x901;
    public static final int TagManualFlashStrength = 1030;
    public static final int TagMeteringMode = 0x202;
    public static final int TagModifiedSaturation = 0x504;
    public static final int TagNdFilter = 0x204;
    public static final int TagNoiseFilter = 0x527;
    public static final int TagNoiseReduction = 0x50A;
    public static final int TagPanoramaMode = 0x601;
    public static final int TagPictureMode = 0x520;
    public static final int TagPictureModeBWFilter = 0x525;
    public static final int TagPictureModeContrast = 0x523;
    public static final int TagPictureModeEffect = 0x52D;
    public static final int TagPictureModeHue = 0x522;
    public static final int TagPictureModeSaturation = 0x521;
    public static final int TagPictureModeSharpness = 0x524;
    public static final int TagPictureModeTone = 0x526;
    public static final int TagPitchAngle = 0x904;
    public static final int TagPreviewImageLength = 0x102;
    public static final int TagPreviewImageStart = 0x101;
    public static final int TagPreviewImageValid = 0x100;
    public static final int TagRollAngle = 0x903;
    public static final int TagSceneMode = 0x509;
    public static final int TagShadingCompensation = 0x50C;
    public static final int TagSharpnessSetting = 0x506;
    public static final int TagStackedImage = 0x804;
    public static final int TagToneLevel = 0x52E;
    public static final int TagWhiteBalance2 = 0x500;
    public static final int TagWhiteBalanceBracket = 0x502;
    public static final int TagWhiteBalanceTemperature = 0x501;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        OlympusCameraSettingsMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Camera Settings Version", 0x100, "Preview Image Valid");
        com.apollographql.apollo.api.b.z(0x101, hashMap0, "Preview Image Start", 0x102, "Preview Image Length");
        com.apollographql.apollo.api.b.z(0x200, hashMap0, "Exposure Mode", 0x201, "AE Lock");
        com.apollographql.apollo.api.b.z(0x202, hashMap0, "Metering Mode", 0x203, "Exposure Shift");
        com.apollographql.apollo.api.b.z(0x204, hashMap0, "ND Filter", 0x300, "Macro Mode");
        com.apollographql.apollo.api.b.z(0x301, hashMap0, "Focus Mode", 770, "Focus Process");
        com.apollographql.apollo.api.b.z(0x303, hashMap0, "AF Search", 0x304, "AF Areas");
        com.apollographql.apollo.api.b.z(0x305, hashMap0, "AF Point Selected", 0x306, "AF Fine Tune");
        com.apollographql.apollo.api.b.z(0x307, hashMap0, "AF Fine Tune Adj", 0x400, "Flash Mode");
        com.apollographql.apollo.api.b.z(0x401, hashMap0, "Flash Exposure Comp", 0x403, "Flash Remote Control");
        com.apollographql.apollo.api.b.z(0x404, hashMap0, "Flash Control Mode", 0x405, "Flash Intensity");
        com.apollographql.apollo.api.b.z(1030, hashMap0, "Manual Flash Strength", 0x500, "White Balance 2");
        com.apollographql.apollo.api.b.z(0x501, hashMap0, "White Balance Temperature", 0x502, "White Balance Bracket");
        com.apollographql.apollo.api.b.z(0x503, hashMap0, "Custom Saturation", 0x504, "Modified Saturation");
        com.apollographql.apollo.api.b.z(0x505, hashMap0, "Contrast Setting", 0x506, "Sharpness Setting");
        com.apollographql.apollo.api.b.z(0x507, hashMap0, "Color Space", 0x509, "Scene Mode");
        com.apollographql.apollo.api.b.z(0x50A, hashMap0, "Noise Reduction", 0x50B, "Distortion Correction");
        com.apollographql.apollo.api.b.z(0x50C, hashMap0, "Shading Compensation", 0x50D, "Compression Factor");
        com.apollographql.apollo.api.b.z(0x50F, hashMap0, "Gradation", 0x520, "Picture Mode");
        com.apollographql.apollo.api.b.z(0x521, hashMap0, "Picture Mode Saturation", 0x522, "Picture Mode Hue");
        com.apollographql.apollo.api.b.z(0x523, hashMap0, "Picture Mode Contrast", 0x524, "Picture Mode Sharpness");
        com.apollographql.apollo.api.b.z(0x525, hashMap0, "Picture Mode BW Filter", 0x526, "Picture Mode Tone");
        com.apollographql.apollo.api.b.z(0x527, hashMap0, "Noise Filter", 0x529, "Art Filter");
        com.apollographql.apollo.api.b.z(0x52C, hashMap0, "Magic Filter", 0x52D, "Picture Mode Effect");
        com.apollographql.apollo.api.b.z(0x52E, hashMap0, "Tone Level", 0x52F, "Art Filter Effect");
        com.apollographql.apollo.api.b.z(1330, hashMap0, "Color Creator Effect", 0x600, "Drive Mode");
        com.apollographql.apollo.api.b.z(0x601, hashMap0, "Panorama Mode", 0x603, "Image Quality 2");
        com.apollographql.apollo.api.b.z(0x604, hashMap0, "Image Stabilization", 0x804, "Stacked Image");
        com.apollographql.apollo.api.b.z(0x900, hashMap0, "Manometer Pressure", 0x901, "Manometer Reading");
        com.apollographql.apollo.api.b.z(0x902, hashMap0, "Extended WB Detect", 0x903, "Roll Angle");
        com.apollographql.apollo.api.b.z(0x904, hashMap0, "Pitch Angle", 0x908, "Date Time UTC");
    }

    public OlympusCameraSettingsMakernoteDirectory() {
        this.setDescriptor(new com.drew.metadata.exif.makernotes.b(this));  // initializer: Lcom/drew/metadata/g;-><init>(Lcom/drew/metadata/b;)V
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Olympus Camera Settings";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return OlympusCameraSettingsMakernoteDirectory._tagNameMap;
    }
}

