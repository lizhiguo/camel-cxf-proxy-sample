package nz.co.ws.proxy.integration.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-02-27T07:17:05.700+13:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://ws.integration.sample.ws.co.nz", name = "UserEndpointPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UserEndpointPortType {

    @WebResult(name = "CreateUserResponse", targetNamespace = "http://ws.integration.sample.ws.co.nz", partName = "parameters")
    @WebMethod(operationName = "CreateUser", action = "http://ws.integration.sample.ws.co.nz/CreateUser")
    public CreateUserResponse createUser(
        @WebParam(partName = "parameters", name = "CreateUserRequest", targetNamespace = "http://ws.integration.sample.ws.co.nz")
        CreateUserRequest parameters
    );
}
