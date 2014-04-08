package refactoring.nullobjectpattern;

/**
 * Created by twer on 4/8/14.
 */
public class PineappleInfoProvider implements IPineappleInfoProvider {
    private PineappleTree pineapple;

    public PineappleInfoProvider(PineappleTree pineappleTree) {
        this.pineapple = pineappleTree;
    }

    public String getColor() {
        return pineapple.getPineapple().getColor();
    }

    public String getHeight() {
        return pineapple.getPineapple().getHeight();
    }
}
