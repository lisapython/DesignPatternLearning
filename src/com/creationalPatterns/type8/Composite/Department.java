package com.creationalPatterns.type8.Composite;

public class Department extends OrganizationComponent{

    //构造方法
    public Department(String name, String dest) {
        super(name, dest);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    //就不需要add和remove了，因为它是叶子节点
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDest() {
        return super.getDest();
    }
}
