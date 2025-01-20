package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class SamsungType2MakernoteDirectory extends b {
    public static final int TagCameraTemperature = 67;
    public static final int TagColorSpace = 0xA011;
    public static final int TagDeviceType = 2;
    public static final int TagEncryptionKey = 0xA020;
    public static final int TagExposureCompensation = 0xA013;
    public static final int TagExposureTime = 0xA018;
    public static final int TagFNumber = 0xA019;
    public static final int TagFaceDetect = 0x100;
    public static final int TagFaceName = 291;
    public static final int TagFaceRecognition = 0x120;
    public static final int TagFirmwareName = 0xA001;
    public static final int TagFocalLengthIn35mmFormat = 0xA01A;
    public static final int TagISO = 40980;
    public static final int TagInternalLensSerialNumber = 0xA005;
    public static final int TagLensFirmware = 0xA004;
    public static final int TagLensType = 0xA003;
    public static final int TagLocalLocationName = 0x30;
    public static final int TagMakerNoteVersion = 1;
    public static final int TagOrientationInfo = 17;
    public static final int TagPictureWizard = 33;
    public static final int TagPreviewIfd = 53;
    public static final int TagRawDataByteOrder = 0x40;
    public static final int TagRawDataCFAPattern = 80;
    public static final int TagSamsungModelId = 3;
    public static final int TagSensorAreas = 0xA010;
    public static final int TagSerialNumber = 0xA002;
    public static final int TagSmartAlbumColor = 0x20;
    public static final int TagSmartRange = 0xA012;
    public static final int TagWhiteBalanceSetup = 65;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        SamsungType2MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Maker Note Version", 2, "Device Type");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Model Id", 17, "Orientation Info");
        com.apollographql.apollo.api.b.z(0x20, hashMap0, "Smart Album Color", 33, "Picture Wizard");
        com.apollographql.apollo.api.b.z(0x30, hashMap0, "Local Location Name", 53, "Preview IFD");
        com.apollographql.apollo.api.b.z(0x40, hashMap0, "Raw Data Byte Order", 65, "White Balance Setup");
        com.apollographql.apollo.api.b.z(67, hashMap0, "Camera Temperature", 80, "Raw Data CFA Pattern");
        com.apollographql.apollo.api.b.z(0x100, hashMap0, "Face Detect", 0x120, "Face Recognition");
        com.apollographql.apollo.api.b.z(291, hashMap0, "Face Name", 0xA001, "Firmware Name");
        com.apollographql.apollo.api.b.z(0xA002, hashMap0, "Serial Number", 0xA003, "Lens Type");
        com.apollographql.apollo.api.b.z(0xA004, hashMap0, "Lens Firmware", 0xA005, "Internal Lens Serial Number");
        com.apollographql.apollo.api.b.z(0xA010, hashMap0, "Sensor Areas", 0xA011, "Color Space");
        com.apollographql.apollo.api.b.z(0xA012, hashMap0, "Smart Range", 0xA013, "Exposure Compensation");
        com.apollographql.apollo.api.b.z(40980, hashMap0, "ISO", 0xA018, "Exposure Time");
        com.apollographql.apollo.api.b.z(0xA019, hashMap0, "F-Number", 0xA01A, "Focal Length in 35mm Format");
        hashMap0.put(0xA020, "Encryption Key");
    }

    public SamsungType2MakernoteDirectory() {
        this.setDescriptor(new d(24, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Samsung Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return SamsungType2MakernoteDirectory._tagNameMap;
    }
}

