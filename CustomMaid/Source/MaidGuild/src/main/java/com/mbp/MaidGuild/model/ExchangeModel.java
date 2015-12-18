package com.mbp.MaidGuild.model;

/**
 * Created by peixun on 2015/12/18.
 */
public class ExchangeModel {
   public static class ExchangeJson{
       //状态码
       String resultcode;
       //状态原因
       String reason;
       //结果
       Result[] result;
       //错误码
       Integer error_code;

       public String getResultcode() {
           return resultcode;
       }

       public void setResultcode(String resultcode) {
           this.resultcode = resultcode;
       }

       public String getReason() {
           return reason;
       }

       public void setReason(String reason) {
           this.reason = reason;
       }

       public Result[] getResult() {
           return result;
       }

       public void setResult(Result[] result) {
           this.result = result;
       }

       public Integer getError_code() {
           return error_code;
       }

       public void setError_code(Integer error_code) {
           this.error_code = error_code;
       }
   }

    public static class Result{
        //美元
        Data data1;
        //欧元
        Data data2;
        //港币
        Data data3;
        //日元
        Data data4;
        //英镑
        Data data5;
        //澳大利亚元
        Data data6;
        //加拿大元
        Data data7;
        //泰国铢
        Data data8;
        //新加坡元
        Data data9;
        //挪威克朗
        Data data10;
        //林吉特
        Data data11;
        //澳门元
        Data data12;
        //韩国元
        Data data13;
        //瑞士法郎
        Data data14;
        //丹麦克朗
        Data data15;
        //瑞典克朗
        Data data16;
        //卢布
        Data data17;
        //新西兰元
        Data data18;
        //菲律宾比索
        Data data19;
        //新台币
        Data data20;

        public Data getData1() {
            return data1;
        }

        public void setData1(Data data1) {
            this.data1 = data1;
        }

        public Data getData2() {
            return data2;
        }

        public void setData2(Data data2) {
            this.data2 = data2;
        }

        public Data getData3() {
            return data3;
        }

        public void setData3(Data data3) {
            this.data3 = data3;
        }

        public Data getData4() {
            return data4;
        }

        public void setData4(Data data4) {
            this.data4 = data4;
        }

        public Data getData5() {
            return data5;
        }

        public void setData5(Data data5) {
            this.data5 = data5;
        }

        public Data getData6() {
            return data6;
        }

        public void setData6(Data data6) {
            this.data6 = data6;
        }

        public Data getData7() {
            return data7;
        }

        public void setData7(Data data7) {
            this.data7 = data7;
        }

        public Data getData8() {
            return data8;
        }

        public void setData8(Data data8) {
            this.data8 = data8;
        }

        public Data getData9() {
            return data9;
        }

        public void setData9(Data data9) {
            this.data9 = data9;
        }

        public Data getData10() {
            return data10;
        }

        public void setData10(Data data10) {
            this.data10 = data10;
        }

        public Data getData11() {
            return data11;
        }

        public void setData11(Data data11) {
            this.data11 = data11;
        }

        public Data getData12() {
            return data12;
        }

        public void setData12(Data data12) {
            this.data12 = data12;
        }

        public Data getData13() {
            return data13;
        }

        public void setData13(Data data13) {
            this.data13 = data13;
        }

        public Data getData14() {
            return data14;
        }

        public void setData14(Data data14) {
            this.data14 = data14;
        }

        public Data getData15() {
            return data15;
        }

        public void setData15(Data data15) {
            this.data15 = data15;
        }

        public Data getData16() {
            return data16;
        }

        public void setData16(Data data16) {
            this.data16 = data16;
        }

        public Data getData17() {
            return data17;
        }

        public void setData17(Data data17) {
            this.data17 = data17;
        }

        public Data getData18() {
            return data18;
        }

        public void setData18(Data data18) {
            this.data18 = data18;
        }

        public Data getData19() {
            return data19;
        }

        public void setData19(Data data19) {
            this.data19 = data19;
        }

        public Data getData20() {
            return data20;
        }

        public void setData20(Data data20) {
            this.data20 = data20;
        }
    }

    public static class Data{
        //货币名
        String name;
        //现汇买入价
        String fBuyPri;
        //现钞买入价
        String  mBuyPri;
        //现汇卖出价
        String fSellPri;
        //现钞卖出价
        String  mSellPri;
        //银行折算价/中间价
        String bankConversionPri;
        //发布日期
        String date;
        //发布时间
        String time;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getfBuyPri() {
            return fBuyPri;
        }

        public void setfBuyPri(String fBuyPri) {
            this.fBuyPri = fBuyPri;
        }

        public String getmBuyPri() {
            return mBuyPri;
        }

        public void setmBuyPri(String mBuyPri) {
            this.mBuyPri = mBuyPri;
        }

        public String getfSellPri() {
            return fSellPri;
        }

        public void setfSellPri(String fSellPri) {
            this.fSellPri = fSellPri;
        }

        public String getmSellPri() {
            return mSellPri;
        }

        public void setmSellPri(String mSellPri) {
            this.mSellPri = mSellPri;
        }

        public String getBankConversionPri() {
            return bankConversionPri;
        }

        public void setBankConversionPri(String bankConversionPri) {
            this.bankConversionPri = bankConversionPri;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
