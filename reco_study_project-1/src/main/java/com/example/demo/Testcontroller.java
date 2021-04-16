package com.example.demo;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {
	
	@RequestMapping("/result")
	public String returnLogin()
	{
		System.out.print("inside user2");
		return "Login";
	}
	
      @RequestMapping("/login")
	  public @ResponseBody String login(@RequestParam("username") String username,
		        @RequestParam("userPassword") String userPassword, HttpServletRequest request, HttpServletResponse response)
      throws IOException, ParseException {
		  
		return "login";
	  }

}
