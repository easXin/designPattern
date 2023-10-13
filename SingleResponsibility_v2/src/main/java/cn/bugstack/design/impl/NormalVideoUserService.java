package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description normal
 */
public class NormalVideoUserService implements IVideoUserService {

    private Logger logger = LoggerFactory.getLogger(NormalVideoUserService.class);
    @Override
    public void definition() {
        logger.info("普通用户，视频720P超清");
    }

    @Override
    public void advertisement() {
        logger.info("普通用户，With 1 min AD.");
    }
}
