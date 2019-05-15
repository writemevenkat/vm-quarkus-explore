# vm-quarkus-explore


# Create New Project Using 
mvn io.quarkus:quarkus-maven-plugin:0.14.0:create     -DprojectGroupId=com.vm.explore     -DprojectArtifactId=vm-quarkus-explore    -DclassName="com.vm.explore.EventResource"     -Dpath="/event"

# Run the application in local 

mvn compile quarkus:dev

# Access the API 

http://localhost:8080/event
