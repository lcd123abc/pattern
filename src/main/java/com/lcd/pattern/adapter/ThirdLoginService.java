package com.lcd.pattern.adapter;

/**
 * 适配器模式，这里的例子是：
 * 假如要添加第三方登录的方式，比如qq登录，微信登录啥的，
 * 这里就可以使用适配器模式
 */
public class ThirdLoginService extends SignInService {

    public ResultMsg QQLogin(String token){
        //qq的token是唯一的标志
        //可以在数据库中查询对应的账户，没有的话就新建
        //然后调用原来的登录逻辑
        login(token,null);
        return new ResultMsg(200, "qq登录成功", null);
    }

    public ResultMsg WeChatLogin(String token){
        //微信的token是唯一的标志
        //可以在数据库中查询对应的账户，没有的话就新建
        //然后调用原来的登录逻辑
        login(token,null);
        return new ResultMsg(200, "qq登录成功", null);
    }
}
