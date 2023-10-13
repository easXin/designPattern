package cn.bugstack.design;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description SRP 每一个类 只负责一个行为，这个类发生变化 只跟这个行为有关
 */
public class VideoUserService {

    private Logger logger = LoggerFactory.getLogger(VideoUserService.class);
    public void serveGrade(String userType){
        if ("VIP用户".equals(userType)){
           logger.info("VIP用户，视频1080P蓝光");
        } else if ("普通用户".equals(userType)){
            logger.info("普通用户，视频720P超清");
        } else if ("访客用户".equals(userType)){
            logger.info("访客用户，视频480P高清");
        }
    }

}