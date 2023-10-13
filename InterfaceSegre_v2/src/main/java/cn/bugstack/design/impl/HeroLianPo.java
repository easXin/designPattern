package cn.bugstack.design.impl;

import cn.bugstack.design.ISkillInvisible;
import cn.bugstack.design.ISkillSilent;
import cn.bugstack.design.ISkillVertigo;

// 接口只包含用户感兴趣的 内容  东西越少越好

public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {

    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }

}
