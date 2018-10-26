package com.edu.zucc.ygg.movie.service;

import com.edu.zucc.ygg.movie.domain.User;
import com.edu.zucc.ygg.movie.dto.ResultDto;
import com.edu.zucc.ygg.movie.dto.UserDto;

import java.util.List;

public interface UserService extends Service<User>{
    ResultDto registerUser(UserDto userDto);

    ResultDto updateUserInfo(UserDto userDto);

    ResultDto registerAdmin(UserDto userDto);

    ResultDto deleteAdmin(int adminId);

    List<UserDto> getUserList(UserDto userDto);
}