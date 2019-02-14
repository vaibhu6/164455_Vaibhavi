package com.upcomingmatches.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upcomingmatches.model.UpcomingMatches;
import com.upcomingmatches.repo.UpcomingMatchesRepo;

@RestController
public class UpcomingMatchesDao {
	
	@Autowired
	private UpcomingMatchesRepo upcomingMatchesRepo;

	
	@RequestMapping(method=RequestMethod.GET,value="/upcomingmatch")
	public List<UpcomingMatches> getAll() {
		return upcomingMatchesRepo.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/upcomingmatch/{unique_id}")
	public UpcomingMatches readbyId(@PathVariable long unique_id) {
		List<UpcomingMatches> matches=upcomingMatchesRepo.findAll();
		for(UpcomingMatches match: matches) {
			if(match.getUnique_id()==unique_id) {
				return match;
			}
		}
		return null;
	
	}
}