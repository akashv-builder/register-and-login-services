http://localhost:8761/   eureka
post via zull http://localhost:8765/user-registration-service/register
http://localhost:8765/login-service/login  post request goes through zuul hit login-service then internally hit zull again and call get method go register-service
http://localhost:8000/swagger-ui.html
http://localhost:9000/swagger-ui.html

Dummy-
"userId":"optional"
{
    "userName": "akku007",
    "city": "amb",
     "dateOfBirth":"1996-06-08T18:09:54.101+0000",
	"educationQualification":"B.Tech",
	"password":"1234567",
	"age":21
}

sudo service mongod start

post data of login
{ "userId":"22341","password":"1234567" }
