package com.IT.builderModel;

/**
 * 指挥者： 项目经理
 */
public class ProjectManger {

    private Decorator builder;

    public ProjectManger(Decorator builder){
        this.builder = builder;
    }

    //产品构建与组装方法
    public Parlour decorate(){
        builder.buildSofa();
        builder.buildWall();
        builder.buildWatch();
        return builder.getResult();
    }
}
