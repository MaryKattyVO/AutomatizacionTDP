package aseguramientoBDD.utility;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonUtility {

    public String executePost(String targetURL, String requestMethod, String accessToken,
                              String authorization, String contentType, String body) throws IOException {
        HttpURLConnection connection = null;
        try {
            // Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            connection.setRequestProperty("Access-Token", accessToken);
            connection.setRequestProperty("Authorization", authorization);
            connection.setRequestProperty("Content-Type", contentType);
            connection.setUseCaches(false);
            connection.setDoOutput(true);
            String data = body;
            // Send request
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(data);
            wr.close();
            // Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if not Java 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
            // PARAMETRIZACIÓN DE JSON - INICIO:
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            if (connection != null) {
                connection.disconnect();
            }
            System.out.println(e.getMessage().toString() + " - " + e.getStackTrace().toString());
            return "";
        }
        // PARAMETRIZACIÓN DE JSON - FIN:
    }

    private static String readResource(String resourceName) throws IOException {
        // read file as a string
        InputStream is = JsonUtility.class.getClassLoader().getResourceAsStream(resourceName);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader buf = new BufferedReader(isr);
        try {
            String s, s2 = new String();
            while ((s = buf.readLine()) != null) {
                s2 += s + "\n";
            }
            return s2;
        } finally {
            buf.close();
            isr.close();
            is.close();
        }
    }
}
