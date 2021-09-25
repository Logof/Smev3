package ru.otr.lbss.client.model.types;

import ru.otr.lbss.client.model.types.basic.*;
import ru.otr.lbss.client.model.types.basic.Void;
import ru.otr.lbss.client.model.types.directive.Record;
import ru.otr.lbss.client.model.types.directive.RecordContent;
import ru.otr.lbss.client.model.types.directive.Registry;
import ru.otr.lbss.client.model.types.directive.RegistryRecord;
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
    private final static QName _AckResponse_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.3", "AckResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.otr.lbss.client.model
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SenderProvidedRequestData }
     *
     */
    public SenderProvidedRequestData createSenderProvidedRequestData() {
        return new SenderProvidedRequestData();
    }

    /**
     * Create an instance of {@link MessageMetadata }
     *
     */
    public MessageMetadata createMessageMetadata() {
        return new MessageMetadata();
    }

    /**
     * Create an instance of {@link SenderProvidedResponseData }
     *
     */
    public SenderProvidedResponseData createSenderProvidedResponseData() {
        return new SenderProvidedResponseData();
    }

    /**
     * Create an instance of {@link GetRequestResponse }
     *
     */
    public GetRequestResponse createGetRequestResponse() {
        return new GetRequestResponse();
    }

    /**
     * Create an instance of {@link GetResponseResponse }
     *
     */
    public GetResponseResponse createGetResponseResponse() {
        return new GetResponseResponse();
    }

    /**
     * Create an instance of {@link SenderProvidedResponseData.RequestStatus }
     *
     */
    public SenderProvidedResponseData.RequestStatus createSenderProvidedResponseDataRequestStatus() {
        return new SenderProvidedResponseData.RequestStatus();
    }

    /**
     * Create an instance of {@link GetStatusRequest }
     *
     */
    public GetStatusRequest createGetStatusRequest() {
        return new GetStatusRequest();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     *
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link SmevAsyncProcessingMessage }
     *
     */
    public SmevAsyncProcessingMessage createSmevAsyncProcessingMessage() {
        return new SmevAsyncProcessingMessage();
    }

    /**
     * Create an instance of {@link AsyncProcessingStatusData }
     *
     */
    public AsyncProcessingStatusData createAsyncProcessingStatusData() {
        return new AsyncProcessingStatusData();
    }

    /**
     * Create an instance of {@link AsyncProcessingStatus }
     *
     */
    public AsyncProcessingStatus createAsyncProcessingStatus() {
        return new AsyncProcessingStatus();
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
     * Create an instance of {@link AckRequest }
     *
     */
    public AckRequest createAckRequest() {
        return new AckRequest();
    }



    /**
     * Create an instance of {@link Request }
     *
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link SenderProvidedRequestData.BusinessProcessMetadata }
     *
     */
    public SenderProvidedRequestData.BusinessProcessMetadata createSenderProvidedRequestDataBusinessProcessMetadata() {
        return new SenderProvidedRequestData.BusinessProcessMetadata();
    }

    /**
     * Create an instance of {@link MessageMetadata.Sender }
     *
     */
    public MessageMetadata.Sender createMessageMetadataSender() {
        return new MessageMetadata.Sender();
    }

    /**
     * Create an instance of {@link MessageMetadata.Recipient }
     *
     */
    public MessageMetadata.Recipient createMessageMetadataRecipient() {
        return new MessageMetadata.Recipient();
    }

    /**
     * Create an instance of {@link SendRequestRequest }
     *
     */
    public SendRequestRequest createSendRequestRequest() {
        return new SendRequestRequest();
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

    /**
     * Create an instance of {@link Response }
     *
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link SenderProvidedResponseData.RequestRejected }
     *
     */
    public SenderProvidedResponseData.RequestRejected createSenderProvidedResponseDataRequestRejected() {
        return new SenderProvidedResponseData.RequestRejected();
    }

    /**
     * Create an instance of {@link SendResponseRequest }
     *
     */
    public SendResponseRequest createSendResponseRequest() {
        return new SendResponseRequest();
    }

    /**
     * Create an instance of {@link SendRequestResponse }
     *
     */
    public SendRequestResponse createSendRequestResponse() {
        return new SendRequestResponse();
    }

    /**
     * Create an instance of {@link GetRequestResponse.RequestMessage }
     *
     */
    public GetRequestResponse.RequestMessage createGetRequestResponseRequestMessage() {
        return new GetRequestResponse.RequestMessage();
    }

    /**
     * Create an instance of {@link GetResponseResponse.ResponseMessage }
     *
     */
    public GetResponseResponse.ResponseMessage createGetResponseResponseResponseMessage() {
        return new GetResponseResponse.ResponseMessage();
    }

    /**
     * Create an instance of {@link SendResponseResponse }
     *
     */
    public SendResponseResponse createSendResponseResponse() {
        return new SendResponseResponse();
    }

    /**
     * Create an instance of {@link GetResponseRequest }
     *
     */
    public GetResponseRequest createGetResponseRequest() {
        return new GetResponseRequest();
    }



    /**
     * Create an instance of {@link GetRequestRequest }
     *
     */
    public GetRequestRequest createGetRequestRequest() {
        return new GetRequestRequest();
    }

    /**
     * Create an instance of {@link Record }
     *
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link SenderProvidedResponseData.RequestStatus.StatusParameter }
     *
     */
    public SenderProvidedResponseData.RequestStatus.StatusParameter createSenderProvidedResponseDataRequestStatusStatusParameter() {
        return new SenderProvidedResponseData.RequestStatus.StatusParameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.3", name = "AckResponse")
    public JAXBElement<Void> createAckResponse(Void value) {
        return new JAXBElement<Void>(_AckResponse_QNAME, Void.class, null, value);
    }

}