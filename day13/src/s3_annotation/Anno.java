package s3_annotation;

public @interface Anno {
    public String name() default "王二狗";
    public int age() default 18;

    public int value();
}
