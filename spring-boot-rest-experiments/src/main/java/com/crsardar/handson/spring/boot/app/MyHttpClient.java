package com.crsardar.handson.spring.boot.app;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Chittaranjan Sardar
 */
public class MyHttpClient {

    public static void main(String[] args) throws Exception{

        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        URL url = new URL("https://api.github.com/search/repositories?q=angular");

        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)url.openConnection();

        httpsURLConnection.setSSLSocketFactory(sslSocketFactory);

        InputStream inputStream = httpsURLConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String string;
        while ((string = bufferedReader.readLine()) != null) {

            System.out.println("Received - " + string);
        }

    }
}
