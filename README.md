Name:- Souvik Saha
Thank You for the Assiment. 

The application is also be uploaded in GITHUB:- https://github.com/souviksaha20/employee.git
I will as deploy the assiment in aws :- Employee.us-east-2.elasticbeanstalk.com

#TECHNOLOGY USED:

#Spring MVC Framework with CURD operations based on Employee with hibernate and AWS sql server. 


##Description

#It is the Maven  project web app   project.

To use this application following are the software requirements :- Eclipse(Oxygen Version),Apache Tomcat 9.0 server, Msql or cloud based My sql(aws sql or etc)



Step 1)
 
  a)file--->Import--->Import--->type in search maven--->existing Maven Projects--->Browse--->select the employee folder first--->Next--->finish.
  b)Right click on project and go to properties.
  c)Click on java build path, and then click on JRE SYSTEM Library and change it to workspace default JRE
  d)On the same page click on add external jar and add all the external jar from the Lib folder(Jar are present in FullCalendarWithSpringMVC-->webContent-->web-Inf-->lib)	  
  e)Click on java Compiler--> change the version to 1.7 or 1.8

  *Note 
   If you want to change my sql database then first create  a database(eg:-calender or etc)
   (As I have AWS server in that server i have a database called as calender inside that database  employee table is present, which is automatically created by Hibernate)
   change the url, username and password in applicationContextConfig.java class. It is located inside the package com.medinfi.employee.config. 

Step 2)  

  a)file--->Import--->Import--->type in search maven--->existing Maven Projects--->Browse--->select the employeefrontend  folder--->Next--->employeefrontend 
  b)Right click on project and go to properties.
  c)Deployment Assembly if Maven Dependencies is not added then click on add --> java Build path Entries--> select Maven Dependencies-->finish
  d)Click on java build path, and then click on JRE SYSTEM Library and change it to workspace default JRE
  e)On the same page click on add external jar and add all the external jar from the Lib folder(Jar are present in FullCalendarWithSpringMVC-->webContent-->web-Inf-->lib)	  
  f)Click on java Compiler--> change the version to 1.7 or 1.8
  
  
3)Click on apply and close.
4)Right click on project employeefrontend -->Run -->Run on server.

The Project then will then run on the local host.

Since I have used cloud server, the database is already created through hibernate.

I am providing the war file too. You can deploy the application direcly in your server using this war file.

  
Thanking You
Souvik saha
Email:-souvik.saha@cs.christuniversity.in
Contact:-8310161424








