package bgd.edu.ua.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {

    @JsonProperty
    Long userId;

    @JsonProperty
    String userName;

    static public String classInfo ="";

    public UserDto() {
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    public static String getClassInfo() {
        return classInfo;
    }

    public static void setClassInfo(String classInfo) {
        UserDto.classInfo = classInfo;
    }
    public static void clearClassInfo(){
        UserDto.classInfo = "";
    }
}
