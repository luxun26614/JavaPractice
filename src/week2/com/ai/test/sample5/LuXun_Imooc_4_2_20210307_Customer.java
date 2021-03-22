package week2.com.ai.test.sample5;

import week2.com.ai.test.sample5.system.LuXun_Imooc_4_2_20210307_CustomerService;
import week2.com.ai.test.sample5.system.LuXun_Imooc_4_2_20210307_Language;

public class LuXun_Imooc_4_2_20210307_Customer {
    public static void main(String[] args) {
        LuXun_Imooc_4_2_20210307_CustomerService lics = new LuXun_Imooc_4_2_20210307_CustomerService();
        LuXun_Imooc_4_2_20210307_Language lil = lics.contact(86);
        lil.voice();
    }
}
