package site.teamo.learning.designpattern.builder;

import java.util.Date;

public class PersonnelReport extends ReportBuilder {

    private Report report;

    public PersonnelReport() {
        report = new Report();
    }


    @Override
    public void setBaseInformation() {
        report.setNo("P.No."+System.currentTimeMillis());
        report.setDepartment("Personnel");
        report.setAuthor("Personnel.张三");
        report.setDate(new Date());
    }

    @Override
    public void setIncomeAndOutcome() {
        report.setIncome(Math.random()*10000);
        report.setOutcome(Math.random()*10000);
    }

    @Override
    public void assess() {
        double income = report.getIncome();
        double outcome = report.getOutcome();
        if (income>outcome){
            report.setAssessment("人事部财务评估：收入大于支出，有收益，开心！");
        }else if(income==outcome){
            report.setAssessment("人事部财务评估：收入等于支出，无收益，一般！");
        }else {
            report.setAssessment("人事部财务评估：收入小于支出，无收益，悲伤！");
        }
    }

    @Override
    public Report getReport() {
        return report;
    }
}
