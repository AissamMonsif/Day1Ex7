package com.codurance.dip;

import java.time.MonthDay;

public class ClockImpl implements Clock {
    @Override
    public MonthDay monthDay() {
        return MonthDay.now();
    }
}
