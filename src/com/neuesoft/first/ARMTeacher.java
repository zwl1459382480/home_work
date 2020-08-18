package com.neuesoft.first;

/**
 * name 姓名
 * experience 经验
 * type 老师试讲内容
 */
public class ARMTeacher extends Teacher{

    public ARMTeacher() {
        super("ARM");
    }

    public void jiangke(){
        super.jiangke();
        System.out.println("使用虚拟机讲课");
    }
}
