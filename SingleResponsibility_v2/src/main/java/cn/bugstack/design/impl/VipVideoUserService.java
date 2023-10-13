package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;

/**
 * @description vip
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户，With No AD.");
    }
}
