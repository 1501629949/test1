package org.bwf.study.util;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.util.EntityUtils;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MSGOpr {

    //这是企业id
    public static String CORP_ID="128718";

    //这是企业用户名
    public static String LOGIN_NAME="Ats";

    //这是企业密码
    public static String SECRET_KEY="Yv253772";


    public static String send(String phoneNumber, String Content) throws UnsupportedEncodingException {

        //用于动态加密使用的,固定的直接使用
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");//日期格式化
        String timeStamp = dateFormat.format(now);

        //设置发送的密码
        String strPwsd = new MD5().md5(CORP_ID + SECRET_KEY + timeStamp);//MD5加密方式

        //对发送的内容进行转码，防止出现乱码问题
        String contexts = URLEncoder.encode(Content, "utf-8");//转码

        //设置发送的时间为当前的时间，即：立即发送
        String TimerSends = URLEncoder.encode(new Date().getTime() + "", "utf-8");//定时发送的时间格式

        //接口的地址
        String url = "https://sms.mobset.com";
        //发送短信的操作
        String type = "SmsSend";

        //Methods = SmsSend为发送短信，SmsGetRecv取回复短信，SmsGetReport取短信状态，SmsGetBalance取账号剩余短信量,SmsGetSign取短信签名。
        //拼接成一个地址
        String urls = url + ":843/SDK3/Sms?Methods=" + type + "&CorpID=" + CORP_ID + "&LoginName=" + LOGIN_NAME + "&TimeStamp=" + timeStamp + "&SecretKey=" + strPwsd + "&PhoneNumbers=" + phoneNumber + "&Content=" + contexts + "&AddNum=&LongSms=1" + "&TimerSend=" + TimerSends;

//////////////////////////////////////////////////////////////////////////////////////

        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try {
            //创建一个HttpClient对象
            httpClient = new SSLClient();
            //准备发送一个请求，post方式，请求的地址就是上面的那个地址
            httpPost = new HttpPost(urls);
            //发送请求 并获取响应数据
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                //HttpEntity工具可以获取到响应的数据中的字符串信息
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, "utf8");

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
/////////////////////////////////////////////////////////////////////
        return result;

    }
}
