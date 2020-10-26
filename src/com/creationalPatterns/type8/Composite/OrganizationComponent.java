package com.creationalPatterns.type8.Composite;


public abstract class OrganizationComponent {

    private String name;
    //说明
    private String dest;

    public OrganizationComponent(String name,String dest){
        super();
        this.name = name;
        this.dest = dest;
    }

    //不声明成抽象类是因为不一定是所有的子类都要实现这个方法。（有leaf）
    protected void add(OrganizationComponent organizationComponent){
        //空实现：空实现的目的是这个方法并不是所有的子类都必须去实现它，想实现它的子类自己去重写就行。
    }

    protected void remove(OrganizationComponent organizationComponent){
        //空实现
    }

    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
