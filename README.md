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

### Make-admin

PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!

### Save Book
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
Content-Type: application/json
Content-Length: 126

{
"title": "Test Book 2",
"price": "10",
"description": "Test description 2",
"author": "Test author 2"
}

### Delete Book
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
### Get All Books
GET /api/book HTTP/1.1
Host: localhost:8080


### Save Purchase
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
Content-Type: application/json
Content-Length: 54

{
"userId":4,
"bookId":1,
"price":10
}

### Get Purchase History
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...