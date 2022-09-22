package com.devmountain.skyrimAlchemyApp.dtos;


import com.devmountain.skyrimAlchemyApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

    private Long user_id;
    private String username;
    private String password;

    private Set<RecipeDto> recipeDtoSet = new HashSet<>();

    public UserDto(User user) {
        if (user.getUser_id() != null){
            this.user_id = user.getUser_id();
        }
        if (user.getUsername() != null){
            this.username = user.getUsername();
        }
        if (user.getPassword() != null){
            this.password = user.getPassword();
        }
    }
}
