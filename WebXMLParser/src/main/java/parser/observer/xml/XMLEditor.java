package parser.observer.xml;

import parser.observer.xml.enums.XMLEventType;
import parser.observer.xml.interfaces.XMLEditorEventsInterface;
import parser.observer.xml.interfaces.XMLEventListenerInterface;

public class XMLEditor implements XMLEditorEventsInterface {
    private XMLEventManager events;
    public XMLEditor() {
        this.events = new XMLEventManager(XMLEventType.START_XML_PARSE, XMLEventType.END_XML_PARSE);
    }

    @Override
    public void startXMLParse(String parseFileName) {
        events.notify(XMLEventType.START_XML_PARSE, parseFileName);
    }

    @Override
    public void endXMLParse(String parseFileName) {
        events.notify(XMLEventType.END_XML_PARSE, parseFileName);
    }

    @Override
    public void subscribeTo(XMLEventType event, XMLEventListenerInterface eventListener) {
        this.events.subscribe(event, eventListener);
    }
}