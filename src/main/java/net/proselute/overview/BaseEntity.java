package net.proselute.overview;

public class BaseEntity {
    private Long id;
    public  void setId(Long id){

        this.id = id;
    }
    @Override
    public  String toString(){
        return  "BaseEntity{"+"id="+id+"}";
    }
    public Long getId() {
        return id;
    }
    public  boolean IsNew(){
        return  (this.id==null);
    }
}
