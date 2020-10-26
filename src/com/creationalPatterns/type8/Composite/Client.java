package com.creationalPatterns.type8.Composite;

//组合模式
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //学校
        OrganizationComponent university = new University("清华大学","中国顶级大学");

        //学院
        OrganizationComponent college1 = new College("英语学院","");
        OrganizationComponent college2 = new College("计算机学院","");

        //创建各个学院下面的系、专业
        college1.add(new Department("软件工程","软件工程不错"));
        college1.add(new Department("网络工程","网络工程不错"));
        college1.add(new Department("计算机科学与技术工程","计算机科学与技术工程不错"));

        college2.add(new Department("软件工程111","软件工程不错"));
        college2.add(new Department("网络工程111","网络工程不错"));
        college2.add(new Department("计算机科学与技术工程1111","计算机科学与技术工程不错"));

        //将学院加到学校
        university.add(college1);
        university.add(college2);

        //university.print();
        college1.print();
        System.out.println("==========================");
        college2.print();
    }
}
