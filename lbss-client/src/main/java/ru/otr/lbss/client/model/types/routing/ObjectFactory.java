package ru.otr.lbss.client.model.types.routing;

import ru.otr.lbss.client.model.types.*;
import ru.otr.lbss.client.model.types.basic.Void;
import ru.otr.lbss.client.model.types.basic.*;
import ru.otr.lbss.client.model.types.directive.Record;
import ru.otr.lbss.client.model.types.directive.RecordContent;
import ru.otr.lbss.client.model.types.directive.Registry;
import ru.otr.lbss.client.model.types.directive.RegistryRecord;
import ru.otr.lbss.client.model.types.fault.*;

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
     * Create an instance of {@link RoutingStatus }
     * 
     */
    public RoutingStatus createRoutingStatus() {
        return new RoutingStatus();
    }

    /**
     * Create an instance of {@link DynamicRoutingStatus }
     * 
     */
    public DynamicRoutingStatus createDynamicRoutingStatus() {
        return new DynamicRoutingStatus();
    }

    /**
     * Create an instance of {@link IdentifierRoutingStatus }
     * 
     */
    public IdentifierRoutingStatus createIdentifierRoutingStatus() {
        return new IdentifierRoutingStatus();
    }

    /**
     * Create an instance of {@link RegistryRoutingStatus }
     * 
     */
    public RegistryRoutingStatus createRegistryRoutingStatus() {
        return new RegistryRoutingStatus();
    }

    /**
     * Create an instance of {@link Routing }
     * 
     */
    public Routing createRouting() {
        return new Routing();
    }

    /**
     * Create an instance of {@link RoutingInformation }
     * 
     */
    public RoutingInformation createRoutingInformation() {
        return new RoutingInformation();
    }

    /**
     * Create an instance of {@link DynamicRouting }
     * 
     */
    public DynamicRouting createDynamicRouting() {
        return new DynamicRouting();
    }

    /**
     * Create an instance of {@link IdentifierRouting }
     * 
     */
    public IdentifierRouting createIdentifierRouting() {
        return new IdentifierRouting();
    }

    /**
     * Create an instance of {@link RegistryRouting }
     * 
     */
    public RegistryRouting createRegistryRouting() {
        return new RegistryRouting();
    }

    /**
     * Create an instance of {@link RegistryRecordRouting }
     * 
     */
    public RegistryRecordRouting createRegistryRecordRouting() {
        return new RegistryRecordRouting();
    }

}
