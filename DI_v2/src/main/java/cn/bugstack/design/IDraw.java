package cn.bugstack.design;

import java.util.List;

/**
 * 开发过程中  高层 不应该 依赖 于底层 模块， 两个都 应该 依赖于 抽象
 *
 * 抽象 不应该 依赖 于 细节，实现的类
 */

public interface IDraw {

    List<BetUser> prize(List<BetUser> list, int count);

}
