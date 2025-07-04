package org.example.service;
import org.example.exception.YearNotFoundException;
import org.example.model.WimbledonResult;
import org.example.repository.WimbledonResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WimbledonService {
    private final WimbledonResultRepository repository;


    @Autowired
    public WimbledonService(WimbledonResultRepository repository) {
        this.repository = repository;
    }

    public WimbledonResult getFinalByYear(int year) throws Throwable {
        return repository.findById(year)
                .orElseThrow(() -> new YearNotFoundException(year));
    }
}
