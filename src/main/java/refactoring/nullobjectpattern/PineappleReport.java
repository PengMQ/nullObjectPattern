package refactoring.nullobjectpattern;

public class PineappleReport {
    private Pineapple pineapple;

    public PineappleReport(PineappleTree pineappleTree){
        this.pineapple = pineappleTree.getPineapple();
    }

    String getColor(){
        if(pineapple == null){
            return "no color";
        }
        return pineapple.getColor();
    }

    String getHeight(){
        if(pineapple == null){
            return "no height";
        }
        return pineapple.getHeight();
    }
}
