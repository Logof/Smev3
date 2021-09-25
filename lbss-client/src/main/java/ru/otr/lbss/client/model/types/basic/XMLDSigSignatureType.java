
package ru.otr.lbss.client.model.types.basic;

import javax.xml.bind.annotation.*;

import org.w3c.dom.Element;


/**
 * 
 *                 Элекронная подпись в формате XMLDSig.
 *             
 * 
 * <p>Java class for XMLDSigSignatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLDSigSignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='http://www.w3.org/2000/09/xmldsig#'/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLDSigSignatureType", namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.3", propOrder = {
    "any"
})
@XmlRootElement
public class XMLDSigSignatureType {

    @XmlAnyElement(lax = true)
    protected Element any;

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

}
