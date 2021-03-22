package week2.com.ai.test.sample5.system;

public class LuXun_Imooc_4_2_20210307_CustomerService {
    public LuXun_Imooc_4_2_20210307_Language contact(int areaCode){
        if (areaCode == 86){
            return new LuXun_Imooc_4_2_20210307_Chinese();
        }else{
            return new LuXun_Imooc_4_2_20210307_English();
        }
    }

    public static void main(String[] args) {
//        前面是接口，后面是实现类
        LuXun_Imooc_4_2_20210307_Language chiness = new LuXun_Imooc_4_2_20210307_Chinese();
        chiness.voice();

        LuXun_Imooc_4_2_20210307_Language english = new LuXun_Imooc_4_2_20210307_English();
        english.voice();

        LuXun_Imooc_4_2_20210307_CustomerService lics = new LuXun_Imooc_4_2_20210307_CustomerService();
        LuXun_Imooc_4_2_20210307_Language chinese1 = lics.contact(85);
        chinese1.voice();
    }
}
