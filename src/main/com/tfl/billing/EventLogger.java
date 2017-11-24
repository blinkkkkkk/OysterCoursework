package com.tfl.billing;

import java.util.ArrayList;
import java.util.List;

public class EventLogger {
    private static EventLogger instance = new EventLogger();
    private final List<JourneyEvent> eventLog = new ArrayList<JourneyEvent>();

    private EventLogger(){}

    public static EventLogger getInstance(){
        return instance;
    }

    public void add(JourneyEvent event){
        eventLog.add(event);
    }

    public List<JourneyEvent> getEventLog(){
        return eventLog;
    }

}
