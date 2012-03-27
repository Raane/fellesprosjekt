package xmlhandle;

import org.dom4j.Document;
import org.dom4j.Element;

import dbhandle.MessageAction;


public class FetchHandle {
	
	private Document xml;
	
	public FetchHandle(Document xml) {
		
		this.xml = xml;
	}
	
	public Document performFetch() {
		
		Element root = xml.getRootElement();		
		Element ownerElement = root.element("owner");
		String ownerUsername = ownerElement.attributeValue("owner_username");
		Element actionElement = root.element("fetch_action");
		FetchAction fetchAction = FetchAction.valueOf(actionElement.attributeValue("fetch_type"));
		
		//Output document
		Document fetchData = null;
		
		if (fetchAction == FetchAction.FETCH_USER) {
			
		} else if (fetchAction == FetchAction.FETCH_MEETING) {
			
		} else if (fetchAction == FetchAction.FETCH_EVENT) {
			
		} else if (fetchAction == FetchAction.FETCH_USERS) {
			
		}
		
		return fetchData;
		
	}

}
