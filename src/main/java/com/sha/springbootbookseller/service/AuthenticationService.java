package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
