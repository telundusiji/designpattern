package site.teamo.learning.designpattern.composite;

public class Main {
    public static void main(String[] args){
        Organization college = new Department("XX大学");

        Organization cs = new Department("计算机科学与工程学院");
        Organization technology = new Department("技术部");
        Organization sta = new Team("科技协会");
        Organization support = new Team("技术支持");
        Organization educate = new Team("技术培训");

        Organization art = new Department("艺术设计学院");
        Organization artWork = new Department("工艺品爱好者协会");
        Organization languageArt = new Team("语言艺术社");

        college.add(cs);
        college.add(art);

        cs.add(technology);
        technology.add(support);
        technology.add(educate);
        cs.add(sta);

        art.add(artWork);
        art.add(languageArt);

        college.print();


    }
}
