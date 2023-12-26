package week3.day1;

public class ApiClient {
	
	public void sendrequest(String endpoint) {
		System.out.println(endpoint);

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint+" "+requestBody+" "+requestStatus);

	}

	public static void main(String[] args) {
		ApiClient api = new ApiClient();
		api.sendrequest("End point from firstmethod");
		api.sendRequest("Footer", "Html", false);

	}

}
