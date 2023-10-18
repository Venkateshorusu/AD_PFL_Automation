
package com.qa.pfl.pages;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToTabularData {

    public static void main(String[] args) {
    	
    	 String apiUrl = "https://howmetinctest2.bigmachines.com/rest/v14/adminCustomSYSTEM_DATA";
         String username = "vkancharla";
         String password = "Imrojane@10";

         // Encode the username and password for basic authentication
         
         String credentials = username + ":" + password;
         String base64Credentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));

         String json = null ;
         // Perform a GET request 
         try {
        	 
        	 json=GetTheJsonDataFromApp.sendGetRequest(apiUrl, base64Credentials);
		} 
         catch (IOException e1) {
			
			e1.printStackTrace();
		}
        
        // Replace with your JSON data

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);

            // Extract the "items" array from the JSON
            JsonNode itemsNode = rootNode.get("items");

            if (itemsNode.isArray()) {
                List<List<String>> tabularData = new ArrayList<>();

                // Create a header row
                List<String> headerRow = new ArrayList<>();
                headerRow.add("id");
                headerRow.add("DATA_NAME");
                headerRow.add("DATA_VALUE");
                headerRow.add("SYSTEM_ID");
                headerRow.add("COMMENT");
                
                tabularData.add(headerRow);

                // Iterate through the items and extract relevant fields
                
                for (JsonNode itemNode : itemsNode) {
                    List<String> rowData = new ArrayList<>();
                    rowData.add(itemNode.get("id").asText()); 
                    rowData.add(itemNode.get("SYSTEM_ID") != null ? itemNode.get("SYSTEM_ID").asText() : "");
                    rowData.add(itemNode.get("DATA_NAME") != null ? itemNode.get("DATA_NAME").asText() : "");
                    rowData.add(itemNode.get("DATA_VALUE") != null ? itemNode.get("DATA_VALUE").asText() : "");
                    rowData.add(itemNode.get("COMMENT") != null ? itemNode.get("COMMENT").asText() : "");
                    
                    tabularData.add(rowData);
                }

                // Print the tabular data
                for (List<String> row : tabularData) {
                    System.out.println(String.join("\t", row));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
