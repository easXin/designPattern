package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description visitor
 */
public class GuestVideoUserService implements IVideoUserService {

    private Logger logger = LoggerFactory.getLogger(GuestVideoUserService.class);
    @Override
    public void definition() {
        logger.info("访客用户，视频360P超清");
    }

    @Override
    public void advertisement() {
        logger.info("访客用户，With AD.");
    }
}
