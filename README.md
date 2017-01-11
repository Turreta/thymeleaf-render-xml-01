# thymeleaf-render-xml-01

[![Build Status](https://travis-ci.org/Turreta/thymeleaf-render-xml-01.svg?branch=master)](https://travis-ci.org/Turreta/thymeleaf-render-xml-01)

Render XML template using Spring Boot + Thymeleaf 

Converts 

'''xml
<?xml version="1.0" encoding="UTF-8"?>
<persons>
    <person>
        <fname th:text="${pinfo['lastname']}"></fname>
        <lname th:text="${pinfo['firstname']}"></lname>
        <country th:text="${pinfo['country']}"></country>
    </person>
</persons>
'''xml

to 

'''xml


