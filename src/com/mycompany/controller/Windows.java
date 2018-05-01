package com.mycompany.controller;

/**
 * 这个枚举类用来保存一些常量
 * 保存窗口fxml文件的相对路径
 * */
public enum Windows {
    MAIN_WINDOW("../view/MainWindow.fxml"),
    MANAGER_HOME_WINDOW("../view/ManagerHomeWindow.fxml"),
    USER_HOME_WINDOW("../view/UserHomeWindow.fxml"),
    REGISTER_WINDOW("../view/RegisterWindow.fxml");
    private String value;


    Windows(String s) {
        this.value = s;
    }


    public String getValue(){
        return this.value;
    }
}