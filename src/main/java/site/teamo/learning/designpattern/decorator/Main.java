package site.teamo.learning.designpattern.decorator;

/**
 * Created by haoco on 2018/4/8.
 */
public class Main {
    public static void main(String[] agrs){
        ImgEdit imgEdit = new ReadImg("/mnt/img/test.jpg");
        imgEdit = new ImgCut(imgEdit);
        imgEdit = new ImgWatermark(imgEdit);
        imgEdit = new ImgZoom(imgEdit);
        imgEdit.handle();
    }
}
