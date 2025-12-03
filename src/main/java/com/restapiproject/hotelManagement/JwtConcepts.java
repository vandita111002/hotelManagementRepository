package com.restapiproject.hotelManagement;

public class JwtConcepts {
	
//	JWT- JSON Web Token
//	compact token- verify who the user is
//				   what the user is allowed to do
//				   whether the token is valid and unmodified
//	
//	structure: 3 parts: xxxx.yyyy.zzzz
//	header: what algorithm was used to sign it
//	payload: usernames, roles, expiry
//	signature: ensures that the token is not tempered
//	
//	why?
//	Secure Rest apis
//	Easy authorization- inside some rolers - admin & users
//	adding security to rest apis
//	user register: end point -> POST auth/register -> username, password, role
//								encode the password - BCryptPaswordEncoder
//								Store in mysql using jdbc template
//								user is registered
//								created user who can authenticate now
//								
//	user login: end point -> POST login/auth name, password
//				Compare raw password with encoded password
//				If valid -> generate jwt token
//				username, role, expiry token, secret copy
//				token now -> user's identity
//
//	Client sends token in request ->  GET/api/hotels -> fetch this
//									  send autorization header also
//	
//	Jwt filter: extract token from authorization -> validate token
//									  
//	Security config: admin -> POST/PUT/DELETE
//							  user -> to do only get
//							  roles -> what kind of access is specified
//							  Controller runs -> execute allowed api

}
