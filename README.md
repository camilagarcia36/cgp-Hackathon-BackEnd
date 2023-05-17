# cgp-Hackathon-BackEnd


## API Reference
https://documenter.getpostman.com/view/13747386/2s93kz4Ptg
## - Welcome message

```http
  GET localhost:8080/

```
#### Response
"Login & Register server"

## - Login

```http
  POST localhost:8080/auth/signin

```

#### Body (raw (JSON))
```javascript
{
        "username": "testUser",
        "password": "12345678"
}
```
#### Responses

```javascript
{
    "id": 1,
    "username": "testUser",
    "email": "testUser@test.com",
    "roles": [
        "ROLE_USER"
    ],
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0VXNlciIsImlhdCI6MTY4NDMxNzEyMiwiZXhwIjoxNjg0NDAzNTIyfQ.rG9NCBvAoYmEaIVA1v4hLPH49-ln7_QdBo5OgHhFJVpx1axhNHBCvRs9JXIp2OOIX2QcG6fNV16J_hSWYTAtAQ",
    "tokenType": "Bearer"
}
```
## - Welcome after login

```http
  GET localhost:8080/WelcomeUser

```

#### AUTH
``
Type: JWT Bearer
``
#### HEADERS
`` 
KEY: AUTHORIZATION
``

``
VALUE: Bearer "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0VXNlciIsImlhdCI6MTY4NDMxNzEyMiwiZXhwIjoxNjg0NDAzNTIyfQ.rG9NCBvAoYmEaIVA1v4hLPH49-ln7_QdBo5OgHhFJVpx1axhNHBCvRs9JXIp2OOIX2QcG6fNV16J_hSWYTAtAQ"
``

## - Register

```http
  POST localhost:8080/auth/signup

```

#### Body (raw (JSON))
```javascript
{
        "username": "pruebauseregister",
        "email": "mail@mail.com",
        "password": "123345677"
}
```
#### Responses

```javascript
{
    "message": "User registered successfully!"
}
```
