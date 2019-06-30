package com.zhongruan.bean;

public class UserInfo {

    private int id;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/user/findAll.do">没有写登录 点这里跳转</a>
</body>
</html>

*/