package com.IT.builderModel;

public class ParlourDecorator {

    public static void main(String[] args) {
        try {
            Decorator decorator;
            decorator = (Decorator) ReadXML.getObject();
            ProjectManger m = new ProjectManger( decorator );
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
    }
}
