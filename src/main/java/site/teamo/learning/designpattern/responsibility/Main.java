package site.teamo.learning.designpattern.responsibility;

public class Main {
    public static void main(String[] args){
        TeamLeader teamLeader = new TeamLeader();
        HeadOfDepartment headOfDepartment = new HeadOfDepartment();
        CTO cto = new CTO();

        teamLeader.setHandler(headOfDepartment);
        headOfDepartment.setHandler(cto);

        teamLeader.handleRequest("task");

        teamLeader.handleRequest("加工资");
    }
}
