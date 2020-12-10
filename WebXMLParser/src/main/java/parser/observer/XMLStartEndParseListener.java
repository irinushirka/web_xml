package parser.observer;

import parser.observer.xml.interfaces.EventListener;

public class XMLStartEndParseListener implements EventListener {
    @Override
    public void update(String eventType, String parseFileName) {
        System.out.println("Someone has performed " + eventType + " from file: " + parseFileName);
    }
}
