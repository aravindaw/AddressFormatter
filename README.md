## Project - AddressFormatter
This code solution converts a string of address in to a JSON object which has separate key/value pairs for street addresses and house numbers.

####example:
Input : "Blaufeldweg 123B" <br/> 
Output : {"street": "Blaufeldweg", "housenumber": "123B"}

Input: "Auf der Vogelwiese 23 b"<br/>
Output: {"street": "Auf der Vogelwiese", "housenumber": "23 b"}

Input:"4, rue de la revolution"<br/>
Output: {"street": "rue de la revolution", "housenumber": "4"}

###Requirement :
1. Java 8
2. Apache Maven 3.3
(Used Spring boot 2.0.4 to implement the project)

###Setup the project :
1. Go to the project folder
2. Run command ```$mvn spring-boot:run```
3. Got to the address formatter web page [http://localhost:8080/address](http://localhost:8080/address )

###Run test cases :
1. Go to the project folder
2. Run command ```$mvn test```

[Test case document](https://github.com/aravindaw/AddressFormatter/blob/master/Test%20case%20document.pdf)


