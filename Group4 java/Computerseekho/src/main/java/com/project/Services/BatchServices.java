package com.project.Services;

import java.util.List;
import java.util.Optional;

import com.project.Entities.Batch;

public interface BatchServices {
	void save(Batch ref);
	List<Batch>getAll();
	Optional<Batch> getBatch(int  pid);
	Optional<Batch> findById(int courseBatchId);

}
