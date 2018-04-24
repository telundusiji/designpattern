package site.teamo.learning.designpattern.builder;

import java.util.Date;

public class TechnologyReport extends ReportBuilder {

    private Report report;

    public TechnologyReport() {
        report = new Report();
    }


    @Override
    public void setBaseInformation() {
        report.setNo("T.No."+System.currentTimeMillis());
        report.setDepartment("Technology");
        report.setAuthor("Technology.李四");
        report.setDate(new Date());
    }

    @Override
    public void setIncomeAndOutcome() {
        report.setIncome(Math.random()*1000000);
        report.setOutcome(Math.random()*1000000);
    }

    @Override
    public void assess() {
        double income = report.getIncome();
        double outcome = report.getOutcome();
        double profit = income - outcome;
        report.setAssessment("技术部财务评估：收益"+profit+"！");
    }

    @Override
    public Report getReport() {
        return report;
    }
}
