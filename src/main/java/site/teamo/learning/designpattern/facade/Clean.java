package site.teamo.learning.designpattern.facade;

public class Clean {
    private DBClean dbClean;
    private FtpClean ftpClean;
    private LocalClean localClean;

    public Clean(){
        dbClean = new DBClean();
        ftpClean = new FtpClean();
        localClean = new LocalClean();
    }

    public void clean(){
        dbClean.clean();
        localClean.clean();
        ftpClean.clean();
    }
}
