package site.teamo.learning.designpattern.builder;

public class ReportDirector {
    public void produce(ReportBuilder reportBuilder){
        reportBuilder.setBaseInformation();
        reportBuilder.setIncomeAndOutcome();
        reportBuilder.assess();
    }
}
