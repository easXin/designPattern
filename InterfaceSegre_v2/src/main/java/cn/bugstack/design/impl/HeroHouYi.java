package cn.bugstack.design.impl;

import cn.bugstack.design.ISkillArchery;
import cn.bugstack.design.ISkillInvisible;
import cn.bugstack.design.ISkillSilent;

// 接口只包含用户感兴趣的 内容  东西越少越好

public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {

    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}
