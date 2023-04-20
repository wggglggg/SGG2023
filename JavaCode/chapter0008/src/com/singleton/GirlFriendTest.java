package com.singleton;

/**
 * ClassName: GirlFriendTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/29 8:39
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance();
    }
}

class GirlFriend {

    private GirlFriend () {}

    private static GirlFriend instance = null;

    public static GirlFriend getInstance() {
        if (instance == null) {
            instance = new GirlFriend();
        }
        return instance;
    }
}
