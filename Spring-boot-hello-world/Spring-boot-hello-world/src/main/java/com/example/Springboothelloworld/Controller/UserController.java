package com.example.Springboothelloworld.Controller;

import com.example.Springboothelloworld.Dto.UserReqDTO;
import com.example.Springboothelloworld.Dto.UserReqUpdateDTO;
import com.example.Springboothelloworld.Dto.UserRespDTO;
import com.example.Springboothelloworld.Service.UserService;
import com.example.Springboothelloworld.Utils.AppResponse;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    public UserController(final UserService userServices) {
        this.userService = userServices;


    }

    @PostMapping("/add-user")
    public AppResponse<UserRespDTO> createUser(@RequestBody UserReqDTO userRequest) {
        UserRespDTO userResponseDTO = userService.createUser(userRequest);


        if (userResponseDTO != null) {
            return AppResponse.<UserRespDTO>builder()
                    .data(userResponseDTO)
                    .success(true)
                    .message("user created successfully")
                    .build();
        }
        return AppResponse.<UserRespDTO>builder()
                .success(false)
                .message(" failed")
                .build();


    }

    @PostMapping("/edit/update-employee")
    public AppResponse<UserRespDTO> updateUser(
            @RequestBody final UserReqUpdateDTO userRequestEditDTO) {
        UserRespDTO userResponseDTO = userService.updateUser(userRequestEditDTO);

        if (userResponseDTO != null) {
            return AppResponse.<UserRespDTO>builder()
                    .data(userResponseDTO)
                    .success(true)
                    .message("successfully updated")
                    .build();


        }
        return AppResponse.<UserRespDTO>builder()
                .success(false)
                .message("couldn't update")
                .build();
    }


}
