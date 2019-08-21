package com.facebook.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.api.model.FBuser;

import com.facebook.api.service.*;;
@RestController
public class FacebookController {
	@Autowired
	FacebookDatastructure facebook;
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<FBuser> getRecommendationList(@RequestBody FBuser user) {
		return facebook.getRecommendations(user);
	}
}
