package app01a.enumPractice;

/**
 * 可以向枚举中添加方法；
 * 所有枚举类都继承自Enum类，不支持多继承；但是可以实现其他的接口
 */
public enum Demo3 {
    ;
    private String name;
    private int index;
    private Demo3(String name,int index){
        this.name = name;
        this.index = index;
    }

    public Demo3 getDemoByIndex(int index){
        for(Demo3 dm : Demo3.values()){
            if(dm.getIndex() == index){
                return dm;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Demo3{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
