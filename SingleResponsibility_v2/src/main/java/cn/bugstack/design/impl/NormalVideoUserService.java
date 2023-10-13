package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;

/**
 * @description normal
 */
public class NormalVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户，视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，With 1 min AD.");
    }
}
