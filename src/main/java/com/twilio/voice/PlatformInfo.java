package com.twilio.voice;

import android.os.Build.VERSION;
import android.os.Build;

final class PlatformInfo {
    private static final String PLATFORM_NAME = "Android";
    private String hwDeviceArch;
    private String hwDeviceManufacturer;
    private String hwDeviceModel;
    private String platformVersion;
    private String sdkVersion;

    public PlatformInfo() {
        this.platformVersion = Build.VERSION.RELEASE;
        this.hwDeviceManufacturer = Build.MANUFACTURER;
        this.hwDeviceModel = Build.MODEL;
        this.sdkVersion = "6.1.2";
        this.hwDeviceArch = System.getProperty("os.arch");
    }

    public String getHwDeviceArch() {
        return this.hwDeviceArch;
    }

    public String getHwDeviceManufacturer() {
        return this.hwDeviceManufacturer;
    }

    public String getHwDeviceModel() {
        return this.hwDeviceModel;
    }

    public String getPlatformName() {
        return "Android";
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }
}

