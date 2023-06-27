package com.dedalus.eqpmgmt.service;

import com.dedalus.eqpmgmt.entity.ApplicationUser;
import com.dedalus.eqpmgmt.pojo.RegisterUser;

public interface ApplicationUserService {
	ApplicationUser createApplicationUser(RegisterUser registerUser);
	ApplicationUser getApplicationUser(String userName);
}
