package com.project.library.Repositories;

import com.project.library.entities.Fine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FineRepo extends JpaRepository<Fine, Long> {

}
