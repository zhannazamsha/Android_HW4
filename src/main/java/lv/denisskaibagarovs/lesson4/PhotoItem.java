package lv.denisskaibagarovs.lesson4;

import java.util.Map;

public class PhotoItem {
    Map<String,String> urls;
    User user;

    public String getImgUrl() {
        return this.urls.get("regular");
    }
    public String getAuthorName() {
        return this.user.name;
    }
    public String getAuthorLocation() {
        return this.user.location;
    }


    // TODO Write a function to get authorName from User

    public class User {
        String name;
        String location;
    }
}
