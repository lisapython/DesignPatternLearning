package com.creationalPatterns.type8.Composite;

import java.util.ArrayList;
import java.util.List;

//就是composit角色
public class University extends OrganizationComponent{

    List<OrganizationComponent> componentList = new ArrayList<OrganizationComponent>();

    public University(String name, String dest) {
        super(name, dest);
    }

    @Override
    protected void print() {
        System.out.println("------------"+getName()+"-------------");
        //遍历list
        for(OrganizationComponent component:componentList){
            component.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //实际业务中，college的添加方法有很多种
        componentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        //实际业务中，college的添加方法有很多种
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
