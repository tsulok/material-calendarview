package com.prolificinteractive.materialcalendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.widget.TextView;

import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;

import java.util.Calendar;

/**
 * Display the month name over the starting day of the month
 */
@Experimental
@SuppressLint("ViewConstructor")
class MonthOnDayView extends TextView {

    private WeekDayFormatter formatter = WeekDayFormatter.DEFAULT;
    private int dayOfWeek;

    public MonthOnDayView(Context context, String monthName) {
        super(context);

        setGravity(Gravity.CENTER);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            setTextAlignment(TEXT_ALIGNMENT_CENTER);
        }

        setText(monthName);
    }
}