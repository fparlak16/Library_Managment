package com.project.library.Services;

import com.project.library.Repositories.BrowwingRepo;
import org.springframework.stereotype.Service;

@Service
public class BrowwingService {
     private BrowwingRepo browwingRepo;
    public BrowwingService(BrowwingRepo browwingRepo) {
            this.browwingRepo = browwingRepo;
    }
}

