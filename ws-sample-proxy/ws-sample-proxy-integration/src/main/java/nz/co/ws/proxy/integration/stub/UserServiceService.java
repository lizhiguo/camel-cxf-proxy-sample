package nz.co.ws.proxy.integration.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-02-27T07:17:05.705+13:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "UserServiceService", 
                  wsdlLocation = "file:/home/david/study/project/camel-ws-proxy/ws-sample-proxy/ws-sample-proxy-integration/src/main/resources/etc/user-service.wsdl",
                  targetNamespace = "http://ws.integration.sample.ws.co.nz") 
public class UserServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.integration.sample.ws.co.nz", "UserServiceService");
    public final static QName UserEndpointPortTypePort = new QName("http://ws.integration.sample.ws.co.nz", "UserEndpointPortTypePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/david/study/project/camel-ws-proxy/ws-sample-proxy/ws-sample-proxy-integration/src/main/resources/etc/user-service.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/david/study/project/camel-ws-proxy/ws-sample-proxy/ws-sample-proxy-integration/src/main/resources/etc/user-service.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns UserEndpointPortType
     */
    @WebEndpoint(name = "UserEndpointPortTypePort")
    public UserEndpointPortType getUserEndpointPortTypePort() {
        return super.getPort(UserEndpointPortTypePort, UserEndpointPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserEndpointPortType
     */
    @WebEndpoint(name = "UserEndpointPortTypePort")
    public UserEndpointPortType getUserEndpointPortTypePort(WebServiceFeature... features) {
        return super.getPort(UserEndpointPortTypePort, UserEndpointPortType.class, features);
    }

}
