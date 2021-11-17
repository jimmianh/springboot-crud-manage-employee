package com.example.hellospringboot.service;

import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.model.dto.UserDto;
import com.example.hellospringboot.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();
    static {
        users.add(new User());
        users.add(new User(1, "Vũ Hoàng Ngọc Anh", "jimmianh1807@gmail.com","0986007605","3.png","123"));
        users.add(new User(1, "Lê Duy Long ", "long@gmail.com","0986999jqk","1.png","123"));
        users.add(new User(1, "Lê Thị Ngọc Ánh", "leanh7@gmail.com","0986abc05","21.png","123"));
        users.add(new User(1, "Nguyễn Quang Hưng", "hungquang@gmail.com","098577885","45.png","123"));
        users.add(new User(1, "Nguyễn Văn A", "vanA@gmail.com","098866887605","13.png","123"));
        users.add(new User(1, "Ngô Minh Hải", "hinhhair@gmail.com","0914556565","25.png","123"));
        users.add(new User(1, "Trần Mai Hải Linh", "cookie@gmail.com","0862555647","8.png","123"));

        }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user : users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }
}
