# Api para realizar pagos en línea

Desarrollado con Spring Boot. Todavía las operaciones de calculo de IVA y edición y eliminación
con consideración de tiempo no están implementadas.

Hace parte del Caso Tech Back 2021 de Accenture.

## Endpoints

* POST /addTransaction 
* PUT /updateTransaction/{id}
* DELETE /deleteTransaction/{id}

## Local Deployment

1. `mysql -u root -h localhost -p`
2. Entra tu contraseña
3. `create database orders;`
4. `use orders;`
5. `create table transactions(id int primary key, client_identification int, client_direction 
varchar(20), products_value varchar(20));`

## Ejemplo de Uso

Para ingresar una transacción con id 1231, cédula de ciudadanía 12345, con la dirección
carrera 96 #56-123 y valor de productos $50000, se realiza la siguiente petición:

url - http://localhost:9090/addTransaction

method - POST

input - 

{

  "id":1231,

  "client_identification":12345,

  "client_direction":"carrera 96 #56-123",

  "products_value":50000

}

output -

{

  "id":1231,

  "client_identification":12345,

  "client_direction":"carrera 96 #56-123",

  "products_value":50000

}

Para la operation PUT se debe especificar los nuevos datos y para la operación DELETE no se debe enviar datos.

Desarrollado por Bill Llach Bruges (tony-coder-18). SDG
