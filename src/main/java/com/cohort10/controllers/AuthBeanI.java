package com.cohort10.controllers;

import com.cohort10.model.Auth;
import com.cohort10.model.User;

public interface AuthBeanI {

    User login(Auth auth) throws Exception;

}
