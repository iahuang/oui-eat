package com.ouieat.requests;

import com.ouieat.implementation.UserImplementation;
import com.ouieat.models.User;
import com.ouieat.repository.UserRepository;
import com.ouieat.responses.Response;

public class UserRequests {

  public static String doRegister(UserRepository userRepository, User newUser) {
    Response response = UserImplementation.saveNewUser(userRepository, newUser);
    return response.getJsonString();
  }
}
