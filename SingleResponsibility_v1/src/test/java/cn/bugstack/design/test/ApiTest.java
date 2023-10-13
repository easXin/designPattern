package cn.bugstack.design.test;

import cn.bugstack.design.VideoUserService;


/**
 * @description SRP 每一个类 只负责一个行为，这个类发生变化 只跟这个行为有关
 */

public class ApiTest {

    public static void main(String[] args) {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP用户");
        service.serveGrade("普通用户");
        service.serveGrade("访客用户");
    }

}
