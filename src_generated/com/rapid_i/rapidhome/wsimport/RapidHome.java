
package com.rapid_i.rapidhome.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RapidHome", targetNamespace = "http://ws.rapidhome.rapid_i.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RapidHome {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "uploadUsageStatistics", targetNamespace = "http://ws.rapidhome.rapid_i.com/", className = "com.rapid_i.rapidhome.wsimport.UploadUsageStatistics")
    @ResponseWrapper(localName = "uploadUsageStatisticsResponse", targetNamespace = "http://ws.rapidhome.rapid_i.com/", className = "com.rapid_i.rapidhome.wsimport.UploadUsageStatisticsResponse")
    public void uploadUsageStatistics(
        @WebParam(name = "arg0", targetNamespace = "")
        StatisticsReport arg0);

}
