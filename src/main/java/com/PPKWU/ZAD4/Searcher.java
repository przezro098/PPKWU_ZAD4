package com.PPKWU.ZAD4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
        


    }
}
