package com.sgurzhiy.advancedswiperefreshlayout;

/**
 * Created by stepa on 18-Feb-17.
 */

public enum AdvancedRefreshLayoutDirection {

    START(0),
    END(1),
    BOTH(2);

    private int mValue;

    AdvancedRefreshLayoutDirection(int value) {
        this.mValue = value;
    }

    public static AdvancedRefreshLayoutDirection getFromInt(int value) {
        for (AdvancedRefreshLayoutDirection direction : AdvancedRefreshLayoutDirection.values()) {
            if (direction.mValue == value) {
                return direction;
            }
        }
        return BOTH;
    }
}
