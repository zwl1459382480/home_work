package com.neuesoft.work.work2;

public class People {
    private String name;
    private String doing;
    private String type;

    public People(String name, String doing, String type) {
        this.name = name;
        this.doing = doing;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDoing() {
        return doing;
    }

    public String getType() {
        return type;
    }

    protected final void print(){
        System.out.println(getType()+""+getName()+""+getDoing());
    }
}
