package s3_annotation;

//目标：掌握自己定义一个注解
/**
 * 定义格式：
 *      public @interface 注解名称 {
 *              public 属性类型 属性名() default 默认值 ;
 *      }
 *      1、属性可有可无，根据实际需求来定义。
 *      2、属性类型：Java支持的数据类型基本上都可以使用
 *      3、默认值可以定义也可以不定义，如果不指定默认值，那么使用该注解时就必须给这个属性赋值。
 * 特殊属性：value
 *      如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可
 */
@Anno(name = "李翠花",age = 19,value = 192)
public class Demo02{
    @Anno(name = "吴刚",age = 18,value = 163)
    private String name;
    @Anno(name = "刘瘤子",age = 30,value = 66)
    public void show(){}
    public static void main(String[] args) {

    }
}
