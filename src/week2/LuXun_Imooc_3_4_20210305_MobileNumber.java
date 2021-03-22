package week2;

/**
 * 3-4 对成员变量进行读写
 * author:luxun
 * date:2020-03-07
 */

public class LuXun_Imooc_3_4_20210305_MobileNumber {
    private String owner;//所有者
    private String areaCode="86";//国家区号
    private long mobileNumber;//手机号
//    getter方法，getter方法用于读取成员变量的内容
//    getter书写格式：public成员变量类型 get成员变量名()，PS：首字母大写

    public String getOwner(){
//        this关键字代表当前对象的...
        return this.owner;
    }

//    setter方法，setter方法用于设置成员变量的内容
//    setter书写格式：public void set成员变量名(新的数据参数)
    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getAreaCode(){
        return this.areaCode;
    }

//    idea工具=>一键生成get/set方法：空白处右键，选择Generate

    public long getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
