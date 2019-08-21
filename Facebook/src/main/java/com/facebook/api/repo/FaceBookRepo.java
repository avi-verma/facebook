package com.facebook.api.repo;

import java.util.HashMap;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.facebook.api.model.FBuser;
@Repository
public class FaceBookRepo {
	public HashMap<FBuser,Set<FBuser>> getRepo(){
	HashMap<FBuser,Set<FBuser>> map=new HashMap<>();
	FBuser user1=new FBuser("Avinash"); 
	user1.addFrnd(new FBuser("Swati"));
	user1.addFrnd(new FBuser("Anurag"));
	user1.addFrnd(new FBuser("Abhay"));
	user1.addFrnd(new FBuser("Ambrish"));
	FBuser user2=new FBuser("Neha");
	user2.addFrnd(new FBuser("Abhay"));
	user2.addFrnd(new FBuser("Ambrish"));
	map.put(user1,user1.getFrndList() );
	map.put(user2, user2.getFrndList());
	return map;
	}
}
