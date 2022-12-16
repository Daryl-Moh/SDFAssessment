package mailmerge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;



public class Main {

    public static void main(String[] args) throws IOException {
        
        // I managed to get the map of input information from reading the CSV 
        // Then I got stuck at trying to find how to compare the keys and replace the items in the output

        // Put file names into a string
        String csv = args[0]; 
        String template = args[1];

        // Read in the CSV file information and create a customer database
        Reader csvr = new FileReader(csv);
        BufferedReader csvbr = new BufferedReader(csvr);

        // Get headers in one array
        String line = csvbr.readLine();
        String[] headerName = line.split(",");
        // Create a list of customers containing hashmaps
        List<HashMap<String, String>> customer = new LinkedList<HashMap<String,String>>(); 
        
        // Read rest of the information into a list of hashmap
        while ((line=csvbr.readLine()) != null) {
            String[] attributes = line.split(",");
            HashMap<String, String> m = new HashMap<String, String>();
            for(Integer i=0; i<attributes.length; i++)
                m.put(headerName[i], attributes[i]);
                customer.add(m);

        }

        //System.out.println(customer.get(1).get("address"));
        

        // Read in the template file and create an output template

        Reader tempr = new FileReader(template);
        BufferedReader tempbr = new BufferedReader(tempr);
        StringBuilder stringb = new StringBuilder();   

        String line2;
        //List<String> keyList = new LinkedList<String>();

        for (HashMap m : customer) {

            while ((line2=tempbr.readLine()) != null) {
            
                //System.out.println(line2);
                // Temp storage for combined string
                String joinedString;
                String[] temp = line2.split(" ");
                
                // Get keyList from the template file to check and replace the words during printing
                for(Integer i=0; i<temp.length; i++){
                    
                    if(temp[i].contains("<")) {
                        String key;
                        key = temp[i].replaceAll("[^a-zA-Z0-9]", "");
    
                        //stringb.append();  
    
                        // Idea is trying to write each array into a string and replacing the correct information when it reaches it
                        // But I cannot figure out how to get it work
    
                    } else {
        
                        stringb.append(temp[i] + " ");
    
                    }
                   
                    
                }
            
        }

            // 
                    
        }

        tempbr.close();
        //joinedString = stringb.toString();
        System.out.println(stringb.toString());
        //System.out.println(keyList.toString());

    }
    
         
        
}

    
