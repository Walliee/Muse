package com.anshul;

import org.json.JSONObject;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInFB extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {            
        String code = req.getParameter("code");
        if (code == null || code.equals("")) {
        	resp.getWriter().println("Error"); 
            // an error occurred, handle this
        }

        String token = null;
        try {
            String g = "https://graph.facebook.com/oauth/access_token?client_id=526132877497296&redirect_uri=" + URLEncoder.encode("http://localhost:8080/signinfb", "UTF-8") + "&client_secret=512de4647edd0533b196ed7f4d264a0b&code=" + code;
            URL u = new URL(g);
            URLConnection c = u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
            String inputLine;
            StringBuffer b = new StringBuffer();
            while ((inputLine = in.readLine()) != null)
                b.append(inputLine + "\n");            
            in.close();
            token = b.toString();
            if (token.startsWith("{"))
                throw new Exception("error on requesting token: " + token + " with code: " + code);
        } catch (Exception e) {
               e.printStackTrace();
        }

        String graph = null;
        try {
            String g = "https://graph.facebook.com/me?" + token;
            URL u = new URL(g);
            URLConnection c = u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
            String inputLine;
            StringBuffer b = new StringBuffer();
            while ((inputLine = in.readLine()) != null)
                b.append(inputLine + "\n");            
            in.close();
            graph = b.toString();
        } catch (Exception e) {
               e.printStackTrace();
        }
        
        String status = null;
        try {
            String g = "https://graph.facebook.com/me/feed?limit=1&access_token=" + token;
            URL u = new URL(g);
            URLConnection c = u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
            String inputLine;
            StringBuffer b = new StringBuffer();
            while ((inputLine = in.readLine()) != null)
                b.append(inputLine + "\n");            
            in.close();
            status = b.toString();
        } catch (Exception e) {
               e.printStackTrace();
        }
        try {
        	if(status!=null){
        		JSONObject j = new JSONObject(status);
        	}
        		
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        String facebookId;
        String firstName;
        String middleNames;
        String lastName;
        String email;
        try {
            JSONObject json = new JSONObject(graph);
            facebookId = json.getString("id");
            firstName = json.getString("first_name");
            if (json.has("middle_name"))
               middleNames = json.getString("middle_name");
            else
                middleNames = null;
            if (middleNames != null && middleNames.equals(""))
                middleNames = null;
            lastName = json.getString("last_name");
//            email = json.getString("email");
//            System.out.println("Hello");
            resp.getWriter().println(json.toString()); 
            resp.getWriter().println(firstName);
            resp.getWriter().println(lastName);
            resp.getWriter().println(status);
//            resp.getWriter().println(email); 
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}