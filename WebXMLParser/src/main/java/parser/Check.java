package parser;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

// Singleton
public class Check {
    public static final Check instance = new Check();
    private Check() {}
    public boolean check(String file_name, String schema_name){
        try {
            File xml = new File(file_name);
            File xsd = new File(schema_name);
            if (!xml.exists()) {
                return false;
            }
            if (!xsd.exists()) {
                return false;
            }
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(schema_name));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(file_name));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

