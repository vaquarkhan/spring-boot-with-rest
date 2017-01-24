# Spring boot example with REST and spring data JPA ,H2 database with Swagger


### Endpoints

| Method | Url | Decription |
| ------ | --- | ---------- |
| GET    |/info  | info / heartbeat - provided by boot |
| GET    |/health| application health - provided by boot |
| GET    |/v2/api-docs    | swagger json |
| GET    |/swagger-ui.html| swagger html |
| GET    |/v1/person/{id}| get person by id |
| GET    |/v1/persons    | get N persons with an offset|
| PUT    |/v1/person     | add / update person|

-----------------------------------------------------------------------------------------------
GET 

http://localhost:8080/info

http://localhost:8080/health

http://localhost:8080/v2/api-docs

http://localhost:8080/swagger-ui.html

http://localhost:8080/v1/persons


PUT

http://localhost:8080/v1/person

Header :

Content-Type :application/json
userId:2

JSON 
Body 
{
	
	"userId":"2",
	"token":"1001",
	"firstName":"vaquar1",
	"middleName":"mohammed",
	"lastName":"khan",
	"dob":"11/11/1985",
	"gender":"M"
}




GET 

http://localhost:8080/v1/persons/1


http://localhost:8080/v1/persons/2


-----------------------------------------------------------------------------------------------

Rest Browser client

https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en
