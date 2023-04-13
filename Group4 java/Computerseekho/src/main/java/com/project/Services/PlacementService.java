package com.project.Services;

import java.util.List;
import java.util.Optional;
import com.project.Entities.Placement;

public interface PlacementService {
	void addPlacement(Placement p);
	List<Placement> getPlacements();
	void delete(int id);
	//void update(Placement Placement,int id);
	Optional<Placement> getPlacement(int id);
	

}
