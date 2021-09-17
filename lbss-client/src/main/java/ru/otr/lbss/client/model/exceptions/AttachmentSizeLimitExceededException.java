
package ru.otr.lbss.client.model.exceptions;

import ru.otr.lbss.client.model.types.fault.AttachmentSizeLimitExceeded;

import javax.xml.ws.WebFault;


/**
 * 
 *                     Суммарный размер вложений превысил предел, установленный правилами СМЭВ.
 *                 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AttachmentSizeLimitExceeded", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.3")
public class AttachmentSizeLimitExceededException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AttachmentSizeLimitExceeded faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AttachmentSizeLimitExceededException(String message, AttachmentSizeLimitExceeded faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AttachmentSizeLimitExceededException(String message, AttachmentSizeLimitExceeded faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: AttachmentSizeLimitExceeded
     */
    public AttachmentSizeLimitExceeded getFaultInfo() {
        return faultInfo;
    }

}
