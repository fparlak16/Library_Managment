package com.project.library.Services;

import com.project.library.Repositories.FineRepo;
import org.springframework.stereotype.Service;

@Service
public class FineService {

     private FineRepo fineRepo;
    public FineService(FineRepo fineRepo) {
        this.fineRepo = fineRepo;
    }
}
