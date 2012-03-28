package xmlhandle;

import java.sql.SQLException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;

import dbhandle.Dbhandle;
import dbhandle.Event;
import dbhandle.MessageAction;


public class FetchHandle {
	
	private Document xml;
	private String ownerUsername;
	private FetchAction fetchAction;
	
	public FetchHandle(Document xml) {
		
		this.xml = xml;
		Element root = xml.getRootElement();
		Element ownerElement = root.element("owner");
		ownerUsername = ownerElement.attributeValue("owner_username");
		Element actionElement = root.element("fetch_action");
		fetchAction = FetchAction.valueOf(actionElement.attributeValue("fetch_type"));

	}
	
	public Document performFetch() throws SQLException {
	
		//Output document
		Document fetchData = null;
		Dbhandle handle = new Dbhandle();
		
		if (fetchAction == FetchAction.FETCH_USER) {
			
		} else if (fetchAction == FetchAction.FETCH_MEETING) {
			
		} else if (fetchAction == FetchAction.FETCH_EVENT) {
			
		} else if (fetchAction == FetchAction.FETCH_USERS) {
			
		} else if (fetchAction == FetchAction.LOGIN_FETCH) {
			
			//Personal events
			List<Event> eventList = handle.fetchUserEvents(ownerUsername);
			
			//Other users events
			
			//Available meeting rooms?
			
			//All the other users in the database
			
			//Meeting ID and meeting leader?
			
		}
		
		return fetchData;
		
	}

}
