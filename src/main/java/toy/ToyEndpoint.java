package toy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.util.Random;

import io.spring.guides.gs_producing_web_service.GetToyRequest;
import io.spring.guides.gs_producing_web_service.GetToyResponse;
import io.spring.guides.gs_producing_web_service.GetJobRequest;
import io.spring.guides.gs_producing_web_service.GetJobResponse;
@Endpoint
public class ToyEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private ToyRepository toyRepository;

	@Autowired
	public ToyEndpoint(ToyRepository toyRepository) {
		this.toyRepository = toyRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getToyRequest")
	@ResponsePayload
	public GetToyResponse getToy(@RequestPayload GetToyRequest request) {
		GetToyResponse response = new GetToyResponse();
		response.setToy(toyRepository.findToy(request.getName()));
		return response;
	}


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getJobRequest")
	@ResponsePayload
	public GetJobResponse getJob(@RequestPayload GetJobRequest request) {
		GetJobResponse response = new GetJobResponse();
		response.setJobID(toyRepository.findJobID(request.getJob()));
		return response;
	}

}
