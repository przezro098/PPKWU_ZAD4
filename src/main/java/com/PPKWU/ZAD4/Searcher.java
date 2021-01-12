package com.PPKWU.ZAD4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Searcher {

    private String url = "https://panoramafirm.pl/szukaj?k=";

    @RequestMapping(value="/field", method = RequestMethod.GET)
    public String getResults(@RequestParam("name") String searchedField, @RequestParam("no") String number) throws IOException {

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
                result.setAddress(element.dataset().get("address"));
                result.setWebsite(element.dataset().get("url"));
                result.setPhone(element.dataset().get("telephone"));
                results.add(result);
            }
        }

        File vCardFile = new File("vCardCompanies.vcf");
        FileWriter fw = new FileWriter(vCardFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("BEGIN:VCARD\r\n");
        bw.write("VERSION:4.0\r\n");
        bw.write("ORG:" + results.get(Integer.getInteger(number)).getName() + "\r\n");
        bw.write("EMAIL:" + results.get(Integer.getInteger(number)).getEmail() + "\r\n");
        bw.write("TEL:" + results.get(Integer.getInteger(number)).getPhone() + "\r\n");
        bw.write("URL:" + results.get(Integer.getInteger(number)).getWebsite() + "\r\n");
        bw.write("ADR:" + results.get(Integer.getInteger(number)).getAddress() + "\r\n");
        bw.write("END:VCARD");
        bw.close();






    }
}
