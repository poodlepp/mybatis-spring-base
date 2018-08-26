package app01a.enumPractice;

/**
 * 实际应用举例
 * 其实枚举还有两个系统自带属性  name,ordinary （就是枚举的名称，序列号）   是不可以被修改的
 *
 * 下面的很重要：
 * 如果在spring mvc 中使用枚举  可以添加转换器 这样前端传来的数据可以直接转化为对应的枚举对象。FormattingConversionServiceFactoryBean.converters
 * 如果需要依赖注入枚举类型  需要FieldRetrievingFactoryBean 进行转换之后才可以进行注入；
 * 如果希望枚举可以直接存入数据库，而且保存属性不是name,ordinal  需要西定义typeHandler  并配置到mybatis中，而具体的sql语句中不一定要定义typeHandler 会自动识别
 */
enum Demo8Enum {
    COFFEE("1"),TEA("2"),JUICE("3");

    private String drink;

    Demo8Enum(String drink){
        this.drink = drink;
        }

    public String getDrink(){
        return drink;
    }

    //根据字符获取对应枚举变量
    public Demo8Enum getDemoByDrink(String drink){
        Demo8Enum[] values = Demo8Enum.values();
        for(int i = 0; i < values.length;i++){
            if(values[i].getDrink().equalsIgnoreCase(drink)){
                return values[i];
            }
        }
        return null;
    }
}
