package com.yykj.oachat.dto.data;

/**
 * @author hyy
 * @date 2017/11/28
 */
public class UserDetailDTO {

    private Long id;

    private String username;

    private String nickName;

    private String gender;

    private String address;

    private String telephoneNumber;

    private String icon;

    private Boolean alreadyFriend;

    private Integer commonFriendsCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getAlreadyFriend() {
        return alreadyFriend;
    }

    public void setAlreadyFriend(Boolean alreadyFriend) {
        this.alreadyFriend = alreadyFriend;
    }

    public Integer getCommonFriendsCount() {
        return commonFriendsCount;
    }

    public void setCommonFriendsCount(Integer commonFriendsCount) {
        this.commonFriendsCount = commonFriendsCount;
    }
}
