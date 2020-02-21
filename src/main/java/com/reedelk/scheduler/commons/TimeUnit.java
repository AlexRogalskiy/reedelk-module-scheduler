package com.reedelk.scheduler.commons;

import com.reedelk.runtime.api.annotation.DisplayName;

public enum TimeUnit {

    @DisplayName("Milliseconds (default)")
    MILLISECONDS,
    @DisplayName("Hours")
    HOURS,
    @DisplayName("Minutes")
    MINUTES,
    @DisplayName("Seconds")
    SECONDS
}