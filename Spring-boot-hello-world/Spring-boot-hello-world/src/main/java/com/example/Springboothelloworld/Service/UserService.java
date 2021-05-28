package com.example.Springboothelloworld.Service;

import com.example.Springboothelloworld.Dto.UserReqDTO;
import com.example.Springboothelloworld.Dto.UserReqUpdateDTO;
import com.example.Springboothelloworld.Dto.UserRespDTO;


public interface UserService {
    UserRespDTO createUser(UserReqDTO userRequestDTO);

    UserRespDTO updateUser(final UserReqUpdateDTO userRequestEditDTO);
}
