public class person <VariableType>{
    private String name;
    private String word;
    private VariableType color;

    public void setColor (VariableType color){
        this.color = color;
    }
    public VariableType getColor(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setWord(String word){
        this.word = word;
    }
    public String getWord(){
        return word;
    }
}