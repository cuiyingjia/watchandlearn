package filter;

public class Entity {

    private String name;

    private Integer id;

    private String attr1;

    private String attr2;

    protected Entity(String name, Integer id, String attr1){
        this.name = name;
        this.id = id;
        this.attr1 = attr1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    @Override
    public String toString() {
        return "Name:"+this.name + " ID:"+this.id + " Attr1:"+this.attr1+ " Attr2:"+ this.attr2 ;
    }
}
