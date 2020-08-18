package com.neuesoft.first;

/**
 * name 姓名
 * experience 经验
 * type 老师试讲内容
 */
public class Teacher {
    private String name;
    private int experience;
    private String type;

    public Teacher(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        try {
            if(experience>3){
                this.experience = experience;
            }
        }catch (Exception e){
            System.out.println("工作经验不足3年");
        }
    }

    public void jiangke(){
        System.out.println("大家好，我是"+name+"工作经验"+experience+"年"+"讲"+type+"课");
    }
}
