package ssf.assessment.day20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ssf.assessment.day20.services.NewsService;

@RestController
@RequestMapping(path="/news", produces = "application/json")

public class NewsRestController {

    @Autowired
    private NewsService newsSvc;

    @GetMapping(path="{id}")
    public ResponseEntity<String> getNews (
        @PathVariable (name = "id") String id) {
            
            
            
            return null;

        }

    



    
}
