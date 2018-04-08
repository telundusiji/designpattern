package site.teamo.learning.designpattern.decorator;

/**
 * Created by haoco on 2018/4/8.
 */
public abstract class ImgDecorator extends ImgEdit{
    private ImgEdit imgEdit;

    public ImgDecorator(ImgEdit imgEdit) {
        this.imgEdit = imgEdit;
    }

    public ImgEdit getImgEdit() {
        return imgEdit;
    }
}
