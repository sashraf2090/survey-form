# Use the official Tomcat base image
FROM tomcat:10.1.14-jdk17

# Remove the default web applications provided by Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file into the Tomcat webapps directory
COPY target/survey-form.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]