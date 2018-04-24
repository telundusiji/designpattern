package site.teamo.learning.designpattern.builder;

import java.util.Date;

public abstract class ReportBuilder {
   public abstract void setBaseInformation();
   public abstract void setIncomeAndOutcome();
   public abstract void assess();
    public abstract Report getReport();
}
