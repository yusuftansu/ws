package com.hoaxify.ws.user.rest.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private String username;
    private String displayName;
    private String password;

}
