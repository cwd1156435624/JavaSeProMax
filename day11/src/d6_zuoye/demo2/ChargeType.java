package d6_zuoye.demo2;

// 定义付款类型的枚举
public enum ChargeType {


        // 定义枚举项
        CHARGE_TYPE_CHARGED(10131001 , "自费") ,
        CHARGE_TYPE_FREE(10131002 , "免费") ,
        CHARGE_TYPE_MEMBER_RIGHTS(10131003 , "会员权益") ;

        // 定义成员变量
        private Integer code ;
        private String name ;

        // 定义构造方法完成成员变量的初始化
        private ChargeType(Integer code , String name) {
            this.code = code ;
            this.name = name ;
        }

        // 根据标号获取对应的付款方式名称
        public static String getTypeName(Integer code) {

            // 获取所有的枚举项
            ChargeType[] chargeTypes = ChargeType.values();

            // 遍历枚举项的数组
            for(ChargeType chargeType : chargeTypes) {

                // 判断
                if (chargeType.code.equals(code)) {
                    return chargeType.name ;
                }

            }

            // 返回null
            return null ;
        }
}
