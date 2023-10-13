package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;

/**
 * @description visitor
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，视频360P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，With AD.");
    }
}
