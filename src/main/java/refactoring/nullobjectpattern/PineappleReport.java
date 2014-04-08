package refactoring.nullobjectpattern;

public class PineappleReport {
    private final IPineappleInfoProvider pineappleInfoProvider;

    public PineappleReport(PineappleTree pineappleTree,
                           PineappleInfoProviderFactory pineappleInfoProviderFactory){
        this.pineappleInfoProvider=pineappleInfoProviderFactory.create(pineappleTree);
    }

    String getColor(){
        return pineappleInfoProvider.getColor();
    }

    String getHeight(){
        return pineappleInfoProvider.getHeight();
    }
}
