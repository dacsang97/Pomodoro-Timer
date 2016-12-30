package com.sangnd.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60, "Thời gian tập trung"),
    BREAK(5 * 60, "Giờ giải lao");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
