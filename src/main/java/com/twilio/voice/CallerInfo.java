package com.twilio.voice;

public class CallerInfo {
    private Boolean isVerified;

    public CallerInfo(String s) {
        Boolean boolean0 = null;
        this.isVerified = null;
        if(s != null && !s.equals("null")) {
            boolean0 = Boolean.valueOf(s.equals("TN-Validation-Passed-A"));
        }
        this.isVerified = boolean0;
    }

    public Boolean isVerified() {
        return this.isVerified;
    }
}

