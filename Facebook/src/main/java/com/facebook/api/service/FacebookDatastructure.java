package com.facebook.api.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.api.model.FBuser;
import com.facebook.api.repo.FaceBookRepo;

@Service
public class FacebookDatastructure {
	@Autowired
	FaceBookRepo repository;
	public List<FBuser> getRecommendations(FBuser user){
		HashMap<FBuser,Set<FBuser>> map=repository.getRepo();
		List<FBuser> list=new ArrayList<>();
		if(map.containsKey(user)) {
			for(Map.Entry<FBuser,Set<FBuser>>entry:map.entrySet()) {
				FBuser key=entry.getKey();
				if(!user.equals(key) && Math.abs(map.get(user).size()-map.get(key).size())>=2) {
					list.add(key);
				}
			}
		}
		return list;
		
	}
}
