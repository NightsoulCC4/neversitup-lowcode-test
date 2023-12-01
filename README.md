# Latest project.
U plus project
language: java version 1.8
framework: spring boot version 2.4
database: postgresql
url: https://github.com/NightsoulCC4/uplus_java

# Standard Project structure and define convention.
There are 3 layers in this project contains of
Controller layer: Define api routes and calls to Service layer.
Service layer: Define request, response and logic to send the request to vendor customer, and repository layer.
Repository layer: Get data from database and convert to LinkedHashMap and return to the Sevice layer.