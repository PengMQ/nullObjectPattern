package refactoring.nullobjectpattern;

/**
 * Created by twer on 4/8/14.
 */
public class PineappleInfoProviderFactory {
    private final PineappleTree pineappleTree;

    public PineappleInfoProviderFactory(PineappleTree pineappleTree){
        this.pineappleTree = pineappleTree;
    }
    public IPineappleInfoProvider create() {
        if(pineappleTree.getPineapple() == null){
            return new nullPineappleInfoProvider();
        }
        return new PineappleInfoProvider(pineappleTree);
    }
}
