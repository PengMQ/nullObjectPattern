package refactoring.nullobjectpattern;

public class PineappleReport {
    private final IPineappleInfoProvider pineappleInfoProvider;

    public PineappleReport(PineappleInfoProviderFactory pineappleInfoProviderFactory){
        this.pineappleInfoProvider = pineappleInfoProviderFactory.create();
    }

    String getColor(){
        return pineappleInfoProvider.getColor();
    }

    String getHeight(){
        return pineappleInfoProvider.getHeight();
    }
}
