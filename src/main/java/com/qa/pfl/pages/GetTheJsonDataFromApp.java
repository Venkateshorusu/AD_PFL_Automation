package com.qa.pfl.pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GetTheJsonDataFromApp {
	public static void main(String[] args) throws Exception {
		// Replace these with your actual CPQ API URL, username, and password
		String apiUrl = "https://howmetinctest2.bigmachines.com/rest/v14/adminCustomSYSTEM_DATA";
		String username = "vkancharla";
		String password = "Imrojane@10";

		// Encode the username and password for basic authentication
		String credentials = username + ":" + password;
		String base64Credentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));

		System.out.println(base64Credentials);

		sendGetRequest(apiUrl, base64Credentials);
	}

	public static String sendGetRequest(String apiUrl, String base64Credentials) throws IOException {
		URL url = new URL(apiUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Set the request method to GET
		connection.setRequestMethod("GET");

		// Set the "Authorization" header with the encoded credentials
		connection.setRequestProperty("Authorization", "Basic " + base64Credentials);

		int responseCode = connection.getResponseCode();
		System.out.println("Response Code: " + responseCode);
		StringBuilder response = new StringBuilder();
		// Handle the API response, reading the data if needed
		try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			// Print the response data
			System.out.println("Response Data:");
			System.out.println(response.toString());
		} catch (IOException e) {
			// Handle any exceptions that may occur during the API request
			e.printStackTrace();
		} finally {

			connection.disconnect();
		}
		return response.toString();
	}
}
