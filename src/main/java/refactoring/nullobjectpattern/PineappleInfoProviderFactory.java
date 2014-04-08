package refactoring.nullobjectpattern;

/**
 * Created by twer on 4/8/14.
 */
public class PineappleInfoProviderFactory {
    public IPineappleInfoProvider create(PineappleTree pineappleTree) {
        if(pineappleTree.getPineapple() == null){
            return new nullPineappleInfoProvider();
        }
        return new PineappleInfoProvider(pineappleTree);
    }
}
