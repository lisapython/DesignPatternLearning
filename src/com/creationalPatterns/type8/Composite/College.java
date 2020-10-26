package com.creationalPatterns.type8.Composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    List<OrganizationComponent> componentList = new ArrayList<OrganizationComponent>();

    public College(String name, String dest) {
        super(name, dest);
    }

    @Override
    protected void print() {
        System.out.println("------------"+getName()+"-------------");
        //遍历list
        for(OrganizationComponent department:componentList){
            department.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //实际业务中，college的添加方法和university的添加方法可能不一样
        componentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        //实际业务中，college的remove方法和university的添加方法可能不一样
        componentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDest() {
        return super.getDest();
    }

}
