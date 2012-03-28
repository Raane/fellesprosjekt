package gui;

//This class is made so that it is possible to sort a list of Events by their Timestamp.
//It makes rules for how to compare to Events to eachother.
import java.sql.Timestamp;
import java.util.Comparator;

import Models.Event;

public class TimeComparator implements Comparator{
	public int compare(Object event1, Object event2){
		Timestamp event1StartTime = ((Event)event1).getStartTime();
		Timestamp event2StartTime = ((Event)event2).getStartTime();
		
		if(event1StartTime.getTime() > event2StartTime.getTime()) return 1;
		else if(event1StartTime.getTime() > event2StartTime.getTime()) return -1;
		else return 0;
	}
}
