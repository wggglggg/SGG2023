package com.builder;

/**
 * ClassName: User
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:09
 * @Version 1.0
 */
public class User {
    private final String name;
    private final String password;

    private User(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {

        private String name;
        private String password;

        public void setName(String name) {
            this.name = name;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        public User build(){
            return new User(this);
        }
    }

}
