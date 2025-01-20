package com.twilio.voice;

class ThreadUtils {
    public static class ThreadChecker {
        private final long threadId;

        public ThreadChecker(Thread thread0) {
            this.threadId = thread0.getId();
        }

        public void checkIsOnValidThread() {
        }
    }

}

