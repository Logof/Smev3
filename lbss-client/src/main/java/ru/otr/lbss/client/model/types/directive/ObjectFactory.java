package ru.otr.lbss.client.model.types.directive;

import ru.otr.lbss.client.model.types.*;
import ru.otr.lbss.client.model.types.basic.Void;
import ru.otr.lbss.client.model.types.basic.*;
import ru.otr.lbss.client.model.types.fault.*;
import ru.otr.lbss.client.model.types.routing.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.otr.lbss.client.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.otr.lbss.client.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Record }
     *
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link RecordContent }
     *
     */
    public RecordContent createRecordContent() {
        return new RecordContent();
    }

    /**
     * Create an instance of {@link Registry }
     *
     */
    public Registry createRegistry() {
        return new Registry();
    }

    /**
     * Create an instance of {@link RegistryRecord }
     *
     */
    public RegistryRecord createRegistryRecord() {
        return new RegistryRecord();
    }

}
