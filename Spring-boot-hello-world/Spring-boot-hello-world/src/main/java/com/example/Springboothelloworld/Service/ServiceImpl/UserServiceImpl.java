package com.example.Springboothelloworld.Service.ServiceImpl;

import com.example.Springboothelloworld.Dto.UserReqDTO;
import com.example.Springboothelloworld.Dto.UserReqUpdateDTO;
import com.example.Springboothelloworld.Dto.UserRespDTO;
import com.example.Springboothelloworld.Entity.User;
import com.example.Springboothelloworld.Repository.UserRepository;
import com.example.Springboothelloworld.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(final UserRepository userRepositoryParam) {
        this.userRepository = userRepositoryParam;
    }

    @Override
    public UserRespDTO createUser(UserReqDTO userRequestDTO) {
        User userDetails = new User();
        userDetails.setName(userRequestDTO.getName());
        userDetails.setEmail(userRequestDTO.getEmail());
        userDetails.setPhoneNumber(userRequestDTO.getPhoneNumber());
        userDetails.setPassword(userRequestDTO.getPassword());
        userDetails.setCreatedOn(LocalDateTime.now());
        User details = userRepository.save(userDetails);


        return getUserRespDTO(details);

    }

    private UserRespDTO getUserRespDTO(User details) {
        UserRespDTO userResponseDTO = new UserRespDTO();
        userResponseDTO.setName(details.getName());
        userResponseDTO.setEmail(details.getEmail());
        userResponseDTO.setPhoneNumber(details.getPhoneNumber());
        userResponseDTO.setPassword(details.getPassword());
        userResponseDTO.setCreatedOn(details.getCreatedOn());
        return userResponseDTO;
    }

    @Override
    public UserRespDTO updateUser(UserReqUpdateDTO userRequestEditDTO) {
        Optional<User> userOptional = userRepository.findById(userRequestEditDTO.getId());
        if (userOptional.isPresent()) {
            userOptional.get().setName(userRequestEditDTO.getName());
            userOptional.get().setEmail(userRequestEditDTO.getEmail());
            userOptional.get().setPhoneNumber(userRequestEditDTO.getPhoneNumber());
            userOptional.get().setPassword(userRequestEditDTO.getPassword());
            userRepository.save(userOptional.get());

        }
        return userResponseDTO(userOptional.get());
    }

    public UserRespDTO userResponseDTO(final User details) {
        return getUserRespDTO(details);


    }

}
