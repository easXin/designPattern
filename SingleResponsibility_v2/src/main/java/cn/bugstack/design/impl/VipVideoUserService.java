package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description vip
 */
public class VipVideoUserService implements IVideoUserService {

    private Logger logger = LoggerFactory.getLogger(VipVideoUserService.class);
    @Override
    public void definition() {
        logger.info("VIP用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        logger.info("VIP用户，With No AD.");
    }
}
