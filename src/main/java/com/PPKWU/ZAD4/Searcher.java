package com.PPKWU.ZAD4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Searcher {

    private String url = "https://panoramafirm.pl/szukaj?k=";

    @RequestMapping(value="/field", method = RequestMethod.GET)
    public List<Result> getResults(String searchedField) throws IOException {

        List<Result> results = new ArrayList<>();
        Document document = Jsoup.connect(url+searchedField+"&l=").get();
        Elements elements = document.select("script");
        for(Element element : elements)
        {
            if(element.attr("type").equals("application/ld+json"))
            {
                Result result = new Result();
                result.setName(element.dataset().get("name"));
                result.setEmail(element.dataset().get("email"));
                result.setAddress(element.dataset().get("name"));
                result.setName(element.dataset().get("name"));
            }
        }


    }
}
