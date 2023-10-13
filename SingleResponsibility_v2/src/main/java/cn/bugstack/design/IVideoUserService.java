package cn.bugstack.design;

/**
 * SRP
 *    每一个类 只负责一个行为，这个类发生变化 只跟这个行为有关
 *      1. 提取接口 信息  user video
 */
public interface IVideoUserService {
    // 用户等级
    void definition();
    // 投放广告
    void advertisement();
}
