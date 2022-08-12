package ssf.assessment.day20.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ssf.assessment.day20.services.NewsService;
import ssf.assessment.day20.models.*;

@Controller
@RequestMapping(path="/")
public class NewsController {



    @Autowired
    private NewsService newsSvc;


    @GetMapping(produces = {"text/html"})
    public String getArticles (Model model, @RequestParam String key, @RequestParam String cat) {
        
        List<String> Articles = newsSvc.getArticles(cat);
        model.addAttribute("key", key);
        model.addAttribute("cat", cat);
    
        
        return "request";
}
    

    @PostMapping (produces = "text/html")
    public String postArticles (@RequestBody MultiValueMap<String, String> form, Model model) {

        String id = form.getFirst("id");
        String title = form.getFirst("title");


        return "articles";

    }
}


    
