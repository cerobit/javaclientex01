import java.io.IOException;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

public class HttpHelp {


	public HttpHelp() {
		// TODO Auto-generated constructor stub
	}
	
	public void testRest() throws IOException {
		
		String apiUrl =  "http://date.jsontest.com/";

	        GenericUrl url = new GenericUrl( apiUrl);

	        // Se encarga del transporte
	        // Para mayor eficiencia deberia ser compartido globalmente
	        HttpTransport httpTransport = new NetHttpTransport();
	        // Prepara la fabrica para crear peticiones
	        HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
	        // Petición de tipo get
	        HttpRequest request = requestFactory.buildGetRequest(url);
	        // Se ejecuta la respuesta consumiendo el api
	        HttpResponse response = request.execute();
	        // si todo sale bien obtenemos una respuesta en formato JSON
	        System.out.println("Y la hora es ...." + response.parseAsString());

	    }


}
