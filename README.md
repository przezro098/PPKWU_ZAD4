# PPKWU_ZAD4

Project is written in Spring Boot technology.
The main feature of the application is to present searched results from https://panoramafirm.pl/szukaj and make it possible to download it in .vcf file. 

To use please:
1) build project using any Java IDE,
2) make sure that project is running
3) type in your browser "http://localhost:8080/field/{WhatAreYouLookingFor}"
4) data will be returned as a web page which allows to download vCards.

Use cases :
a) Typing "http://localhost:8080/field/hydraulik" will return "hydraulik" results

b) Typing "http://localhost:8080/field/spawacz" will return "spawacz" results

