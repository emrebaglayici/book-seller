#Book Seller


###Endpoints

#### Sign-Up
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
{
"name": "emre",
"username":"emrebaglayici",
"password": "123"
}

#### Sign-In
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
{
"username":"emrebaglayici",
"password": "123"
}