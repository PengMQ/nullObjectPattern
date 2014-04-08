package refactoring.nullobjectpattern;

public class PineappleReport {
    private final PineappleTree pineappleTree;

    public PineappleReport(PineappleTree pineappleTree){
        this.pineappleTree = pineappleTree;
    }

    String getColor(){
        if(pineappleTree.getPineapple() == null){
            return "no color";
        }
        return pineappleTree.getPineapple().getColor();
    }

    String getHeight(){
        if(pineappleTree.getPineapple() == null){
            return "no height";
        }
        return pineappleTree.getPineapple().getHeight();
    }
}
