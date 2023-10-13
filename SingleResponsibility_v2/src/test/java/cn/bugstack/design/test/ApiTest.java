package cn.bugstack.design.test;


import cn.bugstack.design.IVideoUserService;
import cn.bugstack.design.impl.GuestVideoUserService;
import cn.bugstack.design.impl.NormalVideoUserService;

/**
 * SRP
 *    每一个类 只负责一个行为，这个类发生变化 只跟这个行为有关
 */

public class ApiTest {

    public static void main(String[] args) {
        IVideoUserService vistor = new GuestVideoUserService();
        vistor.definition();
        vistor.advertisement();

        IVideoUserService user = new NormalVideoUserService();
        user.definition();
        user.advertisement();

        IVideoUserService vip = new GuestVideoUserService();
        vip.definition();
        vip.advertisement();
    }

}
