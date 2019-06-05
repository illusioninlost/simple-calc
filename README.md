# simple-calc
Junit jupiter - testing project

Simple project implementing Junit, Sonar, Artifactory

Commands:
	
	mvn clean 
	mvn test -Dtest=CalcTest   // -Dtest is optional 
	mvn sonar:sonar            // sends code to sonar in localhost
	mvn deploy                 // sends final artifact .jar to artifactory

 Run all these task in a jenkins pipeline 
 Separate every task by stages (clean) (test) (sonar) (deploy-art)
 
 
 
