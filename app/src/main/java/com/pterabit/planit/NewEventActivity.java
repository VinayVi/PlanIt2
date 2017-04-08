package com.pterabit.planit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import java.util.Calendar;

public class NewEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        MaterialCalendarView mvc = (MaterialCalendarView)findViewById(R.id.calendarView);

        mvc.setSelectionMode(MaterialCalendarView.SELECTION_MODE_MULTIPLE);
        mvc.state().edit().setMinimumDate(CalendarDay.today()).commit();

    }
}
