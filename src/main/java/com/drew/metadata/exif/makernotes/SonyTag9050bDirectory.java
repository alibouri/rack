package com.drew.metadata.exif.makernotes;

import com.apollographql.apollo.api.b;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;

public class SonyTag9050bDirectory extends SonyEncodedDataDirectoryBase {
    public static final int TAG_APS_C_SIZE_CAPTURE = 276;
    public static final int TAG_DISTORTION_CORR_PARAMS_PRESENT = 0x10B;
    public static final int TAG_FLASH_STATUS = 57;
    public static final int TAG_INTERNAL_SERIAL_NUMBER = 0x88;
    public static final int TAG_LENS_FORMAT = 0x106;
    public static final int TAG_LENS_MOUNT = 0x105;
    public static final int TAG_LENS_SPEC_FEATURES = 278;
    public static final int TAG_LENS_TYPE_2 = 0x107;
    public static final int TAG_RELEASE_MODE_2 = 109;
    public static final int TAG_SHUTTER = 38;
    public static final int TAG_SHUTTER_COUNT = 58;
    public static final int TAG_SHUTTER_COUNT_3 = 0x19F;
    public static final int TAG_SONY_EXPOSURE_TIME = 70;
    public static final int TAG_SONY_F_NUMBER = 72;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        SonyTag9050bDirectory._tagNameMap = hashMap0;
        b.z(38, hashMap0, "Shutter", 57, "Flash Status");
        b.z(58, hashMap0, "Shutter Count", 70, "Sony Exposure Time");
        b.z(72, hashMap0, "Sony F Number", 109, "Release Mode 2");
        b.z(0x88, hashMap0, "Internal Serial Number", 0x105, "Lens Mount");
        b.z(0x106, hashMap0, "Lens Format", 0x107, "Lens Type 2");
        b.z(0x10B, hashMap0, "Distortion Corr Params Present", 276, "APS-C Size Capture");
        b.z(278, hashMap0, "Lens Spec Features", 0x19F, "Shutter Count 3");
    }

    public SonyTag9050bDirectory() {
        this.setDescriptor(new d(27, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Sony 9050B";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return SonyTag9050bDirectory._tagNameMap;
    }

    public static SonyTag9050bDirectory read(byte[] arr_b) {
        SonyTag9050bDirectory sonyTag9050bDirectory0 = new SonyTag9050bDirectory();
        try {
            SonyEncodedDataDirectoryBase.decipherInPlace(arr_b);
            l4.b b0 = new l4.b(0, arr_b);
            b0.a = false;
            sonyTag9050bDirectory0.setIntArray(38, new int[]{b0.y(38), b0.y(40), b0.y(42)});
            sonyTag9050bDirectory0.setInt(57, b0.C(57));
            sonyTag9050bDirectory0.setLong(58, b0.A(58));
            int v = b0.y(70);
            new DecimalFormat("0.#############").setRoundingMode(RoundingMode.HALF_UP);
            sonyTag9050bDirectory0.setFloat(70, ((float)Math.pow(2.0, 16 - v / 0x100)));
            sonyTag9050bDirectory0.setInt(72, b0.y(72));
            sonyTag9050bDirectory0.setIntArray(0x88, new int[]{b0.C(0x88), b0.C(0x89), b0.C(0x8A), b0.C(0x8B), b0.C(140), b0.C(0x8D)});
            sonyTag9050bDirectory0.setInt(0x105, b0.C(0x105));
            sonyTag9050bDirectory0.setInt(0x106, b0.C(0x106));
            sonyTag9050bDirectory0.setInt(0x107, b0.y(0x107));
            sonyTag9050bDirectory0.setInt(0x10B, b0.C(0x10B));
            sonyTag9050bDirectory0.setInt(276, b0.C(276));
            sonyTag9050bDirectory0.setByteArray(276, b0.d(278, 2));
        }
        catch(IOException iOException0) {
            sonyTag9050bDirectory0.addError(iOException0.getMessage());
        }
        return sonyTag9050bDirectory0;
    }
}

