package com.PPKWU.ZAD4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Searcher {

    private String url = "https://panoramafirm.pl/szukaj?k=";

    @RequestMapping(value="/field", method = RequestMethod.GET)
    public List<Result> getResults(String searchedField) {

        List<Result> results = new ArrayList<>();



    }
}
