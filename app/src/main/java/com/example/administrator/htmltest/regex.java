package com.example.administrator.htmltest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/9/22.
 */

public class regex {

    public static void main(String[] args){
        checkQQ();
        replace();
    }

    /**
     * 检验QQ格式
     */

    public static void checkQQ(){
        String qq ="635520875";
        String regex ="[1-9][0-9]{4,14}";//开头不为零
        Pattern pattern =Pattern.compile(regex);//获取对象
        Matcher matcher=pattern.matcher(qq);//匹配
        boolean b=matcher.matches();//判断
        if (b){
            System.out.println("QQ:"+qq+"  格式正确");
        }else{
            System.out.println("QQ格式错误");
        }

        System.out.println("----------QQ检验完成------------------");
    }

    /*
    *需求：
    *将下列字符串转成：我要学编程
    *到底用四种功能中的哪一个呢？或者哪几个呢？
    *思路方式：
    *1、如果只想知道该字符串是对是错，使用匹配
    *2、想要将已有的字符串变成另一个字符串，替换
    *3、想要按照自定的方式将字符串变成多个字符串，切割，获取规则以外的子串
    *4、想要拿到符合需求的字符串子串，获取，获取符合规则的子串
    **/

    public static void replace(){
        String str="我我我我我我...要要要要要要要要要......学学学学学学学.....编编编编编编编...程程程程........";
        String regex="\\.+";
        str=str.replaceAll(regex, "");//去掉点
        System.out.println(str);
            str=str.replaceAll("(.)\\1+", "$1");//去掉重复的字（\1代表第一个括号内的内容，&1也代表第一个括号的内容）
        System.out.println(str);

    }
}
