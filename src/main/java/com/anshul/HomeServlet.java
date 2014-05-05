/**
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.anshul;

//import com.google.appengine.api.users.User;
//import com.google.appengine.api.users.UserService;
//import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.auth.AccessToken;


@SuppressWarnings("serial")
public class HomeServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException, ServletException {
	  
	try {
		Twitter twitter = (Twitter) req.getSession().getAttribute("twitter");
		AccessToken accessToken;
		accessToken = twitter.getOAuthAccessToken((String) req.getParameter("oauth_verifier"));
		twitter.setOAuthAccessToken(accessToken);
		   
		User user = twitter.verifyCredentials();
		
		String username = user.getName();
		TweetWrapper tweetWrapper = TweetWrapper.feel(user.getStatus().getText());
		
		req.setAttribute("user", username);
		req.setAttribute("emotion", tweetWrapper.getStrongestEmotion());
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);
		
		resp.setContentType("text/html");
		resp.getWriter().print(user.getName());
	} catch (TwitterException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
}
