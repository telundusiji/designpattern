package site.teamo.learning.designpattern.builder;

import lombok.Data;

import java.util.Date;

@Data
public class Report {
    private String no;
    private Date date;
    private String department;
    private String author;
    private double income;
    private double outcome;
    private String assessment;
}
