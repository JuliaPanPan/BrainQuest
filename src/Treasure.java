public class Treasure{
    private int value;
    private String title;
  
    public Treasure(String title, int value){
      this.value = value;
      this.title = title;
    }
  
    public Treasure(String title){
      this.value = 50;
      this.title = title;
    }
  
    //accessors
    public int value() {
      return this.value;
    }
    public String title() {
        return this.title;
    }
    
    //mutators
    public void value(int value){
      this.value = value;
    }
    public void title(String title){
        this.title = title;
      } 
      
    @Override
    public String toString(){
        return this.title + " (" + this.value + ")";
    }
  }