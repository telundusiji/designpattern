package site.teamo.learning.designpattern.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        ReportDirector reportDirector = new ReportDirector();

        ReportBuilder personnel = new PersonnelReport();
        ReportBuilder technology = new TechnologyReport();

        reportDirector.produce(personnel);
        log.info("------------------人事部财务报告---------------");
        log.info(personnel.getReport().toString());

        reportDirector.produce(technology);
        log.info("------------------技术部财务报告---------------");
        log.info(technology.getReport().toString());
    }
}
