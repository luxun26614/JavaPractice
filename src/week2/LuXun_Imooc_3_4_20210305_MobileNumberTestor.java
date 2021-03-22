package week2;

/**
 * 3-4 对成员变量进行读写
 * author:luxun
 * date:2020-03-07
 */

public class LuXun_Imooc_3_4_20210305_MobileNumberTestor {
    public static void main(String[] args) {
        LuXun_Imooc_3_4_20210305_MobileNumber lim = new LuXun_Imooc_3_4_20210305_MobileNumber();
        lim.setOwner("鲁训");
        String on = lim.getOwner();
        System.out.println(on);

        String ac = lim.getAreaCode();
        System.out.println(ac);
//        18951078735
        lim.setMobileNumber(13388888888L);
        System.out.println(lim.getMobileNumber());
    }
}
